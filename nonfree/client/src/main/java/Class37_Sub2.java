import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "J")
	private long aLong90 = 0L;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	private int anInt2582 = 0;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	private int anInt2583 = 1;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "J")
	private long aLong91 = 0L;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class37_Sub2() {
		this.aLong89 = this.aLong90 = jagmisc.nanoTime();
		if (this.aLong90 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
	@Override
	public int method4753(@OriginalArg(0) int arg0) {
		this.aLong90 += this.method2244();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong89 > this.aLong90) {
			Static223.method4582((this.aLong89 - this.aLong90) / 1000000L);
			this.aLong91 += this.aLong89 - this.aLong90;
			this.aLong90 += this.aLong89 - this.aLong90;
			this.aLong89 += local18;
			return 1;
		}
		@Pc(63) int local63 = 0;
		do {
			this.aLong89 += local18;
			local63++;
		} while (local63 < 10 && this.aLong90 > this.aLong89);
		if (this.aLong89 < this.aLong90) {
			this.aLong89 = this.aLong90;
		}
		return local63;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public void method4749() {
		this.aLong91 = 0L;
		if (this.aLong90 < this.aLong89) {
			this.aLong90 += this.aLong89 - this.aLong90;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)J")
	private long method2244() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong91;
		this.aLong91 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray4[this.anInt2582] = local12;
			this.anInt2582 = (this.anInt2582 + 1) % 10;
			if (this.anInt2583 < 1) {
				this.anInt2583++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt2583; local55++) {
			local53 += this.aLongArray4[(this.anInt2582 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt2583;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)J")
	@Override
	public long method4748() {
		return this.aLong90;
	}
}

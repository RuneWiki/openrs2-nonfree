import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "J")
	private long aLong1 = 0L;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "J")
	private long aLong2 = 0L;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt34 = 0;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
	private long aLong3 = 0L;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private int anInt35 = 1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class1_Sub1() {
		this.aLong2 = System.nanoTime();
		this.aLong1 = System.nanoTime();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6834(@OriginalArg(1) long arg0) {
		if (this.aLong2 < this.aLong1) {
			this.aLong3 += this.aLong1 - this.aLong2;
			this.aLong2 += this.aLong1 - this.aLong2;
			this.aLong1 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong1 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong2 > this.aLong1);
		if (this.aLong2 > this.aLong1) {
			this.aLong1 = this.aLong2;
		}
		return local42;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)J")
	@Override
	protected long method6840() {
		this.aLong2 += this.method177();
		return this.aLong1 <= this.aLong2 ? 0L : (this.aLong1 - this.aLong2) / 1000000L;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)J")
	private long method177() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong3;
		this.aLong3 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt34] = local7;
			if (this.anInt35 < 1) {
				this.anInt35++;
			}
			this.anInt34 = (this.anInt34 + 1) % 10;
		}
		@Pc(60) long local60 = 0L;
		for (@Pc(62) int local62 = 1; local62 <= this.anInt35; local62++) {
			local60 += this.aLongArray1[(this.anInt34 + 10 - local62) % 10];
		}
		return local60 / (long) this.anInt35;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6838() {
		this.aLong3 = 0L;
		if (this.aLong2 < this.aLong1) {
			this.aLong2 += this.aLong1 - this.aLong2;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)J")
	@Override
	public long method6839() {
		return this.aLong2;
	}
}

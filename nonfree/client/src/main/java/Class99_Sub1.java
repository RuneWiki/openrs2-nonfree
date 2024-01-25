import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	private int anInt5126 = 0;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	private int anInt5125 = 1;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "J")
	private long aLong240 = 0L;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class99_Sub1() {
		this.aLong238 = System.nanoTime();
		this.aLong239 = System.nanoTime();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	@Override
	public int method5656(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong238 += this.method4040();
		if (this.aLong238 < this.aLong239) {
			Static167.method6157((this.aLong239 - this.aLong238) / 1000000L);
			this.aLong240 += this.aLong239 - this.aLong238;
			this.aLong238 += this.aLong239 - this.aLong238;
			this.aLong239 += local4;
			return 1;
		}
		@Pc(28) int local28 = 0;
		do {
			local28++;
			this.aLong239 += local4;
		} while (local28 < 10 && this.aLong239 < this.aLong238);
		if (this.aLong238 > this.aLong239) {
			this.aLong239 = this.aLong238;
		}
		return local28;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	@Override
	public void method5655() {
		this.aLong240 = 0L;
		if (this.aLong238 < this.aLong239) {
			this.aLong238 += this.aLong239 - this.aLong238;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)J")
	@Override
	public long method5657() {
		return this.aLong238;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)J")
	private long method4040() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong240;
		this.aLong240 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt5126] = local7;
			this.anInt5126 = (this.anInt5126 + 1) % 10;
			if (this.anInt5125 < 1) {
				this.anInt5125++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5125; local51++) {
			local49 += this.aLongArray4[(this.anInt5126 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt5125;
	}
}

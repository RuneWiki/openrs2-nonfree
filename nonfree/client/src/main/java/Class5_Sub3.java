import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!op", name = "g", descriptor = "J")
	private long aLong139 = 0L;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	private int anInt4750 = 1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private int anInt4749 = 0;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 104)
	public Class5_Sub3() {
		this.aLong139 = System.nanoTime();
		this.aLong140 = System.nanoTime();
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)J", line = 4)
	private long method4411() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong141;
		this.aLong141 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt4749] = local12;
			this.anInt4749 = (this.anInt4749 + 1) % 10;
			if (this.anInt4750 < 1) {
				this.anInt4750++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt4750; local56++) {
			local54 += this.aLongArray8[(this.anInt4749 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt4750;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)I", line = 39)
	@Override
	public int method4410(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong139 += this.method4411();
		if (this.aLong139 < this.aLong140) {
			Static214.method4024((this.aLong140 - this.aLong139) / 1000000L);
			this.aLong141 += this.aLong140 - this.aLong139;
			this.aLong139 += this.aLong140 - this.aLong139;
			this.aLong140 += local4;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			this.aLong140 += local4;
			local67++;
		} while (local67 < 10 && this.aLong140 < this.aLong139);
		if (this.aLong140 < this.aLong139) {
			this.aLong140 = this.aLong139;
		}
		return local67;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 74)
	@Override
	public void method4409() {
		if (this.aLong140 > this.aLong139) {
			this.aLong139 += this.aLong140 - this.aLong139;
		}
		this.aLong141 = 0L;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)J", line = 88)
	@Override
	public long method4406() {
		return this.aLong139;
	}
}

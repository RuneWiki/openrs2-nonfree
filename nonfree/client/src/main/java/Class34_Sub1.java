import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!br", name = "i", descriptor = "J")
	private long aLong11 = 0L;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "J")
	private long aLong12 = 0L;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	private int anInt600 = 1;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "J")
	private long aLong13 = 0L;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	private int anInt599 = 0;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.aLong12 = System.nanoTime();
		this.aLong11 = System.nanoTime();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3922(@OriginalArg(0) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong12 += this.method545();
		if (this.aLong11 > this.aLong12) {
			Static37.method613((this.aLong11 - this.aLong12) / 1000000L);
			this.aLong13 += this.aLong11 - this.aLong12;
			this.aLong12 += this.aLong11 - this.aLong12;
			this.aLong11 += local9;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong11 += local9;
		} while (local25 < 10 && this.aLong11 < this.aLong12);
		if (this.aLong11 < this.aLong12) {
			this.aLong11 = this.aLong12;
		}
		return local25;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)J")
	private long method545() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong13;
		this.aLong13 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt599] = local7;
			this.anInt599 = (this.anInt599 + 1) % 10;
			if (this.anInt600 < 1) {
				this.anInt600++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt600; local49++) {
			local47 += this.aLongArray1[(this.anInt599 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt600;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
	@Override
	public void method3928() {
		if (this.aLong11 > this.aLong12) {
			this.aLong12 += this.aLong11 - this.aLong12;
		}
		this.aLong13 = 0L;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)J")
	@Override
	public long method3925() {
		return this.aLong12;
	}
}

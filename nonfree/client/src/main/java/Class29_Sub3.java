import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "J")
	private long aLong185 = 0L;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "J")
	private long aLong186 = 0L;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	private int anInt5827 = 0;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	private int anInt5826 = 1;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "J")
	private long aLong187 = 0L;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class29_Sub3() {
		this.aLong185 = System.nanoTime();
		this.aLong186 = System.nanoTime();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	@Override
	public void method5290() {
		this.aLong187 = 0L;
		if (this.aLong186 > this.aLong185) {
			this.aLong185 += this.aLong186 - this.aLong185;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I")
	@Override
	public int method5293(@OriginalArg(1) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong185 += this.method5294();
		if (this.aLong185 < this.aLong186) {
			Static15.method5425((this.aLong186 - this.aLong185) / 1000000L);
			this.aLong187 += this.aLong186 - this.aLong185;
			this.aLong185 += this.aLong186 - this.aLong185;
			this.aLong186 += local9;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong186 += local9;
		} while (local25 < 10 && this.aLong185 > this.aLong186);
		if (this.aLong185 > this.aLong186) {
			this.aLong186 = this.aLong185;
		}
		return local25;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)J")
	private long method5294() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong187;
		this.aLong187 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt5827] = local7;
			this.anInt5827 = (this.anInt5827 + 1) % 10;
			if (this.anInt5826 < 1) {
				this.anInt5826++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt5826; local57++) {
			local47 += this.aLongArray8[(this.anInt5827 + 10 - local57) % 10];
		}
		return local47 / (long) this.anInt5826;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)J")
	@Override
	public long method5287() {
		return this.aLong185;
	}
}

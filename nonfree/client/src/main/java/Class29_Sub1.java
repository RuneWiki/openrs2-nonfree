import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
	private long aLong25 = 0L;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	private int anInt847 = 0;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	private int anInt848 = 1;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "J")
	private long aLong26 = 0L;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)I")
	@Override
	public int method5293(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong26 += this.method867();
		if (this.aLong26 < this.aLong25) {
			Static15.method5425((this.aLong25 - this.aLong26) / 1000000L);
			this.aLong27 += this.aLong25 - this.aLong26;
			this.aLong26 += this.aLong25 - this.aLong26;
			this.aLong25 += local4;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong25 += local4;
			local69++;
		} while (local69 < 10 && this.aLong25 < this.aLong26);
		if (this.aLong25 < this.aLong26) {
			this.aLong25 = this.aLong26;
		}
		return local69;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)J")
	@Override
	public long method5287() {
		return this.aLong26;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method5290() {
		this.aLong27 = 0L;
		if (this.aLong25 > this.aLong26) {
			this.aLong26 += this.aLong25 - this.aLong26;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)J")
	private long method867() {
		@Pc(4) long local4 = Static168.method3300() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong27;
		this.aLong27 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray2[this.anInt847] = local9;
			if (this.anInt848 < 10) {
				this.anInt848++;
			}
			this.anInt847 = (this.anInt847 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt848; local57++) {
			local50 += this.aLongArray2[(this.anInt847 + 10 - local57) % 10];
		}
		return local50 / (long) this.anInt848;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "J")
	private long aLong190 = 0L;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	private int anInt5866 = 0;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	private int anInt5867 = 1;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)J")
	private long method5058() {
		@Pc(4) long local4 = Static378.method5293() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong191;
		this.aLong191 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray7[this.anInt5866] = local10;
			if (this.anInt5867 < 10) {
				this.anInt5867++;
			}
			this.anInt5866 = (this.anInt5866 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt5867; local58++) {
			local49 += this.aLongArray7[(this.anInt5866 + 10 - local58) % 10];
		}
		return local49 / (long) this.anInt5867;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	@Override
	public void method5053() {
		if (this.aLong189 > this.aLong190) {
			this.aLong190 += this.aLong189 - this.aLong190;
		}
		this.aLong191 = 0L;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	@Override
	public int method5055(@OriginalArg(1) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong190 += this.method5058();
		if (this.aLong189 > this.aLong190) {
			Static57.method5056((this.aLong189 - this.aLong190) / 1000000L);
			this.aLong191 += this.aLong189 - this.aLong190;
			this.aLong190 += this.aLong189 - this.aLong190;
			this.aLong189 += local12;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			this.aLong189 += local12;
			local68++;
		} while (local68 < 10 && this.aLong190 > this.aLong189);
		if (this.aLong190 > this.aLong189) {
			this.aLong189 = this.aLong190;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)J")
	@Override
	public long method5057() {
		return this.aLong190;
	}
}

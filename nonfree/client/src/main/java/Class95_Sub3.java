import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class95_Sub3 extends Class95 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt7870 = 1;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "J")
	private long aLong236 = 0L;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "[J")
	private final long[] aLongArray25 = new long[10];

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "J")
	private long aLong237 = 0L;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	private int anInt7871 = 0;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	@Override
	public void method6523() {
		if (this.aLong238 < this.aLong237) {
			this.aLong238 += this.aLong237 - this.aLong238;
		}
		this.aLong236 = 0L;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)J")
	private long method6527() {
		@Pc(4) long local4 = Static12.method647() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong236;
		this.aLong236 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray25[this.anInt7871] = local10;
			this.anInt7871 = (this.anInt7871 + 1) % 10;
			if (this.anInt7870 < 10) {
				this.anInt7870++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt7870; local54++) {
			local47 += this.aLongArray25[(this.anInt7871 + 10 - local54) % 10];
		}
		return local47 / (long) this.anInt7870;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)J")
	@Override
	public long method6526() {
		return this.aLong238;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6521(@OriginalArg(0) long arg0) {
		if (this.aLong238 < this.aLong237) {
			this.aLong236 += this.aLong237 - this.aLong238;
			this.aLong238 += this.aLong237 - this.aLong238;
			this.aLong237 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong237 += arg0;
		} while (local16 < 10 && this.aLong238 > this.aLong237);
		if (this.aLong237 < this.aLong238) {
			this.aLong237 = this.aLong238;
		}
		return local16;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)J")
	@Override
	protected long method6524() {
		this.aLong238 += this.method6527();
		return this.aLong238 < this.aLong237 ? (this.aLong237 - this.aLong238) / 1000000L : 0L;
	}
}

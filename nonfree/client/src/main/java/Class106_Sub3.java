import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class106_Sub3 extends Class106 {

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	private int anInt6889 = 1;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
	private int anInt6890 = 0;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "[J")
	private final long[] aLongArray15 = new long[10];

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)J")
	@Override
	public long method6186() {
		return this.aLong204;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)J")
	private long method6187() {
		@Pc(4) long local4 = Static567.method7863() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong203;
		this.aLong203 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray15[this.anInt6890] = local10;
			this.anInt6890 = (this.anInt6890 + 1) % 10;
			if (this.anInt6889 < 10) {
				this.anInt6889++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt6889; local55++) {
			local53 += this.aLongArray15[(this.anInt6890 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt6889;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
	@Override
	public void method6184() {
		if (this.aLong202 > this.aLong204) {
			this.aLong204 += this.aLong202 - this.aLong204;
		}
		this.aLong203 = 0L;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)J")
	@Override
	protected long method6180() {
		this.aLong204 += this.method6187();
		return this.aLong204 < this.aLong202 ? (this.aLong202 - this.aLong204) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6185(@OriginalArg(0) long arg0) {
		if (this.aLong202 > this.aLong204) {
			this.aLong203 += this.aLong202 - this.aLong204;
			this.aLong204 += this.aLong202 - this.aLong204;
			this.aLong202 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			local19++;
			this.aLong202 += arg0;
		} while (local19 < 10 && this.aLong204 > this.aLong202);
		if (this.aLong202 < this.aLong204) {
			this.aLong202 = this.aLong204;
		}
		return local19;
	}
}

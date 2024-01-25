import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class228_Sub3 extends Class228 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	private int anInt7213 = 1;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	private int anInt7214 = 0;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	@Override
	public void method6031() {
		if (this.aLong202 > this.aLong203) {
			this.aLong203 += this.aLong202 - this.aLong203;
		}
		this.aLong201 = 0L;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method6033(@OriginalArg(0) long arg0) {
		if (this.aLong202 > this.aLong203) {
			this.aLong201 += this.aLong202 - this.aLong203;
			this.aLong203 += this.aLong202 - this.aLong203;
			this.aLong202 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			this.aLong202 += arg0;
			local15++;
		} while (local15 < 10 && this.aLong203 > this.aLong202);
		if (this.aLong203 > this.aLong202) {
			this.aLong202 = this.aLong203;
		}
		return local15;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)J")
	private long method6038() {
		@Pc(4) long local4 = Static158.method2936() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong201;
		this.aLong201 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray13[this.anInt7214] = local10;
			this.anInt7214 = (this.anInt7214 + 1) % 10;
			if (this.anInt7213 < 10) {
				this.anInt7213++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt7213; local55++) {
			local53 += this.aLongArray13[(this.anInt7214 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt7213;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
	@Override
	public long method6032() {
		return this.aLong203;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)J")
	@Override
	protected long method6036() {
		this.aLong203 += this.method6038();
		return this.aLong203 < this.aLong202 ? (this.aLong202 - this.aLong203) / 1000000L : 0L;
	}
}

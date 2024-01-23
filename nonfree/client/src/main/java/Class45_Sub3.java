import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	private int anInt5405 = 0;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "[J")
	private long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	private int anInt5406 = 1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class45_Sub3() {
		this.aLong202 = System.nanoTime();
		this.aLong201 = System.nanoTime();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	@Override
	public void method4593() {
		if (this.aLong202 < this.aLong201) {
			this.aLong202 += this.aLong201 - this.aLong202;
		}
		this.aLong203 = 0L;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)I")
	@Override
	public int method4592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static282.method4345((long) arg0);
		this.aLong202 += this.method4596();
		if (this.aLong202 < this.aLong201) {
			Static282.method4345((this.aLong201 - this.aLong202) / 1000000L);
			this.aLong203 += this.aLong201 - this.aLong202;
			this.aLong202 += this.aLong201 - this.aLong202;
			this.aLong201 += local4;
			return 1;
		}
		@Pc(73) int local73 = 0;
		do {
			local73++;
			this.aLong201 += local4;
		} while (local73 < 10 && this.aLong202 > this.aLong201);
		if (this.aLong202 > this.aLong201) {
			this.aLong201 = this.aLong202;
		}
		return local73;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)J")
	private long method4596() {
		@Pc(1) long local1 = 0L;
		@Pc(3) long local3 = System.nanoTime();
		@Pc(8) long local8 = local3 - this.aLong203;
		this.aLong203 = local3;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray13[this.anInt5405] = local8;
			if (this.anInt5406 < 1) {
				this.anInt5406++;
			}
			this.anInt5405 = (this.anInt5405 + 1) % 10;
		}
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5406; local51++) {
			local1 += this.aLongArray13[(this.anInt5405 + 10 - local51) % 10];
		}
		return local1 / (long) this.anInt5406;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)J")
	@Override
	public long method4595() {
		return this.aLong202;
	}
}

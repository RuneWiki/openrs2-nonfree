import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	private int anInt2053 = 1;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "J")
	private long aLong43 = 0L;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
	private int anInt2054 = 0;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)J")
	@Override
	public long method6603() {
		return this.aLong45;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6600(@OriginalArg(1) long arg0) {
		if (this.aLong45 < this.aLong43) {
			this.aLong44 += this.aLong43 - this.aLong45;
			this.aLong45 += this.aLong43 - this.aLong45;
			this.aLong43 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong43 += arg0;
		} while (local45 < 10 && this.aLong45 > this.aLong43);
		if (this.aLong43 < this.aLong45) {
			this.aLong43 = this.aLong45;
		}
		return local45;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)J")
	@Override
	protected long method6599() {
		this.aLong45 += this.method1962();
		return this.aLong43 > this.aLong45 ? (this.aLong43 - this.aLong45) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	@Override
	public void method6597() {
		this.aLong44 = 0L;
		if (this.aLong43 > this.aLong45) {
			this.aLong45 += this.aLong43 - this.aLong45;
		}
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)J")
	private long method1962() {
		@Pc(4) long local4 = Static277.method5091() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong44;
		this.aLong44 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt2054] = local10;
			if (this.anInt2053 < 10) {
				this.anInt2053++;
			}
			this.anInt2054 = (this.anInt2054 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt2053; local51++) {
			local49 += this.aLongArray2[(this.anInt2054 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt2053;
	}
}

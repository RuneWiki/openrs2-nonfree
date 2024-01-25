import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "J")
	private long aLong49 = 0L;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "J")
	private long aLong48 = 0L;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	private int anInt1570 = 1;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	private int anInt1571 = 0;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class44_Sub2() {
		this.aLong49 = System.nanoTime();
		this.aLong48 = System.nanoTime();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)J")
	private long method1228() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong50;
		this.aLong50 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt1571] = local7;
			this.anInt1571 = (this.anInt1571 + 1) % 10;
			if (this.anInt1570 < 1) {
				this.anInt1570++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt1570; local51++) {
			local49 += this.aLongArray2[(this.anInt1571 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt1570;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)J")
	@Override
	public long method3068() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	@Override
	public void method3065() {
		this.aLong50 = 0L;
		if (this.aLong48 > this.aLong49) {
			this.aLong49 += this.aLong48 - this.aLong49;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)I")
	@Override
	public int method3067(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong49 += this.method1228();
		if (this.aLong48 > this.aLong49) {
			Static360.method4758((this.aLong48 - this.aLong49) / 1000000L);
			this.aLong50 += this.aLong48 - this.aLong49;
			this.aLong49 += this.aLong48 - this.aLong49;
			this.aLong48 += local4;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong48 += local4;
			local30++;
		} while (local30 < 10 && this.aLong49 > this.aLong48);
		if (this.aLong49 > this.aLong48) {
			this.aLong48 = this.aLong49;
		}
		return local30;
	}
}

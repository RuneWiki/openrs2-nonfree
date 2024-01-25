import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
	private int anInt2692 = 0;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	private int anInt2693 = 1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class89_Sub1() {
		this.aLong70 = System.nanoTime();
		this.aLong71 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)J")
	private long method2412() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong72;
		this.aLong72 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt2692] = local7;
			this.anInt2692 = (this.anInt2692 + 1) % 10;
			if (this.anInt2693 < 1) {
				this.anInt2693++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt2693; local55++) {
			local48 += this.aLongArray4[(this.anInt2692 + 10 - local55) % 10];
		}
		return local48 / (long) this.anInt2693;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)J")
	@Override
	protected long method6692() {
		this.aLong70 += this.method2412();
		return this.aLong71 > this.aLong70 ? (this.aLong71 - this.aLong70) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)J")
	@Override
	public long method6694() {
		return this.aLong70;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method6700(@OriginalArg(1) long arg0) {
		if (this.aLong70 < this.aLong71) {
			this.aLong72 += this.aLong71 - this.aLong70;
			this.aLong70 += this.aLong71 - this.aLong70;
			this.aLong71 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			local44++;
			this.aLong71 += arg0;
		} while (local44 < 10 && this.aLong71 < this.aLong70);
		if (this.aLong71 < this.aLong70) {
			this.aLong71 = this.aLong70;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	@Override
	public void method6696() {
		this.aLong72 = 0L;
		if (this.aLong71 > this.aLong70) {
			this.aLong70 += this.aLong71 - this.aLong70;
		}
	}
}

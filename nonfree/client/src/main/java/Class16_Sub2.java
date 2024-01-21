import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	private int anInt2259 = 0;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt2256 = 1;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	private int anInt2258 = 256;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "J")
	private long aLong65 = Static143.method2807();

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class16_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong65;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
	@Override
	public int method1662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2258;
		this.anInt2258 = 300;
		@Pc(14) int local14 = this.anInt2256;
		this.anInt2256 = 1;
		this.aLong65 = Static143.method2807();
		if (this.aLongArray3[this.anInt2260] == 0L) {
			this.anInt2258 = local4;
			this.anInt2256 = local14;
		} else if (this.aLongArray3[this.anInt2260] < this.aLong65) {
			this.anInt2258 = (int) ((long) (arg0 * 2560) / (this.aLong65 - this.aLongArray3[this.anInt2260]));
		}
		if (this.anInt2258 < 25) {
			this.anInt2258 = 25;
		}
		if (this.anInt2258 > 256) {
			this.anInt2258 = 256;
			this.anInt2256 = (int) ((long) arg0 - (this.aLong65 - this.aLongArray3[this.anInt2260]) / 10L);
		}
		if (this.anInt2256 > arg0) {
			this.anInt2256 = arg0;
		}
		this.aLongArray3[this.anInt2260] = this.aLong65;
		this.anInt2260 = (this.anInt2260 + 1) % 10;
		@Pc(122) int local122;
		if (this.anInt2256 > 1) {
			for (local122 = 0; local122 < 10; local122++) {
				if (this.aLongArray3[local122] != 0L) {
					this.aLongArray3[local122] += this.anInt2256;
				}
			}
		}
		if (arg1 > this.anInt2256) {
			this.anInt2256 = arg1;
		}
		Static24.method517((long) this.anInt2256);
		local122 = 0;
		while (this.anInt2259 < 256) {
			this.anInt2259 += this.anInt2258;
			local122++;
		}
		this.anInt2259 &= 0xFF;
		return local122;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method1663() {
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			this.aLongArray3[local12] = 0L;
		}
	}
}

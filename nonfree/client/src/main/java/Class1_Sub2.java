import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	private int anInt1799;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	private int anInt1797 = 0;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt1803 = 1;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	private int anInt1802 = 256;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "J")
	private long aLong57 = Static210.method3307();

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class1_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray2[local22] = this.aLong57;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)I")
	@Override
	public int method1310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt1803;
		this.anInt1803 = 1;
		@Pc(14) int local14 = this.anInt1802;
		this.anInt1802 = 300;
		this.aLong57 = Static210.method3307();
		if (this.aLongArray2[this.anInt1799] == 0L) {
			this.anInt1802 = local14;
			this.anInt1803 = local8;
		} else if (this.aLongArray2[this.anInt1799] < this.aLong57) {
			this.anInt1802 = (int) ((long) (arg1 * 2560) / (this.aLong57 - this.aLongArray2[this.anInt1799]));
		}
		if (this.anInt1802 < 25) {
			this.anInt1802 = 25;
		}
		if (this.anInt1802 > 256) {
			this.anInt1802 = 256;
			this.anInt1803 = (int) ((long) arg1 - (this.aLong57 - this.aLongArray2[this.anInt1799]) / 10L);
		}
		if (arg1 < this.anInt1803) {
			this.anInt1803 = arg1;
		}
		this.aLongArray2[this.anInt1799] = this.aLong57;
		this.anInt1799 = (this.anInt1799 + 1) % 10;
		@Pc(133) int local133;
		if (this.anInt1803 > 1) {
			for (local133 = 0; local133 < 10; local133++) {
				if (this.aLongArray2[local133] != 0L) {
					this.aLongArray2[local133] += this.anInt1803;
				}
			}
		}
		local133 = 0;
		if (this.anInt1803 < arg0) {
			this.anInt1803 = arg0;
		}
		Static119.method1720((long) this.anInt1803);
		while (this.anInt1797 < 256) {
			local133++;
			this.anInt1797 += this.anInt1802;
		}
		this.anInt1797 &= 0xFF;
		return local133;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	@Override
	public void method1313() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray2[local3] = 0L;
		}
	}
}

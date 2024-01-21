import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!k", name = "C", descriptor = "[I")
	public static int[] anIntArray178 = new int[99];

	@OriginalMember(owner = "client!k", name = "s", descriptor = "I")
	private int anInt1717;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "I")
	private int anInt1720;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "I")
	private int anInt1725;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray178[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class29_Sub1() {
		this.method1590();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	@Override
	public void method1591() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray3[local15] = 0L;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	@Override
	public void method1590() {
		this.anInt1727 = 256;
		this.anInt1720 = 0;
		this.anInt1725 = 1;
		this.aLong57 = Static85.method1534();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray3[local20] = this.aLong57;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	@Override
	public int method1589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt1725;
		this.anInt1725 = 1;
		@Pc(14) int local14 = this.anInt1727;
		this.anInt1727 = 300;
		this.aLong57 = Static85.method1534();
		if (this.aLongArray3[this.anInt1717] == 0L) {
			this.anInt1727 = local14;
			this.anInt1725 = local8;
		} else if (this.aLongArray3[this.anInt1717] < this.aLong57) {
			this.anInt1727 = (int) ((long) (arg0 * 2560) / (this.aLong57 - this.aLongArray3[this.anInt1717]));
		}
		if (this.anInt1727 < 25) {
			this.anInt1727 = 25;
		}
		if (this.anInt1727 > 256) {
			this.anInt1727 = 256;
			this.anInt1725 = (int) ((long) arg0 - (this.aLong57 - this.aLongArray3[this.anInt1717]) / 10L);
		}
		if (this.anInt1725 > arg0) {
			this.anInt1725 = arg0;
		}
		this.aLongArray3[this.anInt1717] = this.aLong57;
		this.anInt1717 = (this.anInt1717 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt1725 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray3[local131] != 0L) {
					this.aLongArray3[local131] += this.anInt1725;
				}
			}
		}
		if (this.anInt1725 < arg1) {
			this.anInt1725 = arg1;
		}
		Static72.method1367((long) this.anInt1725);
		local131 = 0;
		while (this.anInt1720 < 256) {
			local131++;
			this.anInt1720 += this.anInt1727;
		}
		this.anInt1720 &= 0xFF;
		return local131;
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
	private int anInt1863;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!gg", name = "qb", descriptor = "I")
	private int anInt1881;

	@OriginalMember(owner = "client!gg", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!gg", name = "xb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
	private int anInt1872;

	@OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	private int anInt1867;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	private int anInt1866;

	@OriginalMember(owner = "client!gg", name = "ob", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!gg", name = "nb", descriptor = "I")
	private int anInt1878;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.method1405();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1872 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt1869 = arg1.method1607();
		} else if (arg0 == 2) {
			this.anInt1866 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt1879 = arg1.method1642();
		} else if (arg0 == 4) {
			this.anInt1867 = arg1.method1642();
		} else if (arg0 == 5) {
			this.anInt1870 = arg1.method1642();
		} else if (arg0 == 6) {
			this.anInt1875 = arg1.method1642();
		} else if (arg0 == 7) {
			this.anInt1878 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = Static18.anIntArray101[arg0] + this.anInt1870; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt1869 && local24 >= this.anIntArray192[local17]) {
				local17++;
			}
			@Pc(60) float local60 = (float) this.anIntArray192[local17 - 1];
			@Pc(66) float local66 = (float) this.anIntArray192[local17];
			if ((float) local24 > local60 + (float) this.anInt1881 && (float) -this.anInt1881 + local66 > (float) local24) {
				for (@Pc(94) int local94 = 0; local94 < Static65.anInt1933; local94++) {
					@Pc(107) int local107 = local17 % 2 == 0 ? this.anInt1867 : -this.anInt1867;
					@Pc(118) int local118 = (this.anInt1868 * local107 >> 12) + Static106.anIntArray284[local94];
					@Pc(120) int local120 = 0;
					while (local118 < 0) {
						local118 += 4096;
					}
					while (local118 > 4096) {
						local118 -= 4096;
					}
					while (local120 < this.anInt1872 && local118 >= this.anIntArrayArray11[local17 - 1][local120]) {
						local120++;
					}
					@Pc(162) float local162 = (float) this.anIntArrayArray11[local17 - 1][local120];
					@Pc(174) float local174 = (float) this.anIntArrayArray11[local17 - 1][local120 - 1];
					if ((float) local118 > local174 + (float) this.anInt1881 && (float) local118 < (float) -this.anInt1881 + local162) {
						local7[local94] = this.anIntArrayArray12[local17 - 1][local120 - 1];
					} else {
						local7[local94] = 0;
					}
				}
			} else {
				Static193.method2479(local7, 0, Static65.anInt1933, 0);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	private void method1405() {
		@Pc(12) Random local12 = new Random((long) this.anInt1869);
		this.anIntArrayArray11 = new int[this.anInt1869][this.anInt1872 + 1];
		this.anIntArrayArray12 = new int[this.anInt1869][this.anInt1872];
		this.anIntArray192 = new int[this.anInt1869 + 1];
		this.anInt1881 = this.anInt1875 / 2;
		this.anInt1868 = 4096 / this.anInt1872;
		this.anInt1863 = 4096 / this.anInt1869;
		@Pc(58) int local58 = this.anInt1868 / 2;
		this.anIntArray192[0] = 0;
		@Pc(68) int local68 = this.anInt1863 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1869; local70++) {
			@Pc(80) int local80;
			@Pc(92) int local92;
			if (local70 > 0) {
				local80 = this.anInt1863;
				local92 = (Static164.method2805(4096, local12) - 2048) * this.anInt1879 >> 12;
				@Pc(100) int local100 = local80 + (local68 * local92 >> 12);
				this.anIntArray192[local70] = this.anIntArray192[local70 - 1] + local100;
			}
			this.anIntArrayArray11[local70][0] = 0;
			for (local80 = 0; local80 < this.anInt1872; local80++) {
				if (local80 > 0) {
					local92 = this.anInt1868;
					@Pc(140) int local140 = (Static164.method2805(4096, local12) - 2048) * this.anInt1866 >> 12;
					local92 += local140 * local58 >> 12;
					this.anIntArrayArray11[local70][local80] = local92 + this.anIntArrayArray11[local70][local80 - 1];
				}
				this.anIntArrayArray12[local70][local80] = this.anInt1878 > 0 ? 4096 - Static164.method2805(this.anInt1878, local12) : 4096;
			}
			this.anIntArrayArray11[local70][this.anInt1872] = 4096;
		}
		this.anIntArray192[this.anInt1869] = 4096;
	}
}

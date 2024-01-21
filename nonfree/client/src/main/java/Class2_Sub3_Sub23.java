import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!q", name = "nb", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!q", name = "R", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!q", name = "W", descriptor = "I")
	private int anInt2842;

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
	private int anInt2848;

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(20) int local20 = this.anInt2848 << 12;
			@Pc(25) int local25 = this.anInt2849 << 12;
			@Pc(32) int local32 = this.anInt2849 * Static50.anIntArray106[arg0];
			for (@Pc(34) int local34 = 0; local34 < Static53.anInt1184; local34++) {
				@Pc(38) int local38 = 0;
				@Pc(45) int local45 = this.anInt2848 * Static43.anIntArray102[local34];
				for (@Pc(47) int local47 = 0; local47 < this.anInt2842; local47++) {
					@Pc(54) int local54 = this.anIntArray267[local47];
					@Pc(59) int local59 = this.anIntArray266[local47];
					@Pc(83) int local83 = this.method2215(local54 * local20 >> 12, local32 * local54 >> 12, local45 * local54 >> 12, local54 * local25 >> 12);
					local38 += local83 * local59 >> 12;
				}
				if (this.aBoolean121) {
					local38 = (local38 >> 1) + 2048;
				}
				local7[local34] = local38;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.method2216();
		this.method2218();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)I")
	private int method2215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xFFFFF000;
		@Pc(11) int local11 = arg2 - local7;
		@Pc(15) int local15 = arg1 & 0xFFFFF000;
		@Pc(19) int local19 = arg1 - local15;
		@Pc(23) int local23 = arg3 & 0xFFFFF000;
		@Pc(27) int local27 = arg0 & 0xFFFFF000;
		@Pc(31) int local31 = local15 >> 12;
		@Pc(35) int local35 = local31 + 1;
		@Pc(39) int local39 = local31 & 0xFF;
		@Pc(43) int local43 = local7 >> 12;
		@Pc(47) int local47 = local43 + 1;
		if (local47 >= local27 >> 12) {
			local47 = 0;
		}
		local7 = local43 & 0xFF;
		local47 &= 0xFF;
		if (local23 >> 12 <= local35) {
			local35 = 0;
		}
		@Pc(89) int local89 = this.anIntArray265[local47 + this.anIntArray265[local39]] % 4;
		@Pc(102) int local102 = this.anIntArray265[local7 + this.anIntArray265[local39]] % 4;
		local35 &= 0xFF;
		@Pc(119) int local119 = this.anIntArray265[local47 + this.anIntArray265[local35]] % 4;
		@Pc(131) int local131 = this.anIntArray265[this.anIntArray265[local35] + local7] % 4;
		@Pc(144) int local144 = Static81.method1394(local11, local19, Static169.anIntArrayArray34[local102]);
		@Pc(154) int local154 = Static81.method1394(local11 - 4096, local19, Static169.anIntArrayArray34[local89]);
		@Pc(164) int local164 = Static81.method1394(local11, local19 - 4096, Static169.anIntArrayArray34[local131]);
		@Pc(176) int local176 = Static81.method1394(local11 - 4096, local19 + -4096, Static169.anIntArrayArray34[local119]);
		@Pc(182) int local182 = Static78.method1256(local11);
		@Pc(188) int local188 = Static78.method1256(local19);
		@Pc(194) int local194 = Static81.method1395(local144, local182, local154);
		@Pc(200) int local200 = Static81.method1395(local164, local182, local176);
		return Static81.method1395(local194, local188, local200);
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
	private void method2216() {
		@Pc(12) Random local12 = new Random((long) this.anInt2839);
		for (@Pc(26) int local26 = 0; local26 < 255; local26++) {
			this.anIntArray265[local26] = -1;
		}
		for (@Pc(41) int local41 = 0; local41 < 255; local41++) {
			@Pc(48) int local48;
			do {
				local48 = Static108.method1830(255, local12);
			} while (this.anIntArray265[local48] != -1);
			this.anIntArray265[local48 + 255] = this.anIntArray265[local48] = local41;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.aBoolean121 = arg1.method2962() == 1;
		} else if (arg0 == 1) {
			this.anInt2842 = arg1.method2962();
		} else if (arg0 == 2) {
			this.anInt2846 = arg1.method2941();
			if (this.anInt2846 < 0) {
				this.anIntArray266 = new int[this.anInt2842];
				for (@Pc(77) int local77 = 0; local77 < this.anInt2842; local77++) {
					this.anIntArray266[local77] = arg1.method2941();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2848 = this.anInt2849 = arg1.method2962();
		} else if (arg0 == 4) {
			this.anInt2839 = arg1.method2962();
		} else if (arg0 == 5) {
			this.anInt2848 = arg1.method2962();
		} else if (arg0 == 6) {
			this.anInt2849 = arg1.method2962();
		}
	}

	@OriginalMember(owner = "client!q", name = "i", descriptor = "(I)V")
	private void method2218() {
		@Pc(39) int local39;
		if (this.anInt2846 > 0) {
			this.anIntArray266 = new int[this.anInt2842];
			this.anIntArray267 = new int[this.anInt2842];
			for (local39 = 0; local39 < this.anInt2842; local39++) {
				this.anIntArray266[local39] = (int) (Math.pow((double) (this.anInt2846 / 4096), (double) local39) * 4096.0D);
				this.anIntArray267[local39] = (int) (Math.pow(2.0D, (double) local39) * 4096.0D);
			}
		} else if (this.anIntArray266 != null && this.anInt2842 == this.anIntArray266.length) {
			this.anIntArray267 = new int[this.anInt2842];
			for (local39 = 0; local39 < this.anInt2842; local39++) {
				this.anIntArray267[local39] = (int) (Math.pow(2.0D, (double) local39) * 4096.0D);
			}
			return;
		}
	}
}

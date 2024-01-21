import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "I")
	private int anInt3210;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(21) int[] local21 = this.method2901(1, arg0);
			@Pc(27) int[] local27 = this.method2901(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static54.anInt1423; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt3210 * local27[local29] >> 12;
				@Pc(56) int local56 = local48 * Static31.anIntArray368[local39] >> 12;
				@Pc(65) int local65 = local29 + (local56 >> 12) & Static73.anInt1916;
				@Pc(73) int local73 = local48 * Static165.anIntArray339[local39] >> 12;
				@Pc(82) int local82 = Static1.anInt2959 & arg0 + (local73 >> 12);
				@Pc(88) int[] local88 = this.method2901(0, local82);
				local11[local29] = local88[local65];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3210 = arg1.method1680() << 4;
		} else if (arg0 == 1) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		Static150.method2329();
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(26) int[] local26 = this.method2901(1, arg0);
			@Pc(32) int[] local32 = this.method2901(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static54.anInt1423; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3210 >> 12;
				@Pc(75) int local75 = local67 * Static31.anIntArray368[local58] >> 12;
				@Pc(83) int local83 = local67 * Static165.anIntArray339[local58] >> 12;
				@Pc(91) int local91 = Static73.anInt1916 & local46 + (local75 >> 12);
				@Pc(99) int local99 = arg0 + (local83 >> 12) & Static1.anInt2959;
				@Pc(105) int[][] local105 = this.method2900(local99, 0);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}
}

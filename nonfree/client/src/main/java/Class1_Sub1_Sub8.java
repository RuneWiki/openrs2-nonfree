import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
	private int anInt1240 = 32768;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(21) int[] local21 = this.method3303(arg0, 1);
			@Pc(27) int[] local27 = this.method3303(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static176.anInt3921; local41++) {
				@Pc(52) int local52 = this.anInt1240 * local27[local41] >> 12;
				@Pc(62) int local62 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local52 * Static143.anIntArray158[local62] >> 12;
				@Pc(79) int local79 = Static70.anInt1730 & local41 + (local70 >> 12);
				@Pc(87) int local87 = local52 * Static21.anIntArray66[local62] >> 12;
				@Pc(96) int local96 = arg0 + (local87 >> 12) & Static134.anInt3338;
				@Pc(102) int[][] local102 = this.method3307(0, local96);
				local31[local41] = local102[0][local79];
				local35[local41] = local102[1][local79];
				local39[local41] = local102[2][local79];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(28) int[] local28 = this.method3303(arg0, 1);
			@Pc(36) int[] local36 = this.method3303(arg0, 2);
			for (@Pc(38) int local38 = 0; local38 < Static176.anInt3921; local38++) {
				@Pc(49) int local49 = this.anInt1240 * local36[local38] >> 12;
				@Pc(57) int local57 = local28[local38] >> 4 & 0xFF;
				@Pc(65) int local65 = Static21.anIntArray66[local57] * local49 >> 12;
				@Pc(73) int local73 = local49 * Static143.anIntArray158[local57] >> 12;
				@Pc(81) int local81 = Static134.anInt3338 & arg0 + (local65 >> 12);
				@Pc(89) int local89 = (local73 >> 12) + local38 & Static70.anInt1730;
				@Pc(95) int[] local95 = this.method3303(local81, 0);
				local18[local38] = local95[local89];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1240 = arg1.method1753() << 4;
		} else if (arg0 == 1) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		Static161.method2763();
	}
}

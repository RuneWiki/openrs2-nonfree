import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2052 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(32) int[] local32 = this.method2901(0, arg0 - 1 & Static1.anInt2959);
			@Pc(38) int[] local38 = this.method2901(0, arg0);
			@Pc(48) int[] local48 = this.method2901(0, Static1.anInt2959 & arg0 + 1);
			for (@Pc(50) int local50 = 0; local50 < Static54.anInt1423; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt2052;
				@Pc(84) int local84 = this.anInt2052 * (local38[local50 + 1 & Static73.anInt1916] - local38[Static73.anInt1916 & local50 - 1]);
				@Pc(88) int local88 = local64 >> 12;
				@Pc(94) int local94 = local88 * local88 >> 12;
				@Pc(98) int local98 = local84 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((local104 + local94 + 4096) / 4096)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local126;
			}
		}
		return local18;
	}
}

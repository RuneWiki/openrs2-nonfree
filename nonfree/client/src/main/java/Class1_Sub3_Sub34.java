import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
	private int anInt4851 = 32768;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4851 = arg0.method2691() << 4;
		} else if (arg1 == 1) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(30) int[] local30 = this.method4450(1, arg0);
			@Pc(36) int[] local36 = this.method4450(2, arg0);
			@Pc(40) int[] local40 = local19[0];
			@Pc(44) int[] local44 = local19[1];
			@Pc(48) int[] local48 = local19[2];
			for (@Pc(50) int local50 = 0; local50 < Static227.anInt4511; local50++) {
				@Pc(67) int local67 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(76) int local76 = this.anInt4851 * local36[local50] >> 12;
				@Pc(84) int local84 = Static112.anIntArray231[local67] * local76 >> 12;
				@Pc(92) int local92 = Static281.anIntArray463[local67] * local76 >> 12;
				@Pc(100) int local100 = Static202.anInt4099 & (local84 >> 12) + arg0;
				@Pc(109) int local109 = Static229.anInt4527 & local50 + (local92 >> 12);
				@Pc(115) int[][] local115 = this.method4455(0, local100);
				local40[local50] = local115[0][local109];
				local44[local50] = local115[1][local109];
				local48[local50] = local115[2][local109];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(18) int[] local18 = this.method4450(1, arg0);
			@Pc(24) int[] local24 = this.method4450(2, arg0);
			for (@Pc(26) int local26 = 0; local26 < Static227.anInt4511; local26++) {
				@Pc(38) int local38 = this.anInt4851 * local24[local26] >> 12;
				@Pc(46) int local46 = local18[local26] >> 4 & 0xFF;
				@Pc(54) int local54 = Static281.anIntArray463[local46] * local38 >> 12;
				@Pc(62) int local62 = Static112.anIntArray231[local46] * local38 >> 12;
				@Pc(70) int local70 = (local54 >> 12) + local26 & Static229.anInt4527;
				@Pc(78) int local78 = Static202.anInt4099 & (local62 >> 12) + arg0;
				@Pc(84) int[] local84 = this.method4450(0, local78);
				local7[local26] = local84[local70];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		Static19.method365();
	}
}

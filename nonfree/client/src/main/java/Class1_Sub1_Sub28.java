import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	private int anInt4405 = 32768;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(28) int[] local28 = this.method4464(arg0, 1);
			@Pc(34) int[] local34 = this.method4464(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static6.anInt4960; local36++) {
				@Pc(48) int local48 = this.anInt4405 * local34[local36] >> 12;
				@Pc(56) int local56 = local28[local36] >> 4 & 0xFF;
				@Pc(64) int local64 = Static58.anIntArray98[local56] * local48 >> 12;
				@Pc(72) int local72 = local48 * Static192.anIntArray396[local56] >> 12;
				@Pc(80) int local80 = (local72 >> 12) + local36 & Static274.anInt5042;
				@Pc(89) int local89 = arg0 + (local64 >> 12) & Static202.anInt3956;
				@Pc(95) int[] local95 = this.method4464(local89, 0);
				local18[local36] = local95[local80];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		Static129.method2272();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(28) int[] local28 = this.method4464(arg0, 1);
			@Pc(34) int[] local34 = this.method4464(arg0, 2);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[2];
			@Pc(46) int[] local46 = local11[1];
			for (@Pc(48) int local48 = 0; local48 < Static6.anInt4960; local48++) {
				@Pc(65) int local65 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(74) int local74 = local34[local48] * this.anInt4405 >> 12;
				@Pc(82) int local82 = Static192.anIntArray396[local65] * local74 >> 12;
				@Pc(90) int local90 = Static58.anIntArray98[local65] * local74 >> 12;
				@Pc(98) int local98 = local48 + (local82 >> 12) & Static274.anInt5042;
				@Pc(106) int local106 = (local90 >> 12) + arg0 & Static202.anInt3956;
				@Pc(112) int[][] local112 = this.method4456(local106, 0);
				local38[local48] = local112[0][local98];
				local46[local48] = local112[1][local98];
				local42[local48] = local112[2][local98];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4405 = arg0.method1879() << 4;
		} else if (arg1 == 1) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}
}

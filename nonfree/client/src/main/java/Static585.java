import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "[[Lclient!caa;")
	public static Class12_Sub2[][] aClass12_Sub2ArrayArray3;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
	public static int anInt9495;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "[Lclient!vba;")
	public static Class345[] aClass345Array1 = null;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "[I")
	public static final int[] anIntArray614 = new int[3];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZB)V")
	public static void method7578(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static122.anInt2094 != -1) {
				Static453.method5905(Static122.anInt2094);
			}
			for (@Pc(19) Class2_Sub33 local19 = (Class2_Sub33) Static346.aClass90_17.method1676(); local19 != null; local19 = (Class2_Sub33) Static346.aClass90_17.method1680()) {
				if (!local19.method7656()) {
					local19 = (Class2_Sub33) Static346.aClass90_17.method1676();
					if (local19 == null) {
						break;
					}
				}
				Static393.method5411(false, local19, true);
			}
			Static122.anInt2094 = -1;
			Static346.aClass90_17 = new Class90(8);
			Static397.method5455();
			Static122.anInt2094 = Static579.anInt9400;
			Static579.method7524(false);
			Static549.method7175();
			Static566.method7401(Static122.anInt2094);
		}
		Static6.aString4 = "";
		Static64.aString14 = "";
		Static433.aBoolean571 = false;
		Static18.method3528();
		Static409.anInt6677 = -1;
		Static584.method7572(Static36.anInt668);
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 = new Class12_Sub2_Sub1_Sub4_Sub1();
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] = Static281.anInt4822 / 2;
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 = Static281.anInt4822 * 512 / 2;
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 = Static29.anInt491 * 512 / 2;
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] = Static29.anInt491 / 2;
		Static469.anInt7519 = 0;
		Static285.anInt2206 = 0;
		if (Static489.anInt7763 == 2) {
			Static469.anInt7519 = Static259.anInt4284 << 9;
			Static285.anInt2206 = Static388.anInt6396 << 9;
		} else {
			Static317.method4598();
		}
		Static113.method1669();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public static void method7579() {
		if (Static560.aClass232_19 != Static416.aClass232_7) {
			try {
				Static597.method3394("tbrefresh", Static474.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZLclient!r;Lclient!lt;II)V")
	public static void method7586(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) Class216 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class252 local9 = Static369.aClass212_6.method4407(arg2.anInt5273);
		if (local9.anInt6295 == -1) {
			return;
		}
		if (arg2.aBoolean413) {
			@Pc(22) int local22 = arg0 + arg2.anInt5289;
			arg0 = local22 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class38 local38 = local9.method5256(arg2.aBoolean412, arg0, arg1);
		if (local38 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt5287;
		@Pc(52) int local52 = arg2.anInt5244;
		if ((arg0 & 0x1) == 1) {
			local52 = arg2.anInt5287;
			local49 = arg2.anInt5244;
		}
		@Pc(66) int local66 = local38.A();
		@Pc(69) int local69 = local38.ca();
		if (local9.aBoolean494) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local9.anInt6300 == 0) {
			local38.method7466(arg3, arg4 - (local52 - 1) * 4, local66, local69);
		} else {
			local38.method7461(arg3, arg4 - (local52 - 1) * 4, local66, local69, 0, local9.anInt6300 | 0xFF000000, 1);
		}
	}
}

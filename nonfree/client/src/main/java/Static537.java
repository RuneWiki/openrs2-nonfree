import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!te", name = "F", descriptor = "Z")
	public static boolean aBoolean779 = false;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!vv;")
	public static final Class363 aClass363_6 = new Class363();

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	public static void method7636() {
		if (Static47.aClass33_3 == null) {
			return;
		}
		if (Static349.aBoolean590) {
			Static640.method8632();
		}
		Static625.aClass70_2.method2571();
		Static59.method8063();
		Static603.method8219();
		Static260.method4859();
		Static227.method4348();
		Static633.method8555();
		if (Static278.aClass147_5 != null) {
			Static278.aClass147_5.method4613();
		}
		Static202.method3954();
		Static598.method8184();
		Static440.method6685();
		Static396.method6338();
		Static234.method4503(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class2_Sub3_Sub1_Sub2_Sub2 local51 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local45];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass128Array3.length; local55++) {
					local51.aClass128Array3[local55] = null;
				}
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static234.anInt5314; local80++) {
			@Pc(87) Class2_Sub3_Sub1_Sub2_Sub1 local87 = Static482.aClass3_Sub49Array1[local80].aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (local87 != null) {
				for (@Pc(91) int local91 = 0; local91 < local87.aClass128Array3.length; local91++) {
					local87.aClass128Array3[local91] = null;
				}
			}
		}
		Static39.aClass47_1 = null;
		Static456.aClass47_9 = null;
		Static47.aClass33_3.method6151();
		Static47.aClass33_3 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([SI)[S")
	public static short[] method7639(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static655.method6402(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}

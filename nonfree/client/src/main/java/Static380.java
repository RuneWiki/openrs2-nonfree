import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!ec;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public static int anInt6430 = 0;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public static int anInt6431 = 16777215;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	public static void method5086() {
		Static159.method2586(Static331.aClass54_83);
		for (@Pc(17) Class2_Sub35 local17 = (Class2_Sub35) Static113.aClass163_11.method3771(); local17 != null; local17 = (Class2_Sub35) Static113.aClass163_11.method3770()) {
			if (!local17.method5865()) {
				local17 = (Class2_Sub35) Static113.aClass163_11.method3771();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt5541 == 0) {
				Static313.method4400(local17, true, true);
			}
		}
		if (Static412.aClass68_14 != null) {
			Static78.method1460(Static412.aClass68_14);
			Static412.aClass68_14 = null;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!mg;B)V")
	public static void method5087(@OriginalArg(0) Class160 arg0) {
		Static117.anInt2657 = 0;
		Static314.anInt5540 = 0;
		Static28.aClass112_3 = new Class112();
		Static229.aClass8_Sub2_Sub1_Sub1Array2 = new Class8_Sub2_Sub1_Sub1[1024];
		Static213.method3365(arg0);
		Static190.method3001(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!mg;I)V")
	public static void method5088(@OriginalArg(0) Class160 arg0) {
		Static317.aClass160_63 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method5089() {
		if (Static341.anInt2745 <= 0) {
			Static20.aString3 = "";
			return;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static311.aStringArray39.length; local20++) {
			if (Static311.aStringArray39[local20].startsWith("--> ")) {
				local18++;
				if (local18 == Static341.anInt2745) {
					Static20.aString3 = Static311.aStringArray39[local20].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V")
	public static void method5090(@OriginalArg(1) int arg0) {
		Static434.anIntArray604 = new int[arg0];
		Static217.anIntArray358 = new int[arg0];
		Static236.anIntArray382 = new int[arg0];
		Static245.anIntArray552 = new int[arg0];
		Static195.anIntArray333 = new int[arg0];
	}
}

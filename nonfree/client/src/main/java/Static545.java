import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_153 = new Class251(17, 11);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[Lclient!id;")
	public static Class169_Sub1[] aClass169_Sub1Array2 = new Class169_Sub1[0];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method5449(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static10.method117(arg0, arg1) : Integer.toString(arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5450(@OriginalArg(0) Class144 arg0) {
		if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != Static494.anInt8618 && (Static63.aClass89ArrayArrayArray1 != null && Static653.method9144(arg0, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146))) {
			Static494.anInt8618 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZZ)V")
	public static void method5452(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 >= -88) {
			return;
		}
		if (arg1) {
			Static87.anInt1475--;
			if (Static87.anInt1475 == 0) {
				Static441.anIntArray394 = null;
			}
		}
		if (arg2) {
			Static387.anInt9115--;
			if (Static387.anInt9115 == 0) {
				Static302.anIntArray299 = null;
			}
		}
	}
}

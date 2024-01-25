import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_10 = new Class216(72, 2);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method641(@OriginalArg(0) String arg0) {
		if (Class4_Sub5_Sub13.aString48.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class4_Sub5_Sub13.aString48.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class4_Sub5_Sub13.aString48.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public static void method642() {
		Static419.method5754();
		Static58.aClass151_23 = null;
		Static568.aClass151_190 = null;
		Static650.aClass151_220 = null;
		Static86.aClass151_42 = null;
		Static583.anInt8992 = 0;
		Static179.anInt3120 = 0;
		Static163.anInt2980 = 0;
		Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
		Static519.method7020();
		Static93.method1895();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local30] = null;
		}
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 = null;
		for (@Pc(46) int local46 = 0; local46 < Static15.anInt1571; local46++) {
			@Pc(53) Class3_Sub1_Sub2_Sub2_Sub2 local53 = Static238.aClass4_Sub45Array1[local46].aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (local53 != null) {
				local53.anInt9947 = -1;
			}
		}
		Static478.method6573();
		Static286.anInt4563 = -1;
		Static77.anInt1632 = -1;
		Static259.anInt4200 = 1;
		Static53.method1256(10);
		for (@Pc(75) int local75 = 0; local75 < 100; local75++) {
			Static109.aBooleanArray4[local75] = true;
		}
		Static654.method8727();
		Static307.aLong264 = 0L;
		Static290.aClass4_Sub14_2 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method643(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static85.method1764(arg2, 0, arg0, arg3, arg5, arg4, arg1);
	}
}

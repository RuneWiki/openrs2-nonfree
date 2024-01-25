import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "Lclient!lg;")
	public static Class177 aClass177_4;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_11 = new Class174(8);

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ks;)I")
	public static int method3452(@OriginalArg(1) Class47_Sub2_Sub3_Sub2 arg0) {
		@Pc(6) int local6 = arg0.anInt5115;
		@Pc(10) Class255 local10 = arg0.method4356();
		if (arg0.aBoolean343) {
			local6 = arg0.anInt5106;
		} else if (arg0.anInt5039 == local10.anInt7262 || local10.anInt7278 == arg0.anInt5039 || local10.anInt7259 == arg0.anInt5039 || local10.anInt7300 == arg0.anInt5039) {
			local6 = arg0.anInt5111;
		} else if (arg0.anInt5039 == local10.anInt7288 || local10.anInt7270 == arg0.anInt5039 || arg0.anInt5039 == local10.anInt7287 || local10.anInt7268 == arg0.anInt5039) {
			local6 = arg0.anInt5121;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static43.method1389(arg2)) {
			if (Static539.aClass309ArrayArray3[arg2] == null) {
				Static127.method2787(arg7, Static352.aClass309ArrayArray2[arg2], arg0, arg5, arg4, arg1, -1, arg3, arg6);
			} else {
				Static127.method2787(arg7, Static539.aClass309ArrayArray3[arg2], arg0, arg5, arg4, arg1, -1, arg3, arg6);
			}
		} else if (arg6 == -1) {
			for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
				Static145.aBooleanArray14[local22] = true;
			}
		} else {
			Static145.aBooleanArray14[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIJIZILjava/lang/String;ZIILjava/lang/String;)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9) {
		if (!Static25.aBoolean94 && Static267.anInt5167 < 500) {
			@Pc(21) int local21 = arg1 == -1 ? Static151.anInt3437 : arg1;
			@Pc(35) Class1_Sub50 local35 = new Class1_Sub50(arg5, arg9, local21, arg4, arg7, arg2, arg8, arg0, arg3, arg6);
			Static475.aClass38_69.method1426(local35);
			Static267.anInt5167++;
		}
	}
}

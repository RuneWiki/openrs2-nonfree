import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qn;I)I")
	public static int method60(@OriginalArg(0) Class211 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4382(Static208.anInt6830)) {
			local5++;
		}
		if (arg0.method4382(Static28.anInt7409)) {
			local5++;
		}
		if (arg0.method4382(Static198.anInt5152)) {
			local5++;
		}
		if (arg0.method4382(Static84.anInt5161)) {
			local5++;
		}
		if (arg0.method4382(Static60.anInt1089)) {
			local5++;
		}
		if (arg0.method4382(Static31.anInt529)) {
			local5++;
		}
		if (arg0.method4382(Static390.anInt7647)) {
			local5++;
		}
		if (arg0.method4382(Static140.anInt2516)) {
			local5++;
		}
		if (arg0.method4382(Static389.anInt6347)) {
			local5++;
		}
		if (arg0.method4382(Static175.anInt3188)) {
			local5++;
		}
		if (arg0.method4382(Static151.anInt2739)) {
			local5++;
		}
		if (arg0.method4382(Static194.anInt7190)) {
			local5++;
		}
		if (arg0.method4382(Static445.anInt7464)) {
			local5++;
		}
		if (arg0.method4382(Static216.anInt3706)) {
			local5++;
		}
		if (arg0.method4382(Static327.anInt5282)) {
			local5++;
		}
		if (arg0.method4382(Static133.anInt2433)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method61(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(2, arg0);
		local8.method5529();
		local8.aString71 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method62() {
		Static172.aClass135_4.method5382(Static427.aFloat28, Static4.aFloat5, Static363.aFloat68);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V")
	public static void method66(@OriginalArg(0) boolean arg0) {
		Static150.method2112();
		if (!Static130.method1856(Static8.anInt119)) {
			return;
		}
		Static351.anInt5837++;
		if (Static351.anInt5837 < 50 && !arg0) {
			return;
		}
		Static351.anInt5837 = 0;
		if (!Static188.aBoolean267 && Static338.aClass152_4 != null) {
			Static448.method5935(Static278.aClass146_62);
			try {
				Static338.aClass152_4.method2926(Static247.aClass4_Sub9_Sub2_2.anInt6207, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
				Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
			} catch (@Pc(56) IOException local56) {
				Static188.aBoolean267 = true;
			}
		}
		Static150.method2112();
	}
}

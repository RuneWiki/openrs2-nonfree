import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "Lclient!hw;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
	public static int anInt7150;

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
	public static int anInt7153;

	@OriginalMember(owner = "client!ot", name = "L", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)Lclient!lo;")
	public static Class217 method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static421.aClass217ArrayArrayArray5[0][arg1][arg2] != null && Static421.aClass217ArrayArrayArray5[0][arg1][arg2].aClass217_1 != null;
			if (local28 && arg0 >= Static68.anInt1380 - 1) {
				return null;
			}
			Static308.method6295(arg0, arg1, arg2);
		}
		return Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZLclient!ul;)V")
	public static void method6335(@OriginalArg(2) Class5_Sub1_Sub5 arg0) {
		Static422.aClass93_3.method6363(arg0);
		Static320.method4867(Static616.aClass207_125, Static503.aClass207_106, Static610.aClass207_123, Static422.aClass93_3, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	public static int anInt7603 = 0;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Lclient!ph;")
	public static final Class193 aClass193_7 = new Class193("WTRC", 1);

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hd;")
	public static RuntimeException_Sub1 method6227(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString21 = local12.aString21 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6230(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static95.anInt2186;
		@Pc(9) int[] local9 = Static178.anIntArray542;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(29) Class3_Sub2_Sub1_Sub2 local29 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local9[local13]];
			if (local29 != null && Static302.aClass3_Sub2_Sub1_Sub2_2 != local29 && local29.aString54 != null && local29.aString54.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static403.method5961(Static425.aClass92_117);
					Static109.aClass6_Sub1_Sub1_5.method6481(0);
					Static109.aClass6_Sub1_Sub1_5.method6453(local9[local13]);
				} else if (arg1 == 4) {
					Static403.method5961(Static99.aClass92_121);
					Static109.aClass6_Sub1_Sub1_5.method6464(local9[local13]);
					Static109.aClass6_Sub1_Sub1_5.method6437(0);
				} else if (arg1 == 5) {
					Static403.method5961(Static324.aClass92_112);
					Static109.aClass6_Sub1_Sub1_5.method6436(local9[local13]);
					Static109.aClass6_Sub1_Sub1_5.method6439(0);
				} else if (arg1 == 6) {
					Static403.method5961(Static374.aClass92_136);
					Static109.aClass6_Sub1_Sub1_5.method6464(local9[local13]);
					Static109.aClass6_Sub1_Sub1_5.method6456(0);
				} else if (arg1 == 7) {
					Static403.method5961(Static34.aClass92_143);
					Static109.aClass6_Sub1_Sub1_5.method6437(0);
					Static109.aClass6_Sub1_Sub1_5.method6436(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static61.method1338(Static372.aClass267_89.method6581(Static161.anInt3239) + arg0);
		}
	}
}

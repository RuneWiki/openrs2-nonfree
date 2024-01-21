import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt228 = -1;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!fc;")
	private static Class25 aClass25_121 = Static78.method1313("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	public static int anInt231 = 1;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!fc;")
	private static Class25 aClass25_124 = Static78.method1313("glow1:");

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_122 = aClass25_124;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "Lclient!fc;")
	private static Class25 aClass25_130 = Static78.method1313("purple:");

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_123 = aClass25_130;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
	public static int anInt234 = 1;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_125 = aClass25_121;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_126 = aClass25_124;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Lclient!fc;")
	public static Class25 aClass25_127 = aClass25_130;

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "Lclient!fc;")
	public static Class25 aClass25_128 = Static78.method1313("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "Lclient!fc;")
	private static Class25 aClass25_129 = Static78.method1313("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_131 = aClass25_129;

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "Lclient!oa;")
	public static Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Lclient!fc;II)Lclient!fc;")
	public static Class25 method228(@OriginalArg(0) int arg0, @OriginalArg(1) Class25[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg1[local9 + arg0] == null) {
				arg1[local9 + arg0] = Static39.aClass25_460;
			}
			local7 += arg1[local9 + arg0].anInt956;
		}
		@Pc(43) byte[] local43 = new byte[local7];
		@Pc(45) int local45 = 0;
		@Pc(62) Class25 local62;
		for (@Pc(47) int local47 = 0; local47 < arg2; local47++) {
			local62 = arg1[arg0 + local47];
			Static132.method848(local62.aByteArray15, 0, local43, local45, local62.anInt956);
			local45 += local62.anInt956;
		}
		local62 = new Class25();
		local62.aByteArray15 = local43;
		local62.anInt956 = local7;
		return local62;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method230(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static11.aClass29_1);
		arg0.removeFocusListener(Static11.aClass29_1);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method231() {
		aClass25_128 = null;
		aClass25_131 = null;
		aClass25_127 = null;
		aClass61_1 = null;
		anIntArray43 = null;
		aClass25_126 = null;
		aClass25_122 = null;
		aClass25_130 = null;
		aClass25_121 = null;
		aClass25_125 = null;
		aClass25_123 = null;
		aClass25_124 = null;
		aClass25_129 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public static void method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class2 local11 = Static7.aClass2ArrayArrayArray1[Static21.anInt596][arg1][arg0];
		if (local11 == null) {
			Static118.aClass4_1.method88(Static21.anInt596, arg1, arg0);
			return;
		}
		@Pc(21) Class1_Sub2_Sub3_Sub3 local21 = null;
		@Pc(30) Class1_Sub2_Sub3_Sub3 local30 = (Class1_Sub2_Sub3_Sub3) local11.method22();
		@Pc(32) int local32 = -99999999;
		while (local30 != null) {
			@Pc(38) Class1_Sub2_Sub16 local38 = Static33.method736(local30.anInt1448);
			@Pc(41) int local41 = local38.anInt2149;
			if (local38.anInt2152 == 1) {
				local41 *= local30.anInt1443 + 1;
			}
			if (local32 < local41) {
				local21 = local30;
				local32 = local41;
			}
			local30 = (Class1_Sub2_Sub3_Sub3) local11.method23();
		}
		if (local21 == null) {
			Static118.aClass4_1.method88(Static21.anInt596, arg1, arg0);
			return;
		}
		local11.method26(local21);
		@Pc(84) Class1_Sub2_Sub3_Sub3 local84 = null;
		local30 = (Class1_Sub2_Sub3_Sub3) local11.method22();
		@Pc(91) Class1_Sub2_Sub3_Sub3 local91 = null;
		while (local30 != null) {
			if (local30.anInt1448 != local21.anInt1448) {
				if (local84 == null) {
					local84 = local30;
				}
				if (local30.anInt1448 != local84.anInt1448 && local91 == null) {
					local91 = local30;
				}
			}
			local30 = (Class1_Sub2_Sub3_Sub3) local11.method23();
		}
		@Pc(130) int local130 = arg1 + (arg0 << 7) + 1610612736;
		Static118.aClass4_1.method54(Static21.anInt596, arg1, arg0, Static129.method2048(arg0 * 128 + 64, Static21.anInt596, arg1 * 128 + 64), local21, local130, local84, local91);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1306 = Static34.method846("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1303 = aClass55_1306;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1304 = Static34.method846("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
	public static int[] anIntArray293 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1305 = Static34.method846("hitmarks");

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1307 = Static34.method846("Ausw-=hlen");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)Lclient!rc;")
	public static Class55 method2010(@OriginalArg(2) int arg0) {
		return Static66.method1358(arg0, true);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method2011() {
		aClass55_1306 = null;
		aClass55_1305 = null;
		anIntArray293 = null;
		aClass55_1303 = null;
		aClass55_1307 = null;
		aClass55_1304 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rc;ZLclient!rc;B)V")
	public static void method2013(@OriginalArg(0) Class55 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class55 arg2) {
		@Pc(5) short local5 = 151;
		@Pc(6) int local6 = local5 - 3;
		if (Static52.aBoolean74) {
			Static52.aBoolean74 = false;
			Static93.method1775();
			Static55.method1170();
			Static92.method1746();
			Static61.method1313();
			Static24.method696(Static4.aClass6_Sub2_Sub2_Sub4_6, Static112.anInt3231, Static12.anInt717, Static41.anInt1399);
			Static92.method1750(Static100.anIntArray277, Static112.anInt3228, Static14.anInt804 == -1, -1);
			Static88.aBoolean166 = true;
			Static21.aBoolean42 = true;
			Static21.aBoolean43 = true;
		}
		Static28.method738();
		Static4.aClass6_Sub2_Sub2_Sub4_6.method1307(arg2, 257, 148, 0);
		Static4.aClass6_Sub2_Sub2_Sub4_6.method1307(arg2, 256, 147, 16777215);
		if (arg0 != null) {
			local6 += 15;
			if (arg1) {
				@Pc(76) int local76 = Static4.aClass6_Sub2_Sub2_Sub4_6.method1301(arg0) + 4;
				Static53.method1276(257 - local76 / 2, 152, local76, 11, 0);
			}
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1307(arg0, 257, 163, 0);
			Static4.aClass6_Sub2_Sub2_Sub4_6.method1307(arg0, 256, 162, 16777215);
		}
		Static66.method1359();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!b;IIIIIII)V")
	public static void method2014(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(37) int local37;
		if (arg3 < 0 || arg3 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local37 = arg0.method1495();
				if (local37 == 0) {
					return;
				}
				if (local37 == 1) {
					arg0.method1495();
					return;
				}
				if (local37 <= 49) {
					arg0.method1495();
				}
			}
			return;
		}
		Static43.aByteArrayArrayArray8[arg2][arg3][arg6] = 0;
		while (true) {
			local37 = arg0.method1495();
			if (local37 == 0) {
				if (arg2 == 0) {
					Static6.anIntArrayArrayArray1[0][arg3][arg6] = -Static13.method501(arg1 + arg3 + 932731, arg5 + arg6 + 556238) * 8;
					return;
				} else {
					Static6.anIntArrayArrayArray1[arg2][arg3][arg6] = Static6.anIntArrayArrayArray1[arg2 - 1][arg3][arg6] - 240;
					return;
				}
			}
			if (local37 == 1) {
				@Pc(94) int local94 = arg0.method1495();
				if (local94 == 1) {
					local94 = 0;
				}
				if (arg2 != 0) {
					Static6.anIntArrayArrayArray1[arg2][arg3][arg6] = Static6.anIntArrayArrayArray1[arg2 - 1][arg3][arg6] - local94 * 8;
					return;
				}
				Static6.anIntArrayArrayArray1[0][arg3][arg6] = -local94 * 8;
				return;
			}
			if (local37 <= 49) {
				Static54.aByteArrayArrayArray9[arg2][arg3][arg6] = arg0.method1484();
				Static13.aByteArrayArrayArray4[arg2][arg3][arg6] = (byte) ((local37 - 2) / 4);
				Static20.aByteArrayArrayArray6[arg2][arg3][arg6] = (byte) (arg4 + local37 - 2 & 0x3);
			} else if (local37 <= 81) {
				Static43.aByteArrayArrayArray8[arg2][arg3][arg6] = (byte) (local37 - 49);
			} else {
				Static20.aByteArrayArrayArray7[arg2][arg3][arg6] = (byte) (local37 - 81);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public static int anInt1608;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "S")
	public static short aShort5 = 32767;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!pk;Lclient!pk;Lclient!jj;IZ)V")
	public static void method1177(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class8_Sub1_Sub5_Sub2 arg2) {
		Static53.aBoolean84 = true;
		Static120.aClass132_42 = arg1;
		Static203.aClass132_68 = arg0;
		@Pc(15) int local15 = Static120.aClass132_42.method3193() - 1;
		Static200.anInt4048 = Static120.aClass132_42.method3189(local15) + local15 * 256;
		Static153.aStringArray43 = new String[] { null, null, null, null, Static70.aString59 };
		Static132.aClass8_Sub1_Sub5_Sub2_3 = arg2;
		Static180.aStringArray53 = new String[] { null, null, Static28.aString29, null, null };
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
	public static void method1178() {
		if (Static30.anInt726 == -1 || Static115.anInt2342 == -1) {
			return;
		}
		@Pc(27) int local27 = ((Static292.anInt5658 - Static206.anInt4270) * Static153.anInt3122 >> 16) + Static206.anInt4270;
		Static153.anInt3122 += local27;
		if (Static153.anInt3122 >= 65535) {
			if (Static59.aBoolean95) {
				Static257.aBoolean412 = false;
			} else {
				Static257.aBoolean412 = true;
			}
			Static153.anInt3122 = 65535;
			Static59.aBoolean95 = true;
		} else {
			Static59.aBoolean95 = false;
			Static257.aBoolean412 = false;
		}
		@Pc(59) float local59 = (float) Static153.anInt3122 / 65535.0F;
		@Pc(62) float[] local62 = new float[3];
		@Pc(71) int local71 = Static214.anInt4399 * 2;
		@Pc(131) int local131;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(171) int local171;
		@Pc(166) int local166;
		@Pc(157) int local157;
		for (@Pc(73) int local73 = 0; local73 < 3; local73++) {
			local88 = Static230.anIntArrayArrayArray11[Static30.anInt726][local71 + 1][local73] * 3;
			local121 = (Static230.anIntArrayArrayArray11[Static30.anInt726][local71 + 2][local73] + Static230.anIntArrayArrayArray11[Static30.anInt726][local71 + 2][local73] - Static230.anIntArrayArrayArray11[Static30.anInt726][local71 + 3][local73]) * 3;
			local131 = Static230.anIntArrayArrayArray11[Static30.anInt726][local71][local73] * 3;
			local139 = Static230.anIntArrayArrayArray11[Static30.anInt726][local71][local73];
			local157 = local88 + Static230.anIntArrayArrayArray11[Static30.anInt726][local71 + 2][local73] - local121 - local139;
			local166 = local131 + local121 - local88 * 2;
			local171 = local88 - local131;
			local62[local73] = (float) local139 + local59 * (((float) local166 + local59 * (float) local157) * local59 + (float) local171);
		}
		Static170.anInt3411 = (int) local62[1] * -1;
		Static185.anInt3689 = (int) local62[2] - Static130.anInt2601 * 128;
		@Pc(214) float[] local214 = new float[3];
		Static46.anInt1044 = (int) local62[0] - Static49.anInt1089 * 128;
		local131 = Static212.anInt4367 * 2;
		for (local88 = 0; local88 < 3; local88++) {
			local121 = Static230.anIntArrayArrayArray11[Static115.anInt2342][local131][local88] * 3;
			local166 = Static230.anIntArrayArrayArray11[Static115.anInt2342][local131][local88];
			local171 = (Static230.anIntArrayArrayArray11[Static115.anInt2342][local131 + 2][local88] + Static230.anIntArrayArrayArray11[Static115.anInt2342][local131 + 2][local88] - Static230.anIntArrayArrayArray11[Static115.anInt2342][local131 + 3][local88]) * 3;
			local139 = Static230.anIntArrayArrayArray11[Static115.anInt2342][local131 + 1][local88] * 3;
			local157 = local139 - local121;
			@Pc(311) int local311 = local121 + local171 - local139 * 2;
			@Pc(329) int local329 = local139 + Static230.anIntArrayArrayArray11[Static115.anInt2342][local131 - -2][local88] - local171 - local166;
			local214[local88] = (((float) local311 + (float) local329 * local59) * local59 + (float) local157) * local59 + (float) local166;
		}
		@Pc(361) float local361 = local214[0] - local62[0];
		@Pc(372) float local372 = -1.0F * (local214[1] - local62[1]);
		@Pc(380) float local380 = local214[2] - local62[2];
		@Pc(390) double local390 = Math.sqrt((double) (local361 * local361 + local380 * local380));
		Static276.aFloat61 = (float) Math.atan2((double) local372, local390);
		Static210.aFloat46 = -((float) Math.atan2((double) local361, (double) local380));
		Static293.anInt5684 = (int) ((double) Static210.aFloat46 * 325.949D) & 0x7FF;
		Static56.anInt1246 = (int) ((double) Static276.aFloat61 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIBIII)V")
	public static void method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) Class18[] local14 = Static245.aClass18Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(24) Class18 local24 = local14[local16];
			if (local24 != null && local24.anInt668 == 2) {
				Static208.method3296(arg4, arg3, arg1 >> 1, arg5 >> 1, (local24.anInt675 - Static49.anInt1089 << 7) + local24.anInt663, local24.anInt678 * 2, (local24.anInt664 - Static130.anInt2601 << 7) + local24.anInt672);
				if (Static292.anInt5663 > -1 && Static183.anInt3590 % 20 < 10) {
					Static198.aClass8_Sub1_Sub7Array85[local24.anInt674].method2811(arg0 + Static292.anInt5663 - 12, arg2 + -28 + Static246.anInt4896);
				}
			}
		}
	}
}

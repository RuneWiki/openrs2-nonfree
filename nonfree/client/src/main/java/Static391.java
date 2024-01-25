import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "Lclient!pja;")
	public static Class6_Sub4_Sub12 aClass6_Sub4_Sub12_3;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
	public static int anInt6569;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIII)I")
	public static int method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(22) int local22 = arg0 / arg1;
		@Pc(28) int local28 = arg0 & arg1 - 1;
		@Pc(33) int local33 = Static469.method6918(local22, local7);
		@Pc(40) int local40 = Static469.method6918(local22, local7 + 1);
		@Pc(49) int local49 = Static469.method6918(local22 + 1, local7);
		@Pc(58) int local58 = Static469.method6918(local22 + 1, local7 + 1);
		@Pc(65) int local65 = Static143.method2104(local40, local13, local33, arg1);
		@Pc(72) int local72 = Static143.method2104(local58, local13, local49, arg1);
		return Static143.method2104(local72, local28, local65, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIII)V")
	public static void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static154.method2176(arg2, Static292.anInt4921, Static55.anInt4238);
		@Pc(17) int local17 = Static154.method2176(arg1, Static292.anInt4921, Static55.anInt4238);
		@Pc(23) int local23 = Static154.method2176(arg0, Static153.anInt2554, Static502.anInt8456);
		@Pc(29) int local29 = Static154.method2176(arg4, Static153.anInt2554, Static502.anInt8456);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static270.method3998(arg3, local23, local29, Static173.anIntArrayArray15[local31]);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "()V")
	public static void method5570() {
		if (Static432.anInt7402 == 0 || Static32.aClass19_3 == null) {
			return;
		}
		Static576.aClass132_15.K(Static640.anIntArray693);
		for (@Pc(12) int local12 = 0; local12 < Static258.anIntArray259.length; local12++) {
			Static576.aClass132_15.method7432(Static258.anIntArray259[local12] + Static506.anIntArray556[local12], Static640.anIntArray693[1], Static640.anIntArray693[3] - Static640.anIntArray693[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static485.anInt8287; local41++) {
			@Pc(46) Class379 local46 = Static121.aClass379Array1[local41];
			Static576.aClass132_15.H(local46.anIntArray697[0], local46.anIntArray696[0], local46.anIntArray695[0], Static192.anIntArray183);
			Static576.aClass132_15.H(local46.anIntArray697[1], local46.anIntArray696[1], local46.anIntArray695[1], Static631.anIntArray681);
			Static576.aClass132_15.H(local46.anIntArray697[2], local46.anIntArray696[2], local46.anIntArray695[2], Static129.anIntArray136);
			Static576.aClass132_15.H(local46.anIntArray697[3], local46.anIntArray696[3], local46.anIntArray695[3], Static7.anIntArray4);
			if (Static192.anIntArray183[2] != -1 && Static631.anIntArray681[2] != -1 && Static129.anIntArray136[2] != -1 && Static7.anIntArray4[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte145 == 4) {
					local128 = -16776961;
				}
				Static576.aClass132_15.method7435(Static631.anIntArray681[0], Static192.anIntArray183[0], local128, Static631.anIntArray681[1], Static192.anIntArray183[1]);
				Static576.aClass132_15.method7435(Static129.anIntArray136[0], Static631.anIntArray681[0], local128, Static129.anIntArray136[1], Static631.anIntArray681[1]);
				Static576.aClass132_15.method7435(Static7.anIntArray4[0], Static129.anIntArray136[0], local128, Static7.anIntArray4[1], Static129.anIntArray136[1]);
				Static576.aClass132_15.method7435(Static192.anIntArray183[0], Static7.anIntArray4[0], local128, Static192.anIntArray183[1], Static7.anIntArray4[1]);
				Static576.aClass132_15.method7435(Static129.anIntArray136[0], Static192.anIntArray183[0], local128, Static129.anIntArray136[1], Static192.anIntArray183[1]);
			}
		}
		Static32.aClass19_3.method6336(75, -256, -16777216, 10, "Dynamic: " + Static25.anInt3151 + "/" + 5000);
		Static32.aClass19_3.method6336(90, -256, -16777216, 10, "Total Opaque Onscreen: " + Static241.anInt4291 + "/" + 10000);
		Static32.aClass19_3.method6336(105, -256, -16777216, 10, "Total Trans Onscreen: " + Static335.anInt5753 + "/" + 5000);
		Static32.aClass19_3.method6336(120, -256, -16777216, 10, "Occluders: " + (Static33.anInt812 + Static288.anInt4888) + " Active: " + Static485.anInt8287);
		Static32.aClass19_3.method6336(135, -256, -16777216, 10, "Occluded: Ground:" + Static70.anInt1336 + " Walls: " + Static428.anInt7351 + " CPs: " + Static164.anInt10678 + " Pixels: " + Static339.anInt5857);
		Static32.aClass19_3.method6336(150, -256, -16777216, 10, "Occlude Calc Took: " + Static676.aLong312 / 1000L + "us");
		if (Static432.anInt7402 != 2 || Static115.anIntArray125 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static115.anIntArray125.length; local355++) {
			@Pc(361) float local361 = (float) Static115.anIntArray125[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static115.anIntArray125[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class9 local410 = Static576.aClass132_15.method7444(Static115.anIntArray125, Static312.anInt8379, Static522.anInt8677, Static312.anInt8379);
		local410.method8919(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZII)I")
	public static int method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(26) int local26 = 128 - arg2;
		@Pc(40) int local40 = local26 * (arg0 & 0x7F) + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(54) int local54 = (arg0 & 0x380) * local26 + arg2 * (arg1 & 0x380) >> 7;
		@Pc(68) int local68 = (arg1 & 0xFC00) * arg2 + local26 * (arg0 & 0xFC00) >> 7;
		return local40 & 0x7F | local54 & 0x380 | local68 & 0xFC00;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
	public static void method5572(@OriginalArg(1) int arg0) {
		Static645.anInt10427 = arg0;
		Static600.anInt9797 = 100;
		Static30.anInt677 = 3;
		Static64.anInt1190 = -1;
	}
}

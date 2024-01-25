import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!mn;")
	public static Class171 aClass171_8;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_9 = new Class208(5, 4);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLclient!tq;)V")
	public static void method732(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		arg0.method5585();
		@Pc(10) int local10 = Static94.anInt5592;
		@Pc(20) Class11_Sub5_Sub2_Sub1 local20 = Static127.aClass11_Sub5_Sub2_Sub1_2 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local10] = new Class11_Sub5_Sub2_Sub1();
		local20.anInt7670 = local10;
		@Pc(28) int local28 = arg0.method5577(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray632[0] = local39 - Static386.anInt7205;
		local20.anInt7626 = (local20.anIntArray632[0] << 7) + (local20.method6215() << 6);
		local20.anIntArray633[0] = local43 - Static153.anInt2798;
		local20.anInt7622 = (local20.anIntArray633[0] << 7) + (local20.method6215() << 6);
		Static204.anInt3498 = local20.aByte101 = local33;
		if (Static176.aClass2_Sub17Array1[local10] != null) {
			local20.method2106(Static176.aClass2_Sub17Array1[local10]);
		}
		Static121.anInt2062 = 0;
		Static311.anIntArray474[Static121.anInt2062++] = local10;
		Static457.aByteArray95[local10] = 0;
		Static151.anInt2763 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local10) {
				@Pc(135) int local135 = arg0.method5577(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class175 local157 = Static385.aClass175Array1[local125] = new Class175();
				local157.anInt4622 = -1;
				local157.anInt4625 = 0;
				local157.anInt4624 = local149 + (local145 << 14) + (local139 << 28);
				local157.aBoolean331 = false;
				Static390.anIntArray546[Static151.anInt2763++] = local125;
				Static457.aByteArray95[local125] = 0;
			}
		}
		arg0.method5579();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!l;ILclient!za;BI)V")
	public static void method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class75 arg4, @OriginalArg(6) int arg5) {
		if (Static382.anInt6617 < 100) {
			Static35.method576(arg4, arg2);
		}
		arg4.ba(arg3, arg5, arg0 + arg3, arg5 - -arg1);
		@Pc(34) int local34;
		@Pc(46) int local46;
		if (Static382.anInt6617 < 100) {
			local34 = arg3 + arg0 / 2;
			local46 = arg5 + arg1 / 2 - 18 - 20;
			arg4.P(arg3, arg5, arg0, arg1, -16777216, 0);
			arg4.method5979(local34 - 152, local46, 304, 34, Static55.aColorArray1[Static297.anInt5330].getRGB(), 0);
			arg4.P(local34 - 150, local46 - -2, Static382.anInt6617 * 3, 30, Static243.aColorArray3[Static297.anInt5330].getRGB(), 0);
			Static143.aClass14_2.method4883(Static124.aClass231_44.method5261(Static80.anInt6195), local34, local46 + 20, Static144.aColorArray2[Static297.anInt5330].getRGB(), -1);
			return;
		}
		@Pc(111) int local111 = Static204.anInt3501 - (int) ((float) arg0 / Static5.aFloat88);
		local34 = (int) ((float) arg1 / Static5.aFloat88) + Static180.anInt3183;
		local46 = Static204.anInt3501 + (int) ((float) arg0 / Static5.aFloat88);
		Static250.anInt4304 = Static180.anInt3183 - (int) ((float) arg1 / Static5.aFloat88);
		Static410.anInt7046 = (int) ((float) (arg1 * 2) / Static5.aFloat88);
		@Pc(157) int local157 = Static180.anInt3183 - (int) ((float) arg1 / Static5.aFloat88);
		Static279.anInt5040 = (int) ((float) (arg0 * 2) / Static5.aFloat88);
		Static337.anInt6013 = Static204.anInt3501 - (int) ((float) arg0 / Static5.aFloat88);
		Static5.method5405(Static5.anInt6721 + local111, Static5.anInt6729 + local34, local46 + Static5.anInt6721, local157 - -Static5.anInt6729, arg3, arg5, arg0 + arg3, arg1 + arg5 - -1);
		Static5.method5397(arg4);
		@Pc(203) Class181 local203 = Static5.method5400(arg4);
		Static335.method4758(arg4, local203);
		if (Static340.anInt6086 > 0) {
			Static37.anInt611--;
			if (Static37.anInt611 == 0) {
				Static37.anInt611 = 20;
				Static340.anInt6086--;
			}
		}
		if (!Static441.aBoolean501) {
			return;
		}
		@Pc(234) int local234 = arg3 + arg0 - 5;
		@Pc(240) int local240 = arg1 + arg5 - 8;
		Static11.aClass14_1.method4882(16776960, local234, local240, "Fps:" + Static431.anInt7307);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static11.aClass14_1.method4882(local269, local234, local255, "Mem:" + local267 + "k");
		local240 = local255 - 15;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method735() {
		@Pc(12) String local12 = "www";
		if (Static197.aClass129_5 == Static429.aClass129_8) {
			local12 = "www-wtrc";
		} else if (Static429.aClass129_8 == Static19.aClass129_3) {
			local12 = "www-wtqa";
		} else if (Static418.aClass129_7 == Static429.aClass129_8) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static222.aString34 != null) {
			local33 = "/p=" + Static222.aString34;
		}
		return "http://" + local12 + "." + Static10.aClass200_1.aString59 + ".com/l=" + Static80.anInt6195 + "/a=" + Static451.anInt7181 + local33 + "/";
	}
}

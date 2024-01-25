import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "Lclient!nd;")
	public static Class104_Sub1 aClass104_Sub1_2;

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
	public static int anInt6714 = -1;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_107 = new Class142("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZ)V")
	public static void method5320(@OriginalArg(0) boolean arg0) {
		Static383.anInt6137 = 0;
		Static305.anInt5083 = 0;
		Static138.method1752();
		Static389.method5003(arg0);
		Static217.method986();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static305.anInt5083; local20++) {
			local26 = Static398.anIntArray464[local20];
			@Pc(33) Class1_Sub44 local33 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local26);
			@Pc(36) Class11_Sub1_Sub3_Sub1 local36 = local33.aClass11_Sub1_Sub3_Sub1_2;
			if (Static170.aBoolean282 && Static99.method1162(local26)) {
				Static220.method3164();
			}
			if (Static98.anInt1304 != local36.lb) {
				if (local36.aClass272_1.method5899()) {
					Static136.method1742(local36);
				}
				local36.method1303(null);
				local33.method5953();
				local18 = true;
			}
		}
		if (local18) {
			Static406.anInt6516 = Static46.aClass208_33.method4406();
			Static46.aClass208_33.method4407(Static47.aClass1_Sub44Array1);
		}
		if (Static379.anInt119 != Static413.aClass1_Sub19_Sub2_1.anInt3698) {
			throw new RuntimeException("gnp1 pos:" + Static413.aClass1_Sub19_Sub2_1.anInt3698 + " psize:" + Static379.anInt119);
		}
		for (local26 = 0; local26 < Static137.anInt2142; local26++) {
			if (Static46.aClass208_33.method4405((long) Static135.anIntArray183[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static137.anInt2142);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!l;ILclient!za;IIII)V")
	public static void method5321(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static8.anInt126 < 100) {
			Static144.method5807(arg0, arg2);
		}
		arg2.ba(arg5, arg3, arg1 + arg5, arg4 + arg3);
		@Pc(31) int local31;
		@Pc(50) int local50;
		if (Static8.anInt126 < 100) {
			local31 = arg1 / 2 + arg5;
			arg2.P(arg5, arg3, arg1, arg4, -16777216, 0);
			local50 = arg4 / 2 + arg3 - 38;
			arg2.method5690(local31 - 152, local50, 304, 34, Static139.aColorArray2[Static385.anInt6185].getRGB(), 0);
			arg2.P(local31 - 150, local50 - -2, Static8.anInt126 * 3, 30, Static160.aColorArray3[Static385.anInt6185].getRGB(), 0);
			Static17.aClass137_5.method4586(Static276.aClass142_68.method3118(Static63.anInt981), Static98.aColorArray1[Static385.anInt6185].getRGB(), -1, local50 + 20, local31);
			return;
		}
		@Pc(105) int local105 = Static223.anInt5659 - (int) ((float) arg1 / Static430.aFloat55);
		local31 = (int) ((float) arg4 / Static430.aFloat55) + Static173.anInt2855;
		local50 = Static223.anInt5659 + (int) ((float) arg1 / Static430.aFloat55);
		@Pc(137) int local137 = Static173.anInt2855 - (int) ((float) arg4 / Static430.aFloat55);
		Static171.anInt2846 = Static173.anInt2855 - (int) ((float) arg4 / Static430.aFloat55);
		Static454.anInt7225 = (int) ((float) (arg4 * 2) / Static430.aFloat55);
		Static108.anInt1646 = Static223.anInt5659 - (int) ((float) arg1 / Static430.aFloat55);
		Static344.anInt5675 = (int) ((float) (arg1 * 2) / Static430.aFloat55);
		Static430.method3271(Static430.anInt4140 + local105, Static430.anInt4146 + local31, Static430.anInt4140 + local50, Static430.anInt4146 + local137, arg5, arg3, arg5 + arg1, arg4 + arg3 + 1);
		Static430.method3273(arg2);
		@Pc(200) Class14 local200 = Static430.method3263(arg2);
		Static41.method561(arg2, local200);
		if (Static47.anInt678 > 0) {
			Static80.anInt1104--;
			if (Static80.anInt1104 == 0) {
				Static80.anInt1104 = 20;
				Static47.anInt678--;
			}
		}
		if (!Static209.aBoolean360) {
			return;
		}
		@Pc(231) int local231 = arg5 + arg1 - 5;
		@Pc(237) int local237 = arg3 + arg4 - 8;
		Static464.aClass137_8.method4594(local237, local231, "Fps:" + Static218.anInt3991, 16776960);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(265) int local265 = 16776960;
		if (local263 > 65536) {
			local265 = 16711680;
		}
		Static464.aClass137_8.method4594(local252, local231, "Mem:" + local263 + "k", local265);
		local237 = local252 - 15;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)I")
	public static int method5324(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5325(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}

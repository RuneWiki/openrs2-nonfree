import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!km", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString33 = null;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)Z")
	public static boolean method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static124.method3217(arg0, arg1) | (arg0 & 0x60000) != 0 || Static73.method1405(arg0, arg1) || Static262.method4016(arg0, arg1);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)V")
	public static void method3257(@OriginalArg(1) int arg0) {
		Static71.anInt1487 = 3;
		Static18.anInt316 = arg0;
		Static26.anInt2329 = -1;
		Static119.anInt2070 = 100;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!od;IILclient!qq;Lclient!ll;Lclient!gf;Z)V")
	public static void method3258(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) Class152 arg5, @OriginalArg(6) Class94 arg6) {
		@Pc(15) int local15 = arg1.anInt4801 - arg3 / 2 - 5;
		@Pc(19) int local19 = arg0 + 2;
		if (arg6.anInt2181 != 0) {
			arg4.method3531(local15, arg6.anInt2181, local19, arg0 + arg5.method3463() * arg2 + 1 - local19, arg3 + 10);
		}
		if (arg6.anInt2186 != 0) {
			arg4.method3508(arg3 + 10, arg6.anInt2186, local15, arg0 + arg5.method3463() * arg2 + 1 - local19, local19);
		}
		@Pc(74) int local74 = arg6.anInt2169;
		if (arg1.aBoolean340 && arg6.anInt2179 != -1) {
			local74 = arg6.anInt2179;
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			@Pc(98) String local98 = Static122.aStringArray19[local92];
			if (arg2 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg5.method3458(arg4, local98, arg1.anInt4801, arg0, local74);
			arg0 += arg5.method3463();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIII)V")
	public static void method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 4);
		local8.method3043();
		local8.anInt3403 = arg0;
		local8.anInt3400 = arg3;
		local8.anInt3397 = arg2;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public static void method3260() {
		Static10.method5377(Static8.aClass173_Sub1_1.aBoolean309);
		Static384.aClass6_Sub5_Sub3_8 = new Class6_Sub5_Sub3();
		Static384.aClass6_Sub5_Sub3_8.method3645();
		Static18.aClass105_1 = Static429.method5850(22050, 0, Static165.aClass103_3, Static314.aCanvas8);
		Static18.aClass105_1.method5163(Static384.aClass6_Sub5_Sub3_8);
		Static301.method2519(Static144.aClass158_30, Static384.aClass6_Sub5_Sub3_8, Static340.aClass158_71, Static123.aClass158_27);
		Static166.aClass105_2 = Static429.method5850(2048, 1, Static165.aClass103_3, Static314.aCanvas8);
		Static371.aClass6_Sub5_Sub2_2 = new Class6_Sub5_Sub2();
		Static166.aClass105_2.method5163(Static371.aClass6_Sub5_Sub2_2);
		Static379.aClass213_1 = new Class213(22050, Static203.anInt3580);
		Static144.anInt2631 = Static280.aClass158_63.method3677("scape main");
	}
}

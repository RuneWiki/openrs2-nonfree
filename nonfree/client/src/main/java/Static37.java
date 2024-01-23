import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!db", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!hh;")
	private static Class50 aClass50_295 = Static186.method3527(" is already on your ignore list)3");

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!hh;")
	private static Class50 aClass50_298 = Static186.method3527("Loading wordpack )2 ");

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_297 = aClass50_298;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public static int anInt795 = 0;

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_299 = aClass50_295;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!pg;)V")
	public static void method593(@OriginalArg(1) Class1_Sub17 arg0) {
		if (arg0.aByteArray40.length - arg0.anInt2656 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2142();
		if (local20 < 0 || local20 > 2) {
			return;
		}
		@Pc(41) byte local41;
		if (local20 == 2) {
			local41 = 22;
		} else if (local20 == 1) {
			local41 = 23;
		} else {
			local41 = 19;
		}
		if (arg0.aByteArray40.length - arg0.anInt2656 < local41) {
			return;
		}
		Static231.anInt4421 = arg0.method2142();
		if (Static231.anInt4421 < 1) {
			Static231.anInt4421 = 1;
		} else if (Static231.anInt4421 > 4) {
			Static231.anInt4421 = 4;
		}
		Static14.method197(arg0.method2142() == 1);
		Static34.aBoolean18 = arg0.method2142() == 1;
		Static24.aBoolean14 = arg0.method2142() == 1;
		Static205.aBoolean196 = arg0.method2142() == 1;
		Static125.aBoolean111 = arg0.method2142() == 1;
		Static74.aBoolean69 = arg0.method2142() == 1;
		Static148.aBoolean130 = arg0.method2142() == 1;
		Static35.aBoolean27 = arg0.method2142() == 1;
		Static214.anInt4250 = arg0.method2142();
		if (Static214.anInt4250 > 2) {
			Static214.anInt4250 = 2;
		}
		if (local20 >= 2) {
			Static129.aBoolean113 = arg0.method2142() == 1;
		} else {
			Static129.aBoolean113 = arg0.method2142() == 1;
			arg0.method2142();
		}
		Static70.aBoolean65 = arg0.method2142() == 1;
		Static137.aBoolean119 = arg0.method2142() == 1;
		Static207.anInt4148 = arg0.method2142();
		if (Static207.anInt4148 > 2) {
			Static207.anInt4148 = 2;
		}
		Static151.aBoolean134 = arg0.method2142() == 1;
		Static172.anInt3511 = arg0.method2142();
		if (Static172.anInt3511 > 127) {
			Static172.anInt3511 = 127;
		}
		Static152.anInt3168 = arg0.method2142();
		Static146.anInt3076 = arg0.method2142();
		if (Static146.anInt3076 > 127) {
			Static146.anInt3076 = 127;
		}
		if (local20 >= 1) {
			Static27.anInt541 = arg0.method2178();
			Static118.anInt2320 = arg0.method2178();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
	public static int method595(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lclient!lf;")
	public static Class1_Sub1_Sub12 method596(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static8.aClass4_1.method81((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static213.aClass86_78.method3325(11, arg0);
		local10 = new Class1_Sub1_Sub12();
		if (local20 != null) {
			local10.method1942(new Class1_Sub17(local20));
		}
		Static8.aClass4_1.method83(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(II)Lclient!hh;")
	public static Class50 method608(@OriginalArg(1) int arg0) {
		@Pc(9) Class50 local9 = Static160.method2684(arg0);
		for (@Pc(21) int local21 = local9.method1249() - 3; local21 > 0; local21 -= 3) {
			local9 = Static17.method257(new Class50[] { local9.method1216(local21, 0), Static42.aClass50_325, local9.method1244(local21) });
		}
		if (local9.method1249() > 9) {
			return Static17.method257(new Class50[] { Static31.aClass50_224, local9.method1216(local9.method1249() - 8, 0), Static24.aClass50_193, Static60.aClass50_424, local9, Static162.aClass50_1089 });
		} else if (local9.method1249() > 6) {
			return Static17.method257(new Class50[] { Static163.aClass50_1094, local9.method1216(local9.method1249() - 4, 0), Static153.aClass50_1062, Static60.aClass50_424, local9, Static162.aClass50_1089 });
		} else {
			return Static17.method257(new Class50[] { Static102.aClass50_672, local9, Static223.aClass50_1371 });
		}
	}
}

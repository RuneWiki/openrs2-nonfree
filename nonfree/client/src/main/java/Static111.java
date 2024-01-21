import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	public static int anInt2723;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	public static int anInt2724;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_65;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1002 = Static177.method3050("Sprites geladen)3");

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1003 = Static177.method3050("Hierhin gehen");

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "J")
	public static long aLong102 = 0L;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	public static int anInt2728 = 0;

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1004 = Static177.method3050(" <col=ffff00>");

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1005 = null;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1006 = Static177.method3050("compass");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!a;Lclient!rf;IIIII)V")
	public static void method2059(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class4_Sub1_Sub7_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(17) int local17 = Static152.anInt3459 + Static8.anInt297 & 0x7FF;
		@Pc(29) int local29 = Math.max(arg0.anInt50 / 2, arg0.anInt20 / 2) + 10;
		@Pc(37) int local37 = arg2 * arg2 + arg4 * arg4;
		if (local37 > local29 * local29) {
			return;
		}
		@Pc(47) int local47 = Class4_Sub1_Sub7_Sub4.anIntArray412[local17];
		@Pc(55) int local55 = local47 * 256 / (Static114.anInt2767 + 256);
		@Pc(59) int local59 = Class4_Sub1_Sub7_Sub4.anIntArray416[local17];
		@Pc(67) int local67 = local59 * 256 / (Static114.anInt2767 + 256);
		@Pc(78) int local78 = arg4 * local67 - arg2 * local55 >> 16;
		@Pc(88) int local88 = local55 * arg4 + arg2 * local67 >> 16;
		arg1.method2534(local88 + arg5 + arg0.anInt50 / 2 - arg1.anInt3408 / 2, arg3 - (-(arg0.anInt20 / 2) - -local78) + -(arg1.anInt3407 / 2), arg0.anIntArray10, arg0.anIntArray1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)J")
	public static long method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass24_1 == null ? 0L : local7.aClass24_1.aLong36;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!wh;IBI)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub24 local7 = new Class4_Sub24();
		local7.anInt3604 = arg2.anInt4182;
		local7.anInt3605 = arg0 * 128;
		local7.anInt3614 = arg2.anInt4167;
		local7.anInt3616 = arg1 * 128;
		local7.anInt3603 = arg2.anInt4181;
		local7.anInt3606 = arg3;
		local7.anInt3610 = arg2.anInt4154 * 128;
		@Pc(41) int local41 = arg2.anInt4187;
		@Pc(44) int local44 = arg2.anInt4191;
		local7.anIntArray352 = arg2.anIntArray445;
		if (arg4 == 1 || arg4 == 3) {
			local41 = arg2.anInt4191;
			local44 = arg2.anInt4187;
		}
		local7.anInt3609 = (arg0 + local44) * 128;
		local7.anInt3613 = (local41 + arg1) * 128;
		if (arg2.anIntArray442 != null) {
			local7.aClass4_Sub1_Sub19_1 = arg2;
			local7.method2743();
		}
		Static121.aClass11_12.method272(local7);
		if (local7.anIntArray352 != null) {
			local7.anInt3615 = local7.anInt3603 + (int) ((double) (local7.anInt3604 - local7.anInt3603) * Math.random());
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)Lclient!kg;")
	public static Class4_Sub14 method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class4_Sub14 local3 = new Class4_Sub14();
		local3.anInt2450 = arg2;
		local3.anInt2444 = arg0;
		Static106.aClass20_5.method499((long) arg1, local3);
		Static89.method1775(arg2);
		Static47.method922(arg2);
		@Pc(31) Class1 local31 = Static154.method3136(arg1);
		if (local31 != null) {
			Static3.method21(local31);
		}
		if (Static84.aClass1_54 != null) {
			Static3.method21(Static84.aClass1_54);
			Static84.aClass1_54 = null;
		}
		Static64.aBoolean76 = false;
		Static3.anInt86 = 0;
		Static149.method2557(Static185.anInt4084, Static9.anInt327, Static163.anInt3720, Static148.anInt3380);
		if (Static174.anInt3902 != -1) {
			Static73.method1504(Static174.anInt3902, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)Z")
	public static boolean method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static13.method263(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static72.method1496(local10 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg2] + arg3, local14 + 1) && Static72.method1496(local10 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static72.method1496(local10 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static72.method1496(local10 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}

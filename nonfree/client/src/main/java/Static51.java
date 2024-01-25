import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "[Lclient!mj;")
	public static Class135_Sub1[] aClass135_Sub1Array1;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "Lclient!fp;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
	public static int anInt1301 = 0;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	public static int anInt1312 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)V")
	public static void method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class38 local10 = new Class38(16);
		for (@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) Static46.aClass38_4.method1474(); local20 != null; local20 = (Class1_Sub3) Static46.aClass38_4.method1470()) {
			local20.method6045();
			@Pc(31) int local31 = (int) (local20.aLong217 >> 28);
			@Pc(42) int local42 = (int) (local20.aLong217 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local20.aLong217 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local42 >= 0 && local50 < Static311.anInt5653 && local42 < Static189.anInt3820) {
				local10.method1472(local20, (long) (local31 << 28 | local42 << 14 | local50));
			}
		}
		Static46.aClass38_4 = local10;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V")
	public static void method1231(@OriginalArg(1) int arg0) {
		Static234.anInt4738 = arg0;
		@Pc(7) Class21 local7 = Static244.aClass21_134;
		synchronized (Static244.aClass21_134) {
			Static244.aClass21_134.method857();
		}
		local7 = Static34.aClass21_35;
		synchronized (Static34.aClass21_35) {
			Static34.aClass21_35.method857();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method1233(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(26) char local26 = 0;
		@Pc(28) char local28 = 0;
		while (local13 - local26 < local8 || local15 - local28 < local11) {
			if (local13 - local26 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local28) {
				return 1;
			}
			@Pc(65) char local65;
			if (local26 == '\u0000') {
				local65 = arg2.charAt(local13++);
			} else {
				local65 = local26;
			}
			@Pc(78) char local78;
			if (local28 == '\u0000') {
				local78 = arg1.charAt(local15++);
			} else {
				local78 = local28;
			}
			local26 = Static330.method5559(local65);
			local28 = Static330.method5559(local78);
			local65 = Static365.method6055(local65, arg0);
			local78 = Static365.method6055(local78, arg0);
			if (local65 != local78 && Character.toUpperCase(local65) != Character.toUpperCase(local78)) {
				local65 = Character.toLowerCase(local65);
				local78 = Character.toLowerCase(local78);
				if (local65 != local78) {
					return Static204.method3762(local65, arg0) - Static204.method3762(local78, arg0);
				}
			}
		}
		@Pc(140) int local140 = Math.min(local8, local11);
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			if (arg0 == 2) {
				local13 = local8 - local142 - 1;
				local15 = local11 - local142 - 1;
			} else {
				local15 = local142;
				local13 = local142;
			}
			@Pc(170) char local170 = arg2.charAt(local13);
			@Pc(174) char local174 = arg1.charAt(local15);
			if (local170 != local174 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local174 != local170) {
					return Static204.method3762(local170, arg0) - Static204.method3762(local174, arg0);
				}
			}
		}
		@Pc(223) int local223 = local8 - local11;
		if (local223 != 0) {
			return local223;
		}
		for (@Pc(229) int local229 = 0; local229 < local140; local229++) {
			@Pc(235) char local235 = arg2.charAt(local229);
			@Pc(239) char local239 = arg1.charAt(local229);
			if (local235 != local239) {
				return Static204.method3762(local235, arg0) - Static204.method3762(local239, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZI)V")
	public static void method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 < arg3) {
			Static367.method6081(arg0, arg2, Static43.anIntArrayArray57[arg1], arg3);
		} else {
			Static367.method6081(arg0, arg3, Static43.anIntArrayArray57[arg1], arg2);
		}
	}
}

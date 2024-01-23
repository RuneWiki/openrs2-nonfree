import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "I")
	public static int anInt2448;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString86 = "Use";

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "[I")
	public static int[] anIntArray212 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIZI)I")
	public static int method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class174.anIntArray443[arg3 * 1024 / arg0] >> 1;
		return (arg2 * (65536 - local20) >> 16) + (arg1 * local20 >> 16);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class4_Sub26 local10;
		for (local10 = (Class4_Sub26) Static80.aClass17_11.method613(); local10 != null; local10 = (Class4_Sub26) Static80.aClass17_11.method607()) {
			Static260.method4693(arg3, arg0, arg1, arg2, local10);
		}
		@Pc(42) byte local42;
		@Pc(47) Class33 local47;
		@Pc(142) int local142;
		for (local10 = (Class4_Sub26) Static17.aClass17_2.method613(); local10 != null; local10 = (Class4_Sub26) Static17.aClass17_2.method607()) {
			local42 = 1;
			local47 = local10.aClass13_Sub5_Sub2_1.method4212();
			if (local10.aClass13_Sub5_Sub2_1.anInt5307 == local47.anInt1156) {
				local42 = 0;
			} else if (local10.aClass13_Sub5_Sub2_1.anInt5307 == local47.anInt1139 || local47.anInt1142 == local10.aClass13_Sub5_Sub2_1.anInt5307 || local10.aClass13_Sub5_Sub2_1.anInt5307 == local47.anInt1140 || local47.anInt1135 == local10.aClass13_Sub5_Sub2_1.anInt5307) {
				local42 = 2;
			} else if (local47.anInt1157 == local10.aClass13_Sub5_Sub2_1.anInt5307 || local47.anInt1160 == local10.aClass13_Sub5_Sub2_1.anInt5307 || local47.anInt1130 == local10.aClass13_Sub5_Sub2_1.anInt5307 || local47.anInt1153 == local10.aClass13_Sub5_Sub2_1.anInt5307) {
				local42 = 3;
			}
			if (local42 != local10.anInt3906) {
				local142 = Static160.method2584(local10.aClass13_Sub5_Sub2_1);
				if (local142 != local10.anInt3910) {
					if (local10.aClass4_Sub6_Sub1_3 != null) {
						Static10.aClass4_Sub6_Sub4_1.method3730(local10.aClass4_Sub6_Sub1_3);
						local10.aClass4_Sub6_Sub1_3 = null;
					}
					local10.anInt3910 = local142;
				}
				local10.anInt3906 = local42;
			}
			local10.anInt3915 = local10.aClass13_Sub5_Sub2_1.anInt5334;
			local10.anInt3908 = local10.aClass13_Sub5_Sub2_1.anInt5334 + local10.aClass13_Sub5_Sub2_1.method4219() * 64;
			local10.anInt3914 = local10.aClass13_Sub5_Sub2_1.anInt5294;
			local10.anInt3912 = local10.aClass13_Sub5_Sub2_1.anInt5294 + local10.aClass13_Sub5_Sub2_1.method4219() * 64;
			Static260.method4693(arg3, arg0, arg1, arg2, local10);
		}
		for (local10 = (Class4_Sub26) Static5.aClass163_1.method4192(); local10 != null; local10 = (Class4_Sub26) Static5.aClass163_1.method4183()) {
			local42 = 1;
			local47 = local10.aClass13_Sub5_Sub1_2.method4212();
			if (local47.anInt1156 == local10.aClass13_Sub5_Sub1_2.anInt5307) {
				local42 = 0;
			} else if (local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1139 || local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1142 || local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1140 || local47.anInt1135 == local10.aClass13_Sub5_Sub1_2.anInt5307) {
				local42 = 2;
			} else if (local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1157 || local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1160 || local47.anInt1130 == local10.aClass13_Sub5_Sub1_2.anInt5307 || local10.aClass13_Sub5_Sub1_2.anInt5307 == local47.anInt1153) {
				local42 = 3;
			}
			if (local42 != local10.anInt3906) {
				local142 = Static4.method66(local10.aClass13_Sub5_Sub1_2);
				if (local142 != local10.anInt3910) {
					if (local10.aClass4_Sub6_Sub1_3 != null) {
						Static10.aClass4_Sub6_Sub4_1.method3730(local10.aClass4_Sub6_Sub1_3);
						local10.aClass4_Sub6_Sub1_3 = null;
					}
					local10.anInt3910 = local142;
				}
				local10.anInt3906 = local42;
			}
			local10.anInt3915 = local10.aClass13_Sub5_Sub1_2.anInt5334;
			local10.anInt3908 = local10.aClass13_Sub5_Sub1_2.anInt5334 + local10.aClass13_Sub5_Sub1_2.method4219() * 64;
			local10.anInt3914 = local10.aClass13_Sub5_Sub1_2.anInt5294;
			local10.anInt3912 = local10.aClass13_Sub5_Sub1_2.anInt5294 + local10.aClass13_Sub5_Sub1_2.method4219() * 64;
			Static260.method4693(arg3, arg0, arg1, arg2, local10);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method1996(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = false;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local34; local46++) {
			@Pc(57) char local57 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local57 == '-') {
					local27 = true;
					continue;
				}
				if (local57 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local57 >= '0' && local57 <= '9') {
				local84 = local57 - '0';
			} else if (local57 >= 'A' && local57 <= 'Z') {
				local84 = local57 - '7';
			} else if (local57 >= 'a' && local57 <= 'z') {
				local84 = local57 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local84 >= arg1) {
				throw new NumberFormatException();
			}
			if (local27) {
				local84 = -local84;
			}
			@Pc(129) int local129 = local29 * arg1 + local84;
			if (local29 != local129 / arg1) {
				throw new NumberFormatException();
			}
			local29 = local129;
			local31 = true;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local29;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method1997() {
		if (Static173.aBoolean228) {
			Static115.aClass4_Sub2_Sub4_4 = null;
			Static67.aClass58_1 = null;
			Static173.aBoolean228 = false;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZBZ)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(20) int local20 = (arg1 + arg2) / 2;
		@Pc(22) int local22 = arg2;
		@Pc(26) Class64_Sub1 local26 = Static214.aClass64_Sub1Array3[local20];
		Static214.aClass64_Sub1Array3[local20] = Static214.aClass64_Sub1Array3[arg1];
		Static214.aClass64_Sub1Array3[arg1] = local26;
		for (@Pc(38) int local38 = arg2; local38 < arg1; local38++) {
			if (Static200.method3243(local26, Static214.aClass64_Sub1Array3[local38], arg0, arg5, arg4, arg3) <= 0) {
				@Pc(59) Class64_Sub1 local59 = Static214.aClass64_Sub1Array3[local38];
				Static214.aClass64_Sub1Array3[local38] = Static214.aClass64_Sub1Array3[local22];
				Static214.aClass64_Sub1Array3[local22++] = local59;
			}
		}
		Static214.aClass64_Sub1Array3[arg1] = Static214.aClass64_Sub1Array3[local22];
		Static214.aClass64_Sub1Array3[local22] = local26;
		method1998(arg0, local22 - 1, arg2, arg3, arg4, arg5);
		method1998(arg0, arg1, local22 + 1, arg3, arg4, arg5);
	}
}

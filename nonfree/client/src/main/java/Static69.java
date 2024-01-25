import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_35 = new Class208(61, 9);

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
	public static int anInt1551 = 100;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(III)Z")
	public static boolean method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static33.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static301.anInt5604) {
			return false;
		} else if (local7 == Static301.anInt5604) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static162.anInt3362;
			@Pc(26) int local26 = arg2 << Static162.anInt3362;
			if (Static151.method3887(local22 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg2), local26 + 1) && Static151.method3887(local22 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg2), local26 + 1) && Static151.method3887(local22 + Static169.anInt5687 - 1, Static128.aClass149Array1[arg0].method5837(arg1 + 1, arg2 + 1), local26 + Static169.anInt5687 - 1) && Static151.method3887(local22 + 1, Static128.aClass149Array1[arg0].method5837(arg1, arg2 + 1), local26 + Static169.anInt5687 - 1)) {
				Static33.anIntArrayArrayArray2[arg0][arg1][arg2] = Static301.anInt5604;
				return true;
			} else {
				Static33.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static301.anInt5604;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
	public static void method1257() {
		if (Static383.aClass48_9 == null) {
			return;
		}
		Static349.aClass199_7.method4905();
		Static203.method3470();
		Static124.method3771();
		Static32.method365();
		Static141.method2427();
		Static134.method2357();
		if (Static251.aClass58_1 != null) {
			Static251.aClass58_1.method1291();
		}
		Static19.method212();
		Static227.method4131();
		Static217.method3892();
		Static291.method4805(false);
		Static273.method4587();
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class1_Sub2_Sub1_Sub1 local49 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local43];
			if (local49 != null) {
				local49.aClass2_Sub25_3 = null;
				for (@Pc(56) int local56 = 0; local56 < local49.aClass159Array3.length; local56++) {
					local49.aClass159Array3[local56] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static223.aClass1_Sub2_Sub1_Sub2Array1.length; local75++) {
			@Pc(81) Class1_Sub2_Sub1_Sub2 local81 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass159Array3.length; local85++) {
					local81.aClass159Array3[local85] = null;
				}
			}
		}
		Static383.aClass48_9.method2479();
		Static383.aClass48_9 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZJIZI)Ljava/lang/String;")
	public static String method1258(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local22 = true;
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		@Pc(43) int local43;
		@Pc(48) int local48;
		if (arg1 > 0) {
			for (local43 = 0; local43 < arg1; local43++) {
				local48 = (int) arg0;
				arg0 /= 10L;
				local36.append((char) (local48 + 48 - (int) arg0 * 10));
			}
			local36.append(local7);
		}
		local43 = 0;
		while (true) {
			local48 = (int) arg0;
			arg0 /= 10L;
			local36.append((char) (local48 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local22) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg2) {
				local43++;
				if (local43 % 3 == 0) {
					local36.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!gn;)I")
	public static int method1259(@OriginalArg(1) Class1_Sub2_Sub1 arg0) {
		if (arg0.anInt5426 == 0) {
			return 0;
		}
		@Pc(49) int local49;
		@Pc(56) int local56;
		if (arg0.anInt5418 != -1) {
			@Pc(17) Class1_Sub2_Sub1 local17 = null;
			if (arg0.anInt5418 < 32768) {
				local17 = Static223.aClass1_Sub2_Sub1_Sub2Array1[arg0.anInt5418];
			} else if (arg0.anInt5418 >= 32768) {
				local17 = Static42.aClass1_Sub2_Sub1_Sub1Array1[arg0.anInt5418 - 32768];
			}
			if (local17 != null) {
				local49 = arg0.anInt6800 - local17.anInt6800;
				local56 = arg0.anInt6798 - local17.anInt6798;
				if (local49 != 0 || local56 != 0) {
					arg0.method4793((int) (Math.atan2((double) local49, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub2_Sub1_Sub1) {
			@Pc(79) Class1_Sub2_Sub1_Sub1 local79 = (Class1_Sub2_Sub1_Sub1) arg0;
			if (local79.anInt972 != -1 && (local79.anInt5432 == 0 || local79.anInt5429 > 0)) {
				local79.method4793(local79.anInt972);
				local79.anInt972 = -1;
			}
		} else if (arg0 instanceof Class1_Sub2_Sub1_Sub2) {
			@Pc(108) Class1_Sub2_Sub1_Sub2 local108 = (Class1_Sub2_Sub1_Sub2) arg0;
			if (local108.anInt5441 != -1 && (local108.anInt5432 == 0 || local108.anInt5429 > 0)) {
				local49 = local108.anInt6800 - (local108.anInt5441 - Static279.anInt5198 - Static279.anInt5198) * 64;
				local56 = local108.anInt6798 - (local108.anInt5442 - Static350.anInt6470 - Static350.anInt6470) * 64;
				if (local49 != 0 || local56 != 0) {
					local108.method4793((int) (Math.atan2((double) local49, (double) local56) * 2607.5945876176133D) & 0x3FFF);
				}
				local108.anInt5441 = -1;
			}
		}
		return arg0.method4785();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1260(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, local14 + arg0.length())) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(local14 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)I")
	public static int method1261(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

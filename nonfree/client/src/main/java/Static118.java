import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lclient!nd;")
	public static Class1_Sub1_Sub11 aClass1_Sub1_Sub11_5;

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_19;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1830 = Static69.method1153("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "I")
	public static int anInt2834 = 0;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
	public static int anInt2842 = 0;

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1831 = Static69.method1153("Loading wordpack )2 ");

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1832 = Static69.method1153("Versteckt");

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1833 = aClass64_1831;

	@OriginalMember(owner = "client!wb", name = "vb", descriptor = "I")
	public static final int anInt2845 = 7759444;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public static void method2083() {
		@Pc(16) int local16;
		if (Static50.anInt1201 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static50.anInt1201 > 768) {
					Static52.anIntArray448[local16] = Static28.method1693(Static102.anIntArray342[local16], Static34.anIntArray120[local16], 1024 - Static50.anInt1201);
				} else if (Static50.anInt1201 <= 256) {
					Static52.anIntArray448[local16] = Static28.method1693(Static34.anIntArray120[local16], Static102.anIntArray342[local16], 256 - Static50.anInt1201);
				} else {
					Static52.anIntArray448[local16] = Static102.anIntArray342[local16];
				}
			}
		} else if (Static40.anInt927 <= 0) {
			for (local16 = 0; local16 < 256; local16++) {
				Static52.anIntArray448[local16] = Static34.anIntArray120[local16];
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static40.anInt927 > 768) {
					Static52.anIntArray448[local16] = Static28.method1693(Static49.anIntArray162[local16], Static34.anIntArray120[local16], 1024 - Static40.anInt927);
				} else if (Static40.anInt927 > 256) {
					Static52.anIntArray448[local16] = Static49.anIntArray162[local16];
				} else {
					Static52.anIntArray448[local16] = Static28.method1693(Static34.anIntArray120[local16], Static49.anIntArray162[local16], 256 - Static40.anInt927);
				}
			}
		}
		for (local16 = 0; local16 < 33920; local16++) {
			Static61.aClass37_21.anIntArray304[local16] = Static64.aClass1_Sub1_Sub5_Sub2_4.anIntArray150[local16];
		}
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 1152;
		@Pc(185) int local185;
		@Pc(189) int local189;
		@Pc(199) int local199;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(218) int local218;
		@Pc(227) int local227;
		for (@Pc(172) int local172 = 1; local172 < 255; local172++) {
			local185 = Static28.anIntArray356[local172] * (256 - local172) / 256;
			local189 = local185 + 22;
			if (local189 < 0) {
				local189 = 0;
			}
			local168 += local189;
			for (local199 = local189; local199 < 128; local199++) {
				local206 = Static64.anIntArray228[local168++];
				if (local206 == 0) {
					local170++;
				} else {
					local213 = local206;
					local218 = 256 - local206;
					local206 = Static52.anIntArray448[local206];
					local227 = Static61.aClass37_21.anIntArray304[local170];
					Static61.aClass37_21.anIntArray304[local170++] = ((local206 & 0xFF00) * local213 + local218 * (local227 & 0xFF00) & 0xFF0000) + ((local206 & 0xFF00FF) * local213 + local218 * (local227 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local170 += local189;
		}
		local168 = 0;
		local170 = 1176;
		for (local185 = 0; local185 < 33920; local185++) {
			Static105.aClass37_35.anIntArray304[local185] = Static15.aClass1_Sub1_Sub5_Sub2_1.anIntArray150[local185];
		}
		for (local189 = 1; local189 < 255; local189++) {
			local199 = (256 - local189) * Static28.anIntArray356[local189] / 256;
			local206 = 103 - local199;
			local170 += local199;
			for (local213 = 0; local213 < local206; local213++) {
				local218 = Static64.anIntArray228[local168++];
				if (local218 == 0) {
					local170++;
				} else {
					local227 = local218;
					@Pc(346) int local346 = 256 - local218;
					@Pc(351) int local351 = Static105.aClass37_35.anIntArray304[local170];
					local218 = Static52.anIntArray448[local218];
					Static105.aClass37_35.anIntArray304[local170++] = (local227 * (local218 & 0xFF00) + local346 * (local351 & 0xFF00) & 0xFF0000) + ((local351 & 0xFF00FF) * local346 + (local218 & 0xFF00FF) * local227 & 0xFF00FF00) >> 8;
				}
			}
			local170 += 128 - local206 - local199;
			local168 += 128 - local206;
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public static void method2084() {
		aClass1_Sub1_Sub11_5 = null;
		aClass64_1833 = null;
		aClass64_1830 = null;
		aClass1_Sub1_Sub5_Sub3_19 = null;
		aClass64_1832 = null;
		aLongArray6 = null;
		aClass64_1831 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!pb;IZLclient!pb;)V")
	public static void method2085(@OriginalArg(0) Class41 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class41 arg2) {
		Static80.aBoolean117 = arg1;
		Static105.aClass41_64 = arg0;
		Static85.aClass41_73 = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!pb;BLclient!pb;Lclient!pb;)V")
	public static void method2086(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class41 arg2) {
		Static19.aClass41_13 = arg2;
		Static55.aClass41_77 = arg1;
		Static98.aClass41_54 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BIZ)V")
	public static void method2087(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static79.aClass17_1 == null) {
			return;
		}
		if (Static28.anInt2362 >= 0) {
			Static105.anInt2464 = arg2;
			if (Static28.anInt2362 == 0) {
				Static90.anInt560 = 1;
			} else {
				@Pc(43) int local43 = Static86.method1415(Static28.anInt2362);
				@Pc(47) int local47 = local43 - Static103.anInt2331;
				Static90.anInt560 = (local47 + 3600) / arg2;
				if (Static90.anInt560 < 1) {
					Static90.anInt560 = 1;
				}
			}
			Static15.anInt472 = arg0;
			Static17.aBoolean39 = arg3;
			Static53.aByteArray9 = arg1;
		} else if (Static90.anInt560 == 0) {
			Static51.method917(arg0, arg1, arg3);
		} else {
			Static17.aBoolean39 = arg3;
			Static15.anInt472 = arg0;
			Static53.aByteArray9 = arg1;
		}
	}
}

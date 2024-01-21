import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!tg;")
	private static Class81 aClass81_916 = Static120.method2057("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt2523 = 0;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_917 = aClass81_916;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!tg;")
	private static Class81 aClass81_918 = Static120.method2057("Ok");

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public static int anInt2525 = 0;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_919 = Static120.method2057("Weiter");

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!tg;")
	private static Class81 aClass81_922 = Static120.method2057("Please enter your password)3");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_920 = aClass81_922;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_921 = Static120.method2057("Benutzen");

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_923 = null;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_924 = aClass81_918;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!tg;")
	private static Class81 aClass81_925 = Static120.method2057("Error loading your profile)3");

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!tg;")
	public static Class81 aClass81_926 = aClass81_925;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	public static void method1960(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray73.length; local25++) {
				local12.anIntArray73[local25] = -1;
				local12.anIntArray72[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method1961(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString7 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local28);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local28.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local20 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(83) String local83 = local59.substring(local65 + 1, local72);
					@Pc(87) int local87 = local83.indexOf(".java:");
					if (local87 >= 0) {
						local83 = local83.substring(0, local87) + local83.substring(local87 + 5);
						local20 = local20 + local83 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local20 = local20 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	public static int method1962() {
		return 6;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static120.anInt2675; local1++) {
			@Pc(6) Class85 local6 = Static155.aClass85Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3948 == 1) {
				local15 = local6.anInt3958 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3957 + (local6.anInt3951 * local15 >> 8);
					local37 = local6.anInt3942 + (local6.anInt3946 * local15 >> 8);
					local47 = local6.anInt3945 + (local6.anInt3944 * local15 >> 8);
					local57 = local6.anInt3955 + (local6.anInt3941 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3948 == 2) {
				local15 = arg0 - local6.anInt3958;
				if (local15 > 0) {
					local27 = local6.anInt3957 + (local6.anInt3951 * local15 >> 8);
					local37 = local6.anInt3942 + (local6.anInt3946 * local15 >> 8);
					local47 = local6.anInt3945 + (local6.anInt3944 * local15 >> 8);
					local57 = local6.anInt3955 + (local6.anInt3941 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3948 == 3) {
				local15 = local6.anInt3957 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3958 + (local6.anInt3952 * local15 >> 8);
					local37 = local6.anInt3953 + (local6.anInt3943 * local15 >> 8);
					local47 = local6.anInt3945 + (local6.anInt3944 * local15 >> 8);
					local57 = local6.anInt3955 + (local6.anInt3941 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3948 == 4) {
				local15 = arg2 - local6.anInt3957;
				if (local15 > 0) {
					local27 = local6.anInt3958 + (local6.anInt3952 * local15 >> 8);
					local37 = local6.anInt3953 + (local6.anInt3943 * local15 >> 8);
					local47 = local6.anInt3945 + (local6.anInt3944 * local15 >> 8);
					local57 = local6.anInt3955 + (local6.anInt3941 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3948 == 5) {
				local15 = arg1 - local6.anInt3945;
				if (local15 > 0) {
					local27 = local6.anInt3958 + (local6.anInt3952 * local15 >> 8);
					local37 = local6.anInt3953 + (local6.anInt3943 * local15 >> 8);
					local47 = local6.anInt3957 + (local6.anInt3951 * local15 >> 8);
					local57 = local6.anInt3942 + (local6.anInt3946 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1964() {
		aClass81_925 = null;
		aClass81_924 = null;
		aClass81_922 = null;
		aClass81_916 = null;
		aClass81_921 = null;
		aClass81_918 = null;
		aClass81_920 = null;
		aClass81_919 = null;
		aClass81_923 = null;
		aClass81_926 = null;
		aClass81_917 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Lclient!wa;II[I[I)V")
	public static void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(16) int local16 = arg0 + 1;
		@Pc(20) int local20 = arg2 - 1;
		@Pc(26) int local26 = (arg2 + arg0) / 2;
		@Pc(30) Class89 local30 = arg1[local26];
		arg1[local26] = arg1[arg2];
		arg1[arg2] = local30;
		while (local20 < local16) {
			@Pc(44) boolean local44 = true;
			@Pc(47) int local47;
			@Pc(78) int local78;
			@Pc(73) int local73;
			do {
				local16--;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg4[local47] == 2) {
						local78 = arg1[local16].anInt4055;
						local73 = local30.anInt4055;
					} else if (arg4[local47] == 1) {
						local78 = arg1[local16].anInt4056;
						local73 = local30.anInt4056;
						if (local73 == -1 && arg3[local47] == 1) {
							local73 = 2001;
						}
						if (local78 == -1 && arg3[local47] == 1) {
							local78 = 2001;
						}
					} else if (arg4[local47] == 3) {
						local73 = local30.aBoolean166 ? 1 : 0;
						local78 = arg1[local16].aBoolean166 ? 1 : 0;
					} else {
						local73 = local30.anInt4054;
						local78 = arg1[local16].anInt4054;
					}
					if (local73 != local78) {
						if ((arg3[local47] != 1 || local78 <= local73) && (arg3[local47] != 0 || local73 <= local78)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			local44 = true;
			do {
				local20++;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg4[local47] == 2) {
						local78 = arg1[local20].anInt4055;
						local73 = local30.anInt4055;
					} else if (arg4[local47] == 1) {
						local78 = arg1[local20].anInt4056;
						local73 = local30.anInt4056;
						if (local78 == -1 && arg3[local47] == 1) {
							local78 = 2001;
						}
						if (local73 == -1 && arg3[local47] == 1) {
							local73 = 2001;
						}
					} else if (arg4[local47] == 3) {
						local73 = local30.aBoolean166 ? 1 : 0;
						local78 = arg1[local20].aBoolean166 ? 1 : 0;
					} else {
						local78 = arg1[local20].anInt4054;
						local73 = local30.anInt4054;
					}
					if (local78 != local73) {
						if ((arg3[local47] != 1 || local73 <= local78) && (arg3[local47] != 0 || local73 >= local78)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			if (local20 < local16) {
				@Pc(336) Class89 local336 = arg1[local20];
				arg1[local20] = arg1[local16];
				arg1[local16] = local336;
			}
		}
		method1965(local16, arg1, arg2, arg3, arg4);
		method1965(arg0, arg1, local16 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!of;)V")
	public static void method1968(@OriginalArg(1) Class63 arg0) {
		Static105.aClass63_1 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!tg;II)V")
	public static void method1969(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class81 local11 = arg0.method2799().method2808();
		@Pc(13) boolean local13 = false;
		for (@Pc(19) int local19 = 0; local19 < Static25.anInt645; local19++) {
			@Pc(27) Class1_Sub2_Sub1_Sub3_Sub1 local27 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[Static176.anIntArray423[local19]];
			if (local27 != null && local27.aClass81_518 != null && local27.aClass81_518.method2811(local11)) {
				local13 = true;
				Static139.method2339(false, 1, 0, 2, 1, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0], local27.anIntArray326[0], Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], local27.anIntArray324[0], 0, 0);
				if (arg1 == 1) {
					Static104.aClass1_Sub8_Sub1_2.method366(34);
					Static104.aClass1_Sub8_Sub1_2.method345(Static176.anIntArray423[local19]);
				} else if (arg1 == 4) {
					Static104.aClass1_Sub8_Sub1_2.method366(218);
					Static104.aClass1_Sub8_Sub1_2.method337(Static176.anIntArray423[local19]);
				} else if (arg1 == 6) {
					Static104.aClass1_Sub8_Sub1_2.method366(68);
					Static104.aClass1_Sub8_Sub1_2.method337(Static176.anIntArray423[local19]);
				} else if (arg1 == 7) {
					Static104.aClass1_Sub8_Sub1_2.method366(81);
					Static104.aClass1_Sub8_Sub1_2.method321(Static176.anIntArray423[local19]);
				}
				break;
			}
		}
		if (!local13) {
			Static131.method2247(0, Static127.method2169(new Class81[] { Static31.aClass81_287, local11 }), Static149.aClass81_1213);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)Z")
	public static boolean method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static19.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static90.anInt1989) {
			return false;
		} else if (local7 == Static90.anInt1989) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (method1963(local22 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg2], local26 + 1) && method1963(local22 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local26 + 1) && method1963(local22 + 128 - 1, Static116.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && method1963(local22 + 1, Static116.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static19.anIntArrayArrayArray1[arg0][arg1][arg2] = Static90.anInt1989;
				return true;
			} else {
				Static19.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static90.anInt1989;
				return false;
			}
		}
	}
}

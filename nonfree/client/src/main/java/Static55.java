import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "Z")
	private static boolean aBoolean26;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
	public static int[] anIntArray85 = new int[5];

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_665 = null;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_666 = Static94.method1596("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_667 = Static94.method1596("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "Lclient!a;")
	public static Class1 aClass1_668 = Static94.method1596("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_669 = Static94.method1596("null");

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!a;")
	public static Class1 aClass1_670 = Static94.method1596("null");

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "Lclient!a;")
	public static Class1 aClass1_671 = Static94.method1596("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method477() {
		aClass1_671 = null;
		aClass1_665 = null;
		aClass1_670 = null;
		aClass1_669 = null;
		aLongArray2 = null;
		aClass1_666 = null;
		aClass2_Sub1_Sub2_Sub2_6 = null;
		aClass1_667 = null;
		anIntArray85 = null;
		aClass1_668 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public static void method478(@OriginalArg(0) boolean arg0) {
		if (Static93.aClass65_4 == null) {
			return;
		}
		try {
			@Pc(16) Class2_Sub3 local16 = new Class2_Sub3(4);
			local16.method788(arg0 ? 2 : 3);
			local16.method800(0);
			Static93.aClass65_4.method1759(4, local16.aByteArray7);
		} catch (@Pc(37) IOException local37) {
			try {
				Static93.aClass65_4.method1758();
			} catch (@Pc(42) Exception local42) {
			}
			Static93.aClass65_4 = null;
			Static14.anInt681++;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII[Lclient!qd;II)V")
	public static void method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2_Sub1_Sub14[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(8) int local8 = 0; local8 < arg6.length; local8++) {
			@Pc(14) Class2_Sub1_Sub14 local14 = arg6[local8];
			if (local14 != null && (local14.anInt2192 == 0 || local14.aBoolean127) && local14 != null && arg5 == local14.anInt2174 && (!local14.aBoolean134 || Static31.aBoolean52)) {
				@Pc(40) int local40 = arg4 + local14.anInt2180;
				@Pc(45) int local45 = arg0 + local14.anInt2197;
				if (!local14.aBoolean128) {
					local45 -= arg8;
				}
				@Pc(57) int local57 = local45 + local14.anInt2171;
				@Pc(64) int local64 = arg0 >= local45 ? arg0 : local45;
				if (!local14.aBoolean128) {
					local40 -= arg2;
				}
				@Pc(77) int local77 = local40 + local14.anInt2196;
				@Pc(84) int local84 = arg4 < local40 ? local40 : arg4;
				@Pc(91) int local91 = arg1 > local57 ? local57 : arg1;
				@Pc(98) int local98 = local77 < arg7 ? local77 : arg7;
				if (local14.anInt2192 == 0) {
					method479(local64, local91, local14.anInt2228, arg3, local84, local8, arg6, local98, local14.anInt2215);
					if (local14.aClass2_Sub1_Sub14Array1 != null) {
						method479(local64, local91, local14.anInt2228, arg3, local84, local14.anInt2194, local14.aClass2_Sub1_Sub14Array1, local98, local14.anInt2215);
					}
				}
				if (local14.aBoolean127) {
					@Pc(161) boolean local161;
					if (Static22.anInt930 >= local84 && local64 <= Static84.anInt2248 && local98 > Static22.anInt930 && local91 > Static84.anInt2248) {
						local161 = true;
					} else {
						local161 = false;
					}
					@Pc(167) boolean local167 = false;
					if (Static25.anInt1019 == 1 && local161) {
						local167 = true;
					}
					@Pc(176) boolean local176 = false;
					if (local14.anInt2222 != -1 && local167 && Static15.aClass2_Sub1_Sub14_1 == null) {
						Static11.anInt608 = Static22.anInt930;
						Static15.aClass2_Sub1_Sub14_1 = local14;
						Static80.anInt2126 = Static84.anInt2248;
					}
					if (Static103.anInt2617 == 1 && local84 <= Static93.anInt2360 && Static1.anInt13 >= local64 && Static93.anInt2360 < local98 && Static1.anInt13 < local91) {
						local176 = true;
					}
					if (Static15.aClass2_Sub1_Sub14_1 != null) {
						local167 = false;
						local161 = false;
						local176 = false;
					}
					if (!local14.aBoolean133 && local176 && (arg3 & 0x1) != 0) {
						local14.aBoolean133 = true;
						if (local14.anObjectArray8 != null) {
							Static72.method1368(local14.anObjectArray8, Static1.anInt13 - local45, local14, Static93.anInt2360 - local40);
						}
					}
					if (local14.aBoolean133 && local167 && (arg3 & 0x4) != 0 && local14.anObjectArray12 != null) {
						Static72.method1368(local14.anObjectArray12, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
					}
					if (local14.aBoolean133 && !local167 && (arg3 & 0x2) != 0) {
						local14.aBoolean133 = false;
						if (local14.anObjectArray10 != null) {
							Static72.method1368(local14.anObjectArray10, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
						}
					}
					if (local167 && (arg3 & 0x8) != 0 && local14.anObjectArray1 != null) {
						Static72.method1368(local14.anObjectArray1, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
					}
					if (!local14.aBoolean126 && local161 && (arg3 & 0x10) != 0) {
						local14.aBoolean126 = true;
						if (local14.anObjectArray3 != null) {
							Static72.method1368(local14.anObjectArray3, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
						}
					}
					if (local14.aBoolean126 && local161 && (arg3 & 0x40) != 0 && local14.anObjectArray7 != null) {
						Static72.method1368(local14.anObjectArray7, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
					}
					if (local14.aBoolean126 && !local161 && (arg3 & 0x20) != 0) {
						local14.aBoolean126 = false;
						if (local14.anObjectArray5 != null) {
							Static72.method1368(local14.anObjectArray5, Static84.anInt2248 - local45, local14, Static22.anInt930 - local40);
						}
					}
					if (local14.anObjectArray11 != null && (arg3 & 0x80) != 0) {
						Static72.method1368(local14.anObjectArray11, 0, local14, 0);
					}
					if (Static42.anInt1435 == Static69.anInt2806 && local14.anObjectArray2 != null && (arg3 & 0x100) != 0) {
						Static72.method1368(local14.anObjectArray2, 0, local14, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public static void method488(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static51.anInt1703; local14++) {
			if (Static98.aLongArray6[local14] == arg0) {
				Static51.anInt1703--;
				Static34.aBoolean60 = true;
				for (@Pc(42) int local42 = local14; local42 < Static51.anInt1703; local42++) {
					Static100.aClass1Array25[local42] = Static100.aClass1Array25[local42 + 1];
					Static61.anIntArray197[local42] = Static61.anIntArray197[local42 + 1];
					Static98.aLongArray6[local42] = Static98.aLongArray6[local42 + 1];
				}
				Static59.aClass2_Sub3_Sub1_2.method841(255);
				Static59.aClass2_Sub3_Sub1_2.method804(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZI)I")
	public static int method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub1_Sub2_Sub3.anIntArray107[arg3 * 1024 / arg1] >> 1;
		return ((65536 - local21) * arg0 >> 16) + (arg2 * local21 >> 16);
	}
}

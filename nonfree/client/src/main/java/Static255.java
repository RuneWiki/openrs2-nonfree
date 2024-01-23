import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!th", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Lclient!km;")
	public static Class91 aClass91_183;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "Lclient!qc;")
	public static Class135 aClass135_34 = new Class135(30);

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Lclient!fm;")
	public static Class49 aClass49_11 = new Class49(16);

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString297 = " from your friend list first.";

	@OriginalMember(owner = "client!th", name = "N", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)I")
	public static int method3902() {
		if (Static53.aClass82_13 == null) {
			return -1;
		}
		while (Static298.anInt5622 < Static53.aClass82_13.anInt2893) {
			if (Static53.aClass82_13.method2234(Static298.anInt5622)) {
				return Static298.anInt5622++;
			}
			Static298.anInt5622++;
		}
		return -1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
	public static boolean method3903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static95.anInt2222; local1++) {
			@Pc(8) Class165 local8 = Static67.aClass165Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt5231 == 1) {
				local17 = local8.anInt5239 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt5242 + (local8.anInt5245 * local17 >> 8);
					local39 = local8.anInt5234 + (local8.anInt5241 * local17 >> 8);
					local49 = local8.anInt5229 + (local8.anInt5240 * local17 >> 8);
					local59 = local8.anInt5232 + (local8.anInt5236 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5231 == 2) {
				local17 = arg0 - local8.anInt5239;
				if (local17 > 0) {
					local29 = local8.anInt5242 + (local8.anInt5245 * local17 >> 8);
					local39 = local8.anInt5234 + (local8.anInt5241 * local17 >> 8);
					local49 = local8.anInt5229 + (local8.anInt5240 * local17 >> 8);
					local59 = local8.anInt5232 + (local8.anInt5236 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5231 == 3) {
				local17 = local8.anInt5242 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt5239 + (local8.anInt5244 * local17 >> 8);
					local39 = local8.anInt5246 + (local8.anInt5238 * local17 >> 8);
					local49 = local8.anInt5229 + (local8.anInt5240 * local17 >> 8);
					local59 = local8.anInt5232 + (local8.anInt5236 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5231 == 4) {
				local17 = arg2 - local8.anInt5242;
				if (local17 > 0) {
					local29 = local8.anInt5239 + (local8.anInt5244 * local17 >> 8);
					local39 = local8.anInt5246 + (local8.anInt5238 * local17 >> 8);
					local49 = local8.anInt5229 + (local8.anInt5240 * local17 >> 8);
					local59 = local8.anInt5232 + (local8.anInt5236 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt5231 == 5) {
				local17 = arg1 - local8.anInt5229;
				if (local17 > 0) {
					local29 = local8.anInt5239 + (local8.anInt5244 * local17 >> 8);
					local39 = local8.anInt5246 + (local8.anInt5238 * local17 >> 8);
					local49 = local8.anInt5242 + (local8.anInt5245 * local17 >> 8);
					local59 = local8.anInt5234 + (local8.anInt5241 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZB)V")
	public static void method3904(@OriginalArg(0) boolean arg0) {
		Static24.anIntArray412 = new int[104];
		Static29.anIntArray75 = new int[104];
		Static49.anIntArray106 = new int[104];
		Static153.anInt3320 = 99;
		Static84.anIntArray174 = new int[104];
		Static152.anIntArray297 = new int[104];
		Static67.anIntArray140 = new int[5];
		@Pc(33) byte local33;
		if (arg0) {
			local33 = 1;
		} else {
			local33 = 4;
		}
		Static238.aByteArrayArrayArray21 = new byte[local33][104][104];
		Static5.aByteArrayArrayArray4 = new byte[local33][105][105];
		Static2.aByteArrayArrayArray3 = new byte[local33][104][104];
		Static219.anIntArrayArrayArray10 = new int[local33][105][105];
		Static58.aByteArrayArrayArray10 = new byte[local33][104][104];
		Static85.aByteArrayArrayArray13 = new byte[local33][104][104];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILclient!dn;JZ)V")
	public static void method3906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class44 local6 = new Class44();
		local6.aClass14_6 = arg4;
		local6.anInt1520 = arg1 * 128 + 64;
		local6.anInt1524 = arg2 * 128 + 64;
		local6.anInt1521 = arg3;
		local6.aLong55 = arg5;
		local6.aBoolean108 = arg6;
		if (Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub26(arg0, arg1, arg2);
		}
		Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass44_1 = local6;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)I")
	public static int method3907() {
		try {
			if (Static6.anInt191 == 0) {
				if (Static294.method4413() - 5000L < Static248.aLong174) {
					return 0;
				}
				Static192.aClass116_3 = Static253.aClass175_4.method4326(Static13.anInt258, Static83.aString106);
				Static242.aLong167 = Static294.method4413();
				Static6.anInt191 = 1;
			}
			if (Static242.aLong167 + 30000L < Static294.method4413()) {
				return Static212.method3368(1000);
			}
			@Pc(116) int local116;
			if (Static6.anInt191 == 1) {
				if (Static192.aClass116_3.anInt3812 == 2) {
					return Static212.method3368(1001);
				}
				if (Static192.aClass116_3.anInt3812 != 1) {
					return -1;
				}
				Static87.aClass113_1 = new Class113((Socket) Static192.aClass116_3.anObject5, Static253.aClass175_4);
				Static192.aClass116_3 = null;
				@Pc(77) int local77 = 0;
				if (Static297.aBoolean452) {
					local77 = Static286.anInt5469;
				}
				Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
				Static283.aClass1_Sub11_Sub1_3.method2655(23);
				Static283.aClass1_Sub11_Sub1_3.method2659(local77);
				Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				local116 = Static87.aClass113_1.method3012();
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				if (local116 != 0) {
					return Static212.method3368(local116);
				}
				Static6.anInt191 = 2;
			}
			if (Static6.anInt191 == 2) {
				if (Static87.aClass113_1.method3014() < 2) {
					return -1;
				}
				Static111.anInt2559 = Static87.aClass113_1.method3012();
				Static111.anInt2559 <<= 0x8;
				Static111.anInt2559 += Static87.aClass113_1.method3012();
				Static136.anInt4219 = 0;
				Static3.aByteArray3 = new byte[Static111.anInt2559];
				Static6.anInt191 = 3;
			}
			if (Static6.anInt191 != 3) {
				return -1;
			}
			local116 = Static87.aClass113_1.method3014();
			if (local116 < 1) {
				return -1;
			}
			if (Static111.anInt2559 - Static136.anInt4219 < local116) {
				local116 = Static111.anInt2559 - Static136.anInt4219;
			}
			Static87.aClass113_1.method3015(Static3.aByteArray3, local116, Static136.anInt4219);
			Static136.anInt4219 += local116;
			if (Static111.anInt2559 > Static136.anInt4219) {
				return -1;
			} else if (Static205.method3298(Static3.aByteArray3)) {
				Static62.aClass41_Sub1Array1 = new Class41_Sub1[Static139.anInt3029];
				@Pc(237) int local237 = 0;
				for (@Pc(239) int local239 = Static217.anInt4286; local239 <= Static6.anInt186; local239++) {
					@Pc(250) Class41_Sub1 local250 = Static192.method3167(local239);
					if (local250 != null) {
						Static62.aClass41_Sub1Array1[local237++] = local250;
					}
				}
				Static87.aClass113_1.method3019();
				Static6.anInt191 = 0;
				Static87.aClass113_1 = null;
				Static73.anInt1551 = 0;
				Static3.aByteArray3 = null;
				Static248.aLong174 = Static294.method4413();
				return 0;
			} else {
				return Static212.method3368(1002);
			}
		} catch (@Pc(279) IOException local279) {
			return Static212.method3368(1003);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method3909() {
		Static246.aClass135_31.method3320(5);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!km;III)Lclient!pn;")
	public static Class1_Sub2_Sub11 method3910(@OriginalArg(0) Class91 arg0, @OriginalArg(3) int arg1) {
		return Static240.method3698(0, arg1, arg0) ? Static229.method3574() : null;
	}
}

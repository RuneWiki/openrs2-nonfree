import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "Lclient!nh;")
	public static Class62 aClass62_27;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_957 = Static177.method3050("titlebutton");

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!ig;")
	public static final Class43 aClass43_2 = new Class43();

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[B")
	public static final byte[] aByteArray30 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_962 = Static177.method3050("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!jd;")
	public static Class46 aClass46_958 = aClass46_962;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!db;")
	public static Class20 aClass20_5 = new Class20(8);

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_959 = Static177.method3050("<img=0>");

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_960 = Static177.method3050("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_961 = Static177.method3050("scape main");

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
	public static int anInt2649 = -1;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "[I")
	public static final int[] anIntArray247 = new int[5];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!h;I)V")
	public static void method1994(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static50.aClass56_1 != null) {
			@Pc(27) int local27;
			try {
				Static50.aClass56_1.method1966(0L);
				Static50.aClass56_1.method1964(local13);
				for (local27 = 0; local27 < 24 && local13[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local27 = 0; local27 < 24; local27++) {
					local13[local27] = -1;
				}
			}
		}
		arg0.method1239(local13, 24);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I")
	public static int method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(28) int local28 = arg1;
		if (arg1 < 3 && (Static53.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
			local28 = arg1 + 1;
		}
		@Pc(47) int local47 = arg2 & 0x7F;
		@Pc(51) int local51 = arg0 & 0x7F;
		@Pc(78) int local78 = local51 * Static112.anIntArrayArrayArray42[local28][local7 + 1][local11] + Static112.anIntArrayArrayArray42[local28][local7][local11] * (128 - local51) >> 7;
		@Pc(109) int local109 = local51 * Static112.anIntArrayArrayArray42[local28][local7 + 1][local11 + 1] + (128 - local51) * Static112.anIntArrayArrayArray42[local28][local7][local11 - -1] >> 7;
		return (128 - local47) * local78 + local47 * local109 >> 7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jd;I)I")
	public static int method2000(@OriginalArg(0) Class46 arg0) {
		return arg0.method1677() + 1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIILclient!tg;IZJ)Z")
	public static boolean method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static57.anInt1408 || local4 >= Static84.anInt4112) {
					return false;
				}
				@Pc(25) Class4_Sub7 local25 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt1040 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class86 local49 = new Class86();
		local49.aLong129 = arg11;
		local49.anInt3582 = arg0;
		local49.anInt3590 = arg5;
		local49.anInt3585 = arg6;
		local49.anInt3587 = arg7;
		local49.aClass4_Sub1_Sub1_10 = arg8;
		local49.anInt3592 = arg9;
		local49.anInt3583 = arg1;
		local49.anInt3581 = arg2;
		local49.anInt3584 = arg1 + arg3 - 1;
		local49.anInt3595 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static28.aClass4_Sub7ArrayArrayArray1[local124][local92][local95] == null) {
						Static28.aClass4_Sub7ArrayArrayArray1[local124][local92][local95] = new Class4_Sub7(local124, local92, local95);
					}
				}
				@Pc(157) Class4_Sub7 local157 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][local92][local95];
				local157.aClass86Array1[local157.anInt1040] = local49;
				local157.anIntArray90[local157.anInt1040] = local98;
				local157.anInt1042 |= local98;
				local157.anInt1040++;
			}
		}
		if (arg10) {
			Static82.aClass86Array4[Static111.anInt2730++] = local49;
		}
		return true;
	}
}

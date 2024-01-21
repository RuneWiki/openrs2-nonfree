import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!mb;")
	public static Class42 aClass42_75;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public static int anInt2836;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_62;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array58;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt2827 = -1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!fc;")
	public static Class24 aClass24_83 = new Class24();

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_1284 = Static45.method753("Offline");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_1285 = aClass62_1284;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt2835 = 0;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!v;")
	public static Class62 aClass62_1286 = Static45.method753("Anmelde)2Limit \u001c1berschritten)3");

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_1287 = Static45.method753("mapscene");

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!v;")
	public static Class62 aClass62_1288 = Static45.method753("@gr3@");

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Lclient!v;")
	private static Class62 aClass62_1291 = Static45.method753("Off");

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_1289 = aClass62_1291;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!v;")
	private static Class62 aClass62_1292 = Static45.method753("Unable to find ");

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!v;")
	public static Class62 aClass62_1290 = aClass62_1292;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method1853() {
		Static54.aClass34_33.method762();
		Static79.aClass34_26.method762();
		Static21.aClass34_9.method762();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!bd;I)V")
	public static void method1854(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		arg0.anInt1881 = 0;
		@Pc(11) int local11 = arg0.anInt1857 - Static12.anInt451;
		if (arg0.anInt1866 == 0) {
			arg0.anInt1834 = 1024;
		}
		if (arg0.anInt1866 == 1) {
			arg0.anInt1834 = 1536;
		}
		if (arg0.anInt1866 == 2) {
			arg0.anInt1834 = 0;
		}
		if (arg0.anInt1866 == 3) {
			arg0.anInt1834 = 512;
		}
		@Pc(50) int local50 = arg0.anInt1861 * 64 + arg0.anInt1886 * 128;
		arg0.anInt1882 += (local50 - arg0.anInt1882) / local11;
		@Pc(73) int local73 = arg0.anInt1858 * 128 + arg0.anInt1861 * 64;
		arg0.anInt1887 += (local73 - arg0.anInt1887) / local11;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)Lclient!v;")
	public static Class62 method1855(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(51) byte[] local51 = new byte[local35];
			while (arg0 != 0L) {
				@Pc(55) long local55 = arg0;
				arg0 /= 37L;
				local35--;
				local51[local35] = Static94.aByteArray23[(int) (local55 - arg0 * 37L)];
			}
			@Pc(82) Class62 local82 = new Class62();
			local82.aByteArray25 = local51;
			local82.anInt2649 = local51.length;
			return local82;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII[BI[Lclient!cc;IB)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class11[] arg7, @OriginalArg(8) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg3 > 0 && local3 + arg3 < 103 && local7 + arg4 > 0 && local7 + arg4 < 103) {
					arg7[arg2].anIntArrayArray3[local3 + arg3][local7 + arg4] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class3_Sub8 local77 = new Class3_Sub8(arg5);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (local84 == arg8 && local88 >= arg1 && local88 < arg1 + 8 && local92 >= arg0 && local92 < arg0 + 8) {
						Static54.method1783(local77, arg3 + Static36.method667(arg6, local92 & 0x7, local88 & 0x7), arg6, arg2, 0, 0, Static33.method652(arg6, local92 & 0x7, local88 & 0x7) + arg4);
					} else {
						Static54.method1783(local77, -1, 0, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method1857() {
		for (@Pc(14) Class3_Sub2 local14 = (Class3_Sub2) Static108.aClass24_82.method534(); local14 != null; local14 = (Class3_Sub2) Static108.aClass24_82.method525()) {
			if (local14.anInt176 > 0) {
				local14.anInt176--;
			}
			if (local14.anInt176 != 0) {
				if (local14.anInt191 > 0) {
					local14.anInt191--;
				}
				if (local14.anInt191 == 0 && local14.anInt174 >= 1 && local14.anInt189 >= 1 && local14.anInt174 <= 102 && local14.anInt189 <= 102 && (local14.anInt180 < 0 || Static14.method369(local14.anInt180, local14.anInt183))) {
					Static78.method1260(local14.anInt190, local14.anInt179, local14.anInt183, local14.anInt189, local14.anInt174, local14.anInt180, local14.anInt188);
					local14.anInt191 = -1;
					if (local14.anInt180 == local14.anInt184 && local14.anInt184 == -1) {
						local14.method1852();
					} else if (local14.anInt180 == local14.anInt184 && local14.anInt178 == local14.anInt179 && local14.anInt177 == local14.anInt183) {
						local14.method1852();
					}
				}
			} else if (local14.anInt184 < 0 || Static14.method369(local14.anInt184, local14.anInt177)) {
				Static78.method1260(local14.anInt190, local14.anInt178, local14.anInt177, local14.anInt189, local14.anInt174, local14.anInt184, local14.anInt188);
				local14.method1852();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!mb;Lclient!mb;Lclient!mb;)V")
	public static void method1859(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		Static64.aClass42_48 = arg1;
		Static44.aClass42_32 = arg0;
		Static59.aClass42_45 = arg2;
		Static65.aClass3_Sub1_Sub6ArrayArray1 = new Class3_Sub1_Sub6[Static64.aClass42_48.method1496()][];
		Static92.aBooleanArray11 = new boolean[Static64.aClass42_48.method1496()];
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method1860() {
		aClass62_1287 = null;
		aClass24_83 = null;
		aClass62_1288 = null;
		aClass62_1284 = null;
		aClass42_75 = null;
		aClass62_1289 = null;
		aClass3_Sub1_Sub1_Sub4Array58 = null;
		aClass62_1290 = null;
		aClass62_1291 = null;
		aClass62_1286 = null;
		aClass62_1292 = null;
		aClass42_Sub1_62 = null;
		aClass62_1285 = null;
	}
}

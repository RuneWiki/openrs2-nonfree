import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "Lclient!tj;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "Lclient!te;")
	public static final Class188 aClass188_4 = new Class188(128);

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString72 = "Drop";

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public static void method1612() {
		for (@Pc(21) Class3_Sub7_Sub15 local21 = (Class3_Sub7_Sub15) Static165.aClass127_18.method3402(); local21 != null; local21 = (Class3_Sub7_Sub15) Static165.aClass127_18.method3400()) {
			@Pc(26) Class5_Sub4_Sub3 local26 = local21.aClass5_Sub4_Sub3_1;
			if (Static163.anInt3184 != local26.aByte69 || local26.anInt2700 < Static51.anInt1101) {
				local21.method5717();
				local26.method2192();
			} else if (Static51.anInt1101 >= local26.anInt2687) {
				if (local26.anInt2707 > 0) {
					@Pc(67) Class5_Sub4_Sub4_Sub2 local67 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local26.anInt2707 - 1];
					if (local67 != null && local67.anInt5901 >= 0 && local67.anInt5901 < Static162.anInt2152 * 128 && local67.anInt5905 >= 0 && Static122.anInt2632 * 128 > local67.anInt5905) {
						local26.method2193(Static51.anInt1101, local67.anInt5905, local67.anInt5901, Static286.method4919(local67.anInt5901, local67.anInt5905, local26.aByte69) - local26.anInt2686);
					}
				}
				if (local26.anInt2707 < 0) {
					@Pc(131) int local131 = -local26.anInt2707 - 1;
					@Pc(142) Class5_Sub4_Sub4_Sub1 local142;
					if (Static312.anInt6280 == local131) {
						local142 = Static349.aClass5_Sub4_Sub4_Sub1_2;
					} else {
						local142 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local131];
					}
					if (local142 != null && local142.anInt5901 >= 0 && Static162.anInt2152 * 128 > local142.anInt5901 && local142.anInt5905 >= 0 && Static122.anInt2632 * 128 > local142.anInt5905) {
						local26.method2193(Static51.anInt1101, local142.anInt5905, local142.anInt5901, Static286.method4919(local142.anInt5901, local142.anInt5905, local26.aByte69) - local26.anInt2686);
					}
				}
				local26.method2188(Static347.anInt6759);
				Static321.method5272(local26, true);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class3_Sub37 local7 = new Class3_Sub37();
		local7.anInt5400 = arg4;
		local7.anInt5396 = arg10;
		local7.anInt5398 = arg11;
		local7.anInt5388 = arg1;
		local7.anInt5389 = arg3;
		local7.anInt5385 = arg7;
		local7.anInt5392 = arg0;
		local7.anInt5397 = arg2;
		local7.anInt5387 = arg5;
		local7.anInt5390 = arg9;
		local7.anInt5384 = arg8;
		local7.anInt5399 = arg6;
		Static140.aClass127_15.method3387(local7);
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
	public static void method1614() {
		Static176.aByteArrayArrayArray13 = null;
		Static226.anIntArray375 = null;
		Static302.anIntArray487 = null;
		Static147.aByteArrayArrayArray8 = null;
		Static155.aByteArrayArrayArray3 = null;
		Static103.anIntArray126 = null;
		Static297.anIntArray483 = null;
		Static322.anIntArray522 = null;
		Static310.aByteArrayArrayArray14 = null;
		Static105.anIntArrayArrayArray2 = null;
		Static245.aByteArrayArrayArray12 = null;
		Static16.anIntArray16 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)V")
	public static void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static19.anInt533 <= arg4 - arg2 && Static4.anInt75 >= arg4 + arg2 && arg3 - arg2 >= Static236.anInt4721 && arg3 + arg2 <= Static73.anInt1425) {
			Static48.method835(arg1, arg4, arg2, arg5, arg3, arg0);
		} else {
			Static61.method1007(arg0, arg2, arg1, arg5, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZZBII)Lclient!ir;")
	public static Class100 method1616(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class55 local10 = null;
		if (Static130.aClass36_5 != null) {
			local10 = new Class55(arg2, Static130.aClass36_5, Static261.aClass36Array1[arg2], 1000000);
		}
		Static72.aClass152_Sub1Array1[arg2] = Static268.aClass107_1.method2386(arg2, Static5.aClass55_1, local10);
		if (arg0) {
			Static72.aClass152_Sub1Array1[arg2].method3970();
		}
		return new Class100(Static72.aClass152_Sub1Array1[arg2], arg1, 1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!ir;ZLclient!ir;)V")
	public static void method1618(@OriginalArg(1) Class100 arg0, @OriginalArg(3) Class100 arg1) {
		Static169.aClass100_72 = arg1;
		Static18.aClass100_11 = arg0;
		Static97.aBoolean104 = true;
		@Pc(15) int local15 = Static18.aClass100_11.method2306() - 1;
		Static106.anInt2240 = local15 * 256 + Static18.aClass100_11.method2309(local15);
		Static308.aStringArray40 = new String[] { null, null, null, null, aString72 };
		Static13.aStringArray2 = new String[] { null, null, Static337.aString246, null, null };
	}
}

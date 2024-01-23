import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Lclient!bk;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public static int anInt2801;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString100 = null;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public static void method2237() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static128.aBooleanArray7[local7] = true;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V")
	public static void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17;
		if (arg2 > arg0) {
			for (local17 = arg0; local17 < arg2; local17++) {
				Static181.anIntArrayArray19[local17][arg3] = arg1;
			}
		} else {
			for (local17 = arg2; local17 < arg0; local17++) {
				Static181.anIntArrayArray19[local17][arg3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
	public static void method2239(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub1_Sub6 local8 = Static181.method2779(11, arg0);
		local8.method929();
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public static void method2240() {
		Static138.aClass61_21.method1378();
		Static114.aClass61_19.method1378();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
	public static void method2241(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = Static177.aByteArrayArray7.length;
		@Pc(20) byte[][] local20;
		if (Static116.aBoolean188 && arg0) {
			local20 = Static13.aByteArrayArray1;
		} else {
			local20 = Static282.aByteArrayArray5;
		}
		for (@Pc(26) int local26 = 0; local26 < local14; local26++) {
			@Pc(33) byte[] local33 = local20[local26];
			if (local33 != null) {
				@Pc(47) int local47 = (Static13.anIntArray15[local26] & 0xFF) * 64 - Static130.anInt2601;
				@Pc(58) int local58 = (Static13.anIntArray15[local26] >> 8) * 64 - Static49.anInt1089;
				Static16.method2745();
				Static134.method2180(arg0, local47, local58, Static159.aClass112Array1, local33);
			}
		}
	}
}

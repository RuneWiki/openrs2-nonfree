import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_7;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_618 = Static187.method3089("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_619 = Static187.method3089("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_10 = new Class47(20);

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	public static int anInt1521 = -1;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
	public static final int[] anIntArray124 = new int[256];

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_621 = Static187.method3089("Loaded fonts");

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_620 = aClass92_621;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "[Lclient!w;")
	public static final Class96[] aClass96Array1 = new Class96[24];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BBII)Lclient!vd;")
	public static Class92 method1032(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class92 local15 = new Class92();
		local15.anInt4244 = 0;
		local15.aByteArray52 = new byte[arg1];
		for (@Pc(24) int local24 = arg2; local24 < arg2 + arg1; local24++) {
			if (arg0[local24] != 0) {
				local15.aByteArray52[local15.anInt4244++] = arg0[local24];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
	public static boolean method1034(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!vd;B)V")
	public static void method1035(@OriginalArg(0) Class92 arg0) {
		if (Static8.aClass1_Sub10Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method3217();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static8.aClass1_Sub10Array1.length && local14 != Static8.aClass1_Sub10Array1[local10].aLong251) {
			local10++;
		}
		if (Static8.aClass1_Sub10Array1.length > local10 && Static8.aClass1_Sub10Array1[local10] != null) {
			Static38.aClass1_Sub14_Sub1_3.method3067(24);
			Static38.aClass1_Sub14_Sub1_3.method3016(Static8.aClass1_Sub10Array1[local10].aLong251);
		}
	}
}

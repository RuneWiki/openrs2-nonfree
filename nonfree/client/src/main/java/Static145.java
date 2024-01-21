import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_7;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1027 = Static8.method128("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lclient!pg;")
	public static Class59 aClass59_53 = new Class59();

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1028 = Static8.method128("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1030 = Static8.method128("Prepared visibility map");

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1029 = aClass18_1030;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1031 = Static8.method128("Choose Option");

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1032 = aClass18_1031;

	@OriginalMember(owner = "client!sd", name = "tb", descriptor = "I")
	public static int anInt4043 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)I")
	public static int method2763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
	public static void method2764() {
		if (Static25.anIntArray50 != null && Static29.anIntArray62 != null) {
			return;
		}
		Static29.anIntArray62 = new int[256];
		Static25.anIntArray50 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static25.anIntArray50[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static29.anIntArray62[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!c;IB)V")
	public static void method2765(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static71.method1524(arg1, arg0.anInt3579, arg0.anInt3558);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIB)I")
	public static int method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(I)V")
	public static void method2767() {
		aClass18_1032 = null;
		anIntArray375 = null;
		aClass18_1027 = null;
		aClass1_Sub1_Sub8_Sub3_7 = null;
		aClass18_1028 = null;
		aClass18_1030 = null;
		aClass18_1029 = null;
		aClass18_1031 = null;
		anIntArray374 = null;
		aClass59_53 = null;
	}
}

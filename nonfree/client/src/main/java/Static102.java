import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
	public static boolean aBoolean199;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!kc;")
	public static Class22 aClass22_19;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1008 = Static2.method59(": ");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1009 = Static2.method59("cross");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1011 = Static2.method59("Hidden");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1010 = aClass80_1011;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
	public static int anInt2669 = 0;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wb;Lclient!wd;B)I")
	public static int method1657(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(6) int local6 = arg0.anInt2799;
		arg0.method1781(arg1.anInt3200);
		arg0.anInt2799 += Static84.aClass63_1.method1601(0, arg1.anInt3200, arg1.aByteArray40, arg0.anInt2799, arg0.aByteArray38);
		return arg0.anInt2799 - local6;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lclient!wd;")
	public static Class80 method1658(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(46) byte[] local46 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local25--;
				local46[local25] = Static121.aByteArray39[(int) (local50 - arg0 * 37L)];
			}
			@Pc(75) Class80 local75 = new Class80();
			local75.aByteArray40 = local46;
			local75.anInt3200 = local46.length;
			return local75;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method1659(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static94.aBoolean171) {
			try {
				@Pc(22) Class37 local22 = (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
				local22.method998(arg0);
				return local22;
			} catch (@Pc(31) Throwable local31) {
				Static94.aBoolean171 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!va;Z)I")
	public static int method1660(@OriginalArg(0) Class2_Sub1_Sub17 arg0) {
		@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) Static2.aClass41_1.method1056(((long) arg0.anInt3022 << 32) + ((long) arg0.anInt3021));
		return local18 == null ? arg0.anInt3047 : local18.anInt1935;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1661() {
		if (!Static51.aBoolean99) {
			return;
		}
		Static70.anIntArray246 = null;
		Static60.anIntArray221 = null;
		Static126.aClass2_Sub1_Sub9_Sub3Array10 = null;
		Static78.aClass2_Sub1_Sub9_Sub3_48 = null;
		Static56.anIntArray217 = null;
		Static21.aClass2_Sub1_Sub9_Sub3_19 = null;
		Static50.aClass2_Sub1_Sub9_Sub3Array4 = null;
		Static19.aClass22_4 = null;
		Static92.aClass2_Sub1_Sub9_Sub3Array7 = null;
		Static97.anIntArray332 = null;
		Static70.aClass2_Sub1_Sub9_Sub3_41 = null;
		Static4.anIntArray12 = null;
		Static45.aClass2_Sub1_Sub9_Sub1_8 = null;
		Static40.aClass2_Sub1_Sub9_Sub3Array3 = null;
		Static64.anIntArray225 = null;
		Static127.aClass2_Sub1_Sub9_Sub1_9 = null;
		Static70.anIntArray247 = null;
		Static31.aClass2_Sub1_Sub9_Sub3Array2 = null;
		Static108.aClass2_Sub1_Sub9_Sub3_71 = null;
		Static104.aClass2_Sub1_Sub9_Sub1Array13 = null;
		Static113.anIntArray381 = null;
		Static107.method1824();
		Static29.method567(true);
		Static51.aBoolean99 = false;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1662() {
		Static76.aClass32_38.method878();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method1663() {
		aClass80_1010 = null;
		aClass22_19 = null;
		aClass80_1008 = null;
		aClass80_1011 = null;
		aClass80_1009 = null;
	}
}

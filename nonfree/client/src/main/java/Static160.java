import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_88;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 aClass4_Sub1_Sub7_Sub1_Sub1_7;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "Z")
	public static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1326 = Static177.method3050("purple:");

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1323 = aClass46_1326;

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1327 = Static177.method3050("Continue");

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1324 = aClass46_1327;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1325 = aClass46_1326;

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
	public static int anInt3574 = 0;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "[I")
	public static final int[] anIntArray347 = new int[100];

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1328 = Static177.method3050("Angreifen");

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public static void method2720() {
		Static162.aClass4_Sub11_Sub1_3.method1287();
		@Pc(13) int local13 = Static162.aClass4_Sub11_Sub1_3.method1288(8);
		@Pc(18) int local18;
		if (Static87.anInt2219 > local13) {
			for (local18 = local13; local18 < Static87.anInt2219; local18++) {
				Static130.anIntArray291[Static82.anInt2114++] = Static35.anIntArray82[local18];
			}
		}
		if (Static87.anInt2219 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static87.anInt2219 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static35.anIntArray82[local18];
			@Pc(64) Class4_Sub1_Sub1_Sub1_Sub2 local64 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			if (local69 == 0) {
				Static35.anIntArray82[Static87.anInt2219++] = local60;
				local64.anInt2830 = Static142.anInt3325;
			} else {
				@Pc(92) int local92 = Static162.aClass4_Sub11_Sub1_3.method1288(2);
				if (local92 == 0) {
					Static35.anIntArray82[Static87.anInt2219++] = local60;
					local64.anInt2830 = Static142.anInt3325;
					Static121.anIntArray276[Static182.anInt4082++] = local60;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local92 == 1) {
						Static35.anIntArray82[Static87.anInt2219++] = local60;
						local64.anInt2830 = Static142.anInt3325;
						local137 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local64.method2119(local137, false);
						local147 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
						if (local147 == 1) {
							Static121.anIntArray276[Static182.anInt4082++] = local60;
						}
					} else if (local92 == 2) {
						Static35.anIntArray82[Static87.anInt2219++] = local60;
						local64.anInt2830 = Static142.anInt3325;
						local137 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local64.method2119(local137, true);
						local147 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local64.method2119(local147, true);
						@Pc(199) int local199 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
						if (local199 == 1) {
							Static121.anIntArray276[Static182.anInt4082++] = local60;
						}
					} else if (local92 == 3) {
						Static130.anIntArray291[Static82.anInt2114++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public static void method2721() {
		Static2.anIntArray13 = null;
		Static27.anIntArrayArrayArray9 = null;
		Static45.anIntArray96 = null;
		Static27.aByteArrayArrayArray1 = null;
		Static48.anIntArray120 = null;
		Static118.anIntArray265 = null;
		Static125.aByteArrayArrayArray5 = null;
		Static63.aByteArrayArrayArray4 = null;
		Static130.aByteArrayArrayArray6 = null;
		Static166.aByteArrayArrayArray8 = null;
		Static93.anIntArray225 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI[B)Lclient!jd;")
	public static Class46 method2722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class46 local9 = new Class46();
		local9.anInt2141 = 0;
		local9.aByteArray20 = new byte[arg0];
		for (@Pc(18) int local18 = arg1; local18 < arg0 + arg1; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray20[local9.anInt2141++] = arg2[local18];
			}
		}
		return local9;
	}
}

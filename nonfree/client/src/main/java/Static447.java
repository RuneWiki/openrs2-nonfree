import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt7737;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_102;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_103;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_104;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!sv;")
	public static final Class311 aClass311_7 = new Class311();

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_141 = new Class73(68, -1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
	public static void method6333(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg0, 7);
		local13.method2580();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BJ)V")
	public static void method6335(@OriginalArg(1) long arg0) {
		@Pc(14) int local14 = Static289.anInt5381 + Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542;
		@Pc(19) int local19 = Static95.anInt1825 + Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540;
		if (Static405.anInt7184 - local14 < -2000 || Static405.anInt7184 - local14 > 2000 || Static468.anInt8032 - local19 < -2000 || Static468.anInt8032 - local19 > 2000) {
			Static468.anInt8032 = local19;
			Static405.anInt7184 = local14;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (local14 != Static405.anInt7184) {
			local59 = local14 - Static405.anInt7184;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local67 > local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static405.anInt7184 += local67;
		}
		if (!Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static428.aFloat160 += (float) arg0 * Static272.aFloat131 / 6.0F;
			Static331.aFloat140 += Static345.aFloat142 * (float) arg0 / 6.0F;
		}
		if (local19 != Static468.anInt8032) {
			local59 = local19 - Static468.anInt8032;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local59 > local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local59 < local67) {
				local67 = local59;
			}
			Static468.anInt8032 += local67;
		}
		Static468.method6541();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Z")
	public static boolean method6336(@OriginalArg(1) int arg0) {
		Static558.aBoolean714 = true;
		Static30.anInt863 = arg0 + 1 & 0xFFFF;
		return true;
	}
}

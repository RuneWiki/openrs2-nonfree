import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_33;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public static int anInt1064;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static int anInt1060 = 0;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public static int anInt1061 = 0;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public static volatile int anInt1062 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method866() {
		if (Static83.aClass51_4 != null) {
			Static83.aClass51_4.method3268();
		}
		if (Static147.aClass51_3 != null) {
			Static147.aClass51_3.method3268();
		}
		Static256.method3858(Static159.aBoolean203);
		Static83.aClass51_4 = Static148.method2393(Static87.aClass164_2, 22050, Static235.aCanvas1, 0);
		Static83.aClass51_4.method3283(Static278.aClass4_Sub9_Sub2_3);
		Static147.aClass51_3 = Static148.method2393(Static87.aClass164_2, 2048, Static235.aCanvas1, 1);
		Static147.aClass51_3.method3283(Static219.aClass4_Sub9_Sub4_2);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	public static void method867() {
		aClass98_33 = null;
		anIntArray123 = null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method868(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		Static142.aClass4_Sub17_Sub1_3.method1905(103);
		Static142.aClass4_Sub17_Sub1_3.method1890(Static34.method491(arg0));
		Static142.aClass4_Sub17_Sub1_3.method1884(arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJ)V")
	public static void method869(@OriginalArg(1) long arg0) {
		if (!Static74.aBoolean115) {
			Static96.aFloat16 += Static86.aFloat13 * (float) arg0 / 40.0F;
			Static270.aFloat49 += Static171.aFloat28 * (float) arg0 / 40.0F;
		}
		@Pc(31) int local31 = Static190.anInt3790 + Static239.aClass12_Sub3_Sub2_2.anInt4141;
		@Pc(37) int local37 = Static239.aClass12_Sub3_Sub2_2.anInt4113 + Static32.anInt637;
		if (Static127.anInt2702 - local31 < -500 || Static127.anInt2702 - local31 > 500 || Static295.anInt5480 - local37 < -500 || Static295.anInt5480 - local37 > 500) {
			Static295.anInt5480 = local37;
			Static127.anInt2702 = local31;
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		if (Static127.anInt2702 != local31) {
			local83 = local31 - Static127.anInt2702;
			local91 = (int) (arg0 * (long) local83 / 320L);
			if (local83 <= 0) {
				if (local91 == 0) {
					local91 = -1;
				} else if (local91 < local83) {
					local91 = local83;
				}
			} else if (local91 == 0) {
				local91 = 1;
			} else if (local83 < local91) {
				local91 = local83;
			}
			Static127.anInt2702 += local91;
		}
		if (Static295.anInt5480 != local37) {
			local83 = local37 - Static295.anInt5480;
			local91 = (int) ((long) local83 * arg0 / 320L);
			if (local83 > 0) {
				if (local91 == 0) {
					local91 = 1;
				} else if (local83 < local91) {
					local91 = local83;
				}
			} else if (local91 == 0) {
				local91 = -1;
			} else if (local91 < local83) {
				local91 = local83;
			}
			Static295.anInt5480 += local91;
		}
		Static104.method1700();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLclient!lc;)I")
	public static int method870(@OriginalArg(1) Class98 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2391(Static148.anInt2996)) {
			local5++;
		}
		if (arg0.method2391(Static223.anInt4439)) {
			local5++;
		}
		if (arg0.method2391(Static65.anInt1224)) {
			local5++;
		}
		if (arg0.method2391(Static219.anInt4341)) {
			local5++;
		}
		if (arg0.method2391(Static298.anInt5541)) {
			local5++;
		}
		if (arg0.method2391(Static205.anInt4001)) {
			local5++;
		}
		if (arg0.method2391(Static21.anInt4304)) {
			local5++;
		}
		if (arg0.method2391(Static24.anInt438)) {
			local5++;
		}
		if (arg0.method2391(Static46.anInt911)) {
			local5++;
		}
		if (arg0.method2391(Static46.anInt916)) {
			local5++;
		}
		if (arg0.method2391(Static2.anInt17)) {
			local5++;
		}
		if (arg0.method2391(Static174.anInt3436)) {
			local5++;
		}
		if (arg0.method2391(Static149.anInt3031)) {
			local5++;
		}
		if (arg0.method2391(anInt1064)) {
			local5++;
		}
		if (arg0.method2391(Static152.anInt3087)) {
			local5++;
		}
		return local5;
	}
}

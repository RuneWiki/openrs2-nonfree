import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!gn", name = "Zb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_81 = new Class183(72, -1);

	@OriginalMember(owner = "client!gn", name = "cc", descriptor = "I")
	public static final int anInt5428 = 1339;

	@OriginalMember(owner = "client!gn", name = "ec", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!gn", name = "fc", descriptor = "Lclient!ab;")
	public static Class3 aClass3_14 = null;

	@OriginalMember(owner = "client!gn", name = "gc", descriptor = "Lclient!gj;")
	public static Class86 aClass86_9 = null;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Z")
	public static boolean method4788() {
		try {
			if (Static348.anInt6384 == 2) {
				if (Static235.aClass2_Sub39_2 == null) {
					Static235.aClass2_Sub39_2 = Static403.method5515(Static194.aClass83_72, Static84.anInt1838, Static131.anInt2857);
					if (Static235.aClass2_Sub39_2 == null) {
						return false;
					}
				}
				if (Static322.aClass186_1 == null) {
					Static322.aClass186_1 = new Class186(Static36.aClass83_56, Static380.aClass83_130);
				}
				if (Static67.aClass2_Sub11_Sub1_1.method1793(Static322.aClass186_1, Static222.aClass83_80, Static235.aClass2_Sub39_2)) {
					Static67.aClass2_Sub11_Sub1_1.method1797();
					Static67.aClass2_Sub11_Sub1_1.method1792(Static19.anInt320);
					Static67.aClass2_Sub11_Sub1_1.method1802(Static235.aClass2_Sub39_2, Static350.aBoolean465);
					Static322.aClass186_1 = null;
					Static235.aClass2_Sub39_2 = null;
					Static348.anInt6384 = 0;
					Static194.aClass83_72 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static67.aClass2_Sub11_Sub1_1.method1800();
			Static235.aClass2_Sub39_2 = null;
			Static194.aClass83_72 = null;
			Static348.anInt6384 = 0;
			Static322.aClass186_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public static void method4790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static20.aFloat52 < Static20.aFloat51) {
			Static20.aFloat52 = (float) ((double) Static20.aFloat52 + (double) Static20.aFloat52 / 30.0D);
			if (Static20.aFloat52 > Static20.aFloat51) {
				Static20.aFloat52 = Static20.aFloat51;
			}
			Static335.method5408();
			Static20.anInt4599 = (int) Static20.aFloat52 >> 1;
			Static20.aByteArrayArrayArray16 = Static30.method346(Static20.anInt4599);
		} else if (Static20.aFloat51 < Static20.aFloat52) {
			Static20.aFloat52 = (float) ((double) Static20.aFloat52 - (double) Static20.aFloat52 / 30.0D);
			if (Static20.aFloat52 < Static20.aFloat51) {
				Static20.aFloat52 = Static20.aFloat51;
			}
			Static335.method5408();
			Static20.anInt4599 = (int) Static20.aFloat52 >> 1;
			Static20.aByteArrayArrayArray16 = Static30.method346(Static20.anInt4599);
		}
		if (Static79.anInt1735 != -1 && Static8.anInt492 != -1) {
			@Pc(78) int local78 = Static79.anInt1735 - Static375.anInt6902;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(93) int local93 = Static8.anInt492 - Static208.anInt4249;
			Static375.anInt6902 += local78;
			if (local93 < 2 || local93 > 2) {
				local93 /= 8;
			}
			if (local78 == 0 && local93 == 0) {
				Static8.anInt492 = -1;
				Static79.anInt1735 = -1;
			}
			Static208.anInt4249 += local93;
			Static335.method5408();
		}
		if (Static11.anInt211 > 0) {
			Static313.anInt5728--;
			if (Static313.anInt5728 == 0) {
				Static313.anInt5728 = 100;
				Static11.anInt211--;
			}
		} else {
			Static228.anInt4596 = -1;
			Static340.anInt6283 = -1;
		}
		if (!Static56.aBoolean383 || Static340.aClass238_39 == null) {
			return;
		}
		for (@Pc(169) Class2_Sub6 local169 = (Class2_Sub6) Static340.aClass238_39.method5795(); local169 != null; local169 = (Class2_Sub6) Static340.aClass238_39.method5799()) {
			@Pc(178) Class212 local178 = Static20.aClass195_3.method4816(local169.aClass2_Sub10_1.anInt2183);
			if (local169.method467(arg1, arg0)) {
				if (local178.aStringArray36 != null) {
					if (local178.aStringArray36[4] != null) {
						Static51.method787((long) local169.aClass2_Sub10_1.anInt2183, local178.anInt5985, 1001, -1, -1, local178.aStringArray36[4], 0, false, local178.aString56, true);
					}
					if (local178.aStringArray36[3] != null) {
						Static51.method787((long) local169.aClass2_Sub10_1.anInt2183, local178.anInt5985, 1007, -1, -1, local178.aStringArray36[3], 0, false, local178.aString56, true);
					}
					if (local178.aStringArray36[2] != null) {
						Static51.method787((long) local169.aClass2_Sub10_1.anInt2183, local178.anInt5985, 1006, -1, -1, local178.aStringArray36[2], 0, false, local178.aString56, true);
					}
					if (local178.aStringArray36[1] != null) {
						Static51.method787((long) local169.aClass2_Sub10_1.anInt2183, local178.anInt5985, 1011, -1, -1, local178.aStringArray36[1], 0, false, local178.aString56, true);
					}
					if (local178.aStringArray36[0] != null) {
						Static51.method787((long) local169.aClass2_Sub10_1.anInt2183, local178.anInt5985, 1003, -1, -1, local178.aStringArray36[0], 0, false, local178.aString56, true);
					}
				}
				if (!local169.aClass2_Sub10_1.aBoolean161) {
					local169.aClass2_Sub10_1.aBoolean161 = true;
					Static351.method5587(Static60.aClass136_3, local169.aClass2_Sub10_1.anInt2183, local178.anInt5985);
				}
				if (local169.aClass2_Sub10_1.aBoolean161) {
					Static351.method5587(Static348.aClass136_10, local169.aClass2_Sub10_1.anInt2183, local178.anInt5985);
				}
			} else if (local169.aClass2_Sub10_1.aBoolean161) {
				local169.aClass2_Sub10_1.aBoolean161 = false;
				Static351.method5587(Static234.aClass136_7, local169.aClass2_Sub10_1.anInt2183, local178.anInt5985);
			}
		}
	}
}

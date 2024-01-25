import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
	public static int anInt7300;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Lclient!wn;")
	public static Class4_Sub20 aClass4_Sub20_8;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
	public static int anInt7303;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	public static int anInt7302 = 0;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_218 = new Class214(85, 8);

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "Lclient!wp;")
	public static final Class273 aClass273_7 = new Class273();

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "[I")
	public static final int[] anIntArray592 = new int[2];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	public static void method5869() {
		try {
			if (Static445.anInt7575 == 1) {
				@Pc(17) int local17 = Static196.aClass4_Sub7_Sub2_6.method1396();
				if (local17 > 0 && Static196.aClass4_Sub7_Sub2_6.method1395()) {
					local17 -= Static335.anInt5946;
					if (local17 < 0) {
						local17 = 0;
					}
					Static196.aClass4_Sub7_Sub2_6.method1425(local17);
				} else {
					Static196.aClass4_Sub7_Sub2_6.method1400();
					Static196.aClass4_Sub7_Sub2_6.method1404();
					if (Static236.aClass38_50 == null) {
						Static445.anInt7575 = 0;
					} else {
						Static445.anInt7575 = 2;
					}
					Static130.aClass4_Sub5_2 = null;
					Static273.aClass243_1 = null;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static196.aClass4_Sub7_Sub2_6.method1400();
			Static236.aClass38_50 = null;
			Static130.aClass4_Sub5_2 = null;
			Static273.aClass243_1 = null;
			Static445.anInt7575 = 0;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!sv;")
	public static Class11_Sub5 method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class199 local14 = local7.aClass199_1; local14 != null; local14 = local14.aClass199_2) {
			@Pc(18) Class11_Sub5 local18 = local14.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort95 == arg1 && local18.aShort93 == arg2) {
				return local18;
			}
		}
		return null;
	}
}

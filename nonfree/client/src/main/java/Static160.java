import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static int anInt2706;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!ug;")
	public static Class43 aClass43_16;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_47 = new Class225(6, -1);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!ha;Lclient!oh;I)V")
	public static void method2367(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class273 arg1) {
		@Pc(38) boolean local38 = Static543.aClass37_2.method606(arg1.anInt7334, arg1.anInt7397 | 0xFF000000, arg1.anInt7415, arg1.aBoolean634 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null, arg1.anInt7405, arg0, arg1.anInt7416) == null;
		if (local38) {
			Static221.aClass60_73.method1233(new Class2_Sub8(arg1.anInt7415, arg1.anInt7416, arg1.anInt7334, arg1.anInt7397 | 0xFF000000, arg1.anInt7405, arg1.aBoolean634));
			Static371.method5299(arg1);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(JI)V")
	public static void method2368(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static241.anInt3808 + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
		@Pc(16) int local16 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 + Static100.anInt1783;
		if (Static682.anInt11014 - local10 < -2000 || Static682.anInt11014 - local10 > 2000 || Static506.anInt8028 - local16 < -2000 || Static506.anInt8028 - local16 > 2000) {
			Static682.anInt11014 = local10;
			Static506.anInt8028 = local16;
		}
		@Pc(69) int local69;
		@Pc(77) int local77;
		if (Static682.anInt11014 != local10) {
			local69 = local10 - Static682.anInt11014;
			local77 = (int) (arg0 * (long) local69 / 320L);
			if (local69 > 0) {
				if (local77 == 0) {
					local77 = 1;
				} else if (local69 < local77) {
					local77 = local69;
				}
			} else if (local77 == 0) {
				local77 = -1;
			} else if (local69 > local77) {
				local77 = local69;
			}
			Static682.anInt11014 += local77;
		}
		Static213.aFloat46 += (float) arg0 * Static298.aFloat64 / 6.0F;
		if (local16 != Static506.anInt8028) {
			local69 = local16 - Static506.anInt8028;
			local77 = (int) (arg0 * (long) local69 / 320L);
			if (local69 <= 0) {
				if (local77 == 0) {
					local77 = -1;
				} else if (local77 < local69) {
					local77 = local69;
				}
			} else if (local77 == 0) {
				local77 = 1;
			} else if (local69 < local77) {
				local77 = local69;
			}
			Static506.anInt8028 += local77;
		}
		Static356.aFloat90 += Static357.aFloat91 * (float) arg0 / 6.0F;
		Static89.method1327();
	}
}

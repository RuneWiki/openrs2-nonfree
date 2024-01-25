import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!ok;")
	public static Class178 aClass178_123;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_132 = new Class55("K", "T", "K", "K");

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!kh;I)I")
	public static int method5073(@OriginalArg(0) Class26_Sub2_Sub4 arg0) {
		if (arg0.anInt7044 == 0) {
			return 0;
		}
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (arg0.anInt7060 != -1) {
			@Pc(15) Class26_Sub2_Sub4 local15 = null;
			if (arg0.anInt7060 < 32768) {
				local15 = Static171.aClass26_Sub2_Sub4_Sub1Array1[arg0.anInt7060];
			} else if (arg0.anInt7060 >= 32768) {
				local15 = Static410.aClass26_Sub2_Sub4_Sub2Array1[arg0.anInt7060 - 32768];
			}
			if (local15 != null) {
				local47 = arg0.anInt7388 - local15.anInt7388;
				local54 = arg0.anInt7383 - local15.anInt7383;
				if (local47 != 0 || local54 != 0) {
					arg0.method5521((int) (Math.atan2((double) local47, (double) local54) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class26_Sub2_Sub4_Sub2) {
			@Pc(77) Class26_Sub2_Sub4_Sub2 local77 = (Class26_Sub2_Sub4_Sub2) arg0;
			if (local77.anInt7145 != -1 && (local77.anInt7117 == 0 || local77.anInt7114 > 0)) {
				local77.method5521(local77.anInt7145);
				local77.anInt7145 = -1;
			}
		} else if (arg0 instanceof Class26_Sub2_Sub4_Sub1) {
			@Pc(107) Class26_Sub2_Sub4_Sub1 local107 = (Class26_Sub2_Sub4_Sub1) arg0;
			if (local107.anInt6079 != -1 && (local107.anInt7117 == 0 || local107.anInt7114 > 0)) {
				local47 = local107.anInt7388 - (local107.anInt6079 - Static359.anInt5713 - Static359.anInt5713) * 64;
				local54 = local107.anInt7383 - (local107.anInt6081 - Static314.anInt5181 - Static314.anInt5181) * 64;
				if (local47 != 0 || local54 != 0) {
					local107.method5521((int) (Math.atan2((double) local47, (double) local54) * 2607.5945876176133D) & 0x3FFF);
				}
				local107.anInt6079 = -1;
			}
		}
		return arg0.method5504();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method5074() {
		if (Static313.aClass136_7 != Static50.aClass136_1) {
			try {
				Static468.method5098(Static129.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}

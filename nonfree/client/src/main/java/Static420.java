import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	public static int anInt8173;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_106 = new Class316(15, 8);

	@OriginalMember(owner = "client!qea", name = "q", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_136 = new Class98(101, -1);

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(III)Z")
	public static boolean method6485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static424.method5983(arg1, arg0) | (arg0 & 0x70000) != 0 || Static404.method5832(arg0, arg1);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V")
	public static void method6486() {
		if (!Static260.aBoolean349) {
			return;
		}
		while (true) {
			while (Static510.anInt8786 < Static446.aClass139_Sub1Array2.length) {
				@Pc(26) Class139_Sub1 local26 = Static446.aClass139_Sub1Array2[Static510.anInt8786];
				if (local26 != null && local26.anInt7130 == -1) {
					if (Static471.aClass6_Sub16_1 == null) {
						Static471.aClass6_Sub16_1 = Static201.aClass344_1.method7837(local26.aString56);
					}
					@Pc(49) int local49 = Static471.aClass6_Sub16_1.anInt2906;
					if (local49 == -1) {
						return;
					}
					local26.anInt7130 = local49;
					Static471.aClass6_Sub16_1 = null;
					Static510.anInt8786++;
				} else {
					Static510.anInt8786++;
				}
			}
			return;
		}
	}
}

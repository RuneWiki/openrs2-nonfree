import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "F")
	public static float aFloat239;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_155 = new Class349(71, 6);

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[4];

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "[I")
	public static final int[] anIntArray592 = new int[4];

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIILclient!r;II)V")
	public static void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.da(arg4, arg3, arg1 + arg4, arg0 + arg3);
		arg2.method6885(arg3, -16777216, arg1, arg4, arg0);
		if (Static559.anInt9135 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static476.anInt7586 / (float) Static476.anInt7576;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg1);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg4 + (arg1 - local37) / 2;
		@Pc(75) int local75 = arg3 + (arg0 - local39) / 2;
		if (Static86.aClass38_9 == null || Static86.aClass38_9.E() != arg1 || Static86.aClass38_9.u() != arg0) {
			Static476.method6100(Static476.anInt7583, Static476.anInt7586 + Static476.anInt7584, Static476.anInt7576 + Static476.anInt7583, Static476.anInt7584, local66, local75, local66 + local37, local75 - -local39);
			Static476.method6108(arg2);
			Static86.aClass38_9 = arg2.method6868(local66, local75, local37, local39, false);
		}
		Static86.aClass38_9.method7463(local66, local75);
		@Pc(127) int local127 = Static50.anInt903 * local37 / Static476.anInt7576;
		@Pc(133) int local133 = Static367.anInt6180 * local39 / Static476.anInt7586;
		@Pc(141) int local141 = Static343.anInt5955 * local37 / Static476.anInt7576 + local66;
		@Pc(160) int local160 = local75 + local39 - Static560.anInt9173 * local39 / Static476.anInt7586 - local133;
		@Pc(162) int local162 = -1996554240;
		if (Static283.aClass308_10 == Static18.aClass308_7) {
			local162 = -1996488705;
		}
		arg2.J(local141, local160, local127, local133, local162, 1);
		arg2.method6827(local141, local160, local127, local133, local162, 0);
		if (Static150.anInt2432 <= 0) {
			return;
		}
		@Pc(192) int local192;
		if (Static82.anInt1424 <= 50) {
			local192 = Static82.anInt1424 * 5;
		} else {
			local192 = 500 - Static82.anInt1424 * 5;
		}
		for (@Pc(206) Class2_Sub20 local206 = (Class2_Sub20) Static476.aClass70_47.method1264(); local206 != null; local206 = (Class2_Sub20) Static476.aClass70_47.method1261()) {
			@Pc(214) Class142 local214 = Static476.aClass360_4.method7576(local206.anInt2970);
			if (Static113.method1671(local214)) {
				@Pc(238) int local238;
				@Pc(250) int local250;
				if (Static63.anInt1135 == local206.anInt2970) {
					local238 = local206.anInt2971 * local37 / Static476.anInt7576 + local66;
					local250 = local75 + local39 * (Static476.anInt7586 - local206.anInt2973) / Static476.anInt7586;
					arg2.method6885(local250 - 2, local192 << 24 | 0xFFFF00, 4, local238 - 2, 4);
				} else if (Static340.anInt5890 != -1 && Static340.anInt5890 == local214.anInt2962) {
					local238 = local206.anInt2971 * local37 / Static476.anInt7576 + local66;
					local250 = local75 + local39 * (Static476.anInt7586 - local206.anInt2973) / Static476.anInt7586;
					arg2.method6885(local250 - 2, local192 << 24 | 0xFFFF00, 4, local238 - 2, 4);
				}
			}
		}
	}
}

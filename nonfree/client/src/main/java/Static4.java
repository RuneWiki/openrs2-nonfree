import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public static int anInt64 = 0;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_5 = new Class134("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_4 = new Class211(54, -2);

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public static int anInt69 = -1;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[I")
	public static final int[] anIntArray8 = new int[8];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)Lclient!at;")
	public static Class16 method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class16 local7 = Static338.method4534(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass16Array1 == null || arg1 >= local7.aClass16Array1.length) {
			return null;
		} else {
			return local7.aClass16Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)Lclient!oa;")
	public static Class3_Sub2 method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub2_2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
	public static boolean method76(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!za;BLclient!dk;)V")
	public static void method77(@OriginalArg(0) Class163 arg0, @OriginalArg(2) Class54 arg1) {
		if (Static452.aBoolean525) {
			return;
		}
		arg0.t(0);
		Static220.aClass13_13 = arg0.method5549(Static461.method259(arg1, anInt69));
		Static220.aClass13_13.method5668((Static141.anInt2513 - Static220.aClass13_13.RA()) / 2, (Static314.anInt5426 - Static220.aClass13_13.Q()) / 2);
		Static126.aClass13_4 = arg0.method5549(Static461.method259(arg1, Static341.anInt5807));
		Static126.aClass13_4.method5668((Static141.anInt2513 - Static126.aClass13_4.RA()) / 2, 18);
		Static452.aBoolean525 = true;
	}
}

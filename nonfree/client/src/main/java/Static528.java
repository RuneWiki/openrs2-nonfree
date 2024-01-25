import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public static int anInt8948;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt8946 = 0;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public static volatile int anInt8950 = -1;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "[I")
	public static int[] anIntArray558 = new int[1];

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public static int anInt8951 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)Lclient!kaa;")
	public static Class3_Sub27 method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub27 local5 = null;
		if (arg2 == 0) {
			local5 = Static59.method1040(Static325.aClass20_2, Static183.aClass314_60);
		}
		if (arg2 == 1) {
			local5 = Static59.method1040(Static325.aClass20_2, Static337.aClass314_96);
		}
		local5.aClass3_Sub9_Sub2_2.method5620(Static427.anInt7462 + arg1);
		local5.aClass3_Sub9_Sub2_2.method5616(arg0 + Static22.anInt329);
		local5.aClass3_Sub9_Sub2_2.method5572(Static476.aClass62_2.method1421(82) ? 1 : 0);
		Static258.anInt5032 = arg0;
		Static162.anInt3235 = arg1;
		Static309.aBoolean441 = false;
		Static238.method7923();
		return local5;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(FBFF)I")
	public static int method7684(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 < local26 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	public static void method7685() {
		@Pc(1) Class136 local1 = Static89.aClass136_40;
		synchronized (Static89.aClass136_40) {
			Static89.aClass136_40.method3138();
		}
	}
}

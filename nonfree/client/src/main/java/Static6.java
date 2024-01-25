import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Lclient!nc;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
	public static int anInt86;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	public static int anInt87;

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_7 = new Class151(118, -1);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Z")
	public static boolean method110(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLclient!pc;)V")
	public static void method113(@OriginalArg(1) Class33_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static404.anObject10 == null) {
			@Pc(9) Class16_Sub2_Sub2 local9 = new Class16_Sub2_Sub2();
			local16 = local9.method7190();
			Static404.anObject10 = Static621.method8352(local16);
		}
		if (Static300.anObject5 == null) {
			@Pc(27) Class16_Sub1_Sub1 local27 = new Class16_Sub1_Sub1();
			local16 = local27.method295();
			Static300.anObject5 = Static621.method8352(local16);
		}
		@Pc(47) Class295 local47 = arg0.aClass295_1;
		if (local47.method6556() && Static242.anObject4 == null) {
			local16 = Static319.method4407(4.0F, 0.5F, 0.6F, new Class107_Sub1(419684), 16.0F, 4.0F);
			Static242.anObject4 = Static621.method8352(local16);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!bt;JIIIZI)V")
	public static void method114(@OriginalArg(1) Class34 arg0, @OriginalArg(2) long arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3) {
		Static282.anInt4509 = 0;
		Static414.anInt5938 = arg2;
		Static670.anInt6846 = 10000;
		Static566.anInt8739 = arg3;
		Static46.anInt907 = 0;
		Static586.aClass34_116 = arg0;
		Static91.anInt1809 = 1;
		Static466.aBoolean583 = false;
		Static554.aClass4_Sub3_Sub4_5 = null;
		Static170.aLong96 = arg1;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)I")
	public static int method116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return ((local13 * (arg2 & 0xFF00) & 0xFF0000 | local13 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local31;
	}
}

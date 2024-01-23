import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString170 = "";

	@OriginalMember(owner = "client!t", name = "C", descriptor = "Lclient!db;")
	public static Class31 aClass31_37 = new Class31(4);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILclient!ak;)Lclient!fb;")
	public static Class1_Sub7 method3899(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(13) byte[] local13 = arg1.method258(arg0);
		return local13 == null ? null : new Class1_Sub7(local13);
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method3900() {
		Static77.aClass31_13.method850();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 128 || arg4 < 128 || arg0 > 13056 || arg4 > 13056) {
			Static178.anInt3321 = -1;
			Static55.anInt1167 = -1;
			return;
		}
		@Pc(32) int local32 = Static124.method1919(Static159.anInt2978, arg0, arg4) - arg2;
		@Pc(36) int local36 = arg0 - Static182.anInt3398;
		@Pc(40) int local40 = Class135.anIntArray472[Static77.anInt1548];
		@Pc(44) int local44 = Class135.anIntArray474[Static77.anInt1548];
		@Pc(48) int local48 = local32 - Static185.anInt3457;
		@Pc(52) int local52 = arg4 - Static68.anInt4743;
		@Pc(56) int local56 = Class135.anIntArray472[Static56.anInt1177];
		@Pc(60) int local60 = Class135.anIntArray474[Static56.anInt1177];
		@Pc(70) int local70 = local56 * local52 + local60 * local36 >> 16;
		@Pc(81) int local81 = local52 * local60 - local56 * local36 >> 16;
		@Pc(83) int local83 = local70;
		@Pc(93) int local93 = local44 * local48 - local40 * local81 >> 16;
		@Pc(103) int local103 = local81 * local44 + local40 * local48 >> 16;
		if (local103 < 50) {
			Static178.anInt3321 = -1;
			Static55.anInt1167 = -1;
		} else if (Static240.aBoolean369) {
			@Pc(118) int local118 = arg5 * 512 >> 8;
			@Pc(124) int local124 = arg6 * 512 >> 8;
			Static55.anInt1167 = local83 * local124 / local103 + arg1;
			Static178.anInt3321 = arg3 + local118 * local93 / local103;
		} else {
			Static55.anInt1167 = arg1 + (local83 << 9) / local103;
			Static178.anInt3321 = arg3 + (local93 << 9) / local103;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIB)V")
	public static void method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 - arg0 >= Static245.anInt1237 && Static28.anInt606 >= arg0 + arg2 && arg1 - arg0 >= Static24.anInt556 && Static284.anInt5643 >= arg1 + arg0) {
			Static150.method2340(arg3, arg2, arg0, arg1);
		} else {
			Static109.method1720(arg0, arg1, arg2, arg3);
		}
	}
}

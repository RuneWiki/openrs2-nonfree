import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
	public static final int[] anIntArray686 = new int[6];

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_198 = new Class322(26, 3);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!pi;")
	public static final Class284 aClass284_2 = new Class284(false);

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!pi;")
	public static Class284 aClass284_3 = aClass284_2;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_12 = new Class369(4, 1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZII)I")
	public static int method8846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 - 1 & arg1 >> 31;
		return local18 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public static int method8847() {
		if (Static484.aBoolean623) {
			return 6;
		} else if (Static197.aClass6_Sub2_Sub11_2 == null) {
			return 0;
		} else {
			@Pc(16) int local16 = Static197.aClass6_Sub2_Sub11_2.anInt5173;
			if (Static274.method3026(local16)) {
				return 1;
			} else if (Static536.method7655(local16)) {
				return 2;
			} else if (Static635.method8594(local16)) {
				return 3;
			} else if (Static67.method810(local16)) {
				return 4;
			} else if (Static231.method4111(local16)) {
				return 7;
			} else if (local16 == 21) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!jc;)Lclient!sca;")
	public static Class324 method8849(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) String local7 = arg0.method3046();
		@Pc(14) Class318 local14 = Static70.method932()[arg0.method3030()];
		@Pc(28) Class238 local28 = Static632.method8588()[arg0.method3030()];
		@Pc(32) int local32 = arg0.method2989();
		@Pc(36) int local36 = arg0.method2989();
		@Pc(40) int local40 = arg0.method3030();
		@Pc(44) int local44 = arg0.method3030();
		@Pc(48) int local48 = arg0.method3030();
		@Pc(52) int local52 = arg0.method3018();
		@Pc(56) int local56 = arg0.method3018();
		@Pc(60) int local60 = arg0.method3015();
		@Pc(64) int local64 = arg0.method3015();
		@Pc(68) int local68 = arg0.method3015();
		return new Class324(local7, local14, local28, local32, local36, local40, local44, local48, local52, local56, local60, local64, local68);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method8850() {
		Static583.anInt9303 = 0;
		Static566.anInt8431 = 0;
		Static109.anInt2146 = 0;
		Static630.anInt4592 = 0;
	}
}

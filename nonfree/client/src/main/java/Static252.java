import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_7 = new Class225(4, 1, 1, 1);

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString81 = null;

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_84 = new Class186(2, 10);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLclient!uc;I)V")
	public static void method3953(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub53 arg1) {
		if (arg1.aBoolean745) {
			if (arg1.anInt10312 < 0 || Static352.method5099(arg1.anInt10312, arg1.anInt10318)) {
				if (arg0) {
					Static673.method8916((Class241) null, arg1.anInt10320, arg1.anInt10319, arg1.anInt10313, arg1.anInt10317);
				} else {
					Static232.method3644(arg1.anInt10319, arg1.anInt10318, arg1.anInt10313, arg1.anInt10310, arg1.anInt10317, arg1.anInt10320, -1, arg1.anInt10312);
				}
				arg1.method9446();
			}
		} else if (arg1.aBoolean746 && arg1.anInt10319 >= 1 && arg1.anInt10317 >= 1 && Static362.anInt8653 - 2 >= arg1.anInt10319 && Static206.anInt11291 - 2 >= arg1.anInt10317 && (arg1.anInt10311 < 0 || Static352.method5099(arg1.anInt10311, arg1.anInt10314))) {
			if (arg0) {
				Static673.method8916(arg1.aClass241_2, arg1.anInt10320, arg1.anInt10319, arg1.anInt10313, arg1.anInt10317);
			} else {
				Static232.method3644(arg1.anInt10319, arg1.anInt10314, arg1.anInt10313, arg1.anInt10315, arg1.anInt10317, arg1.anInt10320, -1, arg1.anInt10311);
			}
			arg1.aBoolean746 = false;
			if (!arg0 && arg1.anInt10311 == arg1.anInt10312 && arg1.anInt10312 == -1) {
				arg1.method9446();
			} else if (!arg0 && arg1.anInt10311 == arg1.anInt10312 && arg1.anInt10315 == arg1.anInt10310 && arg1.anInt10314 == arg1.anInt10318) {
				arg1.method9446();
			}
		}
	}
}

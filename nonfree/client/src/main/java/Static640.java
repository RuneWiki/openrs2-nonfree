import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt10507;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method8632() {
		Static246.method4655();
		Static349.aBoolean590 = false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!us;ZLclient!rr;)Lclient!ida;")
	public static Class3_Sub26 method8636(@OriginalArg(0) Class344 arg0, @OriginalArg(2) Class294 arg1) {
		@Pc(13) Class3_Sub26 local13 = Static23.method412();
		local13.anInt5179 = arg0.anInt9758;
		local13.aClass344_55 = arg0;
		if (local13.anInt5179 == -1) {
			local13.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(260);
		} else if (local13.anInt5179 == -2) {
			local13.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(10000);
		} else if (local13.anInt5179 <= 18) {
			local13.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(20);
		} else if (local13.anInt5179 > 98) {
			local13.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(260);
		} else {
			local13.aClass3_Sub15_Sub1_3 = new Class3_Sub15_Sub1(100);
		}
		local13.aClass3_Sub15_Sub1_3.method2436(arg1);
		local13.aClass3_Sub15_Sub1_3.method2441(local13.aClass344_55.method8049());
		local13.anInt5180 = 0;
		return local13;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
	public static int anInt5871;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(Z)V")
	public static void method4980() {
		if (Static566.aClass92_6.aBoolean172 && Static307.aClass275_4.anInt7235 != -1) {
			Static16.method8272(Static307.aClass275_4.aString91, Static307.aClass275_4.anInt7235);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!mg;Lclient!mg;)V")
	public static void method4981(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_338 != null) {
			arg0.method9034();
		}
		arg0.aClass3_338 = arg1.aClass3_338;
		arg0.aClass3_337 = arg1;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIII)V")
	public static void method4983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static166.anInt3031;
		@Pc(7) int local7 = Static462.anInt7380;
		if (Static498.aBoolean757) {
			local5 += Static84.method1336();
			local7 += Static614.method8324();
		}
		@Pc(39) Class6 local39;
		if (Static221.anInt3832 == 1) {
			local39 = Static586.aClass6Array13[Static668.anInt10817 / 100];
			local39.method5115(local5 - 8, local7 + -8);
			Static63.method1147(local7 - 8, local5 + -8 - -local39.method5130(), local5 - 8, local7 - 8 + local39.method5134());
		}
		if (Static221.anInt3832 == 2) {
			local39 = Static586.aClass6Array13[Static668.anInt10817 / 100 + 4];
			local39.method5115(local5 - 8, local7 - 8);
			Static63.method1147(local7 - 8, local39.method5130() + -8 + local5, local5 - 8, local39.method5134() + local7 - 8);
		}
		Static285.method4139();
	}
}

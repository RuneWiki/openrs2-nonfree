import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ts", name = "bb", descriptor = "Lclient!jba;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt9465 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	public static boolean method7824(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BILjava/lang/String;)Lclient!rca;")
	public static Class184 method7826(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class184 local13;
		try {
			local13 = (Class184) Class.forName("Class184_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class184_Sub1();
		}
		local13.anInt9996 = arg0;
		local13.aString112 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!tn;I)Lclient!la;")
	public static Class192 method7833(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(7) String local7 = arg0.method8413();
		@Pc(16) Class117 local16 = Static505.method7370()[arg0.method8401()];
		@Pc(25) Class178 local25 = Static324.method5445()[arg0.method8401()];
		@Pc(29) int local29 = arg0.method8444();
		@Pc(33) int local33 = arg0.method8444();
		@Pc(44) int local44 = arg0.method8401();
		@Pc(48) int local48 = arg0.method8401();
		@Pc(54) int local54 = arg0.method8401();
		@Pc(58) int local58 = arg0.method8414();
		@Pc(62) int local62 = arg0.method8414();
		@Pc(66) int local66 = arg0.method8402();
		@Pc(70) int local70 = arg0.method8402();
		@Pc(74) int local74 = arg0.method8402();
		return new Class192(local7, local16, local25, local29, local33, local44, local48, local54, local58, local62, local66, local70, local74);
	}
}

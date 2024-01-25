import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	public static int anInt8116;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!q;")
	public static Class109 aClass109_6;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!hga;")
	public static Class130 aClass130_51 = new Class130();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method6830() {
		Static574.method7622(Static278.aClass3_Sub13_Sub1_1.aBoolean411);
		Static510.aClass3_Sub6_Sub3_3 = new Class3_Sub6_Sub3();
		Static510.aClass3_Sub6_Sub3_3.method2114();
		Static483.aClass288_2 = method6833(0, 22050, Static409.aClass221_6, Static347.aCanvas9);
		Static483.aClass288_2.method6798(Static510.aClass3_Sub6_Sub3_3);
		Static283.method2223(Static510.aClass3_Sub6_Sub3_3, Static500.aClass246_235, Static35.aClass246_28, Static437.aClass246_205);
		Static172.aClass288_1 = method6833(1, 2048, Static409.aClass221_6, Static347.aCanvas9);
		Static164.aClass3_Sub6_Sub1_1 = new Class3_Sub6_Sub1();
		Static172.aClass288_1.method6798(Static164.aClass3_Sub6_Sub1_1);
		Static568.aClass154_1 = new Class154(22050, Static124.anInt3635);
		Static132.anInt2841 = Static576.aClass246_267.method5665("scape main");
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBLclient!n;Ljava/awt/Component;)Lclient!ri;")
	public static Class288 method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) Component arg3) {
		if (Static124.anInt3635 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class288 local35 = (Class288) Class.forName("Class288_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt8059 = arg1;
			local35.anIntArray617 = new int[(Static134.aBoolean244 ? 2 : 1) * 256];
			local35.method6800(arg3);
			local35.anInt8058 = (arg1 & 0xFFFFFC00) + 1024;
			if (local35.anInt8058 > 16384) {
				local35.anInt8058 = 16384;
			}
			local35.method6801(local35.anInt8058);
			if (Static286.anInt6174 > 0 && Static561.aClass275_2 == null) {
				Static561.aClass275_2 = new Class275();
				Static561.aClass275_2.aClass221_7 = arg2;
				arg2.method5198(Static286.anInt6174, Static561.aClass275_2);
			}
			if (Static561.aClass275_2 != null) {
				if (Static561.aClass275_2.aClass288Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static561.aClass275_2.aClass288Array1[arg0] = local35;
			}
			return local35;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class288_Sub2 local121 = new Class288_Sub2(arg2, arg0);
				local121.anInt8059 = arg1;
				local121.anIntArray617 = new int[(Static134.aBoolean244 ? 2 : 1) * 256];
				local121.method6800(arg3);
				local121.anInt8058 = 16384;
				local121.method6801(local121.anInt8058);
				if (Static286.anInt6174 > 0 && Static561.aClass275_2 == null) {
					Static561.aClass275_2 = new Class275();
					Static561.aClass275_2.aClass221_7 = arg2;
					arg2.method5198(Static286.anInt6174, Static561.aClass275_2);
				}
				if (Static561.aClass275_2 != null) {
					if (Static561.aClass275_2.aClass288Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static561.aClass275_2.aClass288Array1[arg0] = local121;
				}
				return local121;
			} catch (@Pc(183) Throwable local183) {
				return new Class288();
			}
		}
	}
}

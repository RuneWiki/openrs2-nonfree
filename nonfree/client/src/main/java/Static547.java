import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Lclient!wh;")
	public static Class319 aClass319_11;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZ)I")
	public static int method7808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static259.anIntArray465[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)Lclient!lq;")
	public static Class3_Sub31 method7809() {
		if (Static55.aClass71_19 == null || Static468.aClass157_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub31 local21 = (Class3_Sub31) Static468.aClass157_1.method4206(); local21 != null; local21 = (Class3_Sub31) Static468.aClass157_1.method4206()) {
			@Pc(29) Class179 local29 = Static55.aClass135_2.method3801(local21.anInt5809);
			if (local29 != null && local29.aBoolean370 && local29.method4796(Static55.anInterface17_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZII)V")
	public static void method7812(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static121.aClass5_7 = Static341.method7477(Static7.aClass3_Sub15_Sub1_1.anInt8366 * 2, 0, Static202.anInterface4_10, Static549.aCanvas15, Static243.aClass161_54);
		} else {
			if (arg0) {
				Static121.aClass5_7 = Static341.method7477(0, 0, Static202.anInterface4_10, Static549.aCanvas15, Static243.aClass161_54);
				Static121.aClass5_7.D(0);
				@Pc(26) Class53 local26 = Static377.method5901(Static62.aClass161_105, Static200.anInt9269);
				@Pc(35) Class59 local35 = Static121.aClass5_7.method7414(local26, Static551.method526(Static19.aClass161_7, Static200.anInt9269));
				Static141.method2464(true, local35, Static157.aClass67_50.method1934(Static193.anInt7803));
				Static192.method3685();
				Static121.aClass5_7.method7437();
			}
			try {
				Static121.aClass5_7 = Static341.method7477(Static7.aClass3_Sub15_Sub1_1.anInt8366 * 2, arg1, Static202.anInterface4_10, Static549.aCanvas15, Static243.aClass161_54);
				if (Static121.aClass5_7.method7423()) {
					@Pc(68) boolean local68 = true;
					try {
						local68 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(78) Throwable local78) {
					}
					@Pc(84) Class3_Sub22 local84;
					if (local68) {
						local84 = Static121.aClass5_7.method7470(146800640);
					} else {
						local84 = Static121.aClass5_7.method7470(104857600);
					}
					Static121.aClass5_7.method7456(local84);
				}
			} catch (@Pc(95) Throwable local95) {
				Static121.aClass5_7 = Static341.method7477(0, 0, Static202.anInterface4_10, Static549.aCanvas15, Static243.aClass161_54);
				arg1 = 0;
			}
		}
		Static382.anInt7091 = arg1;
		Static8.method614();
		if (!Static121.aClass5_7.method7480()) {
			Static172.anInt3951 = 1;
		}
		Static121.aClass5_7.method7474(Static172.anInt3951);
		Static121.aClass5_7.method7438(0);
		Static121.aClass5_7.JA(32);
		Static181.aClass205_5 = Static121.aClass5_7.method7409();
		Static131.aClass205_3 = Static121.aClass5_7.method7409();
		Static249.method4286();
		Static121.aClass5_7.method7446(!Static7.aClass3_Sub15_Sub1_1.aBoolean609);
		if (Static121.aClass5_7.method7452()) {
			Static226.method4083(Static7.aClass3_Sub15_Sub1_1.aBoolean595);
		}
		Static89.method1813(Static118.anInt2527 >> 3, Static121.aClass5_7, Static549.anInt9482 >> 3);
		Static245.method4229();
		Static544.aClass204Array1 = null;
		Static118.aBoolean189 = false;
		Static17.aBoolean318 = true;
	}
}

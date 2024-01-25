import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_123 = new Class242(23, 7);

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
	public static int anInt7364 = -1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIB)V")
	public static void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static15.aClass252_5.method5291(Static141.aClass142_97.method3118(Static63.anInt981));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) Static57.aClass14_3.method203(); local18 != null; local18 = (Class1_Sub10) Static57.aClass14_3.method208()) {
			local24 = Static150.method3711(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static76.anInt1078 * 16 + 21;
		@Pc(53) int local53 = arg0 - local13 / 2;
		if (local53 + local13 > Static192.anInt3532) {
			local53 = Static192.anInt3532 - local13;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(73) int local73 = arg1;
		if (arg1 + local24 > Static40.anInt597) {
			local73 = Static40.anInt597 - local24;
		}
		Static64.anInt995 = local53;
		if (local73 < 0) {
			local73 = 0;
		}
		Static361.anInt5833 = (Static51.aBoolean102 ? 26 : 22) + Static76.anInt1078 * 16;
		Static273.anInt4719 = local13;
		Static170.aBoolean282 = true;
		Static25.anInt358 = local73;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)Lclient!rm;")
	public static Class184 method5928() {
		try {
			return (Class184) Class.forName("Class184_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!oi;Z)V")
	public static void method5929(@OriginalArg(0) Class185 arg0) {
		Static18.aClass185_67 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(III)Z")
	public static boolean method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static446.method5652(arg0, arg1) | (arg0 & 0x70000) != 0 || Static180.method2596(arg1, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(III)I")
	public static int method5932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return (((arg0 & 0xFF00FF) * local30 & 0xFF00FF00 | (arg0 & 0xFF00) * local30 & 0xFF0000) >>> 8) + local25;
	}
}

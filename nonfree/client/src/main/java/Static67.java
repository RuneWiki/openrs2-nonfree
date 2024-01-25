import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "[Lclient!ta;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "Lclient!wn;")
	public static Class266_Sub1 aClass266_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "Lclient!fs;")
	public static Class76 aClass76_19;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
	public static int anInt1408;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBII)V")
	public static void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class4_Sub1_Sub11 local15 = Static405.method5222(arg2, 10);
		local15.method2604();
		local15.anInt3082 = arg1;
		local15.anInt3079 = arg3;
		local15.anInt3083 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
	public static void method1276() {
		if (Static308.aBoolean487) {
			return;
		}
		if (Static323.aClass50_Sub1_1.aBoolean303) {
			Static368.aFloat192 = (int) Static368.aFloat192 + 191 & 0xFFFFFF80;
		} else {
			Static380.aFloat195 += (24.0F - Static380.aFloat195) / 2.0F;
		}
		Static251.aBoolean429 = true;
		Static308.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
	public static void method1277() {
		Static33.method633(false);
		if (Static320.anInt5660 >= 0 && Static320.anInt5660 != 0) {
			Static239.method3551(Static320.anInt5660);
			Static320.anInt5660 = -1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method1278(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static77.method1388(arg1, arg0, 0, arg0.length - 1);
	}
}

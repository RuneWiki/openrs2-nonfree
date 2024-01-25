import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
	public static int anInt9169;

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "[[Lclient!oh;")
	public static Class273[][] aClass273ArrayArray2;

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!sha", name = "h", descriptor = "Z")
	public static boolean aBoolean787 = false;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)Z")
	public static boolean method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIZI)V")
	public static void method8084(@OriginalArg(2) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static24.anInt294 = 22050;
		Static207.anInt3359 = 2;
		Static42.aBoolean76 = arg0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)V")
	public static void method8086(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub44 local15 = (Class2_Sub44) Static426.aClass218_29.method5095((long) arg0, 0);
		if (local15 != null) {
			local15.aClass156_Sub1_1.method3413();
			Static604.method8254(local15.anInt7300, local15.aBoolean621);
			local15.method9872();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8087(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class221 local18 = Static87.method1292();
		@Pc(24) Class2_Sub33 local24 = Static592.method8154(Static44.aClass349_17, local18.aClass48_1);
		local24.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0) + 1);
		local24.aClass2_Sub20_Sub2_1.method8584(arg1);
		local24.aClass2_Sub20_Sub2_1.method8541(arg0);
		local18.method5173(local24);
	}
}

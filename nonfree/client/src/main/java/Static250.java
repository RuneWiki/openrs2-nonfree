import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!vd;")
	public static Class140 aClass140_18 = new Class140(16);

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[S")
	public static short[] aShortArray69 = new short[256];

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!ab;")
	public static Class3 aClass3_23 = new Class3();

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method4059() {
		if (Static143.anInt3466 > 0) {
			Static179.method3056();
		} else {
			Static251.aClass109_4 = Static34.aClass109_2;
			Static34.aClass109_2 = null;
			Static168.method2918(40);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method4060(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static217.aBoolean245) {
			try {
				@Pc(26) Class57 local26 = (Class57) Class.forName("Class57_Sub1").getDeclaredConstructor().newInstance();
				local26.method2670(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static217.aBoolean245 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method4061(@OriginalArg(2) String arg0, @OriginalArg(3) String arg1, @OriginalArg(4) String arg2) {
		Static9.method185(arg1, arg0, 9, -1, arg2);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I")
	public static int method4062(@OriginalArg(0) int arg0) {
		@Pc(13) Class20 local13 = Static222.method3674(arg0);
		@Pc(16) int local16 = local13.anInt911;
		@Pc(23) int local23 = local13.anInt906;
		@Pc(26) int local26 = local13.anInt905;
		@Pc(33) int local33 = Class142.anIntArray460[local26 - local23];
		return Static91.anIntArray189[local16] >> local23 & local33;
	}
}

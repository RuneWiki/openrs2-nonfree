import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
	public static int anInt2042;

	@OriginalMember(owner = "client!fp", name = "W", descriptor = "Lclient!bi;")
	public static Class25 aClass25_57;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_56 = new Class25(98, -1);

	@OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public static void method1941() {
		Static265.anInt4444 = 0;
		Static127.anInt2141 = 0;
		Static397.anInt6875 = 0;
		Static176.anInt3132 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZII)V")
	public static void method1942(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static199.anInt3422 = arg1;
		Static25.anInt7276 = 3;
		Static465.method5967(Static287.aClass263_4.anInt7387, Static287.aClass263_4.aString71);
		if (arg0) {
			Static192.method2760("", "");
		} else {
			Static16.method4090();
			Static192.method2760(Static13.aString2, Static281.aString39);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)Lclient!ab;")
	public static Class3 method1947(@OriginalArg(1) int arg0) {
		@Pc(15) Class3 local15 = (Class3) Static197.aClass188_33.method4158((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static117.aClass171_31.method3658(1, arg0);
		local15 = new Class3();
		local15.anInt38 = arg0;
		if (local25 != null) {
			local15.method33(new Class2_Sub17(local25));
		}
		local15.method29();
		if (local15.anInt37 == 2 && Static285.aClass220_25.method5099((long) arg0) == null) {
			Static285.aClass220_25.method5104(new Class2_Sub5(Static329.anInt5883), (long) arg0);
			Static275.aClass3Array1[Static329.anInt5883++] = local15;
		}
		Static197.aClass188_33.method4155((long) arg0, local15);
		return local15;
	}
}

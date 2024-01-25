import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_76 = new Class272(24, 12);

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public static int anInt2701 = 0;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!ej", name = "cb", descriptor = "I")
	public static final int anInt2715 = 52;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZII)V")
	public static void method2470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static278.aClass3_Sub13_Sub1_1.anInt5154 * arg0 >> 8;
		if (arg2 == -1 && !Static127.aBoolean238) {
			Static245.method4020();
		} else if (arg2 != -1 && (Static380.anInt6546 != arg2 || !Static345.method5246()) && local6 != 0 && !Static127.aBoolean238) {
			Static273.method6460(arg2, arg1, Static576.aClass246_267, local6);
		}
		Static380.anInt6546 = arg2;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2471(@OriginalArg(1) String arg0) {
		Static483.method6585("", "", "", 4, 0, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2472(@OriginalArg(0) String arg0) {
		return Static25.method461(10, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I")
	public static int method2474(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

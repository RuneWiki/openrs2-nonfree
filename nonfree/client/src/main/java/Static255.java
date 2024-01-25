import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
	public static int anInt4672 = 0;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "[I")
	public static final int[] anIntArray240 = new int[3];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public static void method4095() {
		Static377.aClass223_50.method5398();
		Static241.aClass223_32.method5398();
		Static63.aClass223_12.method5398();
		Static76.aClass223_13.method5398();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Lclient!di;")
	public static Class65 method4096() {
		try {
			return (Class65) Class.forName("Class65_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class65_Sub1();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIBIILjava/lang/String;I)V")
	public static void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub3 local7 = new Class1_Sub3();
		local7.anInt1231 = arg3;
		local7.anInt1230 = arg4 + Static106.anInt2418;
		local7.anInt1236 = arg0;
		local7.anInt1232 = arg6;
		local7.anInt1235 = arg2;
		local7.anInt1233 = arg1;
		local7.aString5 = arg5;
		Static451.aClass136_7.method3289(local7);
	}
}

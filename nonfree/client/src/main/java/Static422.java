import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "Lclient!kr;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
	public static int anInt7120 = -1;

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
	public static int anInt7131 = 0;

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
	public static final int anInt7132 = 1400;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method6014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class23_Sub9 local7 = new Class23_Sub9();
		local7.anInt8994 = arg6;
		local7.anInt8998 = arg2;
		local7.anInt8993 = arg3;
		local7.anInt9000 = arg4;
		local7.anInt8992 = arg1;
		local7.anInt8997 = Static621.anInt9665 + arg0;
		local7.aString110 = arg5;
		Static408.aClass105_9.method2447(local7);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZII)V")
	public static void method6016(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static141.method2446(Static569.aClass335_13.method7694(Static319.anInt5939), arg0, arg1);
	}
}

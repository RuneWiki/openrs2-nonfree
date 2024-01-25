import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array9;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Lclient!tq;")
	public static Class191 aClass191_93;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public static int anInt2964;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
	public static final int[] anIntArray246 = new int[25];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZILclient!dg;)Ljava/lang/String;")
	public static String method2821(@OriginalArg(2) Class2_Sub10 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4441();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local7];
			arg0.anInt4807 += Static78.aClass197_1.method5616(local20, arg0.anInt4807, local7, 0, arg0.aByteArray57);
			return Static161.method3040(local7, 0, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!tq;Lclient!tq;B)V")
	public static void method2822(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		Static186.aClass191_175 = arg1;
		Static146.aClass191_95 = arg0;
		Static146.aClass191_95.method5443(34);
	}
}

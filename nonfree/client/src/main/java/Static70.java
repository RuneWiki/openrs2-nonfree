import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public static int anInt1316 = 2;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!nq;Lclient!nq;I)V")
	public static void method1053(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1) {
		Static42.aClass144_17 = arg0;
		Static262.aClass144_89 = arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public static void method1054(@OriginalArg(0) int arg0) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(1, arg0);
		local8.method3864();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method1055(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static220.aClass117_77.method2684(Static5.anInt32) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static22.aClass117_13.method2684(Static5.anInt32) + "</col>";
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method1056() {
		Static216.aClass26_52.method333();
		Static310.aClass26_55.method333();
	}
}

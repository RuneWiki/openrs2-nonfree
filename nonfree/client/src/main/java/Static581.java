import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "Lclient!cb;")
	public static final Class37 aClass37_4 = new Class37();

	@OriginalMember(owner = "client!wf", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString127 = null;

	@OriginalMember(owner = "client!wf", name = "vb", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_14 = new Class93(4);

	@OriginalMember(owner = "client!wf", name = "yb", descriptor = "I")
	public static int anInt9295 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!saa;Z)Ljava/lang/String;")
	public static String method7689(@OriginalArg(0) Class3_Sub44 arg0) {
		return arg0.aString106 == null || arg0.aString106.length() <= 0 ? arg0.aString105 : arg0.aString105 + Static48.aClass33_34.method797(Static131.anInt2839) + arg0.aString106;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)Z")
	public static boolean method7691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static447.method6264(arg0, arg1) || Static330.method5099(arg1, arg0);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	public static int method7694() {
		return Static22.anIntArray52 == null ? 0 : Static22.anIntArray52.length * 2;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
	public static void method7695() {
		@Pc(16) Class3_Sub34 local16 = Static374.method5522(Static435.aClass298_148, Static220.aClass287_2);
		local16.aClass3_Sub11_Sub1_2.method3079(0);
		Static131.method2572(local16);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIII)V")
	public static void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static278.aClass3_Sub13_Sub1_1.anInt5153 != 0 && arg2 != 0 && Static407.anInt6912 < 50 && arg1 != -1) {
			Static567.aClass232Array1[Static407.anInt6912++] = new Class232((byte) 1, arg1, arg2, arg0, arg3, arg4);
		}
	}
}

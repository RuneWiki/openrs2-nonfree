import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rl", name = "rb", descriptor = "I")
	public static int anInt6033;

	@OriginalMember(owner = "client!rl", name = "Bb", descriptor = "I")
	public static int anInt6040;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_53 = new Class129(4);

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "Lclient!cr;")
	public static Class41 aClass41_12 = null;

	@OriginalMember(owner = "client!rl", name = "tb", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_80 = new Class44(66, 2);

	@OriginalMember(owner = "client!rl", name = "xb", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_151 = new Class81(61, 8);

	@OriginalMember(owner = "client!rl", name = "Ab", descriptor = "I")
	public static int anInt6039 = 0;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public static void method4802() {
		if (!Static428.aBoolean637) {
			return;
		}
		@Pc(11) Class41 local11 = Static85.method2627(Static255.anInt4805, Static443.anInt7737);
		if (local11 != null && local11.anObjectArray23 != null) {
			@Pc(24) Class2_Sub14 local24 = new Class2_Sub14();
			local24.aClass41_5 = local11;
			local24.anObjectArray32 = local11.anObjectArray23;
			Static290.method4227(local24);
		}
		Static217.anInt490 = -1;
		Static428.aBoolean637 = false;
		Static245.anInt4645 = -1;
		if (local11 != null) {
			Static168.method2616(local11);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public static void method4805(@OriginalArg(0) int arg0) {
		Static167.anInt3227 = -1;
		Static176.anInt3420 = 3;
		Static303.anInt5385 = 100;
		Static401.anInt6978 = arg0;
	}
}

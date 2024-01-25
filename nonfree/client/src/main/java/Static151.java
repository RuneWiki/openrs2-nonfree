import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public static int anInt3054;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	public static int anInt3056;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!mga;")
	public static Class220 method2593(@OriginalArg(0) int arg0) {
		@Pc(10) Class220[] local10 = Static589.method8185();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class220 local18 = local10[local12];
			if (local18.anInt6506 == arg0) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Z")
	public static boolean method2597(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}

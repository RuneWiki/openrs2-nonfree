import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!ow;")
	public static Class181 aClass181_2;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static int anInt1271;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_32 = new Class136(104, -2);

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Lclient!fg;")
	public static Class70 method1244(@OriginalArg(1) int arg0) {
		@Pc(8) Class70[] local8 = Static361.method5055();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			if (local8[local16].anInt1961 == arg0) {
				return local8[local16];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method1245(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub3_Sub4 local15 = Static281.method3883(9, arg0);
		local15.method1006();
	}
}

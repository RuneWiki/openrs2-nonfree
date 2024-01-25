import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!oi;")
	public static Class3_Sub40 aClass3_Sub40_12;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Z")
	public static boolean aBoolean844 = false;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public static int anInt10236 = 0;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
	public static final int[] anIntArray665 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "[Lclient!dg;")
	public static final Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array10 = new Class2_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
	public static boolean method8292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static109.method2277(arg1, arg0) || Static132.method5408(arg1, arg0);
	}
}

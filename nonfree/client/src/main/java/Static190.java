import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static190 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[J")
	public static long[] aLongArray17;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt3182 = 0;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!dn;")
	public static Class5_Sub10 aClass5_Sub10_1 = null;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static163.method2300(arg1, arg0) | (arg1 & 0x40000) != 0 || Static452.method5943(arg1, arg0);
	}
}

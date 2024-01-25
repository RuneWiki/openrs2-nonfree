import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt3779;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public static int anInt3781;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt3782;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt3786;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!ofa;")
	public static Class267 aClass267_2;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray63;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public static int anInt3787;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public static boolean method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Z")
	public static boolean method3527(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9 || arg0 == 10;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!lga;Lclient!lga;IZ)V")
	public static void method3528(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1) {
		Static74.aClass223_15 = arg1;
		Static254.aClass223_57 = arg0;
	}
}

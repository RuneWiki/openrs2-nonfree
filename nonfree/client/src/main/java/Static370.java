import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!so", name = "h", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array18;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "I")
	public static int anInt6307;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!of;B)Z")
	public static boolean method5089(@OriginalArg(0) Class176 arg0) {
		return Static132.aClass176_4 == arg0 || arg0 == Static359.aClass176_8 || Static212.aClass176_2 == arg0 || Static42.aClass176_3 == arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
	public static boolean method5090(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}

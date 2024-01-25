import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_45 = new Class288(112, -1);

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
	public static int anInt1229 = -2;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)Z")
	public static boolean method964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static191.method2770(arg0, arg1) || Static421.method5623(arg1, arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)I")
	public static int method966() {
		return Static491.anInt8078 == 1 ? Static290.anInt4733 : 0;
	}
}

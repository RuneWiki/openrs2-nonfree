import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!kba", name = "J", descriptor = "Lclient!jn;")
	public static Class176 aClass176_69;

	@OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
	public static int anInt5004 = 0;

	@OriginalMember(owner = "client!kba", name = "L", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_106 = new Class362(30, 0);

	@OriginalMember(owner = "client!kba", name = "M", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_34 = new Class223(4);

	@OriginalMember(owner = "client!kba", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(III)Z")
	public static boolean method4412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static321.method5320(arg1, arg0) & Static247.method3958(arg0, arg1);
	}
}

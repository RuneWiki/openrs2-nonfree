import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Lclient!l;")
	public static Class143 aClass143_11;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!kl;")
	public static final Class137 aClass137_3 = new Class137("WTRC", 1);

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_11 = new Class134(50);

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_34 = new Class7("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	public static int anInt1503 = 0;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_13 = new Class181();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BIIIZLclient!kd;I[B)Lclient!oi;")
	public static Class3_Sub2_Sub1 method1316(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class39_Sub2 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean237 || Static400.method5337(arg0) && Static400.method5337(arg1)) {
			return new Class3_Sub2_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean229) {
			return new Class3_Sub2_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class3_Sub2_Sub1(arg2, 6406, arg0, arg1, Static406.method5434(arg0), Static406.method5434(arg1), arg3, 6406);
		}
	}
}

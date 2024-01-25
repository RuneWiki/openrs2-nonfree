import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!ok;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt4945;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!gj;")
	public static Class143 aClass143_62;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!ul;")
	public static final Class361 aClass361_8 = new Class361(4);

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Z")
	public static boolean aBoolean402 = true;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!is", name = "l", descriptor = "[Lclient!om;")
	public static final Class265[] aClass265Array1 = new Class265[16];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!hk;IIII)Lclient!vq;")
	public static Class39_Sub4_Sub1 method4142(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0.aBoolean314 || Static9.method94(arg3) && Static9.method94(arg2)) {
			return new Class39_Sub4_Sub1(arg0, 3553, arg1, arg3, arg2);
		} else if (arg0.aBoolean318) {
			return new Class39_Sub4_Sub1(arg0, 34037, arg1, arg3, arg2);
		} else {
			return new Class39_Sub4_Sub1(arg0, arg1, arg3, arg2, Static527.method7377(arg3), Static527.method7377(arg2));
		}
	}
}

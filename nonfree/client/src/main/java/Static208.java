import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt3763;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_59 = new Class96(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_81 = new Class254(27, 8);

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Z")
	public static boolean aBoolean303 = true;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Lclient!nh;")
	public static Class47_Sub2 method3165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub2_1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!hh;Lclient!m;)V")
	public static void method3167(@OriginalArg(1) Class109 arg0, @OriginalArg(2) Interface5 arg1) {
		Static264.anInterface5_14 = arg1;
		Static62.aClass109_23 = arg0;
	}
}

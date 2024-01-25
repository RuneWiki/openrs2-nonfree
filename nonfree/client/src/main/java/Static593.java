import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "[Lclient!qo;")
	public static Class291[] aClass291Array1;

	@OriginalMember(owner = "client!vaa", name = "x", descriptor = "Lclient!fha;")
	public static Class14_Sub1_Sub1_Sub3_Sub1 aClass14_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_66 = new Class293(8);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V")
	public static void method8309(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static1.method5724(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBI)Z")
	public static boolean method8313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(23) Class283 local23 = Static525.aClass371_4.method8554(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local23.method6849(arg0);
	}
}

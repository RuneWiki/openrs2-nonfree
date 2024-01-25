import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public static int anInt3733 = 0;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!su;")
	public static final Class298 aClass298_81 = new Class298();

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	public static int anInt3744 = 0;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	public static int anInt3745 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class60_Sub2 local15 = (Class60_Sub2) Static500.aClass349_15.method7890(); local15 != null; local15 = (Class60_Sub2) Static500.aClass349_15.method7896()) {
			if (Static363.anInt6671 >= local15.anInt3135) {
				local15.method7802();
			} else {
				Static234.method3601((local15.anInt3126 << 9) + 256, arg1 >> 1, local15.anInt3136, local15.anInt3129 * 2, arg2 >> 1, (local15.anInt3127 << 9) + 256);
				Static264.aClass82_3.method7873(local15.anInt3131 | 0xFF000000, Static10.anIntArray8[1] + arg3, local15.aString32, Static10.anIntArray8[0] + arg0, 0);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIBI)V")
	public static void method3260(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static21.aLong14 = 0L;
		@Pc(13) int local13 = Static278.method4179();
		if (arg0 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (!Static554.aClass90_12.method7506()) {
			arg1 = true;
		}
		Static528.method7235(arg3, local13, arg1, arg2, arg0);
	}
}

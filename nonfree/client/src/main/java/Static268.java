import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
	public static int anInt5106;

	@OriginalMember(owner = "client!nm", name = "ab", descriptor = "[S")
	public static short[] aShortArray86;

	@OriginalMember(owner = "client!nm", name = "U", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_75 = new Class21(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
	public static int anInt5105 = -1;

	@OriginalMember(owner = "client!nm", name = "Y", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_76 = new Class21("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method4311(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg1[arg2 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static121.aCharArray7[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
	public static void method4312() {
		if (Static42.aClass219_1 != Static337.aClass219_4) {
			try {
				Static476.method5363(Static179.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I")
	public static int method4313(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

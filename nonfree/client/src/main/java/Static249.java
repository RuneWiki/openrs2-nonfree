import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "Lclient!vh;")
	public static Class250 aClass250_55;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	public static int anInt4478;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_59 = new Class84(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_60 = new Class84("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_77 = new Class237(47, 10);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
	public static void method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static83.anInt7380 <= arg3 - arg1 && arg3 + arg1 <= Static221.anInt4001 && arg0 - arg1 >= Static305.anInt5429 && Static212.anInt452 >= arg1 + arg0) {
			Static330.method4641(arg1, arg0, arg3, arg2);
		} else {
			Static250.method3676(arg1, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;IIZ)Ljava/lang/String;")
	public static String method3674(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(18) String local18 = arg0[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg1 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg0[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local31);
			for (@Pc(65) int local65 = arg2; local65 < local29; local65++) {
				@Pc(71) String local71 = arg0[local65];
				if (local71 == null) {
					local58.append("null");
				} else {
					local58.append(local71);
				}
			}
			return local58.toString();
		}
	}
}

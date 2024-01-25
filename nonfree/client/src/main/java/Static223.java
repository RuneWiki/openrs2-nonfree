import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!iq;")
	public static Class104 aClass104_126;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_33 = new Class180();

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_160 = new Class221(31, 0);

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_147 = new Class157(44, 0);

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_115 = new Class140("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_116 = new Class140("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "[I")
	public static final int[] anIntArray359 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "[Lclient!de;")
	public static final Class52[] aClass52Array1 = new Class52[8];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!iq;Z)V")
	public static void method4180(@OriginalArg(0) Class104 arg0) {
		Static336.aClass104_180 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z")
	public static boolean method4181(@OriginalArg(1) int arg0) {
		if (arg0 == 8 || arg0 == 30 || arg0 == 6 || arg0 == 13 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method4182(@OriginalArg(0) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - '0';
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}
}

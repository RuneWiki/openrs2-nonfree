import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_17 = new Class189("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIZ[Ljava/lang/String;)Ljava/lang/String;")
	public static String method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(22) String local22 = arg2[arg1];
			return local22 == null ? "null" : local22.toString();
		} else {
			@Pc(33) int local33 = arg1 + arg0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = arg1; local37 < local33; local37++) {
				@Pc(42) String local42 = arg2[local37];
				if (local42 == null) {
					local35 += 4;
				} else {
					local35 += local42.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local35);
			for (@Pc(62) int local62 = arg1; local62 < local33; local62++) {
				@Pc(67) String local67 = arg2[local62];
				if (local67 == null) {
					local60.append("null");
				} else {
					local60.append(local67);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZIIII)V")
	public static void method510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg0 + 1;
		Static412.method5293(Static262.anIntArrayArray31[arg0], arg1, arg4, arg2);
		@Pc(25) int local25 = arg3 - 1;
		Static412.method5293(Static262.anIntArrayArray31[arg3], arg1, arg4, arg2);
		for (@Pc(33) int local33 = local16; local33 <= local25; local33++) {
			@Pc(39) int[] local39 = Static262.anIntArrayArray31[local33];
			local39[arg4] = local39[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z")
	public static boolean method511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}

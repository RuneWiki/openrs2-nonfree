import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_64 = new Class117("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!ql;")
	public static final Class165 aClass165_3 = new Class165();

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method3136() {
		@Pc(5) String local5 = "www";
		if (Static278.anInt6305 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(19) String local19 = "";
		if (Static239.aString46 != null) {
			local19 = "/p=" + Static239.aString46;
		}
		return Static68.anInt1264 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static230.anInt4634 + "/a=" + Static96.anInt1755 + local19 + "/" : "http://" + local5 + ".runescape.com/l=" + Static230.anInt4634 + "/a=" + Static96.anInt1755 + local19 + "/";
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([[B[[B[BI[I[IIB)I")
	public static int method3159(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg4[arg6];
		@Pc(15) int local15 = arg5[arg6] + local9;
		@Pc(19) int local19 = arg4[arg3];
		@Pc(26) int local26 = local19 + arg5[arg3];
		@Pc(28) int local28 = local9;
		if (local9 < local19) {
			local28 = local19;
		}
		@Pc(35) int local35 = local15;
		if (local15 > local26) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg2[arg6] & 0xFF;
		if ((arg2[arg3] & 0xFF) < local50) {
			local50 = arg2[arg3] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg0[arg6];
		@Pc(75) byte[] local75 = arg1[arg3];
		@Pc(80) int local80 = local28 - local9;
		@Pc(84) int local84 = local28 - local19;
		for (@Pc(94) int local94 = local28; local94 < local35; local94++) {
			@Pc(107) int local107 = local71[local80++] + local75[local84++];
			if (local107 < local50) {
				local50 = local107;
			}
		}
		return -local50;
	}
}

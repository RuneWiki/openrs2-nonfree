import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "J")
	public static long aLong134;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	public static int anInt3974;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!e;")
	public static final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3682() {
		Static131.aClass140_72.method3824(5);
		Static112.aClass140_103.method3824(5);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z")
	public static boolean method3683() {
		if (Static4.aBoolean16) {
			try {
				Static365.method4929(Static180.aClass110_6.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method3685(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static352.anInt6527;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(21) Class73 local21 = Static70.method1417(arg0[local13]);
			if (local21.anInt2209 != -1) {
				@Pc(34) Class90 local34 = (Class90) Static68.aClass140_38.method3816((long) local21.anInt2209);
				if (local34 == null) {
					@Pc(42) Class138 local42 = Static363.method3785(Static297.aClass165_88, local21.anInt2209, 0);
					if (local42 != null) {
						local34 = Static34.aClass2_6.method3322(local42);
						Static68.aClass140_38.method3817((long) local21.anInt2209, local34);
					}
				}
				if (local34 != null) {
					Static335.aClass90Array16[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}

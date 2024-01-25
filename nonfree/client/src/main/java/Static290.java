import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString130;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZILclient!et;)V")
	public static void method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class91 arg2) {
		Static184.anInt3831 = arg0;
		Static14.aClass91_1 = arg2;
		Static91.anInt9225 = arg1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZBZ)V")
	public static void method5100(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static285.anInt5493++;
			Static339.method5712();
		}
		if (arg1) {
			Static193.anInt3953++;
			Static258.method4653();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)[Lclient!sn;")
	public static Class270[] method5101() {
		if (Static80.aClass270Array1 == null) {
			@Pc(19) Class270[] local19 = Static71.method1699(Static473.aClass229_14);
			@Pc(23) Class270[] local23 = new Class270[local19.length];
			@Pc(25) int local25 = 0;
			@Pc(76) int local76;
			@Pc(82) Class270 local82;
			label63: for (@Pc(27) int local27 = 0; local27 < local19.length; local27++) {
				@Pc(33) Class270 local33 = local19[local27];
				if ((local33.anInt7899 <= 0 || local33.anInt7899 >= 24) && local33.anInt7897 >= 800 && local33.anInt7894 >= 600 && (Static520.anInt9181 >= 96 || Static449.anInt7876 != 0 || local33.anInt7897 <= 1024 && local33.anInt7894 <= 768)) {
					for (local76 = 0; local76 < local25; local76++) {
						local82 = local23[local76];
						if (local33.anInt7897 == local82.anInt7897 && local33.anInt7894 == local82.anInt7894) {
							if (local82.anInt7899 < local33.anInt7899) {
								local23[local76] = local33;
							}
							continue label63;
						}
					}
					local23[local25] = local33;
					local25++;
				}
			}
			Static80.aClass270Array1 = new Class270[local25];
			Static556.method7041(local23, 0, Static80.aClass270Array1, 0, local25);
			@Pc(142) int[] local142 = new int[Static80.aClass270Array1.length];
			for (local76 = 0; local76 < Static80.aClass270Array1.length; local76++) {
				local82 = Static80.aClass270Array1[local76];
				local142[local76] = local82.anInt7894 * local82.anInt7897;
			}
			Static214.method3971(local142, Static80.aClass270Array1);
		}
		return Static80.aClass270Array1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Z")
	public static boolean method5103() {
		return Static231.aBoolean346;
	}
}

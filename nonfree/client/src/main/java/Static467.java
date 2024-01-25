import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	public static int anInt8075;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_26 = new Class54(3, 17);

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_121 = new Class45("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!tg", name = "Z", descriptor = "Lclient!et;")
	public static Class91 aClass91_15 = null;

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_122 = new Class45("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[I[ILclient!bda;II)Lclient!dea;")
	public static Class28_Sub2 method7126(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class4_Sub2 arg3, @OriginalArg(4) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg3.method7308(Static517.aClass308_15, Static504.aClass110_22)) {
			@Pc(21) int[] local21 = new int[arg4 * arg0];
			for (local23 = 0; local23 < arg0; local23++) {
				local33 = local23 * arg4 + arg2[local23];
				for (local35 = 0; local35 < arg1[local23]; local35++) {
					local21[local33++] = -16777216;
				}
			}
			return new Class28_Sub2(arg3, arg4, arg0, local21);
		}
		@Pc(69) byte[] local69 = new byte[arg4 * arg0];
		for (local23 = 0; local23 < arg0; local23++) {
			local33 = arg4 * local23 + arg2[local23];
			for (local35 = 0; local35 < arg1[local23]; local35++) {
				local69[local33++] = -1;
			}
		}
		return new Class28_Sub2(arg3, arg4, arg0, local69);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Z")
	public static boolean method7127() {
		try {
			return Static211.method3917();
		} catch (@Pc(14) IOException local14) {
			Static365.method5914();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static43.aClass305_340 == null ? -1 : Static43.aClass305_340.method7835()) + "," + (Static517.aClass305_447 == null ? -1 : Static517.aClass305_447.method7835()) + "," + (Static381.aClass305_360 == null ? -1 : Static381.aClass305_360.method7835()) + " - " + Static494.anInt8660 + "," + (Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] + Static538.anInt9485) + "," + (Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] + Static282.anInt5380) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static494.anInt8660 && local79 < 50; local79++) {
				local77 = local77 + Static352.aClass1_Sub17_Sub2_2.aByteArray58[local79] + ",";
			}
			Static25.method773(local19, local77);
			Static406.method6459(false);
			return true;
		}
	}
}

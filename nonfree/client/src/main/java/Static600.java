import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!al;")
	public static final Class17 aClass17_6 = new Class17("game3", 2);

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static final int anInt9941 = 1403;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!nd;I)V")
	public static void method8442(@OriginalArg(0) Class238 arg0) {
		Static208.anInt4026 = arg0.method5575("hitmarks");
		Static640.anInt10331 = arg0.method5575("hitbar_default");
		Static238.anInt8043 = arg0.method5575("timerbar_default");
		Static162.anInt3285 = arg0.method5575("headicons_pk");
		Static457.anInt8802 = arg0.method5575("headicons_prayer");
		Static248.anInt4779 = arg0.method5575("hint_headicons");
		Static649.anInt10496 = arg0.method5575("hint_mapmarkers");
		Static411.anInt6923 = arg0.method5575("mapflag");
		Static547.anInt8826 = arg0.method5575("cross");
		Static352.anInt6101 = arg0.method5575("mapdots");
		Static54.anInt1392 = arg0.method5575("scrollbar");
		Static602.anInt9969 = arg0.method5575("name_icons");
		Static228.anInt4212 = arg0.method5575("floorshadows");
		Static550.anInt8852 = arg0.method5575("compass");
		Static318.anInt5619 = arg0.method5575("otherlevel");
		Static269.anInt5045 = arg0.method5575("hint_mapedge");
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
	public static void method8443(@OriginalArg(0) boolean arg0) {
		Static113.method2018();
		if (!Static19.method522(Static454.anInt7416)) {
			return;
		}
		Static617.anInt10103++;
		if (Static617.anInt10103 < 50 && !arg0) {
			return;
		}
		Static617.anInt10103 = 0;
		if (!Static236.aBoolean321 && Static341.aClass22_4 != null) {
			@Pc(40) Class2_Sub31 local40 = Static275.method4480(Static640.aClass314_2, Static555.aClass145_162);
			Static526.method7309(local40);
			try {
				Static255.method4268();
			} catch (@Pc(47) IOException local47) {
				Static236.aBoolean321 = true;
			}
		}
		Static113.method2018();
	}
}

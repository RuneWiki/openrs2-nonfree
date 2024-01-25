import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public static int anInt4315;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_102 = new Class7("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)Z")
	public static boolean method3566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static385.aBoolean436) {
			return false;
		}
		@Pc(16) int local16 = arg1 >> 16;
		@Pc(20) int local20 = arg1 & 0xFFFF;
		if (Static437.aClass251ArrayArray2[local16] == null || Static437.aClass251ArrayArray2[local16][local20] == null) {
			return false;
		}
		@Pc(38) Class251 local38 = Static437.aClass251ArrayArray2[local16][local20];
		@Pc(49) Class1_Sub3 local49;
		if (arg0 == -1 && local38.anInt6654 == 0) {
			for (local49 = (Class1_Sub3) Static55.aClass181_63.method4112(); local49 != null; local49 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
				if (local49.anInt117 == 51 || local49.anInt117 == 1007 || local49.anInt117 == 3 || local49.anInt117 == 22 || local49.anInt117 == 2) {
					for (@Pc(81) Class251 local81 = Static378.method3544(local49.anInt114); local81 != null; local81 = Static71.method2636(local81)) {
						if (local81.anInt6689 == local38.anInt6689) {
							return true;
						}
					}
				}
			}
		} else {
			for (local49 = (Class1_Sub3) Static55.aClass181_63.method4112(); local49 != null; local49 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
				if (arg0 == local49.anInt116 && local38.anInt6689 == local49.anInt114 && (local49.anInt117 == 51 || local49.anInt117 == 1007 || local49.anInt117 == 3 || local49.anInt117 == 22 || local49.anInt117 == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method3570(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static282.anInt4930 != 3) {
			Static451.aClass209_5 = new Class209();
			Static451.aClass209_5.aString60 = arg0;
			Static451.aClass209_5.anInt5815 = arg1;
			if (Static35.aClass137_11 != Static45.aClass137_10) {
				Static451.aClass209_5.anInt5817 = Static451.aClass209_5.anInt5815 + 40000;
				Static451.aClass209_5.anInt5818 = Static451.aClass209_5.anInt5815 + 50000;
			}
			return true;
		}
		@Pc(37) String local37 = "";
		if (Static35.aClass137_11 != Static45.aClass137_10) {
			local37 = ":" + (arg1 + 7000);
		}
		@Pc(52) String local52 = "";
		if (Static164.aString23 != null) {
			local52 = "/p=" + Static164.aString23;
		}
		@Pc(100) String local100 = "http://" + arg0 + local37 + "/l=" + Static341.anInt5770 + "/a=" + Static209.anInt3932 + local52 + "/j" + (Static189.aBoolean208 ? "1" : "0") + ",o" + (Static333.aBoolean403 ? "1" : "0") + ",a2";
		try {
			Static152.aClient1.getAppletContext().showDocument(new URL(local100), "_self");
			return true;
		} catch (@Pc(115) Exception local115) {
			return false;
		}
	}
}

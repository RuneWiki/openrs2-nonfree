import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIBII)Z")
	public static boolean method7554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(20) int local20 = arg4; local20 <= arg2; local20++) {
			for (@Pc(26) int local26 = arg1; local26 <= arg3; local26++) {
				if (arg0 == Static84.anIntArrayArray9[local20][local26] && Static723.anIntArrayArray63[local20][local26] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	public static boolean method7556(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static310.aClass47_4.aBoolean97) {
			Static272.aClass314_7 = new Class314();
			Static272.aClass314_7.anInt9072 = arg1;
			Static272.aClass314_7.aString117 = arg0;
			if (Static364.aClass371_4 != Static487.aClass371_7) {
				Static272.aClass314_7.anInt9071 = Static272.aClass314_7.anInt9072 + 40000;
				Static272.aClass314_7.anInt9073 = Static272.aClass314_7.anInt9072 + 50000;
			}
			for (@Pc(39) int local39 = 0; local39 < Static372.aClass256_Sub1Array1.length; local39++) {
				if (arg1 == Static372.aClass256_Sub1Array1[local39].anInt7714) {
					Static50.anInt851 = Static372.aClass256_Sub1Array1[local39].anInt7704;
				}
			}
			return true;
		}
		@Pc(77) String local77 = "";
		if (Static487.aClass371_7 != Static364.aClass371_4) {
			local77 = ":" + (arg1 + 7000);
		}
		@Pc(92) String local92 = "";
		if (Static236.aString77 != null) {
			local92 = "/p=" + Static236.aString77;
		}
		@Pc(156) String local156 = "http://" + arg0 + local77 + "/l=" + Static141.anInt2658 + "/a=" + Static721.anInt3580 + local92 + "/j" + (Static215.aBoolean348 ? "1" : "0") + ",o" + (Static408.aBoolean568 ? "1" : "0") + ",a2";
		try {
			Static556.aClient1.getAppletContext().showDocument(new URL(local156), "_self");
			return true;
		} catch (@Pc(168) Exception local168) {
			return false;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)I")
	public static int method7557(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}

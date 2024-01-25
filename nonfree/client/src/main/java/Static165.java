import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ffa", name = "Zg", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!ffa", name = "Pg", descriptor = "[Lclient!ic;")
	public static final Class8_Sub1_Sub3_Sub2_Sub1[] aClass8_Sub1_Sub3_Sub2_Sub1Array1 = new Class8_Sub1_Sub3_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(BI)Z")
	public static boolean method2306(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method2325(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static294.aClass230_3.aBoolean471) {
			Static197.aClass54_35 = new Class54();
			Static197.aClass54_35.anInt869 = arg0;
			Static197.aClass54_35.aString15 = arg1;
			if (Static408.aClass201_8 != Static570.aClass201_10) {
				Static197.aClass54_35.anInt872 = Static197.aClass54_35.anInt869 + 50000;
				Static197.aClass54_35.anInt868 = Static197.aClass54_35.anInt869 + 40000;
			}
			for (@Pc(39) int local39 = 0; local39 < Static92.aClass180_Sub1Array1.length; local39++) {
				if (Static92.aClass180_Sub1Array1[local39].anInt4558 == arg0) {
					Static74.anInt1194 = Static92.aClass180_Sub1Array1[local39].anInt4551;
				}
			}
			return true;
		}
		@Pc(77) String local77 = "";
		if (Static570.aClass201_10 != Static408.aClass201_8) {
			local77 = ":" + (arg0 + 7000);
		}
		@Pc(99) String local99 = "";
		if (Static625.aString132 != null) {
			local99 = "/p=" + Static625.aString132;
		}
		@Pc(163) String local163 = "http://" + arg1 + local77 + "/l=" + Static323.anInt5795 + "/a=" + Static456.anInt7813 + local99 + "/j" + (Static301.aBoolean679 ? "1" : "0") + ",o" + (Static525.aBoolean720 ? "1" : "0") + ",a2";
		try {
			Static454.aClient1.getAppletContext().showDocument(new URL(local163), "_self");
			return true;
		} catch (@Pc(175) Exception local175) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZZII)I")
	public static int method2349(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class5_Sub48 local17 = Static507.method7441(arg2, arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 >= 0 && local17.anIntArray524.length > arg1) {
			return local17.anIntArray524[arg1];
		} else {
			return 0;
		}
	}
}

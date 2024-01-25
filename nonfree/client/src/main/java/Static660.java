import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!mk;")
	public static Class5_Sub1_Sub13 aClass5_Sub1_Sub13_4;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
	public static int[] anIntArray613;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_216 = new Class156(102, 10);

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_267 = new Class381(66, 8);

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_268 = new Class381(13, 8);

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
	public static final int[] anIntArray614 = new int[8];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
	public static void method9068(@OriginalArg(0) int arg0) {
		Static137.aLong81 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JZIB)Ljava/lang/String;")
	public static String method9069(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static343.method5120(arg0);
		@Pc(19) Calendar local19 = Static462.aCalendar5;
		@Pc(30) int local30 = local19.get(5);
		@Pc(36) int local36 = local19.get(2) + 1;
		@Pc(40) int local40 = local19.get(1);
		@Pc(44) int local44 = local19.get(11);
		@Pc(48) int local48 = local19.get(12);
		return Integer.toString(local30 / 10) + local30 % 10 + "/" + local36 / 10 + local36 % 10 + "/" + local40 % 100 / 10 + local40 % 10 + " " + local44 / 10 + local44 % 10 + ":" + local48 / 10 + local48 % 10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Z")
	public static boolean method9070(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method9071(@OriginalArg(0) int arg0) {
		Static88.anInt1483 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method9072(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static681.aClass349_6.aBoolean601) {
			Static68.aClass258_6 = new Class258();
			Static68.aClass258_6.anInt6748 = arg1;
			Static68.aClass258_6.aString78 = arg0;
			if (Static670.aClass242_7 != Static387.aClass242_8) {
				Static68.aClass258_6.anInt6747 = Static68.aClass258_6.anInt6748 + 40000;
				Static68.aClass258_6.anInt6746 = Static68.aClass258_6.anInt6748 + 50000;
			}
			for (@Pc(39) int local39 = 0; local39 < Static592.aClass51_Sub1Array2.length; local39++) {
				if (arg1 == Static592.aClass51_Sub1Array2[local39].anInt3950) {
					Static342.anInt5705 = Static592.aClass51_Sub1Array2[local39].anInt3944;
				}
			}
			return true;
		}
		@Pc(77) String local77 = "";
		if (Static670.aClass242_7 != Static387.aClass242_8) {
			local77 = ":" + (arg1 + 7000);
		}
		@Pc(92) String local92 = "";
		if (Static565.aString101 != null) {
			local92 = "/p=" + Static565.aString101;
		}
		@Pc(156) String local156 = "http://" + arg0 + local77 + "/l=" + Static375.anInt7800 + "/a=" + Static653.anInt10666 + local92 + "/j" + (Static460.aBoolean507 ? "1" : "0") + ",o" + (Static525.aBoolean554 ? "1" : "0") + ",a2";
		try {
			Static189.aClient1.getAppletContext().showDocument(new URL(local156), "_self");
			return true;
		} catch (@Pc(168) Exception local168) {
			return false;
		}
	}
}

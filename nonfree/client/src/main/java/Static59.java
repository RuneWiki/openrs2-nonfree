import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "C")
	public static char aChar2;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "I")
	public static int anInt1509 = 0;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "[I")
	public static final int[] anIntArray225 = new int[4096];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;ZZLclient!bd;I)V")
	public static void method1193(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class21 arg3) {
		if (!arg1) {
			Static50.method1090(3, arg0, arg3);
			return;
		}
		@Pc(25) String local25;
		if (Static22.aString35.startsWith("win") && Static22.anInt448 != 3) {
			local25 = null;
			if (arg3.anApplet1 != null) {
				local25 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(47) Class99 local47 = Static50.method1090(0, arg0, arg3);
				Static119.aClass99_4 = local47;
				Static250.aString308 = arg0;
				Static58.aClass21_2 = arg3;
				return;
			}
		}
		if (Static22.aString35.startsWith("mac")) {
			local25 = null;
			if (arg3.anApplet1 != null) {
				local25 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg2) {
				Static50.method1090(1, arg0, arg3);
				return;
			}
		}
		Static50.method1090(2, arg0, arg3);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1195(@OriginalArg(1) String arg0) {
		if (Static353.aStringArray27 == null) {
			Static302.method5504();
		}
		@Pc(14) String[] local14 = Static201.method3708('\n', arg0);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(22) int local22 = Static353.aStringArray27.length - 1; local22 > 0; local22--) {
				Static353.aStringArray27[local22] = Static353.aStringArray27[local22 - 1];
			}
			Static353.aStringArray27[0] = local14[local16];
		}
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "(B)V")
	public static void method1196() {
		Static222.aClass103_43.method2684();
	}
}

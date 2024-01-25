import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_39 = new Class91(5);

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "[Lclient!cm;")
	public static Class45[] aClass45Array1 = new Class45[50];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1922(@OriginalArg(0) int arg0) {
		if (Static414.method5610(arg0)) {
			Static367.method5119(Static293.aClass68ArrayArray4[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z")
	public static boolean method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1927(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static323.anInt5975; local9++) {
			if (arg0.equalsIgnoreCase(Static169.aStringArray24[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1928(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static81.method1497(arg1, arg0);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(29) int local29;
			for (local29 = local24; arg0 != arg1.charAt(local29); local29++) {
			}
			local20[local22++] = arg1.substring(local24, local29);
			local24 = local29 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}
}

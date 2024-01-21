import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_20;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!bc;")
	public static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt2067 = 0;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_978 = Static14.method2017("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!kc;")
	private static Class36 aClass36_979 = Static14.method2017("Existing user");

	@OriginalMember(owner = "client!q", name = "q", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_980 = Static14.method2017("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_981 = aClass36_979;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
	public static boolean method1497(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method1499() {
		Static90.aClass8_6 = new Class8();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZZBZ)Lclient!je;")
	public static Class3_Sub1 method1500(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class10 local10 = null;
		if (Static103.aClass47_4 != null) {
			local10 = new Class10(arg0, Static103.aClass47_4, Static4.aClass47Array1[arg0], 1000000);
		}
		return new Class3_Sub1(local10, Static103.aClass10_4, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ac;Lclient!df;ILclient!ac;Z)V")
	public static void method1501(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) boolean arg3) {
		Static36.aClass3_5 = arg0;
		Static27.aBoolean38 = arg3;
		Static41.aClass3_6 = arg2;
		Static113.anInt2955 = Static36.aClass3_5.method946(10);
		Static11.aClass2_Sub1_Sub1_Sub2_2 = arg1;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
	public static void method1502() {
		aClass2_Sub1_Sub1_Sub1_20 = null;
		aClass36_979 = null;
		aClass36_978 = null;
		aClass2_Sub1_Sub3_1 = null;
		aClass36_980 = null;
		aClass36_981 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
	public static void method1503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub13 local16 = (Class2_Sub13) Static66.aClass31_3.method905((long) arg0);
		if (local16 == null) {
			local16 = new Class2_Sub13();
			Static66.aClass31_3.method912((long) arg0, local16);
		}
		if (arg3 >= local16.anIntArray249.length) {
			@Pc(44) int[] local44 = new int[arg3 + 1];
			@Pc(49) int[] local49 = new int[arg3 + 1];
			for (@Pc(51) int local51 = 0; local51 < local16.anIntArray249.length; local51++) {
				local44[local51] = local16.anIntArray249[local51];
				local49[local51] = local16.anIntArray248[local51];
			}
			for (@Pc(77) int local77 = local16.anIntArray249.length; local77 < arg3; local77++) {
				local44[local77] = -1;
				local49[local77] = 0;
			}
			local16.anIntArray249 = local44;
			local16.anIntArray248 = local49;
		}
		local16.anIntArray249[arg3] = arg1;
		local16.anIntArray248[arg3] = arg2;
	}
}

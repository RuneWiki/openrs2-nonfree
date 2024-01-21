import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!lc;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_678 = Static72.method1077(" weitere Optionen");

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_679 = Static72.method1077("(Y ");

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!u;")
	private static Class74 aClass74_680 = Static72.method1077("Existing User");

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt949 = -1;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!la;")
	public static Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_681 = Static72.method1077("cross");

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_682 = aClass74_680;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt952 = -1;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_683 = Static72.method1077("sl_flags");

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_684 = Static72.method1077("auf der Hautpseite)3");

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_685 = Static72.method1077("mn");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method661() {
		aClass74_681 = null;
		aClass43_1 = null;
		aClass74_679 = null;
		aClass74_678 = null;
		aClass74_680 = null;
		aClass74_682 = null;
		aClass42_1 = null;
		aClass74_684 = null;
		aClass74_683 = null;
		aClass74_685 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public static void method662() {
		Static109.aClass16_81.method485();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
	public static void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = 2048 - arg3 & 0x7FF;
		@Pc(28) int local28 = 2048 - arg1 & 0x7FF;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = arg5;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local6 != 0) {
			local43 = Class2_Sub2_Sub1_Sub4.anIntArray122[local6];
			local47 = Class2_Sub2_Sub1_Sub4.anIntArray119[local6];
			local57 = local47 * 0 - arg5 * local43 >> 16;
			local34 = arg5 * local47 + local43 * 0 >> 16;
			local32 = local57;
		}
		if (local28 != 0) {
			local43 = Class2_Sub2_Sub1_Sub4.anIntArray122[local28];
			local47 = Class2_Sub2_Sub1_Sub4.anIntArray119[local28];
			local57 = local34 * local43 + local47 * 0 >> 16;
			local34 = local47 * local34 - local43 * 0 >> 16;
			local30 = local57;
		}
		Static113.anInt2444 = arg4 - local30;
		Static100.anInt2211 = arg1;
		Static40.anInt958 = arg0 - local34;
		Static12.anInt362 = arg2 - local32;
		Static53.anInt1290 = arg3;
	}
}

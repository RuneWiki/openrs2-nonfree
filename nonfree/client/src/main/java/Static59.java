import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!df;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public static int anInt1632;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array12 = new Class34[500];

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_767 = Static9.method266("lila:");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
	public static int[] anIntArray174 = new int[2000];

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_768 = Static9.method266("::noclip");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	public static int anInt1631 = 0;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!id;")
	private static Class34 aClass34_769 = Static9.method266("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_770 = Static9.method266("<col=ff0000>");

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
	public static int[] anIntArray175 = new int[128];

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!id;")
	public static Class34 aClass34_771 = aClass34_769;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_772 = Static9.method266("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!ae;BII)V")
	public static void method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static126.anInt2999 + Static132.anInt3154 & 0x7FF;
		@Pc(21) int local21 = arg3 * arg3 + arg4 * arg4;
		if (local21 > 6400) {
			return;
		}
		@Pc(39) int local39 = Class1_Sub1_Sub2_Sub4.anIntArray335[local12];
		@Pc(47) int local47 = local39 * 256 / (Static122.anInt2890 + 256);
		@Pc(51) int local51 = Class1_Sub1_Sub2_Sub4.anIntArray334[local12];
		@Pc(59) int local59 = local51 * 256 / (Static122.anInt2890 + 256);
		@Pc(70) int local70 = local59 * arg4 - local47 * arg3 >> 16;
		@Pc(80) int local80 = local47 * arg4 + arg3 * local59 >> 16;
		if (local21 > 2500) {
			arg2.method180(Static45.aClass1_Sub1_Sub2_Sub2_14, local80 + arg1 + 94 + 4 - arg2.anInt333 / 2, -(arg2.anInt337 / 2) + -4 + -local70 + 83 + arg0);
		} else {
			arg2.method182(local80 + arg1 + 4 + 94 - arg2.anInt333 / 2, arg0 + 83 - (local70 - -(arg2.anInt337 / 2)) - 4);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1032() {
		anIntArray176 = null;
		aClass34_768 = null;
		anIntArray174 = null;
		anIntArray175 = null;
		aClass34Array12 = null;
		aClass34_771 = null;
		aClass34_769 = null;
		aClass34_772 = null;
		aClass34_767 = null;
		aClass34_770 = null;
		aClass17_3 = null;
	}
}

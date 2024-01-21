import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array27;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_695 = Static33.method650(")4lang)4de");

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_705 = Static33.method650(" from your friend list first");

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_696 = aClass56_705;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_697 = Static33.method650("");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!oa;")
	private static Class56 aClass56_698 = Static33.method650("Loading textures )2 ");

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!oa;")
	private static Class56 aClass56_706 = Static33.method650("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_699 = aClass56_706;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_700 = Static33.method650("VOLL");

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_701 = Static33.method650("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_702 = aClass56_698;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_703 = Static33.method650("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public static final int anInt1167 = 5063219;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_704 = Static33.method650("::clientdrop");

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
	public static int[] anIntArray81 = new int[5];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method809() {
		aClass56_699 = null;
		aClass56_697 = null;
		aClass56_703 = null;
		aClass56_700 = null;
		aClass56_704 = null;
		aClass56_706 = null;
		aClass56_696 = null;
		aClass56_701 = null;
		aClass56_702 = null;
		anIntArray81 = null;
		aClass56_698 = null;
		aClass3_Sub1_Sub1_Sub4Array27 = null;
		aClass56_705 = null;
		aClass56_695 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!ib;")
	public static Class3_Sub1_Sub7 method810(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub7 local10 = (Class3_Sub1_Sub7) Static3.aClass52_57.method1342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static114.aClass44_63.method1146(4, arg0);
		local10 = new Class3_Sub1_Sub7();
		if (local22 != null) {
			local10.method906(arg0, new Class3_Sub2(local22));
		}
		local10.method903();
		Static3.aClass52_57.method1344(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)I")
	public static int method812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return (arg2 / 32 << 7) + (arg0 / 4 << 10) + arg1 / 2;
	}
}

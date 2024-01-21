import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!kb;")
	public static Class41 aClass41_18;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!gd;")
	public static Class28 aClass28_57 = new Class28(100);

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_1011 = Static45.method1937("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_1010 = aClass5_1011;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt2065 = 255;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
	public static int[] anIntArray320 = new int[256];

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_1012 = Static45.method1937("::rect_debug");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	public static void method1447() {
		aClass5_1012 = null;
		aClass41_18 = null;
		anIntArray320 = null;
		aClass5_1010 = null;
		aClass5_1011 = null;
		aByteArrayArray9 = null;
		aClass28_57 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!de;")
	public static Class1_Sub3_Sub7 method1448(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub3_Sub7 local6 = (Class1_Sub3_Sub7) Static128.aClass28_88.method796((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static59.aClass41_8.method1710(13, arg0);
		local6 = new Class1_Sub3_Sub7();
		local6.anInt841 = arg0;
		if (local20 != null) {
			local6.method591(new Class1_Sub20(local20));
		}
		Static128.aClass28_88.method789(local6, (long) arg0);
		return local6;
	}
}

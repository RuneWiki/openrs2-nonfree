import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_4;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_696 = Static45.method1937("Please try using a different world)3");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_689 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_690 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_691 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_692 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_693 = Static45.method1937("mapfunction");

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_694 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_695 = aClass5_696;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
	public static int[] anIntArray221 = new int[5];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lclient!ba;")
	public static Class1_Sub3_Sub2 method1019(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub2 local10 = (Class1_Sub3_Sub2) Static48.aClass28_30.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static99.aClass41_24.method1710(1, arg0);
		local10 = new Class1_Sub3_Sub2();
		if (local25 != null) {
			local10.method249(new Class1_Sub20(local25), arg0);
		}
		local10.method247();
		Static48.aClass28_30.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1020() {
		aClass5_693 = null;
		anIntArray221 = null;
		aClass5_691 = null;
		aClass5_689 = null;
		aClass5_694 = null;
		aClass5_696 = null;
		aClass5_695 = null;
		aClass1_Sub3_Sub1_Sub2_4 = null;
		aClass5_690 = null;
		anIntArray220 = null;
		aClass5_692 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB)I")
	public static int method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static25.aByteArrayArrayArray1[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static25.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lclient!tc;")
	public static Class1_Sub3_Sub16 method1022(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub16 local10 = (Class1_Sub3_Sub16) Static55.aClass28_37.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static113.aClass41_29.method1710(10, arg0);
		local10 = new Class1_Sub3_Sub16();
		local10.anInt2855 = arg0;
		if (local20 != null) {
			local10.method2029(new Class1_Sub20(local20));
		}
		local10.method2025();
		if (local10.anInt2876 != -1) {
			local10.method2022(method1022(local10.anInt2876), method1022(local10.anInt2860));
		}
		if (!Static28.aBoolean25 && local10.aBoolean114) {
			local10.anInt2856 = 0;
			local10.aClass5_1323 = Static27.aClass5_387;
			local10.aClass5Array22 = null;
			local10.aClass5Array23 = null;
		}
		Static55.aClass28_37.method789(local10, (long) arg0);
		return local10;
	}
}

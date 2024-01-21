import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!md;")
	public static Class44 aClass44_5;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "Lclient!qa;")
	public static Class1_Sub1_Sub5_Sub1_Sub2 aClass1_Sub1_Sub5_Sub1_Sub2_1;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1194 = Static8.method128("Loading textures )2 ");

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1195 = Static8.method128("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
	public static int anInt4621 = -1;

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1196 = Static8.method128(")1j");

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1197 = Static8.method128(" <col=ffffff>");

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
	public static int[] anIntArray420 = new int[2000];

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1198 = aClass18_1194;

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1199 = aClass18_1195;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method3122(@OriginalArg(0) Class18 arg0) {
		if (Static26.aClass1_Sub19Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(16) long local16 = arg0.method727();
		if (local16 == 0L) {
			return;
		}
		while (Static26.aClass1_Sub19Array1.length > local10 && local16 != Static26.aClass1_Sub19Array1[local10].aLong139) {
			local10++;
		}
		if (local10 < Static26.aClass1_Sub19Array1.length && Static26.aClass1_Sub19Array1[local10] != null) {
			Static95.aClass1_Sub6_Sub1_1.method555(22);
			Static95.aClass1_Sub6_Sub1_1.method515(Static26.aClass1_Sub19Array1[local10].aLong139);
		}
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	public static void method3123() {
		Static47.aClass59_56 = new Class59();
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
	public static void method3124() {
		anIntArray420 = null;
		aClass18_1194 = null;
		aClass18_1196 = null;
		aClass18_1197 = null;
		aClass1_Sub1_Sub5_Sub1_Sub2_1 = null;
		aClass44_5 = null;
		aClass18_1195 = null;
		aClass18_1199 = null;
		aClass18_1198 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method3125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static48.method1038(arg1)) {
			Static160.aClass20Array2 = null;
			Static115.method2312(arg0, arg5, Static148.aClass20ArrayArray1[arg1], arg3, arg6, arg7, arg4, arg2, -1);
			if (Static160.aClass20Array2 != null) {
				Static115.method2312(Static11.anInt337, arg5, Static160.aClass20Array2, arg3, arg6, arg7, Static73.anInt1887, arg2, -1412584499);
				Static160.aClass20Array2 = null;
			}
		} else if (arg5 == -1) {
			for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
				Static88.aBooleanArray8[local16] = true;
			}
		} else {
			Static88.aBooleanArray8[arg5] = true;
		}
	}
}

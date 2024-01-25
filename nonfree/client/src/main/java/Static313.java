import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!s", name = "N", descriptor = "Lclient!kh;")
	public static Class126 aClass126_5;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "I")
	public static int anInt5728;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "[I")
	public static int[] anIntArray502;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "[Lclient!mt;")
	public static Class1_Sub2[] aClass1_Sub2Array3;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "[I")
	public static final int[] anIntArray503 = new int[4096];

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	public static int anInt5735 = 2;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!oj;B)V")
	public static void method5076(@OriginalArg(0) Class48 arg0) {
		if (Static214.aBoolean313) {
			Static336.method5410(arg0);
		} else {
			Static162.method2879(arg0);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!qo;B)V")
	public static void method5078(@OriginalArg(0) Class1_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(10) Class2_Sub41 local10 = (Class2_Sub41) Static126.aClass238_8.method5795(); local10 != null; local10 = (Class2_Sub41) Static126.aClass238_8.method5799()) {
			if (local10.aClass1_Sub2_Sub1_Sub2_1 == arg0) {
				if (local10.aClass2_Sub11_Sub2_3 != null) {
					Static192.aClass2_Sub11_Sub4_1.method4879(local10.aClass2_Sub11_Sub2_3);
					local10.aClass2_Sub11_Sub2_3 = null;
				}
				local10.method6130();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!v;")
	public static Class1_Sub5 method5079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub5_1;
	}
}

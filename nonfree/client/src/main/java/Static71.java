import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt1616;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
	public static final int[] anIntArray155 = new int[1000];

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!um;")
	public static final Class204 aClass204_2 = new Class204();

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt1618 = 0;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "S")
	public static short aShort35 = 320;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1354() {
		Static282.anInt5713 = 0;
		Static248.aClass130_112.method3514();
		Static173.aBoolean319 = false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!vm;Lclient!ai;III)V")
	public static void method1356(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class57 local12;
		if (arg3 < Static151.anInt3338) {
			local12 = Static18.aClass57ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass2_Sub5_1 != null && local12.aClass2_Sub5_1.method5411()) {
				arg1.method5406(true, 0, 128, local12.aClass2_Sub5_1, 0, arg0);
			}
		}
		if (arg4 < Static151.anInt3338) {
			local12 = Static18.aClass57ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub5_1 != null && local12.aClass2_Sub5_1.method5411()) {
				arg1.method5406(true, 0, 0, local12.aClass2_Sub5_1, 128, arg0);
			}
		}
		if (arg3 < Static151.anInt3338 && arg4 < Static220.anInt4569) {
			local12 = Static18.aClass57ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass2_Sub5_1 != null && local12.aClass2_Sub5_1.method5411()) {
				arg1.method5406(true, 0, 128, local12.aClass2_Sub5_1, 128, arg0);
			}
		}
		if (arg3 < Static151.anInt3338 && arg4 > 0) {
			local12 = Static18.aClass57ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass2_Sub5_1 != null && local12.aClass2_Sub5_1.method5411()) {
				arg1.method5406(true, 0, 128, local12.aClass2_Sub5_1, -128, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)Lclient!hk;")
	public static Class4_Sub1_Sub9 method1357(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub1_Sub9 local15 = (Class4_Sub1_Sub9) Static159.aClass15_6.method356((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static256.aClass11_110.method288(arg0 & 0x7FFF, 0);
		} else {
			local30 = Static322.aClass11_143.method288(arg0, 0);
		}
		local15 = new Class4_Sub1_Sub9();
		if (local30 != null) {
			local15.method2118(new Class4_Sub7(local30));
		}
		if (arg0 >= 32768) {
			local15.method2123();
		}
		Static159.aClass15_6.method352((long) arg0, local15);
		return local15;
	}
}

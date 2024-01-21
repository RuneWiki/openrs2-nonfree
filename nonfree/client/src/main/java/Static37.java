import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!sg;")
	private static Class77 aClass77_420 = Static146.method2172("Loading config )2 ");

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!sg;")
	private static Class77 aClass77_421 = Static146.method2172("Please try again)3");

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Lclient!sg;")
	public static Class77 aClass77_422 = Static146.method2172(":chalreq:");

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Lclient!sg;")
	public static Class77 aClass77_423 = aClass77_421;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Lclient!sg;")
	public static Class77 aClass77_424 = Static146.method2172("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Lclient!sg;")
	public static Class77 aClass77_425 = aClass77_420;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
	public static boolean method742(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public static void method743() {
		aClass77_425 = null;
		aClass77_420 = null;
		aClass77_422 = null;
		aClass77_421 = null;
		aClass77_424 = null;
		anIntArray175 = null;
		aClass77_423 = null;
		anIntArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qf;IIIIIBI)V")
	public static void method744(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static125.aBoolean121) {
			Static24.anInt730 = 32;
		} else {
			Static24.anInt730 = 0;
		}
		Static125.aBoolean121 = false;
		@Pc(139) int local139;
		if (Static31.anInt887 != 0) {
			if (arg2 >= arg1 && arg2 < arg1 + 16 && arg3 <= arg5 && arg5 < arg3 + 16) {
				arg0.anInt3189 -= 4;
				Static57.method2994(arg0);
			} else if (arg2 >= arg1 && arg1 + 16 > arg2 && arg5 >= arg3 + arg6 - 16 && arg5 < arg3 + arg6) {
				arg0.anInt3189 += 4;
				Static57.method2994(arg0);
			} else if (arg1 - Static24.anInt730 <= arg2 && arg2 < Static24.anInt730 + arg1 + 16 && arg5 >= arg3 + 16 && arg5 < arg3 + arg6 - 16) {
				local139 = (arg6 - 32) * arg6 / arg4;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(157) int local157 = arg5 - local139 / 2 - arg3 - 16;
				@Pc(164) int local164 = arg6 - local139 - 32;
				arg0.anInt3189 = (arg4 - arg6) * local157 / local164;
				Static57.method2994(arg0);
				Static125.aBoolean121 = true;
			}
		}
		if (Static100.anInt800 == 0) {
			return;
		}
		local139 = arg0.anInt3227;
		if (arg1 - local139 <= arg2 && arg5 >= arg3 && arg2 < arg1 + 16 && arg5 <= arg6 + arg3) {
			arg0.anInt3189 += Static100.anInt800 * 45;
			Static57.method2994(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public static int method745(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!sc;")
	public static Class57 method746(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class57_Sub1");
			@Pc(15) Class57 local15 = (Class57) local11.getDeclaredConstructor().newInstance();
			local15.method2173(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class57_Sub2 local28 = new Class57_Sub2();
			local28.method2173(arg1, arg0, arg2);
			return local28;
		}
	}
}

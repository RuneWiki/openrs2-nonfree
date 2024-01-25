import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public static int anInt3930;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "[I")
	public static int[] anIntArray772;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString47 = null;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "[I")
	public static final int[] anIntArray773 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg2) {
			Static132.method2589(arg1, arg3, arg5, arg0, arg2, arg6);
		} else if (arg6 - arg2 >= Static243.anInt4326 && Static235.anInt4193 >= arg6 + arg2 && Static138.anInt932 <= arg3 - arg4 && arg3 + arg4 <= Static40.anInt818) {
			Static148.method2764(arg0, arg2, arg3, arg6, arg1, arg4, arg5);
		} else {
			Static91.method2263(arg2, arg0, arg5, arg4, arg1, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(CI)Z")
	public static boolean method3609(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Lclient!ct;")
	public static Class2_Sub10_Sub2 method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub10_Sub2 local20 = (Class2_Sub10_Sub2) Static280.aClass246_25.method5613((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class2_Sub10_Sub2(arg1, arg0);
			Static280.aClass246_25.method5609(local20, local20.aLong209);
		}
		return local20;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method3612() {
		if (Static269.aClass85_2 != null) {
			Static269.aClass85_2.method4215();
		}
		if (Static156.aClass85_1 != null) {
			Static156.aClass85_1.method4215();
		}
		Static9.method195(Static343.aBoolean422);
		Static269.aClass85_2 = Static296.method4433(Static359.aClass111_5, Static257.aCanvas4, 22050, 0);
		Static269.aClass85_2.method4226(Static389.aClass2_Sub2_Sub4_43);
		Static156.aClass85_1 = Static296.method4433(Static359.aClass111_5, Static257.aCanvas4, 2048, 1);
		Static156.aClass85_1.method4226(Static324.aClass2_Sub2_Sub1_2);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBILclient!to;I)V")
	public static void method3613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub40 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg0 << 28 | arg3 << 14);
		@Pc(22) Class2_Sub28 local22 = (Class2_Sub28) Static94.aClass246_6.method5613(local16);
		if (local22 == null) {
			local22 = new Class2_Sub28();
			Static94.aClass246_6.method5609(local22, local16);
			local22.aClass30_31.method685(arg2);
			return;
		}
		@Pc(45) Class179 local45 = Static15.aClass81_1.method2175(arg2.anInt5732);
		@Pc(48) int local48 = local45.anInt4433;
		if (local45.anInt4421 == 1) {
			local48 *= arg2.anInt5736 + 1;
		}
		for (@Pc(75) Class2_Sub40 local75 = (Class2_Sub40) local22.aClass30_31.method694(); local75 != null; local75 = (Class2_Sub40) local22.aClass30_31.method682()) {
			local45 = Static15.aClass81_1.method2175(local75.anInt5732);
			@Pc(86) int local86 = local45.anInt4433;
			if (local45.anInt4421 == 1) {
				local86 *= local75.anInt5736 + 1;
			}
			if (local86 < local48) {
				Static367.method5421(local75, arg2);
				return;
			}
		}
		local22.aClass30_31.method685(arg2);
	}
}

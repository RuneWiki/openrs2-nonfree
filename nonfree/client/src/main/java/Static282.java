import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Lclient!pl;")
	public static Class259 aClass259_85;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!th;")
	public static Class319 aClass319_2;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_5 = new Class258("WTI", 5);

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
	public static final int[] anIntArray344 = new int[8];

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
	public static final int[] anIntArray345 = new int[1];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public static int method4202() {
		return 19;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
	public static boolean method4203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static530.method7283(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static513.method7130(arg0, arg1) | Static24.method442(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static421.method6463(arg1, arg0) | Static360.method5407(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIZII)V")
	public static void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static553.anInt9074 <= arg0 && Static249.anInt4668 >= arg1 && arg3 >= Static326.anInt6028 && arg4 <= Static80.anInt1738) {
			Static371.method5504(arg1, arg3, arg5, arg4, arg6, arg2, arg0);
		} else {
			Static292.method4379(arg2, arg4, arg1, arg6, arg0, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIII)V")
	public static void method4206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(10, arg2);
		local8.method6098();
		local8.anInt7261 = arg0;
		local8.anInt7256 = arg1;
		local8.anInt7258 = arg3;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public static void method4207() {
		@Pc(15) int local15 = Static72.aClass2_Sub12_Sub1_1.method1430(Static391.anInt6846);
		if (local15 == 0) {
			Static143.aByteArrayArrayArray50 = null;
			Static25.method446(0);
		} else if (local15 == 1) {
			Static398.method7277((byte) 0);
			Static25.method446(512);
			if (Static521.aByteArrayArrayArray45 != null) {
				Static372.method5514();
			}
		} else {
			Static398.method7277((byte) (Static485.anInt8225 - 4 & 0xFF));
			Static25.method446(2);
		}
		Static469.anInt8019 = Static566.anInt9278;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BII)Z")
	public static boolean method4208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}

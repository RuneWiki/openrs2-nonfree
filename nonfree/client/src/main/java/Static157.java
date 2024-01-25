import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!jr", name = "X", descriptor = "Lclient!tj;")
	public static Class193 aClass193_58;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
	public static int anInt3360 = 0;

	@OriginalMember(owner = "client!jr", name = "W", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IB)Lclient!vi;")
	public static Class4_Sub4_Sub21 method3056(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub21 local10 = (Class4_Sub4_Sub21) Static108.aClass124_2.method3525((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static264.aClass193_103.method5047(11, arg0);
		local10 = new Class4_Sub4_Sub21();
		if (local20 != null) {
			local10.method5436(new Class4_Sub11(local20));
		}
		Static108.aClass124_2.method3528(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	public static void method3057() {
		@Pc(12) Class198 local12 = Static32.aClass198_32;
		synchronized (Static32.aClass198_32) {
			Static32.aClass198_32.method5213();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIB)Ljava/lang/String;")
	public static String method3058(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(77) int local77 = local67 - arg0 * 10;
			if (local77 >= 10) {
				local50[local58] = (char) (local77 + 87);
			} else {
				local50[local58] = (char) (local77 + 48);
			}
		}
		return new String(local50);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
	public static int method3059(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

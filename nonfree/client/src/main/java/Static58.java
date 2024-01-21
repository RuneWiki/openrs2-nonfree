import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 aClass2_Sub3_Sub2_Sub4_Sub1_4;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 aClass2_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_8;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Lclient!ai;")
	private static Class6 aClass6_425 = Static38.method685("New User");

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!ai;")
	public static Class6 aClass6_422 = aClass6_425;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "J")
	public static volatile long aLong81 = 0L;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "Lclient!ai;")
	private static Class6 aClass6_423 = Static38.method685("Login server offline)3");

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
	public static int[] anIntArray97 = new int[100];

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	public static final int anInt1478 = 0;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_424 = aClass6_423;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIIIILclient!me;I)V")
	public static void method953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub13 arg5, @OriginalArg(7) int arg6) {
		@Pc(39) int local39;
		if (arg4 < 0 || arg4 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local39 = arg5.method1402();
				if (local39 == 0) {
					return;
				}
				if (local39 == 1) {
					arg5.method1402();
					return;
				}
				if (local39 <= 49) {
					arg5.method1402();
				}
			}
			return;
		}
		Static164.aByteArrayArrayArray7[arg1][arg4][arg6] = 0;
		while (true) {
			local39 = arg5.method1402();
			if (local39 == 0) {
				if (arg1 == 0) {
					Static165.anIntArrayArrayArray10[0][arg4][arg6] = -Static88.method1474(arg6 + arg0 + 556238, arg3 + 932731 - -arg4) * 8;
					return;
				} else {
					Static165.anIntArrayArrayArray10[arg1][arg4][arg6] = Static165.anIntArrayArrayArray10[arg1 - 1][arg4][arg6] - 240;
					return;
				}
			}
			if (local39 == 1) {
				@Pc(99) int local99 = arg5.method1402();
				if (local99 == 1) {
					local99 = 0;
				}
				if (arg1 == 0) {
					Static165.anIntArrayArrayArray10[0][arg4][arg6] = -local99 * 8;
					return;
				}
				Static165.anIntArrayArrayArray10[arg1][arg4][arg6] = Static165.anIntArrayArrayArray10[arg1 - 1][arg4][arg6] - local99 * 8;
				return;
			}
			if (local39 <= 49) {
				Static92.aByteArrayArrayArray5[arg1][arg4][arg6] = arg5.method1394();
				Static16.aByteArrayArrayArray1[arg1][arg4][arg6] = (byte) ((local39 - 2) / 4);
				Static72.aByteArrayArrayArray4[arg1][arg4][arg6] = (byte) (arg2 + local39 - 2 & 0x3);
			} else if (local39 <= 81) {
				Static164.aByteArrayArrayArray7[arg1][arg4][arg6] = (byte) (local39 - 49);
			} else {
				Static138.aByteArrayArrayArray6[arg1][arg4][arg6] = (byte) (local39 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public static void method954() {
		aByteArrayArray4 = null;
		aClass10_Sub1_8 = null;
		aClass2_Sub3_Sub2_Sub1_2 = null;
		aClass6_425 = null;
		aClass6_424 = null;
		aClass2_Sub3_Sub2_Sub4_Sub1_4 = null;
		aClass6_422 = null;
		aClass2_Sub3_Sub2_Sub3Array2 = null;
		aClass6_423 = null;
		anIntArray97 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lclient!ai;)Lclient!ai;")
	public static Class6 method956(@OriginalArg(1) Class6[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static171.method2713(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	public static void method957() {
		if (Static160.aClass41_2 != null) {
			Static160.aClass41_2.method1512();
		}
		if (Static138.aClass41_3 != null) {
			Static138.aClass41_3.method1512();
		}
	}
}

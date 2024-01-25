import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "Lclient!vc;")
	public static Class63 aClass63_4;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[S")
	public static final short[] aShortArray42 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_50 = new Class11(46, 16);

	@OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!id", name = "H", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_38 = new Class32(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method2660() {
		Static83.aClass4Array2 = null;
		Static349.method4158(0, -1, Static253.anInt4467, 0, 0, Static234.anInt4158, 0, Static362.anInt6102);
		if (Static83.aClass4Array2 != null) {
			Static204.method3470(Static253.anInt4467, -1412584499, Static362.anInt6102, Static74.anInt1437, 0, Static102.aClass4_11.anInt90, 0, Static10.anInt5866, Static83.aClass4Array2);
			Static83.aClass4Array2 = null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILclient!ip;Lclient!ip;)V")
	public static void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2 arg3, @OriginalArg(4) Class1_Sub2 arg4) {
		@Pc(4) Class251 local4 = Static377.method4610(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub2_2 = arg3;
			local4.aClass1_Sub2_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILclient!fo;IIBILclient!fo;)V")
	public static void method2663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class1_Sub5_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class1_Sub5_Sub1 arg6) {
		@Pc(7) int local7 = arg2.method5551();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class18 local21 = (Class18) Static167.aClass160_49.method3599((long) local7);
		if (local21 == null) {
			@Pc(28) Class86[] local28 = Static397.method2332(Static263.aClass171_64, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static111.aClass63_3.method2000(local28[0]);
			Static167.aClass160_49.method3602((long) local7, local21);
		}
		Static46.method795(0, arg6.anInt6390, arg6.method5547() * 64, arg3 >> 1, arg6.aByte69, arg6.anInt6386, arg5 >> 1);
		@Pc(75) int local75 = arg1 + Static355.anIntArray1252[0] - 18;
		@Pc(85) int local85 = Static355.anIntArray1252[1] + arg4 - 16 - 54;
		@Pc(93) int local93 = local75 + arg0 / 4 * 18;
		@Pc(101) int local101 = local85 + arg0 % 4 * 18;
		local21.method4558(local93, local101);
		if (arg2 == arg6) {
			Static111.aClass63_3.method2027(18, 18, local93 - 1, -256, local101 - 1);
		}
		@Pc(131) Class10_Sub4 local131 = Static379.method5520();
		local131.anInt2785 = local93;
		local131.anInt2788 = local101 + 16;
		local131.aClass1_Sub5_Sub1_1 = arg2;
		local131.anInt2791 = local93 + 16;
		local131.anInt2787 = local101;
		Static303.aClass154_7.method3481(local131);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I")
	public static int method2664(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}
}

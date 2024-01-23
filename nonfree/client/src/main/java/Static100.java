import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!sf;")
	public static Class159 aClass159_3;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "[Lclient!hg;")
	public static Class3_Sub4_Sub11[] aClass3_Sub4_Sub11Array2 = new Class3_Sub4_Sub11[14];

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
	public static int[] anIntArray184 = new int[2];

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString75 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[Lclient!qg;")
	public static Class87_Sub1[] aClass87_Sub1Array1 = new Class87_Sub1[0];

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public static int anInt1839 = 0;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "I")
	public static int anInt1840 = 0;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Z")
	public static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static245.method4932(arg0)) {
			Static42.method624(Static96.aClass151ArrayArray1[arg0], -1, arg6, arg5, arg4, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!rn;BLclient!rn;)V")
	public static void method1604(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class155 arg1) {
		Static280.aClass155_89 = arg1;
		Static311.aClass155_123 = arg0;
		Static311.aClass155_123.method4131(36);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)[B")
	public static byte[] method1605(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub19 local13 = (Class3_Sub4_Sub19) Static297.aClass33_3.method828((long) arg0);
		if (local13 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			@Pc(31) int local31;
			for (local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (local31 = 0; local31 < 255; local31++) {
				@Pc(54) int local54 = 255 - local31;
				@Pc(59) int local59 = Static276.method4529(local54, local29);
				@Pc(63) byte local63 = local23[local59];
				local23[local59] = local23[local54];
				local23[local54] = local23[511 - local31] = local63;
			}
			local13 = new Class3_Sub4_Sub19(local23);
			Static297.aClass33_3.method827(local13, (long) arg0);
		}
		return local13.aByteArray48;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg1 < 1 || arg5 > 102 || arg1 > 102) {
			return;
		}
		@Pc(41) int local41;
		if (!Static208.method3462() && (Static41.aByteArrayArrayArray2[0][arg5][arg1] & 0x2) == 0) {
			local41 = arg3;
			if ((Static41.aByteArrayArrayArray2[arg3][arg5][arg1] & 0x8) != 0) {
				local41 = 0;
			}
			if (Static187.anInt3700 != local41) {
				return;
			}
		}
		local41 = arg3;
		if (arg3 < 3 && (Static41.aByteArrayArrayArray2[1][arg5][arg1] & 0x2) == 2) {
			local41 = arg3 + 1;
		}
		Static206.method3434(arg3, arg5, local41, Static138.aClass153Array1[arg3], arg0, arg1);
		if (arg6 >= 0) {
			@Pc(92) boolean local92 = Static201.aBoolean280;
			Static201.aBoolean280 = true;
			Static54.method839(arg6, arg2, false, arg1, local41, arg3, arg5, false, arg4, Static138.aClass153Array1[arg3]);
			Static201.aBoolean280 = local92;
		}
	}
}

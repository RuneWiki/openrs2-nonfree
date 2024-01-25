import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!ij;")
	public static Class93 aClass93_107;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "[S")
	public static final short[] aShortArray93 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public static int anInt5470 = 1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method4844(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static269.anInt5289 > 0) {
			local19 = Static254.aByteArrayArray17[--Static269.anInt5289];
			Static254.aByteArrayArray17[Static269.anInt5289] = null;
			return local19;
		} else if (arg0 == 5000 && Static62.anInt1096 > 0) {
			local19 = Static41.aByteArrayArray1[--Static62.anInt1096];
			Static41.aByteArrayArray1[Static62.anInt1096] = null;
			return local19;
		} else if (arg0 == 30000 && Static153.anInt2978 > 0) {
			local19 = Static261.aByteArrayArray18[--Static153.anInt2978];
			Static261.aByteArrayArray18[Static153.anInt2978] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
	public static void method4845(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub1_Sub2 local13 = Static166.method3027(arg0, 12);
		local13.method856();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ij;Ljava/lang/String;Z)Lclient!ep;")
	public static Class64 method4846(@OriginalArg(1) Class93 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.method2393(arg1);
		if (local8 == -1) {
			return new Class64(0);
		}
		@Pc(22) int[] local22 = arg0.method2420(local8);
		@Pc(34) Class64 local34 = new Class64(local22.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt1473) {
				@Pc(51) Class5_Sub12 local51 = new Class5_Sub12(arg0.method2410(local22[local38++], local8));
				@Pc(57) int local57 = local51.method5067();
				@Pc(61) int local61 = local51.method5106();
				@Pc(65) int local65 = local51.method5115();
				if (!arg2 && local65 == 1) {
					local34.anInt1473--;
				} else {
					local34.anIntArray122[local36] = local57;
					local34.anIntArray123[local36] = local61;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method4847() {
		Static241.aClass97_1 = new Class97(8);
		Static144.anInt2846 = 0;
		for (@Pc(17) Class32_Sub7 local17 = (Class32_Sub7) Static233.aClass39_5.method806(); local17 != null; local17 = (Class32_Sub7) Static233.aClass39_5.method808()) {
			local17.method4962();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public static int anInt3908;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public static int anInt3905 = 0;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public static int anInt3906 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class6_Sub3 local13 = local7.aClass6_Sub3_1;
		@Pc(16) Class6_Sub3 local16 = local7.aClass6_Sub3_2;
		if (local13 != null) {
			local13.anInt7307 = local13.anInt7307 * arg3 / (0x10 << Static372.anInt7558 - 7);
			local13.anInt7302 = local13.anInt7302 * arg3 / (0x10 << Static372.anInt7558 - 7);
		}
		if (local16 != null) {
			local16.anInt7307 = local16.anInt7307 * arg3 / (0x10 << Static372.anInt7558 - 7);
			local16.anInt7302 = local16.anInt7302 * arg3 / (0x10 << Static372.anInt7558 - 7);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!tl;B)V")
	public static void method2944(@OriginalArg(0) Class4_Sub30 arg0) {
		@Pc(9) int local9 = arg0.method4844();
		Static422.aClass214Array1 = new Class214[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static422.aClass214Array1[local14] = new Class214();
			Static422.aClass214Array1[local14].anInt6360 = arg0.method4844();
			Static422.aClass214Array1[local14].aString59 = arg0.method4847();
		}
		Static355.anInt6373 = arg0.method4844();
		Static230.anInt4220 = arg0.method4844();
		Static218.anInt3837 = arg0.method4844();
		Static230.aClass84_Sub1Array2 = new Class84_Sub1[Static230.anInt4220 + 1 - Static355.anInt6373];
		for (@Pc(67) int local67 = 0; local67 < Static218.anInt3837; local67++) {
			@Pc(73) int local73 = arg0.method4844();
			@Pc(81) Class84_Sub1 local81 = Static230.aClass84_Sub1Array2[local73] = new Class84_Sub1();
			local81.anInt6827 = arg0.method4864();
			local81.anInt6822 = arg0.method4872();
			local81.anInt6832 = Static355.anInt6373 + local73;
			local81.aString65 = arg0.method4847();
			local81.aString66 = arg0.method4847();
		}
		Static154.anInt2952 = arg0.method4872();
		Static398.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI[BIILclient!bv;I)Lclient!og;")
	public static Class1_Sub3_Sub1 method2945(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class30_Sub1 arg3) {
		if (arg3.aBoolean62 || Static315.method4350(arg0) && Static315.method4350(arg2)) {
			return new Class1_Sub3_Sub1(arg3, 3553, 6406, arg0, arg2, false, arg1, 6406);
		} else if (arg3.aBoolean68) {
			return new Class1_Sub3_Sub1(arg3, 34037, 6406, arg0, arg2, false, arg1, 6406);
		} else {
			return new Class1_Sub3_Sub1(arg3, 6406, arg0, arg2, Static183.method2711(arg0), Static183.method2711(arg2), arg1, 6406);
		}
	}
}

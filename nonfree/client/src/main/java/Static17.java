import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "Lclient!fc;")
	public static Class73 aClass73_3;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_2 = new Class136("", 11);

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "Z")
	public static final boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "[I")
	public static int[] anIntArray51 = new int[2];

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "[I")
	public static final int[] anIntArray52 = new int[13];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!vt;)V")
	public static void method377(@OriginalArg(1) Class2_Sub24 arg0) {
		@Pc(9) int local9 = arg0.method5722();
		Static345.aClass198Array1 = new Class198[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static345.aClass198Array1[local14] = new Class198();
			Static345.aClass198Array1[local14].anInt5529 = arg0.method5722();
			Static345.aClass198Array1[local14].aString53 = arg0.method5757();
		}
		Static392.anInt7143 = arg0.method5722();
		Static23.anInt351 = arg0.method5722();
		Static189.anInt637 = arg0.method5722();
		Static266.aClass35_Sub1Array2 = new Class35_Sub1[Static23.anInt351 + 1 - Static392.anInt7143];
		for (@Pc(65) int local65 = 0; local65 < Static189.anInt637; local65++) {
			@Pc(71) int local71 = arg0.method5722();
			@Pc(79) Class35_Sub1 local79 = Static266.aClass35_Sub1Array2[local71] = new Class35_Sub1();
			local79.anInt5026 = arg0.method5732();
			local79.anInt5023 = arg0.method5776();
			local79.anInt5032 = Static392.anInt7143 + local71;
			local79.aString47 = arg0.method5757();
			local79.aString48 = arg0.method5757();
		}
		Static375.anInt6899 = arg0.method5776();
		Static108.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!rs;IIII)V")
	public static void method378(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static212.method3828(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static176.anInt3742) {
			Static212.method3828(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static212.method3828(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static285.anInt5263) {
			Static212.method3828(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static285.anInt5263) {
			Static212.method3828(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static176.anInt3742 && arg4 <= Static285.anInt5263) {
			Static212.method3828(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static212.method3828(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static176.anInt3742 && arg4 > 0) {
			Static212.method3828(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)S")
	public static short method379(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(42) int local42 = local19 + local37;
		@Pc(51) int local51;
		if (local42 == 0) {
			local51 = local37 << 1;
		} else {
			local51 = (local37 << 8) / local42;
		}
		return (short) (local9 << 10 | local51 >> 4 << 7 | local42);
	}
}

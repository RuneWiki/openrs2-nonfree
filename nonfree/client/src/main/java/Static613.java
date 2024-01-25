import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "Lclient!wia;")
	public static Class386 aClass386_127;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Lclient!in;")
	public static Class168 aClass168_12;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
	public static int anInt10338;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
	public static int anInt10339;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "[I")
	public static int[] anIntArray754;

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB[S)[S")
	public static short[] method8610(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static681.method2475(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!je;II)V")
	public static void method8614(@OriginalArg(0) Class12_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class12_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11000;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11000 > local27 + (local29 & 0x1)) {
				@Pc(44) Class12_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method8614(arg0, arg1, local10 - 1);
		method8614(arg0, local10 + 1, arg2);
	}
}

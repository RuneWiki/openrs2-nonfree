import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_85 = new Class289(54, 4);

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[128][128];

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_86 = new Class289(83, -1);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILclient!wc;Lclient!wc;)V")
	public static void method5185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3, @OriginalArg(4) Class2_Sub1_Sub2 arg4) {
		@Pc(4) Class351 local4 = Static31.method714(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub1_Sub2_2 = arg3;
		local4.aClass2_Sub1_Sub2_1 = arg4;
		@Pc(19) int local19 = Static289.aClass12Array3 == Static68.aClass12Array2 ? 1 : 0;
		if (!arg3.method8447()) {
			arg3.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local19];
			Static512.aClass2_Sub1Array4[local19] = arg3;
		} else if (arg3.method8446()) {
			arg3.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local19];
			Static643.aClass2_Sub1Array5[local19] = arg3;
		} else {
			arg3.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local19];
			Static229.aClass2_Sub1Array2[local19] = arg3;
			Static119.aBoolean126 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8447()) {
			if (arg4.method8446()) {
				arg4.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local19];
				Static643.aClass2_Sub1Array5[local19] = arg4;
				return;
			}
			arg4.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local19];
			Static229.aClass2_Sub1Array2[local19] = arg4;
			Static119.aBoolean126 = true;
			return;
		}
		arg4.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local19];
		Static512.aClass2_Sub1Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
	public static int method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static161.anIntArrayArray14 == null ? 0 : Static161.anIntArrayArray14[arg0][arg1] & 0xFFFFFF;
	}
}

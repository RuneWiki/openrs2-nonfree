import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_244 = new Class359(79, 10);

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
	public static final int[] anIntArray599 = new int[3];

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "[S")
	public static short[] aShortArray157 = new short[256];

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Z")
	public static boolean aBoolean895 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8764(@OriginalArg(0) Class65 arg0) {
		if (Static493.aBoolean702) {
			Static341.method5194(arg0);
		} else {
			Static596.method2934(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V")
	public static void method8765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(14) int local14 = arg3 + arg5;
		for (@Pc(16) int local16 = arg5; local16 < local14; local16++) {
			Static197.method3240(arg4, Static16.anIntArrayArray2[local16], arg0, arg1);
		}
		@Pc(35) int local35 = arg0 + arg3;
		@Pc(39) int local39 = arg4 - arg3;
		for (@Pc(41) int local41 = arg2; local41 > local10; local41--) {
			Static197.method3240(arg4, Static16.anIntArrayArray2[local41], arg0, arg1);
		}
		for (@Pc(61) int local61 = local14; local61 <= local10; local61++) {
			@Pc(73) int[] local73 = Static16.anIntArrayArray2[local61];
			Static197.method3240(local35, local73, arg0, arg1);
			Static197.method3240(arg4, local73, local39, arg1);
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public static int method8766() {
		return Static471.aClass352_41.method8255();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!gd;[I[II)Lclient!lm;")
	public static Class1_Sub2 method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class65_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg1.method4359(Static67.aClass339_4, Static120.aClass89_7)) {
			@Pc(74) int[] local74 = new int[arg0 * arg4];
			for (local24 = 0; local24 < arg4; local24++) {
				local34 = arg0 * local24 + arg3[local24];
				for (local36 = 0; local36 < arg2[local24]; local36++) {
					local74[local34++] = -16777216;
				}
			}
			return new Class1_Sub2(arg1, arg0, arg4, local74);
		}
		@Pc(22) byte[] local22 = new byte[arg4 * arg0];
		for (local24 = 0; local24 < arg4; local24++) {
			local34 = arg0 * local24 + arg3[local24];
			for (local36 = 0; local36 < arg2[local24]; local36++) {
				local22[local34++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg0, arg4, local22);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)Z")
	public static boolean method8768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}

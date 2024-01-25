import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "Lclient!dda;")
	public static Class53 aClass53_32;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!qa;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
	public static int anInt1992;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIB[I[ILclient!kw;)Lclient!qf;")
	public static Class209_Sub2 method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class39_Sub2 arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg4.method6103(Static268.aClass171_10, Static160.aClass150_3)) {
			@Pc(66) int[] local66 = new int[arg1 * arg0];
			for (local23 = 0; local23 < arg0; local23++) {
				local34 = arg1 * local23 + arg3[local23];
				for (local36 = 0; local36 < arg2[local23]; local36++) {
					local66[local34++] = -16777216;
				}
			}
			return new Class209_Sub2(arg4, arg1, arg0, local66);
		}
		@Pc(21) byte[] local21 = new byte[arg1 * arg0];
		for (local23 = 0; local23 < arg0; local23++) {
			local34 = arg1 * local23 + arg3[local23];
			for (local36 = 0; local36 < arg2[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class209_Sub2(arg4, arg1, arg0, local21);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIII)V")
	public static void method1933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static7.anInt8119 && arg0 + arg1 <= Static34.anInt603 && arg3 - arg1 >= Static328.anInt6154 && arg3 + arg1 <= Static394.anInt7462) {
			Static248.method3943(arg3, arg0, arg2, arg1);
		} else {
			Static206.method3296(arg3, arg0, arg2, arg1);
		}
	}
}

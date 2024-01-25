import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!go;")
	public static Class115_Sub1 aClass115_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_1 = new Class261("", 14);

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "[I")
	public static final int[] anIntArray37 = new int[1000];

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIII)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static542.method7335(arg0);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg0 - arg4;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(28) int local28 = arg0;
		@Pc(31) int local31 = -arg0;
		@Pc(33) int local33 = local19;
		@Pc(36) int local36 = -local19;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static454.anIntArrayArray71[arg2];
		@Pc(49) int local49 = arg3 - local19;
		Static208.method3687(arg3 - arg0, arg5, local44, local49);
		@Pc(62) int local62 = local19 + arg3;
		Static208.method3687(local49, arg1, local44, local62);
		Static208.method3687(local62, arg5, local44, arg3 + arg0);
		while (local14 < local28) {
			local38 += 2;
			local40 += 2;
			local31 += local38;
			local36 += local40;
			if (local36 >= 0 && local33 >= 1) {
				Static147.anIntArray692[local33] = local14;
				local33--;
				local36 -= local33 << 1;
			}
			local14++;
			@Pc(129) int[] local129;
			@Pc(136) int[] local136;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				if (local19 > local28) {
					local129 = Static454.anIntArrayArray71[local28 + arg2];
					local136 = Static454.anIntArrayArray71[arg2 - local28];
					local140 = Static147.anIntArray692[local28];
					local144 = local14 + arg3;
					local149 = arg3 - local14;
					local154 = arg3 + local140;
					local158 = arg3 - local140;
					Static208.method3687(local149, arg5, local129, local158);
					Static208.method3687(local158, arg1, local129, local154);
					Static208.method3687(local154, arg5, local129, local144);
					Static208.method3687(local149, arg5, local136, local158);
					Static208.method3687(local158, arg1, local136, local154);
					Static208.method3687(local154, arg5, local136, local144);
				} else {
					local129 = Static454.anIntArrayArray71[local28 + arg2];
					local136 = Static454.anIntArrayArray71[arg2 - local28];
					local140 = local14 + arg3;
					local144 = arg3 - local14;
					Static208.method3687(local144, arg5, local129, local140);
					Static208.method3687(local144, arg5, local136, local140);
				}
			}
			local129 = Static454.anIntArrayArray71[arg2 + local14];
			local136 = Static454.anIntArrayArray71[arg2 - local14];
			local140 = arg3 + local28;
			local144 = arg3 - local28;
			if (local19 > local14) {
				local149 = local14 <= local33 ? local33 : Static147.anIntArray692[local14];
				local154 = local149 + arg3;
				local158 = arg3 - local149;
				Static208.method3687(local144, arg5, local129, local158);
				Static208.method3687(local158, arg1, local129, local154);
				Static208.method3687(local154, arg5, local129, local140);
				Static208.method3687(local144, arg5, local136, local158);
				Static208.method3687(local158, arg1, local136, local154);
				Static208.method3687(local154, arg5, local136, local140);
			} else {
				Static208.method3687(local144, arg5, local129, local140);
				Static208.method3687(local144, arg5, local136, local140);
			}
		}
	}
}

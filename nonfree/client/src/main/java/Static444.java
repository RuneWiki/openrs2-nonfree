import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "[Lclient!rja;")
	public static Class324[] aClass324Array1;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_47 = new Class85(4);

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	public static int anInt7209 = -1;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZ[II[Ljava/lang/String;)V")
	public static void method6504(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg0) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) String local25 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg0; local51++) {
			if (local25 == null || arg3[local51] != null && arg3[local51].compareTo(local25) < (local51 & 0x1)) {
				@Pc(82) String local82 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21] = local82;
				@Pc(96) int local96 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local96;
			}
		}
		arg3[arg0] = arg3[local21];
		arg3[local21] = local25;
		arg1[arg0] = arg1[local21];
		arg1[local21] = local39;
		method6504(local21 - 1, arg1, arg2, arg3);
		method6504(arg0, arg1, local21 + 1, arg3);
	}
}

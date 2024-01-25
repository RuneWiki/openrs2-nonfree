import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_69 = new Class109();

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[I")
	public static int[] anIntArray660 = new int[1];

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	public static final int[] anIntArray661 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZII)Z")
	public static boolean method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg1; local16++) {
				if (Static559.anIntArrayArray63[local12][local16] == arg0 && Static544.anIntArrayArray65[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Ljava/lang/String;I[SII)V")
	public static void method8063(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(27) int local27 = (arg1 + arg3) / 2;
		@Pc(29) int local29 = arg1;
		@Pc(33) String local33 = arg0[local27];
		arg0[local27] = arg0[arg3];
		arg0[arg3] = local33;
		@Pc(47) short local47 = arg2[local27];
		arg2[local27] = arg2[arg3];
		arg2[arg3] = local47;
		for (@Pc(59) int local59 = arg1; local59 < arg3; local59++) {
			if (local33 == null || arg0[local59] != null && arg0[local59].compareTo(local33) < (local59 & 0x1)) {
				@Pc(80) String local80 = arg0[local59];
				arg0[local59] = arg0[local29];
				arg0[local29] = local80;
				@Pc(94) short local94 = arg2[local59];
				arg2[local59] = arg2[local29];
				arg2[local29++] = local94;
			}
		}
		arg0[arg3] = arg0[local29];
		arg0[local29] = local33;
		arg2[arg3] = arg2[local29];
		arg2[local29] = local47;
		method8063(arg0, arg1, arg2, local29 - 1);
		method8063(arg0, local29 + 1, arg2, arg3);
	}
}

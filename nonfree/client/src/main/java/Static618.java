import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_131 = new Class100(47, -1);

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	public static final int[] anIntArray763 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BIIIIB)Z")
	public static boolean method8664(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg3 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg0 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg3 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg1[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local21;
			if (arg1[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[I[ILclient!pj;II)Lclient!cca;")
	public static Class1_Sub1 method8668(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class137_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (!arg2.method8087(Static202.aClass363_3, Static47.aClass36_5)) {
			@Pc(72) int[] local72 = new int[arg3 * arg4];
			for (local26 = 0; local26 < arg3; local26++) {
				local36 = arg0[local26] + local26 * arg4;
				for (local38 = 0; local38 < arg1[local26]; local38++) {
					local72[local36++] = -16777216;
				}
			}
			return new Class1_Sub1(arg2, arg4, arg3, local72);
		}
		@Pc(24) byte[] local24 = new byte[arg3 * arg4];
		for (local26 = 0; local26 < arg3; local26++) {
			local36 = arg4 * local26 + arg0[local26];
			for (local38 = 0; local38 < arg1[local26]; local38++) {
				local24[local36++] = -1;
			}
		}
		return new Class1_Sub1(arg2, arg4, arg3, local24);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[II[Ljava/lang/String;I)V")
	public static void method8670(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) String local25 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local25;
		@Pc(39) int local39 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg3; local51++) {
			if (local25 == null || arg2[local51] != null && (local51 & 0x1) > arg2[local51].compareTo(local25)) {
				@Pc(76) String local76 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local76;
				@Pc(90) int local90 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21++] = local90;
			}
		}
		arg2[arg3] = arg2[local21];
		arg2[local21] = local25;
		arg0[arg3] = arg0[local21];
		arg0[local21] = local39;
		method8670(arg0, arg1, arg2, local21 - 1);
		method8670(arg0, local21 + 1, arg2, arg3);
	}
}

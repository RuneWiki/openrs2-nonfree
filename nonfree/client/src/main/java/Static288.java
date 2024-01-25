import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "Lclient!lca;")
	public static final Class203 aClass203_11 = new Class203(3);

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_151 = new Class235(86, 8);

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "Lclient!hga;")
	public static final Class137 aClass137_2 = new Class137(16);

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "Lclient!kda;")
	public static final Class185 aClass185_3 = new Class185();

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_21 = new Class187(16);

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "[I")
	public static final int[] anIntArray389 = new int[8];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIIIII)Z")
	public static boolean method4082(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static371.anInt6168 < arg3) {
			arg3 = Static371.anInt6168;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 <= arg4) {
			return true;
		}
		arg2 += arg4 * arg5;
		arg1 += arg4 - 1;
		@Pc(42) int local42 = arg3 - arg4 >> 2;
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(71) int local71;
		if (Static444.anInt5044 == 1) {
			Static286.anInt8220 += local42;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg3 - arg4 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg1++;
						if (arg0[arg1] > arg2) {
							arg0[arg1] = arg2;
						}
						arg2 += arg5;
					}
				}
				local56 = ~arg2;
				local58 = arg1 + 1;
				if (local56 > ~arg0[local58]) {
					arg0[local58] = arg2;
				}
				local71 = arg2 + arg5;
				local58++;
				if (arg0[local58] > local71) {
					arg0[local58] = local71;
				}
				local71 += arg5;
				local58++;
				if (local71 < arg0[local58]) {
					arg0[local58] = local71;
				}
				local71 += arg5;
				arg1 = local58 + 1;
				if (local71 < arg0[arg1]) {
					arg0[arg1] = local71;
				}
				arg2 = local71 + arg5;
			}
		} else {
			arg2 -= 15360;
			while (true) {
				local42--;
				if (local42 < 0) {
					local42 = arg3 - arg4 & 0x3;
					while (true) {
						local42--;
						if (local42 < 0) {
							return true;
						}
						arg1++;
						if (arg2 < arg0[arg1]) {
							return false;
						}
						arg2 += arg5;
					}
				}
				local58 = arg1 + 1;
				if (arg0[local58] > arg2) {
					return false;
				}
				local71 = arg2 + arg5;
				local58++;
				if (arg0[local58] > local71) {
					return false;
				}
				local71 += arg5;
				local56 = ~local71;
				local58++;
				if (local56 > ~arg0[local58]) {
					return false;
				}
				local71 += arg5;
				local56 = ~local71;
				arg1 = local58 + 1;
				if (local56 > ~arg0[arg1]) {
					return false;
				}
				arg2 = local71 + arg5;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!ke;")
	public static Class137 aClass137_4 = new Class137(64);

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_6 = new Class186(69, 0);

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
	public static int[] anIntArray32 = new int[2];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BIIIB)Z")
	public static boolean method331(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub15 local12 = new Class6_Sub15(arg1);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method3083();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method3090();
					if (local34 == 0) {
						continue label56;
					}
					local26 += local34 - 1;
					@Pc(58) int local58 = local26 & 0x3F;
					@Pc(64) int local64 = local26 >> 6 & 0x3F;
					@Pc(70) int local70 = local12.method3111() >> 2;
					@Pc(74) int local74 = arg0 + local64;
					@Pc(79) int local79 = local58 + arg3;
					if (local74 > 0 && local79 > 0 && local74 < arg2 - 1 && local79 < arg4 - 1) {
						@Pc(102) Class118 local102 = Static113.aClass127_2.method2820(local14);
						if (local70 != 22 || Static8.aClass173_Sub1_1.aBoolean302 || local102.anInt2984 != 0 || local102.anInt2978 == 1 || local102.aBoolean213) {
							if (!local102.method2720()) {
								Static371.anInt6173++;
								local7 = false;
							}
							local28 = true;
						}
					}
				}
				local34 = local12.method3090();
				if (local34 == 0) {
					break;
				}
				local12.method3111();
			}
		}
	}
}

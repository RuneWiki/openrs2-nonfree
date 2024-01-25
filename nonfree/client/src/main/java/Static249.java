import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!uj;")
	public static final Class242 aClass242_3 = new Class242();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	public static void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		Static23.method323(Static283.anIntArrayArray30[arg2], arg1, arg4, arg0);
		@Pc(17) int local17 = arg3 - 1;
		Static23.method323(Static283.anIntArrayArray30[arg3], arg1, arg4, arg0);
		for (@Pc(33) int local33 = local8; local33 <= local17; local33++) {
			@Pc(39) int[] local39 = Static283.anIntArrayArray30[local33];
			local39[arg1] = local39[arg0] = arg4;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!tp;)V")
	public static void method3577(@OriginalArg(0) Class47_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort104; local2 <= arg0.aShort107; local2++) {
			for (@Pc(6) int local6 = arg0.aShort105; local6 <= arg0.aShort106; local6++) {
				@Pc(16) Class137 local16 = Static131.aClass137ArrayArrayArray2[arg0.aByte97][local2][local6];
				if (local16 != null) {
					@Pc(21) Class167 local21 = local16.aClass167_1;
					@Pc(23) Class167 local23 = null;
					while (local21 != null) {
						if (local21.aClass47_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass167_1 = local21.aClass167_2;
							} else {
								local23.aClass167_2 = local21.aClass167_2;
							}
							local21.method3611();
							break;
						}
						local23 = local21;
						local21 = local21.aClass167_2;
					}
					local16.aByte47 = 0;
					for (@Pc(56) Class167 local56 = local16.aClass167_1; local56 != null; local56 = local56.aClass167_2) {
						local16.aByte47 = (byte) (local16.aByte47 | local56.anInt4346);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)V")
	public static void method3586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class241 local9 = Static237.aClass241ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static298.anInt4991 = local9.anInt7152;
			Static130.anInt4554 = local9.anInt7149;
			Static139.anInt2523 = local9.anInt7148;
		}
		Static401.method5480();
	}
}

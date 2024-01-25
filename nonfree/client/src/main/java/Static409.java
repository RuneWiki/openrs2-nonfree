import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
	public static void method5963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class4_Sub1_Sub5 local14 = local7.aClass4_Sub1_Sub5_2;
		@Pc(17) Class4_Sub1_Sub5 local17 = local7.aClass4_Sub1_Sub5_1;
		if (local14 != null) {
			local14.aShort107 = (short) (local14.aShort107 * arg3 / (0x10 << Static314.anInt5377 - 7));
			local14.aShort106 = (short) (local14.aShort106 * arg3 / (0x10 << Static314.anInt5377 - 7));
		}
		if (local17 != null) {
			local17.aShort107 = (short) (local17.aShort107 * arg3 / (0x10 << Static314.anInt5377 - 7));
			local17.aShort106 = (short) (local17.aShort106 * arg3 / (0x10 << Static314.anInt5377 - 7));
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5964(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static177.aClass84Array2 != Static77.aClass84Array1) {
			@Pc(12) int local12 = Static668.aClass84Array4[arg1].method7625(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class84 local19 = Static668.aClass84Array4[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7625(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7619(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method5965(@OriginalArg(1) int arg0) {
		Static81.anInt1432 = 100;
		Static396.anInt6671 = 3;
		Static284.anInt5035 = -1;
		Static557.anInt8788 = arg0;
	}
}

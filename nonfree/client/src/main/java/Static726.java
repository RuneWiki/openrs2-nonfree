import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static726 {

	@OriginalMember(owner = "client!za", name = "p", descriptor = "I")
	public static int anInt11312;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_201 = new Class186(6, -2);

	@OriginalMember(owner = "client!za", name = "k", descriptor = "[I")
	public static final int[] anIntArray641 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!za", name = "o", descriptor = "Lclient!iga;")
	public static final Class169 aClass169_12 = new Class169("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ILclient!ha;Lclient!dr;B)V")
	public static void method9447(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) Class79 arg2) {
		@Pc(26) int local26;
		if (Static406.anIntArray390 != null && arg2.aByte36 >= arg0) {
			for (local26 = 0; local26 < Static406.anIntArray390.length; local26++) {
				if (Static406.anIntArray390[local26] != -1000000 && (Static406.anIntArray390[local26] >= arg2.anIntArray118[0] || Static406.anIntArray390[local26] >= arg2.anIntArray118[1] || arg2.anIntArray118[2] <= Static406.anIntArray390[local26] || arg2.anIntArray118[3] <= Static406.anIntArray390[local26]) && (arg2.anIntArray116[0] <= Static404.anIntArray389[local26] || arg2.anIntArray116[1] <= Static404.anIntArray389[local26] || arg2.anIntArray116[2] <= Static404.anIntArray389[local26] || Static404.anIntArray389[local26] >= arg2.anIntArray116[3]) && (arg2.anIntArray116[0] >= Static407.anIntArray392[local26] || arg2.anIntArray116[1] >= Static407.anIntArray392[local26] || arg2.anIntArray116[2] >= Static407.anIntArray392[local26] || Static407.anIntArray392[local26] <= arg2.anIntArray116[3]) && (Static395.anIntArray383[local26] >= arg2.anIntArray117[0] || Static395.anIntArray383[local26] >= arg2.anIntArray117[1] || Static395.anIntArray383[local26] >= arg2.anIntArray117[2] || Static395.anIntArray383[local26] >= arg2.anIntArray117[3]) && (Static512.anIntArray476[local26] <= arg2.anIntArray117[0] || arg2.anIntArray117[1] >= Static512.anIntArray476[local26] || arg2.anIntArray117[2] >= Static512.anIntArray476[local26] || Static512.anIntArray476[local26] <= arg2.anIntArray117[3])) {
					return;
				}
			}
		}
		@Pc(321) int local321;
		@Pc(342) int local342;
		@Pc(365) boolean local365;
		@Pc(400) float local400;
		if (arg2.aByte35 == 1) {
			local26 = arg2.aShort17 + anInt11312 - Static296.anInt3655;
			if (local26 >= 0 && local26 <= anInt11312 + anInt11312) {
				local321 = arg2.aShort16 + anInt11312 - Static450.anInt7928;
				if (local321 < 0) {
					local321 = 0;
				} else if (anInt11312 + anInt11312 < local321) {
					return;
				}
				local342 = anInt11312 + arg2.aShort18 - Static450.anInt7928;
				if (anInt11312 + anInt11312 < local342) {
					local342 = anInt11312 + anInt11312;
				} else if (local342 < 0) {
					return;
				}
				local365 = false;
				while (local321 <= local342) {
					if (Static624.aBooleanArrayArray7[local26][local321++]) {
						local365 = true;
						break;
					}
				}
				if (local365) {
					local400 = (float) (Static148.anInt2796 - arg2.anIntArray116[0]);
					if (local400 < 0.0F) {
						local400 *= -1.0F;
					}
					if (!local400 < (float) Static84.anInt1285 && (Static210.method3118(0, arg2) && (Static210.method3118(1, arg2) && (Static210.method3118(2, arg2) && Static210.method3118(3, arg2))))) {
						Static406.aClass79Array2[Static505.anInt8623++] = arg2;
					}
				}
			}
		} else if (arg2.aByte35 == 2) {
			local26 = arg2.aShort16 + anInt11312 - Static450.anInt7928;
			if (local26 >= 0 && anInt11312 + anInt11312 >= local26) {
				local321 = anInt11312 + arg2.aShort17 - Static296.anInt3655;
				if (local321 < 0) {
					local321 = 0;
				} else if (local321 > anInt11312 + anInt11312) {
					return;
				}
				local342 = anInt11312 + arg2.aShort19 - Static296.anInt3655;
				if (local342 > anInt11312 + anInt11312) {
					local342 = anInt11312 + anInt11312;
				} else if (local342 < 0) {
					return;
				}
				local365 = false;
				while (local321 <= local342) {
					if (Static624.aBooleanArrayArray7[local321++][local26]) {
						local365 = true;
						break;
					}
				}
				if (local365) {
					local400 = (float) (Static355.anInt6022 - arg2.anIntArray117[0]);
					if (local400 < 0.0F) {
						local400 *= -1.0F;
					}
					if (!(local400 < (float) Static84.anInt1285) && (Static210.method3118(0, arg2) && (Static210.method3118(1, arg2) && (Static210.method3118(2, arg2) && Static210.method3118(3, arg2))))) {
						Static406.aClass79Array2[Static505.anInt8623++] = arg2;
					}
				}
			}
		} else if (arg2.aByte35 == 16 || arg2.aByte35 == 8) {
			local26 = arg2.aShort17 + anInt11312 - Static296.anInt3655;
			if (local26 >= 0 && local26 <= anInt11312 + anInt11312) {
				local321 = arg2.aShort16 + anInt11312 - Static450.anInt7928;
				if (local321 >= 0 && anInt11312 + anInt11312 >= local321 && Static624.aBooleanArrayArray7[local26][local321]) {
					@Pc(693) float local693 = (float) (Static148.anInt2796 - arg2.anIntArray116[0]);
					if (local693 < 0.0F) {
						local693 *= -1.0F;
					}
					@Pc(709) float local709 = (float) (Static355.anInt6022 - arg2.anIntArray117[0]);
					if (local709 < 0.0F) {
						local709 *= -1.0F;
					}
					if ((!(local693 < (float) Static84.anInt1285) || !((float) Static84.anInt1285 > local709)) && (Static210.method3118(0, arg2) && (Static210.method3118(1, arg2) && (Static210.method3118(2, arg2) && Static210.method3118(3, arg2))))) {
						Static406.aClass79Array2[Static505.anInt8623++] = arg2;
					}
				}
			}
		} else if (arg2.aByte35 == 4) {
			@Pc(783) float local783 = (float) (arg2.anIntArray118[0] - Static628.anInt10147);
			if (!((float) Static87.anInt1440 >= local783)) {
				local321 = arg2.aShort16 + anInt11312 - Static450.anInt7928;
				if (local321 < 0) {
					local321 = 0;
				} else if (local321 > anInt11312 + anInt11312) {
					return;
				}
				local342 = anInt11312 + arg2.aShort18 - Static450.anInt7928;
				if (anInt11312 + anInt11312 < local342) {
					local342 = anInt11312 + anInt11312;
				} else if (local342 < 0) {
					return;
				}
				@Pc(852) int local852 = anInt11312 + arg2.aShort17 - Static296.anInt3655;
				if (local852 < 0) {
					local852 = 0;
				} else if (local852 > anInt11312 + anInt11312) {
					return;
				}
				@Pc(880) int local880 = arg2.aShort19 + anInt11312 - Static296.anInt3655;
				if (local880 > anInt11312 + anInt11312) {
					local880 = anInt11312 + anInt11312;
				} else if (local880 < 0) {
					return;
				}
				@Pc(901) boolean local901 = false;
				label283: for (@Pc(903) int local903 = local852; local903 <= local880; local903++) {
					for (@Pc(909) int local909 = local321; local909 <= local342; local909++) {
						if (Static624.aBooleanArrayArray7[local903][local909]) {
							local901 = true;
							break label283;
						}
					}
				}
				if (local901 && (Static210.method3118(0, arg2) && (Static210.method3118(1, arg2) && (Static210.method3118(2, arg2) && Static210.method3118(3, arg2))))) {
					Static406.aClass79Array2[Static505.anInt8623++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public static void method9448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static454.anInt8007 = arg2;
		Static59.anInt933 = arg3;
		Static139.anInt2623 = arg5;
		Static530.anInt8963 = arg1;
		Static147.anInt2788 = arg4;
		Static714.anInt11139 = arg0;
	}
}

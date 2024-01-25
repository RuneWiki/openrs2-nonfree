import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!mt;")
	public static final Class164 aClass164_37 = new Class164(8);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!cr;[[BI)V")
	public static void method5093(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt1034; local18++) {
			Static330.method4331();
			for (@Pc(26) int local26 = 0; local26 < Static333.anInt3375 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static102.anInt2086 >> 3; local30++) {
					@Pc(40) int local40 = Static17.anIntArrayArrayArray1[local18][local26][local30];
					if (local40 != -1) {
						@Pc(49) int local49 = local40 >> 24 & 0x3;
						if (!arg0.aBoolean64 || local49 == 0) {
							@Pc(63) int local63 = local40 >> 1 & 0x3;
							@Pc(69) int local69 = local40 >> 14 & 0x3FF;
							@Pc(75) int local75 = local40 >> 3 & 0x7FF;
							@Pc(85) int local85 = (local69 / 8 << 8) + local75 / 8;
							for (@Pc(87) int local87 = 0; local87 < Static331.anIntArray494.length; local87++) {
								if (Static331.anIntArray494[local87] == local85 && arg1[local87] != null) {
									@Pc(109) Class7_Sub14 local109 = new Class7_Sub14(arg1[local87]);
									arg0.method797(local18, local63, local30 * 8, local75, local109, local49, local26 * 8, local69, Static179.aClass70Array3);
									arg0.method813(local69, local49, Static269.aClass51_9, local63, local12[0] == -1 ? local12 : null, local18, local75, local30 * 8, local109, local26 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static37.aClass196_1 = Static439.aClass255_1.method5273(local12[1], local12[2], local12[0], local12[3], Static411.aClass217_1);
			Static269.anInt4579 = local12[4];
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method5094(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static141.anInt2685 > 0) {
			local18 = Static139.aByteArrayArray7[--Static141.anInt2685];
			Static139.aByteArrayArray7[Static141.anInt2685] = null;
			return local18;
		} else if (arg0 == 5000 && Static336.anInt5455 > 0) {
			local18 = Static226.aByteArrayArray15[--Static336.anInt5455];
			Static226.aByteArrayArray15[Static336.anInt5455] = null;
			return local18;
		} else if (arg0 == 30000 && Static248.anInt4237 > 0) {
			local18 = Static3.aByteArrayArray2[--Static248.anInt4237];
			Static3.aByteArrayArray2[Static248.anInt4237] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}

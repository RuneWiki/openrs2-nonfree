import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_15 = new Class85(5);

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_36 = new Class349(87, 1);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ha;ZIILclient!oh;IILclient!aa;I)V")
	public static void method1844(@OriginalArg(0) Class145 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class273 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class259 local15 = Static117.aClass196_2.method4194(arg1);
		if (local15 == null || !local15.aBoolean581 || !local15.method6247(Static396.aClass107_1)) {
			return;
		}
		@Pc(41) int local41;
		if (local15.anIntArray497 != null) {
			@Pc(39) int[] local39 = new int[local15.anIntArray497.length];
			@Pc(66) int local66;
			@Pc(70) int local70;
			for (local41 = 0; local41 < local39.length / 2; local41++) {
				@Pc(53) int local53;
				if (Static60.anInt1040 == 4) {
					local53 = (int) Static213.aFloat46 & 0x3FFF;
				} else {
					local53 = Static91.anInt1623 + (int) Static213.aFloat46 & 0x3FFF;
				}
				local66 = Class145_Sub1.anIntArray761[local53];
				local70 = Class145_Sub1.anIntArray760[local53];
				if (Static60.anInt1040 != 4) {
					local70 = local70 * 256 / (Static505.anInt8017 + 256);
					local66 = local66 * 256 / (Static505.anInt8017 + 256);
				}
				local39[local41 * 2] = arg5 + arg3.anInt7402 / 2 + ((arg7 + local15.anIntArray497[local41 * 2 + 1] * 4) * local66 + (local15.anIntArray497[local41 * 2] * 4 + arg2) * local70 >> 14);
				local39[local41 * 2 + 1] = arg4 + arg3.anInt7385 / 2 - ((arg7 + local15.anIntArray497[local41 * 2 + 1] * 4) * local70 - local66 * (local15.anIntArray497[local41 * 2] * 4 + arg2) >> 14);
			}
			@Pc(189) Class114 local189 = arg3.method6608(arg0);
			if (local189 != null) {
				Static244.method3446(arg0, local39, local15.anInt6975, local189.anIntArray216, local189.anIntArray215);
			}
			if (local15.anInt6961 <= 0) {
				for (local66 = 0; local66 < local39.length / 2 - 1; local66++) {
					arg0.method9682(local39[local66 * 2], local39[local66 * 2 + 1], local39[(local66 + 1) * 2], local39[local66 * 2 + 2 + 1], local15.anIntArray498[local15.aByteArray89[local66] & 0xFF], arg6, arg5, arg4);
				}
				arg0.method9682(local39[local39.length - 2], local39[local39.length - 1], local39[0], local39[1], local15.anIntArray498[local15.aByteArray89[local15.aByteArray89.length - 1] & 0xFF], arg6, arg5, arg4);
			} else {
				@Pc(330) int local330;
				@Pc(338) int local338;
				@Pc(348) int local348;
				@Pc(363) int local363;
				@Pc(373) int local373;
				for (local66 = 0; local66 < local39.length / 2 - 1; local66++) {
					local70 = local39[local66 * 2];
					local330 = local39[local66 * 2 + 1];
					local338 = local39[(local66 + 1) * 2];
					local348 = local39[(local66 + 1) * 2 + 1];
					if (local338 < local70) {
						local363 = local70;
						local373 = local330;
						local70 = local338;
						local338 = local363;
						local330 = local348;
						local348 = local373;
					} else if (local70 == local338 && local348 < local330) {
						local363 = local330;
						local330 = local348;
						local348 = local363;
					}
					arg0.method9704(local70, local330, local338, local348, local15.anIntArray498[local15.aByteArray89[local66] & 0xFF], arg6, arg5, arg4, local15.anInt6961, local15.anInt6947, local15.anInt6950);
				}
				local70 = local39[local39.length - 2];
				local330 = local39[local39.length - 1];
				local338 = local39[0];
				local348 = local39[1];
				if (local338 < local70) {
					local363 = local70;
					local373 = local330;
					local70 = local338;
					local338 = local363;
					local330 = local348;
					local348 = local373;
				} else if (local338 == local70 && local330 > local348) {
					local363 = local330;
					local330 = local348;
					local348 = local363;
				}
				arg0.method9704(local70, local330, local338, local348, local15.anIntArray498[local15.aByteArray89[local15.aByteArray89.length - 1] & 0xFF], arg6, arg5, arg4, local15.anInt6961, local15.anInt6947, local15.anInt6950);
			}
		}
		@Pc(515) Class43 local515 = null;
		if (local15.anInt6954 != -1) {
			local515 = local15.method6256(arg0, false);
			if (local515 != null) {
				Static433.method8699(arg6, arg5, arg4, arg3, arg2, local515, arg7);
			}
		}
		if (local15.aString75 == null) {
			return;
		}
		local41 = 0;
		if (local515 != null) {
			local41 = local515.method9592();
		}
		@Pc(550) Class68 local550 = Static435.aClass68_11;
		@Pc(552) Class289 local552 = Static607.aClass289_17;
		if (local15.anInt6983 == 1) {
			local550 = Static61.aClass68_1;
			local552 = Static175.aClass289_18;
		}
		if (local15.anInt6983 == 2) {
			local550 = Static387.aClass68_12;
			local552 = Static277.aClass289_8;
		}
		Static496.method7084(local550, local552, local15.anInt6978, arg3, arg4, arg2, local15.aString75, local41, arg5, arg7, arg6);
		return;
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	public static void method1845() {
		Static424.aClass218_28.method5097();
		Static131.aClass60_42.method1223();
		if (Static626.aBoolean824) {
			Static538.aShort115 = Static238.aShort55;
			Static323.aShort61 = Static479.aShort103;
			Static626.aBoolean824 = false;
			Static8.aShort1 = Static263.aShort57;
			Static353.aShort131 = Static367.aShort70;
		}
		Static578.aClass15Array1 = null;
		Static566.aClass42Array1 = null;
		Static73.aClass256Array1 = null;
		Static173.anInt2989 = 0;
		Static199.aClass61Array1 = null;
		Static486.aClass398Array1 = null;
		Static495.anInt7937 = 1;
		Static154.anInt2554 = 0;
	}
}

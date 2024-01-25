import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_4 = new Class370(7, 2);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public static void method5246(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static407.aClass5_Sub2_Sub18_2 != null) {
			Static271.anInt4278 = Static407.aClass5_Sub2_Sub18_2.anInt7674;
		} else {
			Static271.anInt4278 = -1;
		}
		Static8.anInt166 = 0;
		Static413.aClass394_4 = null;
		Static407.aClass5_Sub2_Sub18_2 = null;
		Static653.aClass124_104 = null;
		Static407.method5500();
		Static407.aClass124_66.method2567();
		Static189.aClass170_19 = null;
		Static158.anInt2662 = -1;
		Static486.aClass170_45 = null;
		Static435.aClass170_40 = null;
		Static180.aClass170_18 = null;
		Static238.aClass170_22 = null;
		Static188.aClass59_6 = null;
		Static407.aClass79_2 = null;
		Static524.aClass170_39 = null;
		Static511.aClass170_51 = null;
		Static120.aClass170_10 = null;
		Static195.anInt3145 = -1;
		if (Static407.aClass218_3 != null) {
			Static407.aClass218_3.method5158();
			Static407.aClass218_3.method5157(128, 64);
		}
		if (Static407.aClass161_3 != null) {
			Static407.aClass161_3.method3449(64, 64);
		}
		if (Static407.aClass140_3 != null) {
			Static407.aClass140_3.method2846(64);
		}
		Static480.aClass298_2.method7197(64);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method5247() {
		if (!Static386.aBoolean482) {
			return;
		}
		@Pc(11) Class394 local11 = Static622.method7590(Static537.anInt10359, Static404.anInt6945);
		if (local11 != null && local11.anObjectArray29 != null) {
			@Pc(20) Class5_Sub28 local20 = new Class5_Sub28();
			local20.aClass394_2 = local11;
			local20.anObjectArray2 = local11.anObjectArray29;
			Static497.method7205(local20);
		}
		Static386.aBoolean482 = false;
		Static669.anInt10434 = -1;
		Static54.anInt8558 = -1;
		if (local11 != null) {
			Static609.method8190(local11);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method5248() {
		@Pc(14) boolean local14 = Static386.aClass5_Sub15_Sub2_2.method3646() == 1;
		@Pc(18) int local18 = Static386.aClass5_Sub15_Sub2_2.method3667();
		Static566.anInt9293 = Static386.aClass5_Sub15_Sub2_2.method3655();
		@Pc(26) int local26 = Static386.aClass5_Sub15_Sub2_2.method3637();
		@Pc(30) int local30 = Static386.aClass5_Sub15_Sub2_2.method3637();
		Static11.method175();
		Static544.method7522(local18);
		Static386.aClass5_Sub15_Sub2_2.method3701();
		@Pc(45) int local45;
		@Pc(48) int local48;
		@Pc(54) int local54;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local45 = 0; local45 < Static124.anInt2150 >> 3; local45++) {
				for (local48 = 0; local48 < Static64.anInt1015 >> 3; local48++) {
					local54 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
					if (local54 == 1) {
						Static301.anIntArrayArrayArray5[local42][local45][local48] = Static386.aClass5_Sub15_Sub2_2.method3702(26);
					} else {
						Static301.anIntArrayArrayArray5[local42][local45][local48] = -1;
					}
				}
			}
		}
		Static386.aClass5_Sub15_Sub2_2.method3710();
		local45 = (Static139.anInt2291 - Static386.aClass5_Sub15_Sub2_2.anInt4144) / 16;
		Static636.anIntArrayArray87 = new int[local45][4];
		for (local48 = 0; local48 < local45; local48++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static636.anIntArrayArray87[local48][local54] = Static386.aClass5_Sub15_Sub2_2.method3671();
			}
		}
		Static490.aByteArrayArray19 = null;
		Static640.anIntArray588 = new int[local45];
		Static517.anIntArray477 = new int[local45];
		Static373.aByteArrayArray15 = new byte[local45][];
		Static286.anIntArray263 = new int[local45];
		Static249.anIntArray245 = new int[local45];
		Static620.aByteArrayArray22 = new byte[local45][];
		Static155.aByteArrayArray8 = new byte[local45][];
		Static336.aByteArrayArray11 = new byte[local45][];
		Static655.anIntArray596 = null;
		Static235.anIntArray236 = new int[local45];
		local45 = 0;
		for (local54 = 0; local54 < 4; local54++) {
			for (@Pc(176) int local176 = 0; local176 < Static124.anInt2150 >> 3; local176++) {
				for (@Pc(179) int local179 = 0; local179 < Static64.anInt1015 >> 3; local179++) {
					@Pc(188) int local188 = Static301.anIntArrayArrayArray5[local54][local176][local179];
					if (local188 != -1) {
						@Pc(197) int local197 = local188 >> 14 & 0x3FF;
						@Pc(203) int local203 = local188 >> 3 & 0x7FF;
						@Pc(213) int local213 = (local197 / 8 << 8) + local203 / 8;
						for (@Pc(215) int local215 = 0; local215 < local45; local215++) {
							if (local213 == Static249.anIntArray245[local215]) {
								local213 = -1;
								break;
							}
						}
						if (local213 != -1) {
							Static249.anIntArray245[local45] = local213;
							@Pc(249) int local249 = local213 >> 8 & 0xFF;
							@Pc(253) int local253 = local213 & 0xFF;
							Static640.anIntArray588[local45] = Static570.aClass50_162.method900("m" + local249 + "_" + local253);
							Static235.anIntArray236[local45] = Static570.aClass50_162.method900("l" + local249 + "_" + local253);
							Static517.anIntArray477[local45] = Static570.aClass50_162.method900("um" + local249 + "_" + local253);
							Static286.anIntArray263[local45] = Static570.aClass50_162.method900("ul" + local249 + "_" + local253);
							local45++;
						}
					}
				}
			}
		}
		Static505.method7281(local14, local30, 11, local26);
	}
}

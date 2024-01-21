import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "W", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_56 = Static187.method3089("");

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_57 = Static187.method3089("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_58 = Static187.method3089("Hidden)2use");

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "[I")
	public static final int[] anIntArray15 = new int[128];

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_1 = new Class47(64);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!vd;)Z")
	public static boolean method119(@OriginalArg(1) Class92 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static103.anInt2229; local16++) {
			if (arg0.method3241(Static75.aClass92Array13[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	public static void method120() {
		@Pc(10) int local10 = Static18.aClass1_Sub14_Sub1_2.method3070(8);
		@Pc(15) int local15;
		if (local10 < Static35.anInt992) {
			for (local15 = local10; local15 < Static35.anInt992; local15++) {
				Static38.anIntArray80[Static158.anInt3294++] = Static111.anIntArray181[local15];
			}
		}
		if (Static35.anInt992 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static35.anInt992 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(57) int local57 = Static111.anIntArray181[local15];
			@Pc(61) Class8_Sub3_Sub1 local61 = Static47.aClass8_Sub3_Sub1Array1[local57];
			@Pc(68) int local68 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			if (local68 == 0) {
				Static111.anIntArray181[Static35.anInt992++] = local57;
				local61.anInt3595 = Static155.anInt2981;
			} else {
				@Pc(91) int local91 = Static18.aClass1_Sub14_Sub1_2.method3070(2);
				if (local91 == 0) {
					Static111.anIntArray181[Static35.anInt992++] = local57;
					local61.anInt3595 = Static155.anInt2981;
					Static111.anIntArray183[Static147.anInt2991++] = local57;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static111.anIntArray181[Static35.anInt992++] = local57;
						local61.anInt3595 = Static155.anInt2981;
						local138 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local61.method2677(false, local138);
						local148 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
						if (local148 == 1) {
							Static111.anIntArray183[Static147.anInt2991++] = local57;
						}
					} else if (local91 == 2) {
						Static111.anIntArray181[Static35.anInt992++] = local57;
						local61.anInt3595 = Static155.anInt2981;
						local138 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local61.method2677(true, local138);
						local148 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local61.method2677(true, local148);
						@Pc(204) int local204 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
						if (local204 == 1) {
							Static111.anIntArray183[Static147.anInt2991++] = local57;
						}
					} else if (local91 == 3) {
						Static38.anIntArray80[Static158.anInt3294++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public static int method121(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method122(@OriginalArg(0) Class8_Sub3 arg0) {
		if (arg0.anInt3597 == 0) {
			return;
		}
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (arg0.anInt3582 != -1 && arg0.anInt3582 < 32768) {
			@Pc(29) Class8_Sub3_Sub2 local29 = Static177.aClass8_Sub3_Sub2Array1[arg0.anInt3582];
			if (local29 != null) {
				local37 = arg0.anInt3600 - local29.anInt3600;
				local44 = arg0.anInt3606 - local29.anInt3606;
				if (local37 != 0 || local44 != 0) {
					arg0.anInt3577 = (int) (Math.atan2((double) local37, (double) local44) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt3582 >= 32768) {
			local72 = arg0.anInt3582 - 32768;
			if (local72 == Static32.anInt769) {
				local72 = 2047;
			}
			@Pc(85) Class8_Sub3_Sub1 local85 = Static47.aClass8_Sub3_Sub1Array1[local72];
			if (local85 != null) {
				local44 = arg0.anInt3600 - local85.anInt3600;
				@Pc(101) int local101 = arg0.anInt3606 - local85.anInt3606;
				if (local44 != 0 || local101 != 0) {
					arg0.anInt3577 = (int) (Math.atan2((double) local44, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3587 != 0 || arg0.anInt3603 != 0) && (arg0.anInt3578 == 0 || arg0.anInt3567 > 0)) {
			local37 = arg0.anInt3606 - (arg0.anInt3603 - Static138.anInt2800 - Static138.anInt2800) * 64;
			local72 = arg0.anInt3600 - (arg0.anInt3587 - Static100.anInt2141 - Static100.anInt2141) * 64;
			if (local72 != 0 || local37 != 0) {
				arg0.anInt3577 = (int) (Math.atan2((double) local72, (double) local37) * 325.949D) & 0x7FF;
			}
			arg0.anInt3587 = 0;
			arg0.anInt3603 = 0;
		}
		local72 = arg0.anInt3577 - arg0.anInt3611 & 0x7FF;
		if (local72 == 0) {
			arg0.anInt3585 = 0;
			return;
		}
		arg0.anInt3585++;
		@Pc(224) boolean local224;
		if (local72 > 1024) {
			arg0.anInt3611 -= arg0.anInt3597;
			local224 = true;
			if (local72 < arg0.anInt3597 || 2048 - arg0.anInt3597 < local72) {
				arg0.anInt3611 = arg0.anInt3577;
				local224 = false;
			}
			if (arg0.anInt3616 == arg0.anInt3574 && (arg0.anInt3585 > 25 || local224)) {
				if (arg0.anInt3601 == -1) {
					arg0.anInt3616 = arg0.anInt3610;
				} else {
					arg0.anInt3616 = arg0.anInt3601;
				}
			}
		} else {
			local224 = true;
			arg0.anInt3611 += arg0.anInt3597;
			if (arg0.anInt3597 > local72 || 2048 - arg0.anInt3597 < local72) {
				local224 = false;
				arg0.anInt3611 = arg0.anInt3577;
			}
			if (arg0.anInt3616 == arg0.anInt3574 && (arg0.anInt3585 > 25 || local224)) {
				if (arg0.anInt3571 == -1) {
					arg0.anInt3616 = arg0.anInt3610;
				} else {
					arg0.anInt3616 = arg0.anInt3571;
				}
			}
		}
		arg0.anInt3611 &= 0x7FF;
	}
}

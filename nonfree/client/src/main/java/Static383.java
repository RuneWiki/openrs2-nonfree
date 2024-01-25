import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_8 = new Class295(11, 2);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method5512(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) String local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) short local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (local25 == null || arg0[local51] != null && arg0[local51].compareTo(local25) < (local51 & 0x1)) {
				@Pc(76) String local76 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local76;
				@Pc(90) short local90 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local90;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method5512(arg0, local21 - 1, arg2, arg3);
		method5512(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public static void method5513() {
		for (@Pc(3) int local3 = 0; local3 < Static386.anInt6908; local3++) {
			@Pc(9) int local9 = Static423.anIntArray444[local3];
			@Pc(17) Class11_Sub1_Sub1_Sub3_Sub2 local17 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) local9)).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			@Pc(21) int local21 = Static158.aClass1_Sub3_Sub1_2.method7974();
			if ((local21 & 0x40) != 0) {
				local21 += Static158.aClass1_Sub3_Sub1_2.method7974() << 8;
			}
			@Pc(47) int local47;
			if ((local21 & 0x1000) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7946();
				local17.anInt7581 = Static158.aClass1_Sub3_Sub1_2.method7931();
				local17.anInt7534 = Static158.aClass1_Sub3_Sub1_2.method7943();
				local17.aBoolean576 = (local47 & 0x8000) != 0;
				local17.anInt7550 = local47 & 0x7FFF;
				local17.lb = local17.anInt7581 + Static518.anInt9331 + local17.anInt7550;
			}
			@Pc(100) int[] local100;
			@Pc(103) int[] local103;
			@Pc(108) int local108;
			@Pc(114) int local114;
			if ((local21 & 0x800) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7931();
				local100 = new int[local47];
				local103 = new int[local47];
				@Pc(106) int[] local106 = new int[local47];
				for (local108 = 0; local108 < local47; local108++) {
					local114 = Static158.aClass1_Sub3_Sub1_2.method7946();
					if (local114 == 65535) {
						local114 = -1;
					}
					local100[local108] = local114;
					local103[local108] = Static158.aClass1_Sub3_Sub1_2.method7943();
					local106[local108] = Static158.aClass1_Sub3_Sub1_2.method7945();
				}
				Static258.method3757(local17, local100, local106, local103);
			}
			@Pc(161) int local161;
			@Pc(172) int local172;
			if ((local21 & 0x4000) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7945();
				local161 = Static158.aClass1_Sub3_Sub1_2.method7928();
				if (local47 == 65535) {
					local47 = -1;
				}
				local172 = Static158.aClass1_Sub3_Sub1_2.method7938();
				local17.method6059(local47, local172, local161, true);
			}
			if ((local21 & 0x2) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7946();
				local161 = Static158.aClass1_Sub3_Sub1_2.method7915();
				if (local47 == 65535) {
					local47 = -1;
				}
				local172 = Static158.aClass1_Sub3_Sub1_2.method7931();
				local17.method6059(local47, local172, local161, false);
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt7611 = Static158.aClass1_Sub3_Sub1_2.method7916();
				local17.anInt7619 = Static158.aClass1_Sub3_Sub1_2.method7967();
			}
			if ((local21 & 0x400) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7971();
				local161 = Static158.aClass1_Sub3_Sub1_2.method7938();
				local17.method6070(local47, local161, Static518.anInt9331);
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt7557 = Static158.aClass1_Sub3_Sub1_2.method7963();
				local17.anInt7569 = Static158.aClass1_Sub3_Sub1_2.method7976();
				local17.anInt7556 = Static158.aClass1_Sub3_Sub1_2.method7976();
				local17.anInt7598 = Static158.aClass1_Sub3_Sub1_2.method7963();
				local17.anInt7584 = Static158.aClass1_Sub3_Sub1_2.method7967() + Static518.anInt9331;
				local17.anInt7568 = Static158.aClass1_Sub3_Sub1_2.method7946() + Static518.anInt9331;
				local17.anInt7555 = Static158.aClass1_Sub3_Sub1_2.method7931();
				local17.anInt7569 += local17.anIntArray454[0];
				local17.anInt7598 += local17.anIntArray454[0];
				local17.anInt7557 += local17.anIntArray455[0];
				local17.anInt7604 = 1;
				local17.anInt7556 += local17.anIntArray455[0];
				local17.anInt7607 = 0;
			}
			if ((local21 & 0x10) != 0) {
				local17.aString86 = Static158.aClass1_Sub3_Sub1_2.method7951();
				local17.anInt7571 = 100;
			}
			if ((local21 & 0x200) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7938();
				local100 = new int[local47];
				local103 = new int[local47];
				for (@Pc(369) int local369 = 0; local369 < local47; local369++) {
					local108 = Static158.aClass1_Sub3_Sub1_2.method7946();
					if ((local108 & 0xC000) == 49152) {
						local114 = Static158.aClass1_Sub3_Sub1_2.method7945();
						local100[local369] = local114 | local108 << 16;
					} else {
						local100[local369] = local108;
					}
					local103[local369] = Static158.aClass1_Sub3_Sub1_2.method7967();
				}
				local17.method6077(local100, local103);
			}
			if ((local21 & 0x4) != 0) {
				@Pc(428) int[] local428 = new int[4];
				for (local161 = 0; local161 < 4; local161++) {
					local428[local161] = Static158.aClass1_Sub3_Sub1_2.method7916();
					if (local428[local161] == 65535) {
						local428[local161] = -1;
					}
				}
				local172 = Static158.aClass1_Sub3_Sub1_2.method7931();
				Static217.method3240(local428, local17, local172);
			}
			if ((local21 & 0x100) != 0) {
				local17.aByte106 = Static158.aClass1_Sub3_Sub1_2.method7963();
				local17.aByte105 = Static158.aClass1_Sub3_Sub1_2.method7970();
				local17.aByte104 = Static158.aClass1_Sub3_Sub1_2.method7970();
				local17.aByte103 = (byte) Static158.aClass1_Sub3_Sub1_2.method7943();
				local17.anInt7589 = Static518.anInt9331 + Static158.aClass1_Sub3_Sub1_2.method7916();
				local17.anInt7599 = Static518.anInt9331 + Static158.aClass1_Sub3_Sub1_2.method7946();
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt7528 = Static158.aClass1_Sub3_Sub1_2.method7967();
				if (local17.anInt7528 == 65535) {
					local17.anInt7528 = -1;
				}
			}
			if ((local21 & 0x20) != 0) {
				local47 = Static158.aClass1_Sub3_Sub1_2.method7971();
				local161 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local17.method6070(local47, local161, Static518.anInt9331);
				local17.anInt7537 = Static518.anInt9331 + 300;
				local17.anInt7531 = Static158.aClass1_Sub3_Sub1_2.method7931();
			}
			if ((local21 & 0x8) != 0) {
				if (local17.aClass354_1.method7671()) {
					Static510.method7148(local17);
				}
				local17.method6080(Static84.aClass242_1.method5281(Static158.aClass1_Sub3_Sub1_2.method7916()));
				local17.method6071(local17.aClass354_1.anInt9418);
				local17.anInt7565 = local17.aClass354_1.anInt9432 << 3;
				if (local17.aClass354_1.method7671()) {
					Static224.method3330(null, local17.anIntArray455[0], null, local17, local17.anIntArray454[0], 0, local17.aByte113);
				}
			}
		}
	}
}

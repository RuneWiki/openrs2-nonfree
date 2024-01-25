import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
	public static int anInt2790;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "Lclient!rs;")
	public static Class289 aClass289_2;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_27 = new Class230(56, -1);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!cda;I)V")
	public static void method2427(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub1 arg1) {
		@Pc(13) boolean local13 = arg1.method1499(1) == 1;
		if (local13) {
			Static12.anIntArray6[Static293.anInt6017++] = arg0;
		}
		@Pc(35) int local35 = arg1.method1499(2);
		@Pc(39) Class2_Sub2_Sub1_Sub1 local39 = Static378.aClass2_Sub2_Sub1_Sub1Array10[arg0];
		if (local35 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local35 == 1) {
				local146 = arg1.method1499(3);
				local151 = local39.anIntArray487[0];
				local156 = local39.anIntArray488[0];
				if (local146 == 0) {
					local156--;
					local151--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local156--;
					local151++;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local151--;
					local156++;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local156++;
					local151++;
				}
				if (local13) {
					local39.aBoolean172 = true;
					local39.anInt2223 = local156;
					local39.anInt2225 = local151;
				} else {
					local39.method2035(Static113.aByteArray38[arg0], local156, local151);
				}
			} else if (local35 == 2) {
				local146 = arg1.method1499(4);
				local151 = local39.anIntArray487[0];
				local156 = local39.anIntArray488[0];
				if (local146 == 0) {
					local156 -= 2;
					local151 -= 2;
				} else if (local146 == 1) {
					local156 -= 2;
					local151--;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local151++;
					local156 -= 2;
				} else if (local146 == 4) {
					local151 += 2;
					local156 -= 2;
				} else if (local146 == 5) {
					local156--;
					local151 -= 2;
				} else if (local146 == 6) {
					local151 += 2;
					local156--;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local156++;
					local151 -= 2;
				} else if (local146 == 10) {
					local156++;
					local151 += 2;
				} else if (local146 == 11) {
					local151 -= 2;
					local156 += 2;
				} else if (local146 == 12) {
					local151--;
					local156 += 2;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local151++;
					local156 += 2;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local13) {
					local39.aBoolean172 = true;
					local39.anInt2225 = local151;
					local39.anInt2223 = local156;
				} else {
					local39.method2035(Static113.aByteArray38[arg0], local156, local151);
				}
			} else {
				local146 = arg1.method1499(1);
				@Pc(398) int local398;
				@Pc(406) int local406;
				@Pc(419) int local419;
				@Pc(427) int local427;
				if (local146 == 0) {
					local151 = arg1.method1499(12);
					local156 = local151 >> 10;
					local398 = local151 >> 5 & 0x1F;
					if (local398 > 15) {
						local398 -= 32;
					}
					local406 = local151 & 0x1F;
					if (local406 > 15) {
						local406 -= 32;
					}
					local419 = local39.anIntArray487[0] + local398;
					local427 = local39.anIntArray488[0] + local406;
					if (local13) {
						local39.aBoolean172 = true;
						local39.anInt2225 = local419;
						local39.anInt2223 = local427;
					} else {
						local39.method2035(Static113.aByteArray38[arg0], local427, local419);
					}
					local39.aByte103 = (byte) (local39.aByte103 + local156 & 0x3);
					if (arg0 == Static381.anInt1560) {
						Static212.anInt4380 = local39.aByte103;
					}
				} else {
					local151 = arg1.method1499(30);
					local156 = local151 >> 28;
					local398 = local151 >> 14 & 0x3FFF;
					local406 = local151 & 0x3FFF;
					local419 = (local39.anIntArray487[0] + Static230.anInt4667 + local398 & 0x3FFF) - Static230.anInt4667;
					local427 = (local406 + Static563.anInt10006 + local39.anIntArray488[0] & 0x3FFF) - Static563.anInt10006;
					if (local13) {
						local39.anInt2223 = local427;
						local39.aBoolean172 = true;
						local39.anInt2225 = local419;
					} else {
						local39.method2035(Static113.aByteArray38[arg0], local427, local419);
					}
					local39.aByte103 = (byte) (local156 + local39.aByte103 & 0x3);
					if (arg0 == Static381.anInt1560) {
						Static212.anInt4380 = local39.aByte103;
					}
				}
			}
		} else if (local13) {
			local39.aBoolean172 = false;
		} else if (arg0 == Static381.anInt1560) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class90 local67 = Static102.aClass90Array1[arg0] = new Class90();
			local67.anInt2871 = (local39.anIntArray488[0] + Static563.anInt10006 >> 6) + ((local39.aByte103 << 28) + (local39.anIntArray487[0] + Static230.anInt4667 >> 6 << 14));
			if (local39.anInt2218 == -1) {
				local67.anInt2874 = local39.aClass358_7.method8345();
			} else {
				local67.anInt2874 = local39.anInt2218;
			}
			local67.anInt2875 = local39.anInt7634;
			local67.aBoolean220 = local39.aBoolean171;
			if (local39.anInt2198 > 0) {
				Static286.method8361(local39);
			}
			Static378.aClass2_Sub2_Sub1_Sub1Array10[arg0] = null;
			if (arg1.method1499(1) != 0) {
				Static237.method4125(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	public static void method2429() {
		for (@Pc(1) int local1 = 0; local1 < Static268.anInt5680; local1++) {
			@Pc(11) int local11 = Static304.anIntArray377[local1];
			@Pc(20) Class3_Sub46 local20 = (Class3_Sub46) Static331.aClass25_25.method946((long) local11);
			if (local20 != null) {
				@Pc(25) Class2_Sub2_Sub1_Sub2 local25 = local20.aClass2_Sub2_Sub1_Sub2_2;
				Static86.method1923(local25, local25.aClass169_1.anInt4979);
			}
		}
	}
}

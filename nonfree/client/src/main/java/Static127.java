import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_7 = new Class43("", 15);

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public static int anInt2209 = 500;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rd;)V")
	public static void method1764(@OriginalArg(1) Class8_Sub3_Sub1_Sub1 arg0) {
		@Pc(15) Class4_Sub22 local15 = (Class4_Sub22) Static381.aClass67_4.method1429((long) arg0.anInt7391);
		if (local15 == null) {
			Static353.method4676(null, arg0.anIntArray559[0], 0, arg0, arg0.anIntArray560[0], arg0.aByte99, null);
		} else {
			local15.method3049();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public static void method1765(@OriginalArg(0) long arg0) {
		@Pc(18) int local18 = Static328.anInt5322 + Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339;
		@Pc(23) int local23 = Static141.anInt2521 + Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343;
		if (Static371.anInt5975 - local18 < -500 || Static371.anInt5975 - local18 > 500 || Static196.anInt3536 - local23 < -500 || Static196.anInt3536 - local23 > 500) {
			Static196.anInt3536 = local23;
			Static371.anInt5975 = local18;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local18 != Static371.anInt5975) {
			local62 = local18 - Static371.anInt5975;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static371.anInt5975 += local70;
		}
		if (Static196.anInt3536 != local23) {
			local62 = local23 - Static196.anInt3536;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local62 > local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static196.anInt3536 += local70;
		}
		if (!Static413.aClass49_Sub1_1.aBoolean230) {
			Static109.aFloat75 += (float) arg0 * Static33.aFloat7 / 6.0F;
			Static439.aFloat99 += (float) arg0 * Static390.aFloat102 / 6.0F;
		}
		Static167.method2319();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
	public static boolean method1766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method1768(@OriginalArg(1) Class4_Sub9_Sub2 arg0) {
		arg0.method5076();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static438.anInt2796; local12++) {
			local18 = Static78.anIntArray114[local12];
			if ((Static104.aByteArray11[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static104.aByteArray11[local18] = (byte) (Static104.aByteArray11[local18] | 0x2);
					local10--;
				} else {
					local49 = arg0.method5071(1);
					if (local49 == 0) {
						local10 = Static407.method5525(arg0);
						Static104.aByteArray11[local18] = (byte) (Static104.aByteArray11[local18] | 0x2);
					} else {
						Static55.method757(local18, arg0);
					}
				}
			}
		}
		arg0.method5074();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5076();
		@Pc(130) int local130;
		for (local18 = 0; local18 < Static438.anInt2796; local18++) {
			local49 = Static78.anIntArray114[local18];
			if ((Static104.aByteArray11[local49] & 0x1) != 0) {
				if (local10 > 0) {
					Static104.aByteArray11[local49] = (byte) (Static104.aByteArray11[local49] | 0x2);
					local10--;
				} else {
					local130 = arg0.method5071(1);
					if (local130 == 0) {
						local10 = Static407.method5525(arg0);
						Static104.aByteArray11[local49] = (byte) (Static104.aByteArray11[local49] | 0x2);
					} else {
						Static55.method757(local49, arg0);
					}
				}
			}
		}
		arg0.method5074();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5076();
		@Pc(207) int local207;
		for (local49 = 0; local49 < Static454.anInt7608; local49++) {
			local130 = Static360.anIntArray469[local49];
			if ((Static104.aByteArray11[local130] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static104.aByteArray11[local130] = (byte) (Static104.aByteArray11[local130] | 0x2);
				} else {
					local207 = arg0.method5071(1);
					if (local207 == 0) {
						local10 = Static407.method5525(arg0);
						Static104.aByteArray11[local130] = (byte) (Static104.aByteArray11[local130] | 0x2);
					} else if (Static371.method4764(arg0, local130)) {
						Static104.aByteArray11[local130] = (byte) (Static104.aByteArray11[local130] | 0x2);
					}
				}
			}
		}
		arg0.method5074();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5076();
		for (local130 = 0; local130 < Static454.anInt7608; local130++) {
			local207 = Static360.anIntArray469[local130];
			if ((Static104.aByteArray11[local207] & 0x1) == 0) {
				if (local10 > 0) {
					Static104.aByteArray11[local207] = (byte) (Static104.aByteArray11[local207] | 0x2);
					local10--;
				} else {
					@Pc(291) int local291 = arg0.method5071(1);
					if (local291 == 0) {
						local10 = Static407.method5525(arg0);
						Static104.aByteArray11[local207] = (byte) (Static104.aByteArray11[local207] | 0x2);
					} else if (Static371.method4764(arg0, local207)) {
						Static104.aByteArray11[local207] = (byte) (Static104.aByteArray11[local207] | 0x2);
					}
				}
			}
		}
		arg0.method5074();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static438.anInt2796 = 0;
		Static454.anInt7608 = 0;
		for (local207 = 1; local207 < 2048; local207++) {
			Static104.aByteArray11[local207] = (byte) (Static104.aByteArray11[local207] >> 1);
			@Pc(366) Class8_Sub3_Sub1_Sub1 local366 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local207];
			if (local366 == null) {
				Static360.anIntArray469[Static454.anInt7608++] = local207;
			} else {
				Static78.anIntArray114[Static438.anInt2796++] = local207;
			}
		}
	}
}

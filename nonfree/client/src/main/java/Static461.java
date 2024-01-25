import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_157 = new Class180(60, 6);

	@OriginalMember(owner = "client!pja", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[200];

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V")
	public static void method6711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3_Sub11_Sub4 local11 = Static583.method8201(12, (long) arg0);
		local11.method2195();
		local11.anInt2394 = arg1;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BILclient!gaa;)V")
	public static void method6712(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub25_Sub1 arg1) {
		@Pc(17) boolean local17 = arg1.method3402(1) == 1;
		if (local17) {
			Static272.anIntArray429[Static185.anInt3761++] = arg0;
		}
		@Pc(32) int local32 = arg1.method3402(2);
		@Pc(36) Class28_Sub1_Sub1_Sub1_Sub1 local36 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(160) int local160;
			if (local32 == 1) {
				local150 = arg1.method3402(3);
				local155 = local36.anIntArray956[0];
				local160 = local36.anIntArray955[0];
				if (local150 == 0) {
					local155--;
					local160--;
				} else if (local150 == 1) {
					local160--;
				} else if (local150 == 2) {
					local160--;
					local155++;
				} else if (local150 == 3) {
					local155--;
				} else if (local150 == 4) {
					local155++;
				} else if (local150 == 5) {
					local160++;
					local155--;
				} else if (local150 == 6) {
					local160++;
				} else if (local150 == 7) {
					local160++;
					local155++;
				}
				if (local17) {
					local36.anInt10505 = local160;
					local36.anInt10507 = local155;
					local36.aBoolean795 = true;
				} else {
					local36.method9107(local155, local160, Static185.aByteArray28[arg0]);
				}
			} else if (local32 == 2) {
				local150 = arg1.method3402(4);
				local155 = local36.anIntArray956[0];
				local160 = local36.anIntArray955[0];
				if (local150 == 0) {
					local160 -= 2;
					local155 -= 2;
				} else if (local150 == 1) {
					local160 -= 2;
					local155--;
				} else if (local150 == 2) {
					local160 -= 2;
				} else if (local150 == 3) {
					local160 -= 2;
					local155++;
				} else if (local150 == 4) {
					local155 += 2;
					local160 -= 2;
				} else if (local150 == 5) {
					local160--;
					local155 -= 2;
				} else if (local150 == 6) {
					local155 += 2;
					local160--;
				} else if (local150 == 7) {
					local155 -= 2;
				} else if (local150 == 8) {
					local155 += 2;
				} else if (local150 == 9) {
					local160++;
					local155 -= 2;
				} else if (local150 == 10) {
					local160++;
					local155 += 2;
				} else if (local150 == 11) {
					local155 -= 2;
					local160 += 2;
				} else if (local150 == 12) {
					local155--;
					local160 += 2;
				} else if (local150 == 13) {
					local160 += 2;
				} else if (local150 == 14) {
					local155++;
					local160 += 2;
				} else if (local150 == 15) {
					local160 += 2;
					local155 += 2;
				}
				if (local17) {
					local36.aBoolean795 = true;
					local36.anInt10507 = local155;
					local36.anInt10505 = local160;
				} else {
					local36.method9107(local155, local160, Static185.aByteArray28[arg0]);
				}
			} else {
				local150 = arg1.method3402(1);
				@Pc(436) int local436;
				@Pc(447) int local447;
				@Pc(454) int local454;
				if (local150 == 0) {
					local155 = arg1.method3402(12);
					local160 = local155 >> 10;
					@Pc(426) int local426 = local155 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local436 = local155 & 0x1F;
					if (local436 > 15) {
						local436 -= 32;
					}
					local447 = local36.anIntArray956[0] + local426;
					local454 = local436 + local36.anIntArray955[0];
					if (local17) {
						local36.anInt10505 = local454;
						local36.anInt10507 = local447;
						local36.aBoolean795 = true;
					} else {
						local36.method9107(local447, local454, Static185.aByteArray28[arg0]);
					}
					local36.aByte174 = local36.aByte173 = (byte) (local36.aByte174 + local160 & 0x3);
					if (Static488.method7052(local447, local454)) {
						local36.aByte173++;
					}
					if (Static106.anInt2205 == arg0) {
						if (local36.aByte174 != Static309.anInt5138) {
							Static27.aBoolean42 = true;
						}
						Static309.anInt5138 = local36.aByte174;
					}
				} else {
					local155 = arg1.method3402(30);
					local160 = local155 >> 28;
					local436 = local155 >> 14 & 0x3FFF;
					local447 = local155 & 0x3FFF;
					local454 = (Static287.anInt4910 + local36.anIntArray956[0] + local436 & 0x3FFF) - Static287.anInt4910;
					@Pc(574) int local574 = (local447 + Static72.anInt1361 + local36.anIntArray955[0] & 0x3FFF) - Static72.anInt1361;
					if (local17) {
						local36.anInt10505 = local574;
						local36.aBoolean795 = true;
						local36.anInt10507 = local454;
					} else {
						local36.method9107(local454, local574, Static185.aByteArray28[arg0]);
					}
					local36.aByte174 = local36.aByte173 = (byte) (local160 + local36.aByte174 & 0x3);
					if (Static488.method7052(local454, local574)) {
						local36.aByte173++;
					}
					if (Static106.anInt2205 == arg0) {
						Static309.anInt5138 = local36.aByte174;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean795 = false;
		} else if (Static106.anInt2205 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class251 local60 = Static583.aClass251Array1[arg0] = new Class251();
			local60.anInt6816 = (local36.anIntArray955[0] + Static72.anInt1361 >> 6) + (Static287.anInt4910 + local36.anIntArray956[0] >> 6 << 14) + (local36.aByte174 << 28);
			if (local36.anInt10520 == -1) {
				local60.anInt6812 = local36.aClass282_7.method7022();
			} else {
				local60.anInt6812 = local36.anInt10520;
			}
			local60.aBoolean488 = local36.aBoolean793;
			local60.anInt6814 = local36.anInt10743;
			local60.aBoolean487 = local36.aBoolean792;
			if (local36.anInt10522 > 0) {
				Static189.method5097(local36);
			}
			Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method3402(1) != 0) {
				Static66.method1350(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BII)I")
	public static int method6716(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lclient!dia;I[II[II)Lclient!cg;")
	public static Class1_Sub1 method6717(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(23) int local23 = arg3 * local12 + arg2[local12];
			for (@Pc(25) int local25 = 0; local25 < arg4[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class1_Sub1(arg0, arg3, arg1, local10);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
	public static void method6719() {
		Static473.aFont2 = null;
		Static174.anImage12 = null;
	}
}

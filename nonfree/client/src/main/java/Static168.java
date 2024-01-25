import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[S")
	public static final short[] aShortArray52 = new short[] { 19, 48, 18, 13, 6, 5, 59, 20 };

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public static int anInt3036 = -1;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public static int anInt3037 = 0;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Z")
	public static boolean method2451(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!dr;I)V")
	public static void method2452(@OriginalArg(1) Class7_Sub14_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method1358(1) == 1;
		if (local17) {
			Static419.anIntArray587[Static345.anInt5547++] = arg1;
		}
		@Pc(32) int local32 = arg0.method1358(2);
		@Pc(36) Class26_Sub2_Sub4_Sub2 local36 = Static410.aClass26_Sub2_Sub4_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(160) int local160;
			if (local32 == 1) {
				local150 = arg0.method1358(3);
				local155 = local36.anIntArray603[0];
				local160 = local36.anIntArray604[0];
				if (local150 == 0) {
					local155--;
					local160--;
				} else if (local150 == 1) {
					local160--;
				} else if (local150 == 2) {
					local155++;
					local160--;
				} else if (local150 == 3) {
					local155--;
				} else if (local150 == 4) {
					local155++;
				} else if (local150 == 5) {
					local155--;
					local160++;
				} else if (local150 == 6) {
					local160++;
				} else if (local150 == 7) {
					local155++;
					local160++;
				}
				if (local17) {
					local36.anInt7139 = local160;
					local36.anInt7147 = local155;
					local36.aBoolean480 = true;
				} else {
					local36.method5531(local155, Static373.aByteArray86[arg1], local160);
				}
			} else if (local32 == 2) {
				local150 = arg0.method1358(4);
				local155 = local36.anIntArray603[0];
				local160 = local36.anIntArray604[0];
				if (local150 == 0) {
					local160 -= 2;
					local155 -= 2;
				} else if (local150 == 1) {
					local160 -= 2;
					local155--;
				} else if (local150 == 2) {
					local160 -= 2;
				} else if (local150 == 3) {
					local155++;
					local160 -= 2;
				} else if (local150 == 4) {
					local160 -= 2;
					local155 += 2;
				} else if (local150 == 5) {
					local155 -= 2;
					local160--;
				} else if (local150 == 6) {
					local155 += 2;
					local160--;
				} else if (local150 == 7) {
					local155 -= 2;
				} else if (local150 == 8) {
					local155 += 2;
				} else if (local150 == 9) {
					local155 -= 2;
					local160++;
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
					local36.aBoolean480 = true;
					local36.anInt7139 = local160;
					local36.anInt7147 = local155;
				} else {
					local36.method5531(local155, Static373.aByteArray86[arg1], local160);
				}
			} else {
				local150 = arg0.method1358(1);
				@Pc(421) int local421;
				@Pc(429) int local429;
				@Pc(440) int local440;
				@Pc(447) int local447;
				if (local150 == 0) {
					local155 = arg0.method1358(12);
					local160 = local155 >> 10;
					local421 = local155 >> 5 & 0x1F;
					if (local421 > 15) {
						local421 -= 32;
					}
					local429 = local155 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local440 = local421 + local36.anIntArray603[0];
					local447 = local429 + local36.anIntArray604[0];
					if (local17) {
						local36.anInt7139 = local447;
						local36.anInt7147 = local440;
						local36.aBoolean480 = true;
					} else {
						local36.method5531(local440, Static373.aByteArray86[arg1], local447);
					}
					local36.aByte102 = (byte) (local36.aByte102 + local160 & 0x3);
					if (Static296.anInt4920 == arg1) {
						Static268.anInt4539 = local36.aByte102;
					}
				} else {
					local155 = arg0.method1358(30);
					local160 = local155 >> 28;
					local421 = local155 >> 14 & 0x3FFF;
					local429 = local155 & 0x3FFF;
					local440 = (local421 + local36.anIntArray603[0] + Static359.anInt5713 & 0x3FFF) - Static359.anInt5713;
					local447 = (local429 + local36.anIntArray604[0] + Static314.anInt5181 & 0x3FFF) - Static314.anInt5181;
					if (local17) {
						local36.anInt7147 = local440;
						local36.anInt7139 = local447;
						local36.aBoolean480 = true;
					} else {
						local36.method5531(local440, Static373.aByteArray86[arg1], local447);
					}
					local36.aByte102 = (byte) (local36.aByte102 + local160 & 0x3);
					if (Static296.anInt4920 == arg1) {
						Static268.anInt4539 = local36.aByte102;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean480 = false;
		} else if (Static296.anInt4920 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class89 local67 = Static136.aClass89Array1[arg1] = new Class89();
			local67.anInt2433 = (local36.anIntArray604[0] + Static314.anInt5181 >> 6) + ((local36.aByte102 << 28) + (local36.anIntArray603[0] + Static359.anInt5713 >> 6 << 14));
			if (local36.anInt7145 == -1) {
				local67.anInt2430 = local36.aClass158_7.method3356();
			} else {
				local67.anInt2430 = local36.anInt7145;
			}
			local67.anInt2432 = local36.anInt7060;
			local67.aBoolean136 = local36.aBoolean482;
			if (local36.anInt7126 > 0) {
				Static213.method3051(local36);
			}
			Static410.aClass26_Sub2_Sub4_Sub2Array1[arg1] = null;
			if (arg0.method1358(1) != 0) {
				Static179.method5738(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
	public static boolean method2454() {
		return Static94.aBoolean106;
	}
}

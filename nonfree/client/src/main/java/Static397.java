import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt7408;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_83 = new Class185(22, 7);

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt7407 = -1;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!em;)I")
	public static int method6259(@OriginalArg(1) Class6_Sub5_Sub9 arg0) {
		@Pc(7) String local7 = Static159.method3114(arg0);
		@Pc(9) int[] local9 = null;
		if (Static578.method8033(arg0.anInt3240)) {
			local9 = Static356.aClass221_1.method5923((int) arg0.aLong78).anIntArray469;
		} else if (arg0.anInt3239 != -1) {
			local9 = Static356.aClass221_1.method5923(arg0.anInt3239).anIntArray469;
		} else if (Static74.method2090(arg0.anInt3240)) {
			@Pc(94) Class6_Sub42 local94 = (Class6_Sub42) Static461.aClass380_35.method8747((long) (int) arg0.aLong78);
			if (local94 != null) {
				@Pc(99) Class9_Sub4_Sub2_Sub1_Sub1 local99 = local94.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				@Pc(102) Class158 local102 = local99.aClass158_1;
				if (local102.anIntArray260 != null) {
					local102 = local102.method4867(Static140.aClass157_1);
				}
				if (local102 != null) {
					local9 = local102.anIntArray262;
				}
			}
		} else if (Static340.method5667(arg0.anInt3240)) {
			@Pc(59) Class356 local59;
			if (arg0.anInt3240 == 1009) {
				local59 = Static249.aClass310_1.method7474((int) arg0.aLong78);
			} else {
				local59 = Static249.aClass310_1.method7474((int) (arg0.aLong78 >>> 32 & 0x7FFFFFFFL));
			}
			if (local59.anIntArray545 != null) {
				local59 = local59.method8322(Static140.aClass157_1);
			}
			if (local59 != null) {
				local9 = local59.anIntArray546;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static591.method8148(local9);
		}
		@Pc(142) int local142 = Static2.aClass213_9.method5833(Static388.aClass4Array10, local7);
		if (arg0.aBoolean252) {
			local142 += Static295.aClass4_14.method7697() + 4;
		}
		return local142;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public static int method6260(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local18 * local32 >> 12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!lr;Z)Z")
	public static boolean method6261(@OriginalArg(0) Class9_Sub4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static148.aClass245Array1 == Static152.aClass245Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7823();
		if (arg0.aShort115 < 0 || arg0.aShort114 < 0 || arg0.aShort117 >= Static623.anInt10485 || arg0.aShort116 >= Static142.anInt3372) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort115; local36 <= arg0.aShort117; local36++) {
			for (local40 = arg0.aShort114; local40 <= arg0.aShort116; local40++) {
				@Pc(47) Class186 local47 = Static180.method3388(arg0.aByte135, local36, local40);
				if (local47 != null) {
					@Pc(53) Class168 local53 = Static578.method8031(arg0);
					@Pc(56) Class168 local56 = local47.aClass168_3;
					if (local56 == null) {
						local47.aClass168_3 = local53;
					} else {
						while (local56.aClass168_2 != null) {
							local56 = local56.aClass168_2;
						}
						local56.aClass168_2 = local53;
					}
					if (local6 && (Static80.anIntArrayArray5[local36][local40] & 0xFF000000) != 0) {
						local8 = Static80.anIntArrayArray5[local36][local40];
						local10 = Static527.aShortArrayArray30[local36][local40];
						local12 = Static578.aByteArrayArray32[local36][local40];
					}
					if (!arg1 && local47.aClass9_Sub4_Sub3_1 != null && local47.aClass9_Sub4_Sub3_1.aShort96 > local33) {
						local33 = local47.aClass9_Sub4_Sub3_1.aShort96;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort115; local40 <= arg0.aShort117; local40++) {
				for (@Pc(136) int local136 = arg0.aShort114; local136 <= arg0.aShort116; local136++) {
					if ((Static80.anIntArrayArray5[local40][local136] & 0xFF000000) == 0) {
						Static80.anIntArrayArray5[local40][local136] = local8;
						Static527.aShortArrayArray30[local40][local136] = local10;
						Static578.aByteArrayArray32[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static560.aClass9_Sub4_Sub2Array1[Static592.anInt10005++] = arg0;
		} else {
			local40 = Static148.aClass245Array1 == Static152.aClass245Array3 ? 1 : 0;
			if (!arg0.method8413()) {
				arg0.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local40];
				Static249.aClass9_Sub4Array4[local40] = arg0;
			} else if (arg0.method8422()) {
				arg0.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local40];
				Static611.aClass9_Sub4Array5[local40] = arg0;
			} else {
				arg0.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local40];
				Static645.aClass9_Sub4Array6[local40] = arg0;
				Static610.aBoolean810 = true;
			}
		}
		if (arg1) {
			arg0.anInt10365 -= local33;
		}
		return true;
	}
}

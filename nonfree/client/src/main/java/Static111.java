import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt2134;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_14 = new Class142();

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_55 = new Class151(4);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIBI)V")
	public static void method1739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static131.aClass137ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg2 << 14 | arg1 << 28);
		@Pc(25) Class1_Sub34 local25 = (Class1_Sub34) Static346.aClass51_22.method930(local19);
		if (local25 == null) {
			Static26.method376(arg1, arg0, arg2);
			return;
		}
		@Pc(47) Class1_Sub44 local47 = (Class1_Sub44) local25.aClass142_43.method3199();
		if (local47 == null) {
			Static26.method376(arg1, arg0, arg2);
			return;
		}
		@Pc(61) Class47_Sub3_Sub1 local61 = (Class47_Sub3_Sub1) Static26.method376(arg1, arg0, arg2);
		if (local61 == null) {
			local61 = new Class47_Sub3_Sub1();
		} else {
			local61.anInt6188 = local61.anInt6184 = -1;
		}
		local61.anInt6182 = local47.anInt7736;
		local61.anInt6178 = local47.anInt7735;
		label44: while (true) {
			@Pc(89) Class1_Sub44 local89 = (Class1_Sub44) local25.aClass142_43.method3198();
			if (local89 == null) {
				break;
			}
			if (local61.anInt6182 != local89.anInt7736) {
				local61.anInt6188 = local89.anInt7736;
				local61.anInt6181 = local89.anInt7735;
				while (true) {
					@Pc(114) Class1_Sub44 local114 = (Class1_Sub44) local25.aClass142_43.method3198();
					if (local114 == null) {
						break label44;
					}
					if (local61.anInt6182 != local114.anInt7736 && local114.anInt7736 != local61.anInt6188) {
						local61.anInt6184 = local114.anInt7736;
						local61.anInt6186 = local114.anInt7735;
					}
				}
			}
		}
		@Pc(154) int local154 = Static405.method5510((arg2 << 7) + 64, (arg0 << 7) + 64, arg1);
		Static133.method2050(arg1, arg0, arg2, local154, local61);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Z")
	public static boolean method1740(@OriginalArg(1) int arg0) {
		if (Static65.aBooleanArray5[arg0]) {
			return true;
		} else if (Static2.aClass109_1.method2339(arg0)) {
			@Pc(28) int local28 = Static2.aClass109_1.method2322(arg0);
			if (local28 == 0) {
				Static65.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static276.aClass229ArrayArray1[arg0] == null) {
				Static276.aClass229ArrayArray1[arg0] = new Class229[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static276.aClass229ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static2.aClass109_1.method2349(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class229 local73 = Static276.aClass229ArrayArray1[arg0][local47] = new Class229();
						local73.anInt6923 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5383(new Class1_Sub14(local61));
					}
				}
			}
			Static65.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ir;B)I")
	public static int method1741(@OriginalArg(0) Class47_Sub1_Sub5 arg0) {
		if (arg0.anInt5404 == 0) {
			return 0;
		}
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (arg0.anInt5378 != -1) {
			@Pc(24) Class47_Sub1_Sub5 local24 = null;
			if (arg0.anInt5378 < 32768) {
				local24 = Static307.aClass47_Sub1_Sub5_Sub1Array1[arg0.anInt5378];
			} else if (arg0.anInt5378 >= 32768) {
				local24 = Static362.aClass47_Sub1_Sub5_Sub2Array1[arg0.anInt5378 - 32768];
			}
			if (local24 != null) {
				local54 = arg0.anInt7060 - local24.anInt7060;
				local61 = arg0.anInt7066 - local24.anInt7066;
				if (local54 != 0 || local61 != 0) {
					arg0.method4321((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class47_Sub1_Sub5_Sub2) {
			@Pc(84) Class47_Sub1_Sub5_Sub2 local84 = (Class47_Sub1_Sub5_Sub2) arg0;
			if (local84.anInt5440 != -1 && (local84.anInt5421 == 0 || local84.anInt5419 > 0)) {
				local84.method4321(local84.anInt5440);
				local84.anInt5440 = -1;
			}
		} else if (arg0 instanceof Class47_Sub1_Sub5_Sub1) {
			@Pc(114) Class47_Sub1_Sub5_Sub1 local114 = (Class47_Sub1_Sub5_Sub1) arg0;
			if (local114.anInt3755 != -1 && (local114.anInt5421 == 0 || local114.anInt5419 > 0)) {
				local54 = local114.anInt7060 - (local114.anInt3755 - Static190.anInt3507 - Static190.anInt3507) * 64;
				local61 = local114.anInt7066 - (local114.anInt3752 - Static331.anInt6034 - Static331.anInt6034) * 64;
				if (local54 != 0 || local61 != 0) {
					local114.method4321((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local114.anInt3755 = -1;
			}
		}
		return arg0.method4326();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method1742() {
		@Pc(13) Class1_Sub1_Sub1 local13 = Static190.method3007(0, 15);
		local13.method28();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII)Z")
	public static boolean method1744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIB)I")
	public static int method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static228.aByteArrayArrayArray8[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static228.aByteArrayArrayArray8[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZZI)V")
	public static void method1746(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static149.anInt2670++;
			Static179.method2888();
		}
		if (arg0) {
			Static49.anInt795++;
			Static376.method5312();
		}
	}
}

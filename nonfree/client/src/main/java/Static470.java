import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	public static int anInt7808;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIBIII)Lclient!lj;")
	public static Class12 method6496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg0 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 475427L ^ (long) arg5 * 76724863L;
		@Pc(44) Class12 local44 = (Class12) Static12.aClass6_57.method92(local33);
		if (local44 == null) {
			local44 = Static288.aClass45_9.method7431(arg0, arg3, arg1, arg4, arg2, arg5);
			Static12.aClass6_57.method106(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!al;)I")
	public static int method6497(@OriginalArg(1) Class17 arg0) {
		if (Static62.aClass17_1 == arg0) {
			return 9216;
		} else if (Static326.aClass17_3 == arg0) {
			return 34065;
		} else if (arg0 == Static380.aClass17_4) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method6498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class361 local8 = Static556.method7352(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray4 != null) {
			@Pc(18) Class3_Sub32 local18 = new Class3_Sub32();
			local18.aClass361_6 = local8;
			local18.anInt4753 = arg1;
			local18.anObjectArray1 = local8.anObjectArray4;
			local18.aString29 = arg2;
			Static312.method4566(local18);
		}
		if (Static32.anInt602 != 10 || !Static71.method1520(local8).method5122(arg1 - 1)) {
			return;
		}
		@Pc(58) Class3_Sub42 local58;
		if (arg1 == 1) {
			local58 = Static591.method7910(Static9.aClass199_3, Static401.aClass303_73);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 2) {
			local58 = Static591.method7910(Static9.aClass199_3, Static238.aClass303_45);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 3) {
			local58 = Static591.method7910(Static9.aClass199_3, Static25.aClass303_7);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 4) {
			local58 = Static591.method7910(Static9.aClass199_3, Static90.aClass303_23);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 5) {
			local58 = Static591.method7910(Static9.aClass199_3, Static392.aClass303_71);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 6) {
			local58 = Static591.method7910(Static9.aClass199_3, Static335.aClass303_64);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 7) {
			local58 = Static591.method7910(Static9.aClass199_3, Static107.aClass303_30);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 8) {
			local58 = Static591.method7910(Static9.aClass199_3, Static486.aClass303_87);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 9) {
			local58 = Static591.method7910(Static9.aClass199_3, Static385.aClass303_70);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
		if (arg1 == 10) {
			local58 = Static591.method7910(Static9.aClass199_3, Static278.aClass303_56);
			Static303.method4451(arg0, arg3, local8.anInt9645, local58);
			Static511.method6885(local58);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public static void method6499(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3 local5 = Static134.aClass354_11.method7694(); local5 != null; local5 = Static134.aClass354_11.method7692()) {
			if ((local5.aLong273 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method7825();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!sp;I)I")
	public static int method6500(@OriginalArg(0) Class41_Sub2_Sub1_Sub4 arg0) {
		if (arg0.anInt9499 == 0) {
			return 0;
		}
		@Pc(69) int local69;
		@Pc(62) int local62;
		if (arg0.anInt9483 != -1) {
			@Pc(24) Class41_Sub2_Sub1_Sub4 local24 = null;
			if (arg0.anInt9483 < 32768) {
				@Pc(36) Class3_Sub34 local36 = (Class3_Sub34) Static213.aClass354_37.method7689((long) arg0.anInt9483);
				if (local36 != null) {
					local24 = local36.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				}
			} else if (arg0.anInt9483 >= 32768) {
				local24 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[arg0.anInt9483 - 32768];
			}
			if (local24 != null) {
				local62 = arg0.anInt9444 - local24.anInt9444;
				local69 = arg0.anInt9442 - local24.anInt9442;
				if (local62 != 0 || local69 != 0) {
					arg0.method7865((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class41_Sub2_Sub1_Sub4_Sub2) {
			@Pc(159) Class41_Sub2_Sub1_Sub4_Sub2 local159 = (Class41_Sub2_Sub1_Sub4_Sub2) arg0;
			if (local159.anInt9560 != -1 && (local159.anInt9535 == 0 || local159.anInt9533 > 0)) {
				local159.method7865(local159.anInt9560);
				local159.anInt9560 = -1;
			}
		} else if (arg0 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
			@Pc(95) Class41_Sub2_Sub1_Sub4_Sub1 local95 = (Class41_Sub2_Sub1_Sub4_Sub1) arg0;
			if (local95.anInt6736 != -1 && (local95.anInt9535 == 0 || local95.anInt9533 > 0)) {
				local62 = local95.anInt9444 - (local95.anInt6736 - Static335.anInt5608 - Static335.anInt5608) * 256;
				local69 = local95.anInt9442 - (local95.anInt6751 - Static246.anInt4344 - Static246.anInt4344) * 256;
				if (local62 != 0 || local69 != 0) {
					local95.method7865((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
				local95.anInt6736 = -1;
			}
		}
		return arg0.method7870();
	}
}

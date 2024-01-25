import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "Lclient!uia;")
	public static Class354 aClass354_2;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
	public static int anInt5198 = 0;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	public static int anInt5201 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg0; local55++) {
			if ((long) (local53 & local55) + local21 > arg2[local55]) {
				@Pc(76) long local76 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17] = local76;
				@Pc(90) Object local90 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17++] = local90;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method4387(local17 - 1, arg1, arg2, arg3);
		method4387(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void method4388() {
		@Pc(8) Class6_Sub27 local8 = (Class6_Sub27) Static60.aClass362_8.method8538();
		@Pc(16) boolean local16 = Static489.aClass321_39 != null || Static423.anInt7313 > 0;
		@Pc(20) int local20 = local8.method8184();
		@Pc(24) int local24 = local8.method8188();
		if (local16) {
			Static548.anInt9237 = 1;
		}
		if (local16) {
			Static391.aClass6_Sub4_Sub12_3 = Static593.aClass6_Sub4_Sub12_4;
		} else {
			Static347.method9040(local24, Static593.aClass6_Sub4_Sub12_4, local20);
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public static void method4390() {
		while (true) {
			if (Static204.aClass6_Sub23_Sub1_1.method2882(Static655.anInt10505) >= 15) {
				@Pc(14) int local14 = Static204.aClass6_Sub23_Sub1_1.method2878(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class6_Sub44 local26 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local14);
					@Pc(32) Class2_Sub1_Sub1_Sub3_Sub2 local32;
					if (local26 == null) {
						local32 = new Class2_Sub1_Sub1_Sub3_Sub2();
						local32.anInt5103 = local14;
						local26 = new Class6_Sub44(local32);
						Static349.aClass209_32.method5035((long) local14, local26);
						Static84.aClass6_Sub44Array1[Static490.anInt8336++] = local26;
						local19 = true;
					}
					local32 = local26.aClass2_Sub1_Sub1_Sub3_Sub2_2;
					Static74.anIntArray80[Static133.anInt2316++] = local14;
					local32.anInt5062 = Static352.anInt6014;
					if (local32.aClass91_1 != null && local32.aClass91_1.method2032()) {
						Static89.method8412(local32);
					}
					@Pc(86) int local86 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
					if (local86 == 1) {
						Static69.anIntArray70[Static105.anInt1939++] = local14;
					}
					@Pc(112) int local112 = (Static204.aClass6_Sub23_Sub1_1.method2878(3) + 4 & 0xB1600007) << 11;
					@Pc(117) int local117 = Static204.aClass6_Sub23_Sub1_1.method2878(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					@Pc(128) int local128 = Static204.aClass6_Sub23_Sub1_1.method2878(5);
					if (local128 > 15) {
						local128 -= 32;
					}
					@Pc(137) int local137 = Static204.aClass6_Sub23_Sub1_1.method2878(1);
					@Pc(142) int local142 = Static204.aClass6_Sub23_Sub1_1.method2878(2);
					local32.method4341(Static95.aClass188_1.method4262(Static204.aClass6_Sub23_Sub1_1.method2878(14)));
					local32.method4323(local32.aClass91_1.anInt2346);
					local32.anInt5050 = local32.aClass91_1.anInt2349 << 3;
					if (local19) {
						local32.method4328(local112, true);
					}
					local32.method4342(local128 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0], local32.method4326(), local117 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0], local137 == 1, local142);
					if (local32.aClass91_1.method2032()) {
						Static513.method7270(local32, (Class308) null, local32.anIntArray302[0], local32.anIntArray301[0], (Class2_Sub1_Sub1_Sub3_Sub1) null, 0, local32.aByte140);
					}
					continue;
				}
			}
			Static204.aClass6_Sub23_Sub1_1.method2883();
			return;
		}
	}
}

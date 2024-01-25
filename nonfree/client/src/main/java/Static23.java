import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!as", name = "A", descriptor = "Lclient!n;")
	public static Class221 aClass221_3;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Lclient!om;")
	public static Class246 aClass246_18;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_15 = new Class298(42, -1);

	@OriginalMember(owner = "client!as", name = "C", descriptor = "[I")
	public static final int[] anIntArray56 = new int[2];

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IBZII)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg2 == Static16.anInt248 && Static596.anInt9431 == arg3 && (Static209.anInt8182 == Static65.anInt1778 || Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932))) {
			return;
		}
		Static65.anInt1778 = Static209.anInt8182;
		Static596.anInt9431 = arg3;
		Static16.anInt248 = arg2;
		if (Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932)) {
			Static65.anInt1778 = 0;
		}
		Static113.method2374(arg0);
		Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839), true, Static49.aClass117_1, Static103.aClass58_6);
		@Pc(61) int local61 = Static529.anInt8344;
		Static529.anInt8344 = (Static16.anInt248 - (Static400.anInt6818 >> 4)) * 8;
		@Pc(72) int local72 = Static463.anInt7588;
		Static463.anInt7588 = (Static596.anInt9431 - (Static271.anInt5050 >> 4)) * 8;
		Static28.aClass3_Sub3_Sub3_1 = Static284.method6625(Static16.anInt248 * 8, Static596.anInt9431 * 8);
		Static190.aClass149_1 = null;
		@Pc(96) int local96 = Static529.anInt8344 - local61;
		@Pc(101) int local101 = Static463.anInt7588 - local72;
		@Pc(108) int local108;
		@Pc(121) int local121;
		@Pc(248) int local248;
		@Pc(183) int local183;
		if (arg0 == 11) {
			for (local108 = 0; local108 < Static568.anInt9131; local108++) {
				@Pc(114) Class3_Sub39 local114 = Static341.aClass3_Sub39Array1[local108];
				if (local114 != null) {
					@Pc(119) Class9_Sub1_Sub1_Sub2_Sub1 local119 = local114.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					for (local121 = 0; local121 < 10; local121++) {
						local119.anIntArray518[local121] -= local96;
						local119.anIntArray517[local121] -= local101;
					}
					local119.anInt8980 -= local101 * 512;
					local119.anInt8975 -= local96 * 512;
				}
			}
		} else {
			@Pc(169) boolean local169 = false;
			Static49.anInt1058 = 0;
			@Pc(177) int local177 = Static400.anInt6818 * 512 - 512;
			local183 = Static271.anInt5050 * 512 - 512;
			for (local121 = 0; local121 < Static568.anInt9131; local121++) {
				@Pc(191) Class3_Sub39 local191 = Static341.aClass3_Sub39Array1[local121];
				if (local191 != null) {
					@Pc(196) Class9_Sub1_Sub1_Sub2_Sub1 local196 = local191.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					local196.anInt8975 -= local96 * 512;
					local196.anInt8980 -= local101 * 512;
					if (local196.anInt8975 >= 0 && local196.anInt8975 <= local177 && local196.anInt8980 >= 0 && local196.anInt8980 <= local183) {
						@Pc(246) boolean local246 = true;
						for (local248 = 0; local248 < 10; local248++) {
							local196.anIntArray518[local248] -= local96;
							local196.anIntArray517[local248] -= local101;
							if (local196.anIntArray518[local248] < 0 || local196.anIntArray518[local248] >= Static400.anInt6818 || local196.anIntArray517[local248] < 0 || Static271.anInt5050 <= local196.anIntArray517[local248]) {
								local246 = false;
							}
						}
						if (local246) {
							Static480.anIntArray603[Static49.anInt1058++] = local196.anInt6429;
						} else {
							local196.method425(null);
							local169 = true;
							local191.method7812();
						}
					} else {
						local196.method425(null);
						local191.method7812();
						local169 = true;
					}
				}
			}
			if (local169) {
				Static568.anInt9131 = Static243.aClass310_16.method6608();
				Static243.aClass310_16.method6604(Static341.aClass3_Sub39Array1);
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(348) Class9_Sub1_Sub1_Sub2_Sub2 local348 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local108];
			if (local348 != null) {
				for (local183 = 0; local183 < 10; local183++) {
					local348.anIntArray518[local183] -= local96;
					local348.anIntArray517[local183] -= local101;
				}
				local348.anInt8975 -= local96 * 512;
				local348.anInt8980 -= local101 * 512;
			}
		}
		@Pc(396) Class122[] local396 = Static443.aClass122Array1;
		for (local183 = 0; local183 < local396.length; local183++) {
			@Pc(404) Class122 local404 = local396[local183];
			if (local404 != null) {
				local404.anInt3555 -= local96 * 512;
				local404.anInt3553 -= local101 * 512;
			}
		}
		for (@Pc(432) Class3_Sub42 local432 = (Class3_Sub42) Static475.aClass130_47.method3543(); local432 != null; local432 = (Class3_Sub42) Static475.aClass130_47.method3551()) {
			local432.anInt7381 -= local101;
			local432.anInt7385 -= local96;
			if (Static282.anInt5183 != 4 && (local432.anInt7385 < 0 || local432.anInt7381 < 0 || local432.anInt7385 >= Static400.anInt6818 || local432.anInt7381 >= Static271.anInt5050)) {
				local432.method7812();
			}
		}
		if (Static282.anInt5183 != 4) {
			for (@Pc(488) Class3_Sub46 local488 = (Class3_Sub46) Static508.aClass310_33.method6602(); local488 != null; local488 = (Class3_Sub46) Static508.aClass310_33.method6599()) {
				@Pc(496) int local496 = (int) (local488.aLong273 & 0x3FFFL);
				@Pc(501) int local501 = local496 - Static529.anInt8344;
				local248 = (int) (local488.aLong273 >> 14 & 0x3FFFL);
				@Pc(514) int local514 = local248 - Static463.anInt7588;
				if (local501 < 0 || local514 < 0 || local501 >= Static400.anInt6818 || local514 >= Static271.anInt5050) {
					local488.method7812();
				}
			}
		}
		if (Static341.anInt6021 != 0) {
			Static329.anInt5894 -= local101;
			Static341.anInt6021 -= local96;
		}
		Static516.method6878();
		if (arg0 != 11) {
			Static233.anInt4431 -= local101 * 512;
			Static452.anInt7420 -= local101;
			Static12.anInt137 -= local96;
			Static421.anInt7061 -= local96 * 512;
			Static206.anInt4180 -= local96;
			Static41.anInt966 -= local101;
			if (Math.abs(local96) > Static400.anInt6818 || Math.abs(local101) > Static271.anInt5050) {
				Static578.method7669();
			}
		} else if (Static446.anInt7363 == 4) {
			Static45.anInt998 -= local96 * 512;
			Static498.anInt7926 -= local101 * 512;
			Static92.anInt2289 -= local96 * 512;
			Static383.anInt6591 -= local101 * 512;
		} else {
			Static446.anInt7363 = 1;
			Static205.anInt4130 = -1;
			Static471.anInt7695 = -1;
		}
		Static91.method2047();
		Static79.method1727();
		Static131.aClass130_11.method3541();
		Static240.aClass130_25.method3541();
		Static479.aClass309_11.method6588();
		Static521.method6936();
	}
}

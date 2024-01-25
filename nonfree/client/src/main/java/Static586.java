import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uw", name = "U", descriptor = "I")
	public static int anInt9638 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!fd;ILclient!ha;Lclient!nd;)V")
	public static void method8085(@OriginalArg(0) Class105 arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class2_Sub36 arg2) {
		@Pc(8) Class20 local8 = arg0.method2794(arg1);
		if (local8 == null) {
			return;
		}
		@Pc(18) int local18 = local8.method4579();
		if (local18 < local8.method4595()) {
			local18 = local8.method4595();
		}
		@Pc(34) int local34 = arg2.anInt6594;
		@Pc(37) int local37 = arg2.anInt6591;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(57) int local57;
		@Pc(83) int local83;
		if (arg0.aString34 != null) {
			local39 = Static72.aClass114_9.method3010(null, null, Static264.aStringArray13, arg0.aString34);
			for (local57 = 0; local57 < local39; local57++) {
				@Pc(62) String local62 = Static264.aStringArray13[local57];
				if (local57 < local39 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local83 = Static97.aClass125_5.method3115(local62);
				if (local41 < local83) {
					local41 = local83;
				}
			}
			local43 = local39 * Static97.aClass125_5.method3114() + Static97.aClass125_5.method3117() / 2;
		}
		local57 = local18 / 2 + arg2.anInt6594;
		@Pc(116) int local116 = arg2.anInt6591;
		if (local18 + Static292.anInt8384 > local34) {
			local57 = local18 / 2 + Static292.anInt8384 + local41 / 2 + 5 + 10;
			local34 = Static292.anInt8384;
		} else if (local34 > Static292.anInt8381 - local18) {
			local34 = Static292.anInt8381 - local18;
			local57 = Static292.anInt8381 - local18 / 2 - local41 / 2 - 10 - 5;
		}
		if (local37 < local18 + Static292.anInt8382) {
			local37 = Static292.anInt8382;
			local116 = Static292.anInt8382 + local18 / 2 + 10;
		} else if (Static292.anInt8379 - local18 < local37) {
			local37 = Static292.anInt8379 - local18;
			local116 = Static292.anInt8379 - local18 / 2 - local43 - 10;
		}
		local83 = (int) (Math.atan2((double) (local34 - arg2.anInt6594), (double) (local37 - arg2.anInt6591)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method4578((float) local18 / 2.0F + (float) local34, (float) local37 + (float) local18 / 2.0F, 4096, local83);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg0.aString34 != null) {
			local257 = local116;
			local255 = local57 - local41 / 2 - 5;
			local259 = local41 + local255 + 10;
			local261 = local116 + Static97.aClass125_5.method3114() * local39 + 3;
			if (arg0.anInt3346 != 0) {
				arg1.method7898(local261 - local116, local259 + -local255, arg0.anInt3346, local116, local255);
			}
			if (arg0.anInt3321 != 0) {
				arg1.method7933(arg0.anInt3321, local116, local261 - local116, -local255 + local259, local255);
			}
			for (@Pc(328) int local328 = 0; local328 < local39; local328++) {
				@Pc(333) String local333 = Static264.aStringArray13[local328];
				if (local328 < local39 - 1) {
					local333 = local333.substring(0, local333.length() - 4);
				}
				Static97.aClass125_5.method3113(arg1, local333, local57, local116, arg0.anInt3347);
				local116 += Static97.aClass125_5.method3114();
			}
		}
		if (arg0.anInt3335 == -1 && arg0.aString34 == null) {
			return;
		}
		@Pc(380) Class2_Sub52 local380 = new Class2_Sub52(arg2);
		local18 >>= 0x1;
		local380.anInt10264 = local259;
		local380.anInt10258 = local34 - local18;
		local380.anInt10257 = local37 + local18;
		local380.anInt10262 = local37 - local18;
		local380.anInt10260 = local255;
		local380.anInt10255 = local261;
		local380.anInt10256 = local257;
		local380.anInt10259 = local34 + local18;
		Static300.aClass238_33.method5837(local380);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)V")
	public static void method8086(@OriginalArg(0) int arg0) {
		if (arg0 == Static526.anInt8766) {
			return;
		}
		Static3.anInt46 = Static270.anInt5194 = Static581.anIntArray664[arg0];
		Static346.method5398();
		Static39.anIntArrayArray93 = new int[Static3.anInt46][Static270.anInt5194];
		Static447.anIntArrayArrayArray10 = new int[4][Static3.anInt46 >> 3][Static270.anInt5194 >> 3];
		Static277.anIntArrayArray47 = new int[Static3.anInt46][Static270.anInt5194];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static19.aClass179Array2[local36] = Static282.method4468(Static3.anInt46, Static270.anInt5194);
		}
		Static198.aByteArrayArrayArray8 = new byte[4][Static3.anInt46][Static270.anInt5194];
		Static589.method8142(Static270.anInt5194, Static3.anInt46);
		Static129.method2532(Static3.anInt46 >> 3, Static600.aClass87_15, Static270.anInt5194 >> 3);
		Static526.anInt8766 = arg0;
	}
}

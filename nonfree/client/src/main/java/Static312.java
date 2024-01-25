import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kj", name = "rb", descriptor = "I")
	public static int anInt5191;

	@OriginalMember(owner = "client!kj", name = "fb", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_36 = new Class165(32);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!dm;Lclient!rs;Lclient!ha;I)V")
	public static void method4766(@OriginalArg(0) Class3_Sub18 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(10) Class33 local10 = arg1.method7692(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7659();
		if (local16 < local10.method7662()) {
			local16 = local10.method7662();
		}
		@Pc(40) int local40 = arg0.anInt2281;
		@Pc(43) int local43 = arg0.anInt2284;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(63) int local63;
		@Pc(90) int local90;
		if (arg1.aString103 != null) {
			local45 = Static595.aClass88_20.method2512((Class33[]) null, Static158.aStringArray3, (int[]) null, arg1.aString103);
			for (local63 = 0; local63 < local45; local63++) {
				@Pc(69) String local69 = Static158.aStringArray3[local63];
				if (local45 - 1 > local63) {
					local69 = local69.substring(0, local69.length() - 4);
				}
				local90 = Static182.aClass256_4.method6197(local69);
				if (local47 < local90) {
					local47 = local90;
				}
			}
			local49 = Static182.aClass256_4.method6196() * local45 + Static182.aClass256_4.method6200() / 2;
		}
		local63 = arg0.anInt2281 + local16 / 2;
		if (Static317.anInt5404 + local16 > local40) {
			local40 = Static317.anInt5404;
			local63 = local47 / 2 + Static317.anInt5404 + local16 / 2 + 15;
		} else if (local40 > Static317.anInt5408 - local16) {
			local63 = Static317.anInt5408 - local16 / 2 - local47 / 2 - 15;
			local40 = Static317.anInt5408 - local16;
		}
		@Pc(180) int local180 = arg0.anInt2284;
		if (local43 < Static317.anInt5400 + local16) {
			local180 = local16 / 2 + Static317.anInt5400 + 10;
			local43 = Static317.anInt5400;
		} else if (Static317.anInt5411 - local16 < local43) {
			local43 = Static317.anInt5411 - local16;
			local180 = Static317.anInt5411 - local16 / 2 - local49 - 10;
		}
		local90 = (int) (Math.atan2((double) (local40 - arg0.anInt2281), (double) (local43 - arg0.anInt2284)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7661((float) local16 / 2.0F + (float) local40, (float) local43 + (float) local16 / 2.0F, 4096, local90);
		@Pc(271) int local271 = -2;
		@Pc(273) int local273 = -2;
		@Pc(275) int local275 = -2;
		@Pc(277) int local277 = -2;
		if (arg1.aString103 != null) {
			local273 = local180;
			local271 = local63 - local47 / 2 - 5;
			local277 = local45 * Static182.aClass256_4.method6196() + local180 + 3;
			local275 = local271 + local47 + 10;
			if (arg1.anInt8807 != 0) {
				arg2.method8452(local275 - local271, local180, local277 - local180, local271, arg1.anInt8807);
			}
			if (arg1.anInt8803 != 0) {
				arg2.method8460(local180, local277 - local180, arg1.anInt8803, local271, local275 - local271);
			}
			for (@Pc(346) int local346 = 0; local346 < local45; local346++) {
				@Pc(352) String local352 = Static158.aStringArray3[local346];
				if (local45 - 1 > local346) {
					local352 = local352.substring(0, local352.length() - 4);
				}
				Static182.aClass256_4.method6199(arg2, local352, local63, local180, arg1.anInt8802);
				local180 += Static182.aClass256_4.method6196();
			}
		}
		if (arg1.anInt8801 == -1 && arg1.aString103 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(399) Class3_Sub28 local399 = new Class3_Sub28(arg0);
		local399.anInt3875 = local275;
		local399.anInt3874 = local16 + local43;
		local399.anInt3880 = local271;
		local399.anInt3871 = local40 + local16;
		local399.anInt3878 = local43 - local16;
		local399.anInt3877 = local40 - local16;
		local399.anInt3879 = local277;
		local399.anInt3876 = local273;
		Static93.aClass338_238.method8171(local399);
	}
}

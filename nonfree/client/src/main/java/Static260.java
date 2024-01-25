import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array170;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt6188 = 10;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
	public static final int[] anIntArray400 = new int[2048];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method4830() {
		if (Static440.aBoolean641) {
			return;
		}
		if (Static374.aClass20_Sub1_1.aBoolean186) {
			Static180.aFloat27 = (int) Static180.aFloat27 - 17 & 0xFFFFFFF0;
		} else {
			Static300.aFloat57 += (-Static300.aFloat57 - 12.0F) / 2.0F;
		}
		Static440.aBoolean641 = true;
		Static224.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!gj;BLclient!jq;Lclient!qa;)V")
	public static void method4834(@OriginalArg(0) Class90 arg0, @OriginalArg(2) Class3_Sub26 arg1, @OriginalArg(3) Class172 arg2) {
		@Pc(10) Class8 local10 = arg0.method2035(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local10.qa() > local16) {
			local16 = local10.qa();
		}
		@Pc(32) int local32 = arg1.anInt3893;
		@Pc(35) int local35 = arg1.anInt3890;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString18 != null) {
			local37 = Static309.aClass70_28.method1757(Static143.aStringArray14, null, arg0.aString18, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static143.aStringArray14[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static172.aClass204_5.method4416(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = Static172.aClass204_5.method4418() * local37 + Static172.aClass204_5.method4414() / 2;
		}
		local55 = local16 / 2 + arg1.anInt3893;
		@Pc(116) int local116 = arg1.anInt3890;
		if (Static144.anInt5412 + local16 > local32) {
			local55 = local16 / 2 + Static144.anInt5412 + local39 / 2 + 15;
			local32 = Static144.anInt5412;
		} else if (local32 > Static144.anInt5413 - local16) {
			local55 = Static144.anInt5413 - local16 / 2 - local39 / 2 - 5 - 10;
			local32 = Static144.anInt5413 - local16;
		}
		if (local35 < Static144.anInt5414 + local16) {
			local35 = Static144.anInt5414;
			local116 = local16 / 2 + Static144.anInt5414 + 10;
		} else if (Static144.anInt5417 - local16 < local35) {
			local116 = Static144.anInt5417 - local41 - local16 / 2 - 10;
			local35 = Static144.anInt5417 - local16;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt3893), (double) (local35 - arg1.anInt3890)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6004((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(251) int local251 = -2;
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		if (arg0.aString18 != null) {
			local253 = local116;
			local251 = local55 - local39 / 2 - 5;
			local257 = local37 * Static172.aClass204_5.method4418() + local116 + 3;
			local255 = local39 + local251 + 10;
			if (arg0.anInt2721 != 0) {
				arg2.method5507(arg0.anInt2721, local257 - local116, local251, local116, local255 - local251);
			}
			if (arg0.anInt2711 != 0) {
				arg2.method5503(local255 - local251, local251, local257 - local116, arg0.anInt2711, local116);
			}
			for (@Pc(327) int local327 = 0; local327 < local37; local327++) {
				@Pc(333) String local333 = Static143.aStringArray14[local327];
				if (local327 < local37 - 1) {
					local333 = local333.substring(0, local333.length() - 4);
				}
				Static172.aClass204_5.method4417(arg2, local333, local55, local116, arg0.anInt2715);
				local116 += Static172.aClass204_5.method4418();
			}
		}
		if (arg0.anInt2704 == -1 && arg0.aString18 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(381) Class3_Sub16 local381 = new Class3_Sub16(arg1);
		local381.anInt2488 = local257;
		local381.anInt2490 = local255;
		local381.anInt2497 = local253;
		local381.anInt2492 = local32 + local16;
		local381.anInt2494 = local251;
		local381.anInt2489 = local16 + local35;
		local381.anInt2493 = local35 - local16;
		local381.anInt2496 = local32 - local16;
		Static132.aClass243_17.method5198(local381);
	}
}

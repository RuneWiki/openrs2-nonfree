import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
	public static int anInt9704 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(JI)V")
	public static void method7764(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static173.anInt3141;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Static480.anInt8528 != local7) {
			local18 = local7 - Static480.anInt8528;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Static480.anInt8528 += local26;
		}
		@Pc(72) int local72 = Static450.anInt7952;
		if (!Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static562.aFloat14 += Static7.aFloat12 * (float) arg0 / 40.0F * 8.0F;
			Static532.aFloat185 += (float) arg0 * Static256.aFloat120 / 40.0F * 8.0F;
		}
		if (Static168.anInt3085 != local72) {
			local18 = local72 - Static168.anInt3085;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Static168.anInt3085 += local26;
		}
		Static48.method7038();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!en;B)V")
	public static void method7765(@OriginalArg(0) Class90_Sub1 arg0) {
		@Pc(12) byte[] local12;
		if (Static311.anObject10 == null) {
			@Pc(5) Class101_Sub2_Sub2 local5 = new Class101_Sub2_Sub2();
			local12 = local5.method7256();
			Static311.anObject10 = Static403.method5820(local12);
		}
		if (Static25.anObject2 == null) {
			@Pc(27) Class101_Sub1_Sub1 local27 = new Class101_Sub1_Sub1();
			local12 = local27.method3375();
			Static25.anObject2 = Static403.method5820(local12);
		}
		@Pc(42) Class142 local42 = arg0.aClass142_1;
		if (local42.method3509() && Static23.anObject1 == null) {
			local12 = Static97.method1428(new Class306_Sub1(419684), 0.5F, 0.6F, 4.0F, 16.0F, 4.0F);
			Static23.anObject1 = Static403.method5820(local12);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!nh;)I")
	public static int method6021(@OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg0) {
		if (arg0.anInt3295 == 0) {
			return 0;
		}
		@Pc(62) int local62;
		@Pc(55) int local55;
		if (arg0.anInt3256 != -1) {
			@Pc(16) Class4_Sub3_Sub3_Sub3 local16 = null;
			if (arg0.anInt3256 < 32768) {
				@Pc(30) Class14_Sub44 local30 = (Class14_Sub44) Static100.aClass125_9.method2630((long) arg0.anInt3256);
				if (local30 != null) {
					local16 = local30.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				}
			} else if (arg0.anInt3256 >= 32768) {
				local16 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[arg0.anInt3256 - 32768];
			}
			if (local16 != null) {
				local55 = arg0.anInt11184 - local16.anInt11184;
				local62 = arg0.anInt11178 - local16.anInt11178;
				if (local55 != 0 || local62 != 0) {
					arg0.method2881((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub3_Sub3_Sub3_Sub2) {
			@Pc(179) Class4_Sub3_Sub3_Sub3_Sub2 local179 = (Class4_Sub3_Sub3_Sub3_Sub2) arg0;
			if (local179.anInt3322 != -1 && (local179.anInt3298 == 0 || local179.anInt3299 > 0)) {
				local179.method2881(local179.anInt3322);
				local179.anInt3322 = -1;
			}
		} else if (arg0 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
			@Pc(103) Class4_Sub3_Sub3_Sub3_Sub1 local103 = (Class4_Sub3_Sub3_Sub3_Sub1) arg0;
			if (local103.anInt2829 != -1 && (local103.anInt3298 == 0 || local103.anInt3299 > 0)) {
				local55 = local103.anInt11184 - (local103.anInt2829 - Static36.anInt617 - Static36.anInt617) * 256;
				local62 = local103.anInt11178 - (local103.anInt2814 - Static550.anInt9242 - Static550.anInt9242) * 256;
				if (local55 != 0 || local62 != 0) {
					local103.method2881((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local103.anInt2829 = -1;
			}
		}
		return arg0.method2862();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z")
	public static boolean method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}

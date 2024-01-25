import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public static int anInt7117 = -1;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!pe;Z)V")
	public static void method6300(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anIntArray87 == null && arg0.anIntArray89 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray87.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray87 != null) {
				local20 = arg0.anIntArray87[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(79) int local79;
				@Pc(90) int local90;
				@Pc(58) int local58;
				if ((local20 & 0xC0000000) == -1073741824) {
					local58 = local20 & 0xFFFFFFF;
					@Pc(62) int local62 = local58 >> 14;
					@Pc(66) int local66 = local58 & 0x3FFF;
					local79 = arg0.anInt10231 - (local62 - Static565.anInt9560) * 512 - 256;
					local90 = arg0.anInt10229 - (local66 - Static567.anInt9589) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(103) Class5_Sub3 local103 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local20);
					if (local103 == null) {
						arg0.method1037(-1, local16);
						continue;
					}
					@Pc(108) Class4_Sub2_Sub1_Sub1_Sub2 local108 = local103.aClass4_Sub2_Sub1_Sub1_Sub2_1;
					local79 = arg0.anInt10231 - local108.anInt10231;
					local90 = arg0.anInt10229 - local108.anInt10229;
				} else {
					local58 = local20 & 0x7FFF;
					@Pc(139) Class4_Sub2_Sub1_Sub1_Sub1 local139 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local58];
					if (local139 == null) {
						arg0.method1037(-1, local16);
						continue;
					}
					local90 = arg0.anInt10229 - local139.anInt10229;
					local79 = arg0.anInt10231 - local139.anInt10231;
				}
				if (local79 != 0 || local90 != 0) {
					arg0.method1037((int) (Math.atan2((double) local79, (double) local90) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method1037(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray87 = null;
			arg0.anIntArray89 = null;
		}
	}
}

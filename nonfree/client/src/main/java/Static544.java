import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "[Lclient!th;")
	public static Class348[] aClass348Array3;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
	public static int anInt9515 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!fm;)V")
	public static void method8345(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0) {
		if (arg0.anIntArray185 == null && arg0.anIntArray186 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray185.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray185 != null) {
				local20 = arg0.anIntArray185[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(95) int local95;
				if ((local20 & -1073741824) == -1073741824) {
					local95 = local20 & 0xFFFFFFF;
					@Pc(133) int local133 = local95 >> 14;
					local83 = arg0.anInt11022 - (local133 - Static640.anInt11085) * 512 - 256;
					@Pc(149) int local149 = local95 & 0x3FFF;
					local89 = arg0.anInt11024 - (local149 - Static490.anInt8763) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(63) Class2_Sub6 local63 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local20);
					if (local63 == null) {
						arg0.method3683(-1, local16);
						continue;
					}
					@Pc(76) Class15_Sub3_Sub3_Sub1_Sub2 local76 = local63.aClass15_Sub3_Sub3_Sub1_Sub2_1;
					local83 = arg0.anInt11022 - local76.anInt11022;
					local89 = arg0.anInt11024 - local76.anInt11024;
				} else {
					local95 = local20 & 0x7FFF;
					@Pc(99) Class15_Sub3_Sub3_Sub1_Sub1 local99 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local95];
					if (local99 == null) {
						arg0.method3683(-1, local16);
						continue;
					}
					local89 = arg0.anInt11024 - local99.anInt11024;
					local83 = arg0.anInt11022 - local99.anInt11022;
				}
				if (local83 != 0 || local89 != 0) {
					arg0.method3683((int) (Math.atan2((double) local83, (double) local89) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method3683(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray186 = null;
			arg0.anIntArray185 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)Z")
	public static boolean method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt812;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Lclient!au;")
	public static final Class22 aClass22_10 = new Class22();

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!au;")
	public static final Class22 aClass22_11 = new Class22();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ufa;)V")
	public static void method716(@OriginalArg(1) Class21_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray201 == null && arg0.anIntArray202 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray201.length; local16++) {
			@Pc(22) int local22 = -1;
			if (arg0.anIntArray201 != null) {
				local22 = arg0.anIntArray201[local16];
			}
			if (local22 != -1) {
				local14 = false;
				@Pc(77) int local77;
				@Pc(94) int local94;
				@Pc(61) int local61;
				if ((local22 & 0xC0000000) == -1073741824) {
					local61 = local22 & 0xFFFFFFF;
					@Pc(65) int local65 = local61 >> 14;
					local77 = arg0.anInt10551 - (local65 + -Static242.anInt10133) * 512 - 256;
					@Pc(81) int local81 = local61 & 0x3FFF;
					local94 = arg0.anInt10550 - (local81 - Static157.anInt3323) * 512 - 256;
				} else if ((local22 & 0x8000) == 0) {
					@Pc(144) Class4_Sub29 local144 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local22);
					if (local144 == null) {
						arg0.method3338(local16, -1);
						continue;
					}
					@Pc(157) Class21_Sub1_Sub1_Sub1_Sub1 local157 = local144.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					local77 = arg0.anInt10551 - local157.anInt10551;
					local94 = arg0.anInt10550 - local157.anInt10550;
				} else {
					local61 = local22 & 0x7FFF;
					@Pc(111) Class21_Sub1_Sub1_Sub1_Sub2 local111 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local61];
					if (local111 == null) {
						arg0.method3338(local16, -1);
						continue;
					}
					local94 = arg0.anInt10550 - local111.anInt10550;
					local77 = arg0.anInt10551 - local111.anInt10551;
				}
				if (local77 != 0 || local94 != 0) {
					arg0.method3338(local16, (int) (Math.atan2((double) local77, (double) local94) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method3338(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray202 = null;
			arg0.anIntArray201 = null;
		}
	}
}

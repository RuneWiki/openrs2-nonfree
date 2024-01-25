import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_1 = new Class225(75, 4);

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[2];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static240.anInt10701 != 1) {
			return;
		}
		@Pc(16) int local16 = arg3 / Static405.anInt6687;
		@Pc(20) int local20 = arg2 / Static405.anInt6687;
		@Pc(24) int local24 = arg1 / Static136.anInt2255;
		@Pc(28) int local28 = arg0 / Static136.anInt2255;
		if (Static59.anInt1029 <= local16 || local20 < 0 || Static331.anInt5059 <= local24 || local28 < 0) {
			return;
		}
		if (local16 < 0) {
			local16 = 0;
		}
		if (local28 >= Static331.anInt5059) {
			local28 = Static331.anInt5059 - 1;
		}
		if (local20 >= Static59.anInt1029) {
			local20 = Static59.anInt1029 - 1;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		for (@Pc(81) int local81 = local24; local81 <= local28; local81++) {
			@Pc(92) int local92 = Static450.method6579(Static368.anInt5896 + local81, Static331.anInt5059) * Static59.anInt1029;
			for (@Pc(94) int local94 = local16; local94 <= local20; local94++) {
				@Pc(106) int local106 = local92 + Static450.method6579(Static466.anInt7550 + local94, Static59.anInt1029);
				Static627.anIntArray698[local106] = Static388.anInt6469;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class2_Sub6_Sub12 local23 = Static636.method8647(18, (long) arg1 << 32 | (long) arg0);
		local23.method6245();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public static int anInt1229 = 64;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBI)V")
	public static void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static331.anInt10594 / (float) Static331.anInt10587;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg1 - local11) / 2;
		@Pc(49) int local49 = arg0 - (arg2 - local13) / 2;
		Static69.anInt1350 = -1;
		Static43.anInt8888 = local40 * Static331.anInt10587 / local11;
		Static609.anInt10718 = Static331.anInt10594 - Static331.anInt10594 * local49 / local13;
		Static22.anInt389 = -1;
		Static366.method6212();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!sea;IZ)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class331 arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class2_Sub12 local14 = (Class2_Sub12) Static158.aClass271_21.method7177(); local14 != null; local14 = (Class2_Sub12) Static158.aClass271_21.method7175()) {
			if (arg3 == local14.anInt1210 && local14.anInt1207 == arg0 << 9 && local14.anInt1202 == arg1 << 9 && local14.aClass331_1.anInt9434 == arg2.anInt9434) {
				if (local14.aClass2_Sub26_Sub5_1 != null) {
					Static270.aClass2_Sub26_Sub4_2.method7390(local14.aClass2_Sub26_Sub5_1);
					local14.aClass2_Sub26_Sub5_1 = null;
				}
				if (local14.aClass2_Sub26_Sub5_2 != null) {
					Static270.aClass2_Sub26_Sub4_2.method7390(local14.aClass2_Sub26_Sub5_2);
					local14.aClass2_Sub26_Sub5_2 = null;
				}
				local14.method9825();
				return;
			}
		}
	}
}

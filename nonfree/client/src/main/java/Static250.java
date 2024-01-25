import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public static int anInt3897;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!ik;)V")
	public static void method3518(@OriginalArg(1) Class182 arg0) {
		Static646.aClass182_118 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!afa;)V")
	public static void method3519(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(21) Class3_Sub56 local21 = (Class3_Sub56) Static251.aClass313_20.method7104((long) arg0.anInt8783);
		if (local21 == null) {
			return;
		}
		if (local21.aClass3_Sub33_Sub5_1 != null) {
			Static391.aClass3_Sub33_Sub4_1.method8544(local21.aClass3_Sub33_Sub5_1);
			local21.aClass3_Sub33_Sub5_1 = null;
		}
		local21.method9596();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII)Z")
	public static boolean method3521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static474.method6454(arg1, arg0) || Static401.method5419(arg1, arg0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIII)I")
	public static int method3522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg1 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg2;
		} else if (local14 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!qja", name = "m", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!qja", name = "p", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!qja", name = "n", descriptor = "Lclient!lea;")
	public static final Class223 aClass223_10 = new Class223();

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!mga;Z)V")
	public static void method7066(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort123; local2 <= arg0.aShort122; local2++) {
			for (@Pc(6) int local6 = arg0.aShort120; local6 <= arg0.aShort121; local6++) {
				@Pc(16) Class364 local16 = Static448.aClass364ArrayArrayArray2[arg0.aByte139][local2][local6];
				if (local16 != null) {
					@Pc(21) Class181 local21 = local16.aClass181_3;
					@Pc(23) Class181 local23 = null;
					while (local21 != null) {
						if (local21.aClass9_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass181_3 = local21.aClass181_2;
							} else {
								local23.aClass181_2 = local21.aClass181_2;
							}
							local21.method3952();
							break;
						}
						local23 = local21;
						local21 = local21.aClass181_2;
					}
				}
			}
		}
		if (!arg1) {
			Static219.method3261(arg0);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!ee;III)V")
	public static void method7067(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class364 local12;
		if (arg2 < Static128.anInt2531) {
			local12 = Static448.aClass364ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass9_Sub1_Sub4_1 != null && local12.aClass9_Sub1_Sub4_1.method9077()) {
				arg0.method9091(local12.aClass9_Sub1_Sub4_1, Static404.aClass22_6, 0, true, Static308.anInt4969, 0);
			}
		}
		if (arg3 < Static128.anInt2531) {
			local12 = Static448.aClass364ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub1_Sub4_1 != null && local12.aClass9_Sub1_Sub4_1.method9077()) {
				arg0.method9091(local12.aClass9_Sub1_Sub4_1, Static404.aClass22_6, 0, true, 0, Static308.anInt4969);
			}
		}
		if (arg2 < Static128.anInt2531 && arg3 < Static448.anInt6835) {
			local12 = Static448.aClass364ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub1_Sub4_1 != null && local12.aClass9_Sub1_Sub4_1.method9077()) {
				arg0.method9091(local12.aClass9_Sub1_Sub4_1, Static404.aClass22_6, 0, true, Static308.anInt4969, Static308.anInt4969);
			}
		}
		if (arg2 < Static128.anInt2531 && arg3 > 0) {
			local12 = Static448.aClass364ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass9_Sub1_Sub4_1 != null && local12.aClass9_Sub1_Sub4_1.method9077()) {
				arg0.method9091(local12.aClass9_Sub1_Sub4_1, Static404.aClass22_6, 0, true, Static308.anInt4969, -Static308.anInt4969);
			}
		}
	}
}

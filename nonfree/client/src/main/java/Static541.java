import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	public static int anInt8510 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!og;B)I")
	public static int method7125(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6496;
		@Pc(12) Class267 local12 = arg0.method5573();
		if (arg0.aBoolean528) {
			local8 = arg0.anInt6493;
		} else if (local12.anInt7022 == arg0.anInt6461 || arg0.anInt6461 == local12.anInt7026 || local12.anInt7028 == arg0.anInt6461 || local12.anInt7037 == arg0.anInt6461) {
			local8 = arg0.anInt6478;
		} else if (local12.anInt7013 == arg0.anInt6461 || arg0.anInt6461 == local12.anInt7034 || local12.anInt7018 == arg0.anInt6461 || local12.anInt7010 == arg0.anInt6461) {
			local8 = arg0.anInt6483;
		}
		return local8;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7126(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static590.anInt9377; local9++) {
			if (arg0.equalsIgnoreCase(Static595.aStringArray49[local9])) {
				return local9;
			}
		}
		return -1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
	public static int anInt3536;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
	public static int anInt3540;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
	public static int anInt3547;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Lclient!mfa;")
	public static Class215 method3195(@OriginalArg(1) int arg0) {
		@Pc(8) Class215[] local8 = Static573.method8144();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class215 local16 = local8[local10];
			if (arg0 == local16.anInt6727) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBII)I")
	public static int method3196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static368.anInt6962 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg1 - Static110.anInt3014;
		@Pc(28) int local28 = arg2 - Static110.anInt3012;
		for (@Pc(33) Class3_Sub49 local33 = (Class3_Sub49) Static110.aClass223_15.method5874(); local33 != null; local33 = (Class3_Sub49) Static110.aClass223_15.method5870()) {
			if (local33.anInt9434 == arg0) {
				@Pc(42) int local42 = local33.anInt9439;
				@Pc(45) int local45 = local33.anInt9437;
				@Pc(55) int local55 = local45 + Static110.anInt3012 | Static110.anInt3014 + local42 << 14;
				@Pc(75) int local75 = (local28 - local45) * (-local45 + local28) + (local19 - local42) * (-local42 + local19);
				if (local12 < 0 || local75 < local14) {
					local14 = local75;
					local12 = local55;
				}
			}
		}
		return local12;
	}
}

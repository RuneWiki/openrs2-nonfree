import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
	public static boolean method2771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static234.aBoolean411) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static297.aClass247ArrayArray2[local13] == null || Static297.aClass247ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class247 local35 = Static297.aClass247ArrayArray2[local13][local17];
		@Pc(46) Class4_Sub39 local46;
		if (arg1 == -1 && local35.anInt6840 == 0) {
			for (local46 = (Class4_Sub39) Static206.aClass183_28.method4140(); local46 != null; local46 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
				if (local46.anInt5699 == 47 || local46.anInt5699 == 1002 || local46.anInt5699 == 9 || local46.anInt5699 == 48 || local46.anInt5699 == 60) {
					for (@Pc(136) Class247 local136 = Static392.method5121(local46.anInt5697); local136 != null; local136 = Static12.method125(local136)) {
						if (local136.anInt6809 == local35.anInt6809) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class4_Sub39) Static206.aClass183_28.method4140(); local46 != null; local46 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
				if (arg1 == local46.anInt5696 && local46.anInt5697 == local35.anInt6809 && (local46.anInt5699 == 47 || local46.anInt5699 == 1002 || local46.anInt5699 == 9 || local46.anInt5699 == 48 || local46.anInt5699 == 60)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIILclient!rd;)V")
	public static void method2773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class202 arg3) {
		for (@Pc(14) Class4_Sub8 local14 = (Class4_Sub8) Static281.aClass183_34.method4140(); local14 != null; local14 = (Class4_Sub8) Static281.aClass183_34.method4144()) {
			if (local14.anInt619 == arg2 && local14.anInt614 == arg1 << 7 && local14.anInt613 == arg0 << 7 && local14.aClass202_1.anInt5823 == arg3.anInt5823) {
				if (local14.aClass4_Sub15_Sub3_2 != null) {
					Static360.aClass4_Sub15_Sub2_2.method2955(local14.aClass4_Sub15_Sub3_2);
					local14.aClass4_Sub15_Sub3_2 = null;
				}
				if (local14.aClass4_Sub15_Sub3_1 != null) {
					Static360.aClass4_Sub15_Sub2_2.method2955(local14.aClass4_Sub15_Sub3_1);
					local14.aClass4_Sub15_Sub3_1 = null;
				}
				local14.method5684();
				return;
			}
		}
	}
}

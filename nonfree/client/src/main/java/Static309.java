import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
	public static final int[] anIntArray363 = new int[3];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)I")
	public static int method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg0 : arg1;
		@Pc(35) int local35 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg0 : arg2;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local35 : -local35);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!gba;")
	public static Class3_Sub22 method5218() {
		if (Static361.aClass276_14 == null || Static647.aClass271_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub22 local21 = (Class3_Sub22) Static647.aClass271_1.method6849(); local21 != null; local21 = (Class3_Sub22) Static647.aClass271_1.method6849()) {
			@Pc(29) Class269 local29 = Static361.aClass115_3.method3752(local21.anInt4123);
			if (local29 != null && local29.aBoolean692 && local29.method6796(Static361.anInterface6_2)) {
				return local21;
			}
		}
		return null;
	}
}

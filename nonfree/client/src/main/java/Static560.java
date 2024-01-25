import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!rba;I)Lclient!b;")
	public static Class21_Sub1 method7830(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) Class21 local7 = Static582.method8682(arg0);
		@Pc(11) int local11 = arg0.method5312();
		@Pc(21) int local21 = arg0.method5312();
		return new Class21_Sub1(local7.aClass304_9, local7.aClass216_9, local7.anInt3469, local7.anInt3465, local7.anInt3462, local7.anInt3460, local7.anInt3467, local7.anInt3463, local7.anInt3466, local11, local21);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(III)I")
	public static int method7831(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}
}

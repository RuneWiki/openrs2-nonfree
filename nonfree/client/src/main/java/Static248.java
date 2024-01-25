import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
	public static int anInt4202;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBII)Lclient!ta;")
	public static Class3_Sub3_Sub6 method3821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class189 local11 = Static30.aClass189ArrayArrayArray2[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class3_Sub3_Sub6 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class242 local27 = local11.aClass242_2; local27 != null; local27 = local27.aClass242_4) {
			@Pc(31) Class3_Sub3 local31 = local27.aClass3_Sub3_2;
			if (local31 instanceof Class3_Sub3_Sub6) {
				@Pc(37) Class3_Sub3_Sub6 local37 = (Class3_Sub3_Sub6) local31;
				@Pc(47) int local47 = (local37.method5512() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt6675 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6677 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt6675 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt6677 >> 7;
				if (local55 <= arg2 && arg1 >= local63 && local70 >= arg2 && local77 >= arg1) {
					@Pc(111) int local111 = (local77 + 1 - arg1) * (-arg2 + local70 - -1);
					if (local111 > local24) {
						local17 = local37;
						local24 = local111;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method3823(@OriginalArg(0) Class3_Sub3_Sub6_Sub1 arg0) {
		@Pc(11) Class6_Sub14 local11 = (Class6_Sub14) Static417.aClass137_35.method3175((long) arg0.anInt6731);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub5_Sub4_1 != null) {
			Static371.aClass6_Sub5_Sub2_2.method2168(local11.aClass6_Sub5_Sub4_1);
			local11.aClass6_Sub5_Sub4_1 = null;
		}
		local11.method5977();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(CI)C")
	public static char method3824(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}

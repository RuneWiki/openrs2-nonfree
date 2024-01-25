import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt4469;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!nc;")
	public static final Class7_Sub27 aClass7_Sub27_2 = new Class7_Sub27(0, -1);

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[Lclient!kq;")
	public static final Class125[] aClass125Array1 = new Class125[6];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)C")
	public static char method3944(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(45) char local45 = Static36.aCharArray1[local7 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local7 = local45;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!pe;IILclient!bi;)V")
	public static void method3946(@OriginalArg(1) Class89 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3) {
		if (arg3.anInt520 == 2) {
			for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
				@Pc(16) int local16 = arg3.anIntArray72[local7] - 1;
				if (local16 != -1) {
					@Pc(54) boolean local54;
					if (Static127.anInt2799 == 1 && Static341.anInt6489 == local7 && arg3.anInt492 == Static150.anInt1962) {
						local54 = Static51.method1098(arg0, null, arg3.anIntArray69[local7], 2, 0, local16, arg3.anInt487) == null;
						if (local54) {
							Static196.aClass74_30.method1802(new Class7_Sub34(local16, arg3.anIntArray69[local7], 2, 0, arg3.anInt487, false));
						}
					} else {
						local54 = Static51.method1098(arg0, null, arg3.anIntArray69[local7], 1, -13623264, local16, arg3.anInt487) == null;
						if (local54) {
							Static196.aClass74_30.method1802(new Class7_Sub34(local16, arg3.anIntArray69[local7], 1, -13623264, arg3.anInt487, false));
						}
					}
				}
			}
		} else if (arg3.anInt520 == 5) {
			@Pc(149) boolean local149 = Static51.method1098(arg0, arg3.aBoolean33 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null, arg3.anInt510, arg3.anInt508, arg3.anInt545 | 0xFF000000, arg3.anInt526, arg3.anInt487) == null;
			if (local149) {
				Static196.aClass74_30.method1802(new Class7_Sub34(arg3.anInt526, arg3.anInt510, arg3.anInt508, arg3.anInt545 | 0xFF000000, arg3.anInt487, arg3.aBoolean33));
			}
		}
	}
}

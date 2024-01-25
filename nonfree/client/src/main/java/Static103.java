import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_30 = new Class173(51, 7);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method2210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static486.anInt8866 <= arg2 && Static214.anInt3975 >= arg2) {
			@Pc(32) int local32 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg0);
			@Pc(38) int local38 = Static322.method5335(Static290.anInt5903, Static530.anInt9437, arg1);
			Static134.method2659(arg2, local32, local38, arg3);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BB)C")
	public static char method2211(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(38) char local38 = Static298.aCharArray4[local7 - 128];
			if (local38 == '\u0000') {
				local38 = '?';
			}
			local7 = local38;
		}
		return (char) local7;
	}
}

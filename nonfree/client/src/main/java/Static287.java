import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "[I")
	public static int[] anIntArray559;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!dm;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_91 = new Class37(50);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)C")
	public static char method5025(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(36) char local36 = Static185.aCharArray3[local7 - 128];
			if (local36 == '\u0000') {
				local36 = '?';
			}
			local7 = local36;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
	public static void method5027() {
		@Pc(10) Class37 local10 = Static246.aClass37_80;
		synchronized (Static246.aClass37_80) {
			Static246.aClass37_80.method919();
		}
	}

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)V")
	public static void method5029() {
		if (Static251.anInt5188 > 0) {
			Static324.method5503();
		} else {
			Static148.aClass202_4 = Static81.aClass202_3;
			Static81.aClass202_3 = null;
			Static16.method298(40);
		}
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!za", name = "g", descriptor = "I")
	public static int anInt7336;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "I")
	public static int anInt7339;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!fo;")
	public static Class82 aClass82_99;

	@OriginalMember(owner = "client!za", name = "s", descriptor = "Lclient!fo;")
	public static Class82 aClass82_100;

	@OriginalMember(owner = "client!za", name = "d", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_176 = new Class119("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!za", name = "p", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_13 = new Class30("LIVE", 0);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_250 = new Class103(5, 16);

	@OriginalMember(owner = "client!za", name = "r", descriptor = "Lclient!ti;")
	public static final Class236 aClass236_4 = new Class236();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!fq;Ljava/awt/Canvas;Lclient!l;IBI)Lclient!za;")
	public static synchronized Class34 method5776(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static411.aBooleanArray26[local14]) {
				local7 = local14;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(52) Class34 local52;
		if (arg3 == 0) {
			local52 = Static145.method1630(arg1, arg2, local7);
		} else if (arg3 == 1) {
			local52 = Static301.method4120(arg1, arg0, arg4, arg2, local7);
		} else if (arg3 == 2) {
			local52 = Static339.method4538(arg2, arg0, arg1, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static411.aBooleanArray26[local7] = true;
		return local52;
	}
}

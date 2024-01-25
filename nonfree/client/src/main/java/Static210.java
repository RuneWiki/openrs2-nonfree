import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!im", name = "B", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_8;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_89 = new Class73(98, -1);

	@OriginalMember(owner = "client!im", name = "I", descriptor = "I")
	public static int anInt4254 = -1;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "I")
	public static int anInt4255 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZBZ)V")
	public static void method3727(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static133.anInt2980++;
			Static439.method6253();
		}
		if (arg0) {
			Static16.anInt469++;
			Static177.method3237();
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(III)I")
	public static int method3728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 + arg0 * 57;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!pfa;)I")
	public static int method3729(@OriginalArg(1) Class251 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5782(Static339.anInt6133)) {
			local5++;
		}
		if (arg0.method5782(Static155.anInt3331)) {
			local5++;
		}
		if (arg0.method5782(Static105.anInt2025)) {
			local5++;
		}
		if (arg0.method5782(Static293.anInt5469)) {
			local5++;
		}
		if (arg0.method5782(Static128.anInt2926)) {
			local5++;
		}
		if (arg0.method5782(Static326.anInt5970)) {
			local5++;
		}
		if (arg0.method5782(Static174.anInt3687)) {
			local5++;
		}
		if (arg0.method5782(Static570.anInt9342)) {
			local5++;
		}
		if (arg0.method5782(Static79.anInt1673)) {
			local5++;
		}
		if (arg0.method5782(Static592.anInt9586)) {
			local5++;
		}
		if (arg0.method5782(Static74.anInt1548)) {
			local5++;
		}
		if (arg0.method5782(Static92.anInt1781)) {
			local5++;
		}
		if (arg0.method5782(Static394.anInt6930)) {
			local5++;
		}
		if (arg0.method5782(Static185.anInt3863)) {
			local5++;
		}
		if (arg0.method5782(Static565.anInt6658)) {
			local5++;
		}
		if (arg0.method5782(Static15.anInt415)) {
			local5++;
		}
		return local5;
	}
}

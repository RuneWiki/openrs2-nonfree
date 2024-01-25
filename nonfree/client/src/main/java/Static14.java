import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	public static int anInt331;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_6 = new Class25(12, 8);

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_7 = new Class231("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IB)I")
	public static int method326(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}

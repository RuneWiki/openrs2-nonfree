import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!ek;)Lclient!vu;")
	public static Class50_Sub3 method5436(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(7) Class50 local7 = Static279.method4475(arg0);
		@Pc(11) int local11 = arg0.method7054();
		@Pc(15) int local15 = arg0.method7054();
		@Pc(19) int local19 = arg0.method7054();
		@Pc(23) int local23 = arg0.method7054();
		@Pc(27) int local27 = arg0.method7054();
		@Pc(36) int local36 = arg0.method7054();
		return new Class50_Sub3(local7.aClass347_11, local7.aClass214_11, local7.anInt7638, local7.anInt7633, local7.anInt7637, local7.anInt7630, local7.anInt7631, local7.anInt7632, local7.anInt7635, local11, local15, local19, local23, local27, local36);
	}
}

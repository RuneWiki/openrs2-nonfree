import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	public static int anInt556;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_6 = new Class185(67, 8);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ha;BZ)Lclient!da;")
	public static Class34 method523(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class259 local14 = Static212.method3804(arg0, arg2, arg1);
		return local14 == null ? null : local14.aClass34_9;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!sba;)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class302 arg2) {
		Static467.aClass302_14 = arg2;
		Static151.anInt3537 = arg1;
		Static304.anInt6167 = arg0;
	}
}

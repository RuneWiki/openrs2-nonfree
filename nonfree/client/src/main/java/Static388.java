import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public static int anInt6921;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public static int anInt6923;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_156 = new Class40(111, 8);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!dga;B)Lclient!tf;")
	public static Class253_Sub1 method5782(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) Class253 local7 = Static533.method7410(arg0);
		@Pc(11) int local11 = arg0.method5994();
		return new Class253_Sub1(local7.anInt8137, local7.aClass277_11, local7.aClass137_14, local7.anInt8132, local7.anInt8135, local11);
	}
}

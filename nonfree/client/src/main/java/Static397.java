import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array15;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_99 = new Class242("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt6817 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tl;I)Lclient!ot;")
	public static Class180 method5287(@OriginalArg(0) Class4_Sub30 arg0) {
		@Pc(7) Class180 local7 = new Class180();
		local7.anInt5303 = arg0.method4877();
		local7.aClass4_Sub1_Sub10_1 = Static390.aClass221_2.method5054(local7.anInt5303);
		return local7;
	}
}

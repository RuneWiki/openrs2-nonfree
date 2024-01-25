import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!rj;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public static int anInt960 = 0;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
	public static final int[] anIntArray190 = new int[5];

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!jd;")
	public static final Class117 aClass117_2 = new Class117("WTQA", 2);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Lclient!ml;")
	public static Class138_Sub1 method804(@OriginalArg(1) int arg0) {
		return Static195.aBoolean279 && Static206.anInt3798 <= arg0 && Static133.anInt2726 >= arg0 ? Static48.aClass138_Sub1Array1[arg0 - Static206.anInt3798] : null;
	}
}

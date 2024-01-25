import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[Lclient!uea;")
	public static Class28_Sub4_Sub2_Sub1[] aClass28_Sub4_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_6 = new Class228(9, 0, 4, 1);

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public static int anInt4968 = 0;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_6 = new Class94();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!jp;I)Lclient!aia;")
	public static Class14 method4571(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(12) int local12 = arg0.method8618();
		return new Class14(local12);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lclient!ei;")
	public static Class79 method4572() {
		try {
			return (Class79) Class.forName("Class79_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class79_Sub2();
		}
	}
}

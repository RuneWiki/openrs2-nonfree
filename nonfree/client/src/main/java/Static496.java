import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!sw", name = "B", descriptor = "Lclient!ue;")
	public static final Class172 aClass172_1 = Static185.method3240();

	@OriginalMember(owner = "client!sw", name = "J", descriptor = "[Lclient!nn;")
	public static final Class228[] aClass228Array1 = new Class228[2048];

	@OriginalMember(owner = "client!sw", name = "L", descriptor = "I")
	public static int anInt8340 = 500;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)Lclient!jo;")
	public static Class20_Sub6 method6924() {
		@Pc(16) Class20_Sub6 local16 = (Class20_Sub6) Static392.aClass349_11.method7658();
		if (local16 == null) {
			return new Class20_Sub6();
		} else {
			Static269.anInt5041--;
			return local16;
		}
	}
}

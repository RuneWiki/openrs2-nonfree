import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pfa", name = "C", descriptor = "Lclient!wo;")
	public static Class362 aClass362_168;

	@OriginalMember(owner = "client!pfa", name = "I", descriptor = "[Lclient!hd;")
	public static Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!pfa", name = "y", descriptor = "I")
	public static int anInt7642 = 0;

	@OriginalMember(owner = "client!pfa", name = "A", descriptor = "Z")
	public static final boolean aBoolean524 = false;

	@OriginalMember(owner = "client!pfa", name = "F", descriptor = "I")
	public static int anInt7647 = 16777215;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)Z")
	public static boolean method6306() {
		@Pc(12) Class4 local12 = Static40.aClass244_4.aClass4_185.aClass4_286;
		if (local12 == null || Static40.aClass244_4.aClass4_185 == local12) {
			return false;
		}
		@Pc(23) Class4_Sub39 local23 = (Class4_Sub39) local12;
		if (local23.anInt8541 >= 2000) {
			local23.anInt8541 -= 2000;
		}
		return local23.anInt8541 == 1007;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public static int anInt3880;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_57 = new Class186(48, 11);

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_21 = new Class316(20);

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_79 = new Class114("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!h;")
	public static final Class114 aClass114_80 = new Class114("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Lclient!jj;")
	public static Class1_Sub25 method3465() {
		if (Static451.aClass38_28 == null || Static328.aClass157_1 == null) {
			return null;
		}
		for (@Pc(19) Class1_Sub25 local19 = (Class1_Sub25) Static328.aClass157_1.method4037(); local19 != null; local19 = (Class1_Sub25) Static328.aClass157_1.method4037()) {
			@Pc(26) Class24 local26 = Static451.aClass250_3.method6143(local19.anInt4556);
			if (local26 != null && local26.aBoolean100 && local26.method1184(Static451.anInterface10_2)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)Z")
	public static boolean method3467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static542.aByteArrayArrayArray17[1][arg0][arg1] & 0x2) != 0;
	}
}

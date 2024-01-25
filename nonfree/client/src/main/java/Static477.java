import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!tia;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "[Lclient!s;")
	public static Class259[] aClass259Array3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!or", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	// $FF: synthetic field
	@OriginalMember(owner = "client!or", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass20;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_58 = new Class342();

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_118 = new Class397(106, 0);

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public static int anInt7514 = -1;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I")
	public static int method6490() {
		@Pc(14) int local14 = 0;
		@Pc(27) Field[] local27 = (aClass19 == null ? (aClass19 = Class63_Sub5.a("eha")) : aClass19).getDeclaredFields();
		for (@Pc(31) int local31 = 0; local31 < local27.length; local31++) {
			@Pc(37) Field local37 = local27[local31];
			if ((aClass20 == null ? (aClass20 = Class63_Sub5.a("pca")) : aClass20).isAssignableFrom(local37.getType())) {
				local14++;
			}
		}
		return local14 + 1;
	}
}

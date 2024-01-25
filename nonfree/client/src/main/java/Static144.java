import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_160 = new Class88("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
	public static int anInt5610 = 0;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
	public static int anInt5613 = 0;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_13 = new Class225(2, 4, 4, 0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Lclient!oca;")
	public static Class225 method4712(@OriginalArg(0) int arg0) {
		@Pc(13) Class225[] local13 = Static394.method6202();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt6500 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}
}

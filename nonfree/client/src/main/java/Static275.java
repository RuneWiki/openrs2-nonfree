import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!in;")
	public static Class169 aClass169_135;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
	public static int anInt5119 = 0;

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "[Lclient!baa;")
	public static final Class2_Sub6[] aClass2_Sub6Array1 = new Class2_Sub6[1024];

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "F")
	public static float aFloat107 = 0.25F;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public static void method4672(@OriginalArg(1) int arg0) {
		if (!Static39.method9317(arg0)) {
			return;
		}
		@Pc(19) Class357[] local19 = Static111.aClass357ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class357 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt10467 = 0;
				local27.anInt10408 = 1;
				local27.anInt10475 = 0;
			}
		}
	}
}

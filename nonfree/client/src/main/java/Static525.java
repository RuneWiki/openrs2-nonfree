import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static525 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!pl;")
	public static Class259 aClass259_170;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!f;")
	public static Class39 aClass39_38;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_284 = new Class363(36, 10);

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[S")
	public static short[] aShortArray142 = new short[256];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public static void method8003(@OriginalArg(1) int arg0) {
		if (Static53.anIntArray65 == null || Static53.anIntArray65.length < arg0) {
			Static53.anIntArray65 = new int[arg0];
		}
	}
}

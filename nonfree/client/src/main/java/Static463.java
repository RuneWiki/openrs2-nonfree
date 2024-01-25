import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!ri;")
	public static Class284 aClass284_128;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array13;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!qe;")
	public static final Class269 aClass269_8 = new Class269();

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
	public static boolean aBoolean557 = false;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!pca;")
	public static Class251 aClass251_12 = null;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V")
	public static void method6361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class263 local14 = Static363.aClass263ArrayArray5[arg1][arg0];
		if (local14 != null) {
			Static9.anInt82 = local14.anInt7482;
			Static462.anInt8079 = local14.anInt7479;
			Static222.anInt4596 = local14.anInt7481;
		}
		Static406.method5726();
	}
}

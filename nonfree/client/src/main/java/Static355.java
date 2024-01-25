import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt6322;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!wu;")
	public static Class384 aClass384_92;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_128 = new Class136(7, 6);

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Z")
	public static final boolean aBoolean530 = false;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static void method5608() {
		@Pc(6) Class293 local6 = Static580.aClass293_75;
		synchronized (Static580.aClass293_75) {
			Static580.aClass293_75.method6930();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	public static void method5610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg3 <= arg0) {
			for (local14 = arg3; local14 < arg0; local14++) {
				Static267.anIntArrayArray20[local14][arg1] = arg2;
			}
		} else {
			for (local14 = arg0; local14 < arg3; local14++) {
				Static267.anIntArrayArray20[local14][arg1] = arg2;
			}
		}
	}
}

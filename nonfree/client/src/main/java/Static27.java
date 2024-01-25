import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!gf;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "Lclient!ib;")
	public static final Class90 aClass90_1 = Static142.method2519();

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
	public static int anInt545 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBI)I")
	public static int method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg2 & 0xFF00) * arg0 & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return (((arg1 & 0xFF00) * local31 & 0xFF0000 | (arg1 & 0xFF00FF) * local31 & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method486() {
		if (Static155.aBoolean230) {
			return;
		}
		Static289.aBoolean472 = true;
		Static155.aBoolean230 = true;
		if (Static131.aBoolean194) {
			Static29.aFloat7 = (int) Static29.aFloat7 - 17 & 0xFFFFFFF0;
		} else {
			Static215.aFloat55 += (-12.0F - Static215.aFloat55) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!ij;ZLclient!ij;Z)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) Class93 arg2) {
		Static317.aClass93_120 = arg2;
		Static226.aClass93_85 = arg1;
		Static53.aBoolean71 = true;
		Static170.anInt3410 = arg0;
	}
}

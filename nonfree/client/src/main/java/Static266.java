import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
	public static int anInt5098;

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
	public static int anInt5101 = 104;

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "Ljava/lang/String;")
	public static final String aString300 = "wave2:";

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
	public static void method4534() {
		@Pc(1) Class66 local1 = Static48.aClass66_15;
		synchronized (Static48.aClass66_15) {
			Static48.aClass66_15.method1933();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)I")
	public static int method4535(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
	public static void method4536(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub9_Sub16 local13 = Static239.method4052(6, arg0);
		local13.method4138();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIII)V")
	public static void method4538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static314.anInt6018 && Static334.anInt6315 >= arg3) {
			@Pc(15) int local15 = Static133.method5819(Static80.anInt4809, arg0, Static184.anInt6250);
			@Pc(21) int local21 = Static133.method5819(Static80.anInt4809, arg2, Static184.anInt6250);
			Static103.method2060(arg3, arg1, local15, local21);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!qq;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "[Lclient!wi;")
	public static final Class247[] aClass247Array1 = new Class247[8];

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Lclient!ab;")
	public static Class3 aClass3_2 = null;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
	public static final int anInt284 = 1407;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 + arg4;
		@Pc(15) int local15 = arg0 - arg4;
		for (@Pc(17) int local17 = arg6; local17 < local10; local17++) {
			Static307.method5019(Static152.anIntArrayArray30[local17], arg3, arg5, arg1);
		}
		for (@Pc(45) int local45 = arg0; local45 > local15; local45--) {
			Static307.method5019(Static152.anIntArrayArray30[local45], arg3, arg5, arg1);
		}
		@Pc(63) int local63 = arg4 + arg1;
		@Pc(68) int local68 = arg3 - arg4;
		for (@Pc(70) int local70 = local10; local70 <= local15; local70++) {
			@Pc(76) int[] local76 = Static152.anIntArrayArray30[local70];
			Static307.method5019(local76, local63, arg5, arg1);
			Static307.method5019(local76, local68, arg2, local63);
			Static307.method5019(local76, arg3, arg5, local68);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!g;I)Lclient!bg;")
	public static Class24 method189(@OriginalArg(1) Class83 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1979(arg1);
		return local8 == null ? null : new Class24(local8);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method190() {
		@Pc(5) Class41 local5 = Static236.aClass41_55;
		synchronized (Static236.aClass41_55) {
			Static236.aClass41_55.method826(5);
		}
		local5 = Static157.aClass41_40;
		synchronized (Static157.aClass41_40) {
			Static157.aClass41_40.method826(5);
		}
	}
}

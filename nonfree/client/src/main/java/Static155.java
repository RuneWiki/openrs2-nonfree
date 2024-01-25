import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "F")
	public static float aFloat64 = 0.0F;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method3612() {
		@Pc(5) Class66 local5 = Static59.aClass66_20;
		synchronized (Static59.aClass66_20) {
			Static59.aClass66_20.method1933();
		}
		local5 = Static43.aClass66_14;
		synchronized (Static43.aClass66_14) {
			Static43.aClass66_14.method1933();
		}
		local5 = Static287.aClass66_96;
		synchronized (Static287.aClass66_96) {
			Static287.aClass66_96.method1933();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIII)V")
	public static void method3613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(10, arg2);
		local8.method4140();
		local8.anInt4724 = arg1;
		local8.anInt4723 = arg0;
		local8.anInt4721 = arg3;
	}
}

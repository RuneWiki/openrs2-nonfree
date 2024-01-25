import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "W", descriptor = "Lclient!cj;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
	public static int anInt345;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "S")
	public static short aShort1 = 256;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public static void method303() {
		Static41.aClass66_12.method1933();
		Static265.aClass66_101.method1933();
		Static216.aClass66_73.method1933();
		Static168.aClass66_60.method1933();
		Static148.aClass66_50.method1933();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	public static void method304() {
		@Pc(5) Class66 local5 = Static173.aClass66_80;
		synchronized (Static173.aClass66_80) {
			Static173.aClass66_80.method1944(5);
		}
		local5 = Static68.aClass66_27;
		synchronized (Static68.aClass66_27) {
			Static68.aClass66_27.method1944(5);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIB)V")
	public static void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(15, 0);
		local8.method4140();
		local8.anInt4721 = arg1;
		local8.anInt4723 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V")
	public static void method307() {
		if (Static228.anIntArray320 != null && Static73.anIntArray94 != null) {
			return;
		}
		Static73.anIntArray94 = new int[256];
		Static228.anIntArray320 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static228.anIntArray320[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static73.anIntArray94[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}
}

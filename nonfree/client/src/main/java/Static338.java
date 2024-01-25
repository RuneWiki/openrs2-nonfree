import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!bt;")
	public static Class34 aClass34_73;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array10;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_91 = new Class216(87, 2);

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
	public static final int[] anIntArray411 = new int[2];

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt5228 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLclient!bn;)V")
	public static void method4621(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11_Sub1 arg1) {
		Static657.anInt10371 = 0;
		Static455.aBoolean580 = false;
		Static341.method4652(arg1);
		Static535.method7192(arg1);
		if (Static455.aBoolean580) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt10466) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10466 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method4622() {
		@Pc(1) Class352 local1 = Static511.aClass352_58;
		synchronized (Static511.aClass352_58) {
			Static511.aClass352_58.method7656();
		}
		local1 = Static261.aClass352_36;
		synchronized (Static261.aClass352_36) {
			Static261.aClass352_36.method7656();
		}
	}
}

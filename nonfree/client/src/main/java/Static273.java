import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_88 = new Class60();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!nka;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_80 = new Class225(20, -2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZIII)V")
	public static void method3822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(10, (long) arg3);
		local9.method6239();
		local9.anInt6938 = arg2;
		local9.anInt6936 = arg1;
		local9.anInt6934 = arg0;
	}
}

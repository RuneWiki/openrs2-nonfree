import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public static int anInt6831;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "Lclient!hi;")
	public static Class80 aClass80_17;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_210 = new Class217(96, 5);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIZFI)[I")
	public static int[] method5917(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4();
		local10.aBoolean14 = true;
		local10.anInt271 = 4;
		local10.anInt273 = 35;
		local10.anInt272 = 8;
		local10.anInt265 = (int) (arg0 * 4096.0F);
		local10.anInt277 = 8;
		local10.method6008();
		Static264.method4800(1, 2048);
		local10.method316(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IC)C")
	public static char method5919(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}

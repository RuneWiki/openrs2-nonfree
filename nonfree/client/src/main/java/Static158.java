import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "Lclient!uj;")
	public static Class242 aClass242_2;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	public static final int anInt2833 = 328;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_6 = new Class60(0, 3);

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "S")
	public static short aShort56 = 32767;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(FIFFBLclient!ee;FFIII)[B")
	public static byte[] method2500(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) Class68 arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static21.method251(0, arg1, arg3, arg4, arg2, arg0, arg5, local15);
		return local15;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)V")
	public static void method2501(@OriginalArg(0) int arg0) {
		Static167.method2608();
		@Pc(19) int local19 = Static157.aClass255_1.method5817(arg0).anInt7197;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static237.aClass80_1.anIntArray99[arg0];
		if (local19 == 5) {
			Static82.anInt1486 = local27;
		}
		if (local19 == 6) {
			Static147.anInt3260 = local27;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!oo;Lclient!oo;)V")
	public static void method2502(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_261 != null) {
			arg0.method5965();
		}
		arg0.aClass1_262 = arg1;
		arg0.aClass1_261 = arg1.aClass1_261;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}
}

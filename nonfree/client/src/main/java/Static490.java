import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "[I")
	public static int[] anIntArray539;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
	public static int anInt8335;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
	public static int anInt8337;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_290 = new Class179(5, -1);

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "[Lclient!dn;")
	public static final Class70[] aClass70Array1 = new Class70[6];

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
	public static int anInt8336 = 0;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	public static int anInt8338 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!ae;B)Lclient!ce;")
	public static Class6_Sub10 method7096(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1) {
		@Pc(8) byte[] local8 = arg1.method267(arg0);
		return local8 == null ? null : new Class6_Sub10(local8);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public static void method7097() {
		if (Static561.anInt9357 == -1) {
			return;
		}
		@Pc(11) int local11 = Static193.aClass128_1.method5191();
		@Pc(15) int local15 = Static193.aClass128_1.method5188();
		@Pc(22) Class6_Sub27 local22 = (Class6_Sub27) Static60.aClass362_8.method8538();
		if (local22 != null) {
			local11 = local22.method8184();
			local15 = local22.method8188();
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static594.aBoolean693) {
			local38 = Static234.method3562();
			local40 = Static314.method4504();
		}
		Static318.method4576(local38, local38, local15, Static449.anInt7506 + local38, local40, Static348.anInt5935 + local40, local38 + local11, local11, local40, local15 + local40, Static561.anInt9357);
		if (Static562.aClass321_46 != null) {
			Static648.method8830(local11 + local38, local40 + local15);
		}
	}
}

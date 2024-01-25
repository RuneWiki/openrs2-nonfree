import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
	public static int anInt7328;

	@OriginalMember(owner = "client!oja", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_77 = new Class387(82, 1);

	@OriginalMember(owner = "client!oja", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_154 = new Class109(20, 7);

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(BI)I")
	public static int method6316(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)V")
	public static void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 3650) {
			anInt7328 = 15;
		}
		Static261.anInt4523 = arg1;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILclient!tia;)[I")
	public static int[] method6321(@OriginalArg(1) Class5_Sub50 arg0) {
		@Pc(10) Class5_Sub23 local10 = new Class5_Sub23(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8502(10);
		local10.method8486(local13[0]);
		local10.method8486(local13[1]);
		local10.method8486(local13[2]);
		local10.method8486(local13[3]);
		if (-24197 != -24197) {
			method6318(45, 20);
		}
		for (@Pc(72) int local72 = 0; local72 < 10; local72++) {
			local10.method8486((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8480((int) (Math.random() * 9.9999999E7D));
		local10.method8494(Static538.aBigInteger6, Static546.aBigInteger10);
		arg0.aClass5_Sub23_Sub2_2.method8528(local10.anInt9869, 0, local10.aByteArray102);
		return local13;
	}
}

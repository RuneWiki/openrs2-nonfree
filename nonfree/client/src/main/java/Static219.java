import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!at;")
	public static Class16 aClass16_19;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	public static final int anInt6121 = 1401;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_182 = new Class102(77, 8);

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	public static final int[] anIntArray527 = new int[13];

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	public static int anInt6125 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!sv;I)V")
	public static void method4781(@OriginalArg(0) Class2_Sub13 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static409.anInt6678; local13++) {
			@Pc(19) int local19 = arg0.method3588();
			@Pc(23) int local23 = arg0.method3555();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static379.aClass65_Sub1Array5[local19] != null) {
				Static379.aClass65_Sub1Array5[local19].anInt2401 = local23;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBI[B)[B")
	public static byte[] method4783(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static464.method1964(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZIIII)V")
	public static void method4784(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static288.anInt4743 == 0) {
			Static21.method133(false);
		} else {
			Static124.anInt1088 = Static288.anInt4743;
			Static424.method5112(0);
		}
		Static79.anInt1500 = arg2;
		Static169.anInt2875 = arg1;
		Static320.aBoolean409 = arg0;
		Static282.method2790(arg3);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_16 = new Class220(260);

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_8 = new Class175(6, 4);

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "[I")
	public static final int[] anIntArray241 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!qq;Lclient!wn;IIZI)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg4) {
			Static410.aClass12_19.method5665((Static235.anInt4053 - Static410.aClass12_19.method5654()) / 2, (Static381.anInt6279 - Static410.aClass12_19.method5655()) / 2);
			Static349.aClass12_17.method5665((Static235.anInt4053 - Static349.aClass12_17.method5654()) / 2, 18);
		}
		arg2.method5633(Static235.anInt4053 / 2, Static381.anInt6279 / 2 - 26, arg5, -1, (Static323.aClass44_4 == Static307.aClass44_2 ? Static424.aClass231_7 : Static396.aClass231_102).method5138(Static382.anInt6289));
		@Pc(67) int local67 = Static381.anInt6279 / 2 - 18;
		arg1.method3506(Static235.anInt4053 / 2 - 152, local67, 304, 34, arg3, 0);
		arg1.method3506(Static235.anInt4053 / 2 - 151, local67 + 1, 302, 32, 0, 0);
		arg1.method3559(Static235.anInt4053 / 2 - 150, local67 + 2, Static402.anInt6639 * 3, 30, arg0, 0);
		arg1.method3559(Static402.anInt6639 * 3 + Static235.anInt4053 / 2 - 150, local67 - -2, 300 - Static402.anInt6639 * 3, 30, 0, 0);
		arg2.method5633(Static235.anInt4053 / 2, Static381.anInt6279 / 2 + 4, arg5, -1, Static417.aString65);
	}
}

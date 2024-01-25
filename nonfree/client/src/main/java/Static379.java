import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_130 = new Class83("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_293 = new Class22(53, -1);

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_45 = new Class183();

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!hr;)V")
	public static void method5008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub4 arg3) {
		@Pc(4) Class164 local4 = Static341.method5175(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass16_Sub4_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	public static int method5009(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

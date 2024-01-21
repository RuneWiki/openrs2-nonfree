import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Z")
	public static boolean aBoolean155;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!qa", name = "sb", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!qa", name = "Eb", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
	public static int anInt3298 = 0;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
	public static int anInt3302 = 128;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	public static int anInt3312 = 0;

	@OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_971 = Static181.method2795("<img=1>");

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
	public static int anInt3340 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method2517() {
		Static175.aClass86_46.method2641();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIIIII)V")
	public static void method2523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		@Pc(38) int local38;
		if (Static158.aBoolean148 && (Static9.aByteArrayArrayArray7[0][arg1][arg4] & 0x2) == 0) {
			local38 = arg5;
			if ((Static9.aByteArrayArrayArray7[arg5][arg1][arg4] & 0x8) != 0) {
				local38 = 0;
			}
			if (local38 != Static159.anInt3223) {
				return;
			}
		}
		local38 = arg5;
		if (arg5 < 3 && (Static9.aByteArrayArrayArray7[1][arg1][arg4] & 0x2) == 2) {
			local38 = arg5 + 1;
		}
		Static120.method2081(Static117.aClass22Array1[arg5], local38, arg1, arg5, arg3, arg4);
		if (arg6 >= 0) {
			Static96.method1642(local38, false, arg5, false, arg1, arg4, arg2, arg6, arg0, Static117.aClass22Array1[arg5]);
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public static void method2526() {
		Static22.method432(Static138.anInt2942, Static89.anInt4290, Static190.anInt3767);
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public static void method2527() {
		Static135.aClass63_10 = new Class63(32);
	}
}

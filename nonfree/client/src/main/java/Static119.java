import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Lclient!oca;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_45 = new Class45("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	public static int anInt2469 = 100;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[16];

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
	public static int anInt2478 = -1;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
	public static int anInt2480 = -1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!pa;Lclient!et;IIIILclient!ha;)V")
	public static void method2307(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class91 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class104 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static170.anInt3418 == 4) {
			local16 = (int) Static135.aFloat193 & 0x3FFF;
		} else {
			local16 = Static445.anInt7798 + (int) Static135.aFloat193 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt2399 / 2, arg1.anInt2378 / 2) + 10;
		@Pc(45) int local45 = arg4 * arg4 + arg5 * arg5;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(60) int local60 = Class200_Sub1.lb[local16];
		@Pc(64) int local64 = Class200_Sub1.anIntArray576[local16];
		if (Static170.anInt3418 != 4) {
			local60 = local60 * 256 / (Static220.anInt4325 + 256);
			local64 = local64 * 256 / (Static220.anInt4325 + 256);
		}
		@Pc(96) int local96 = local60 * arg4 + local64 * arg5 >> 15;
		@Pc(107) int local107 = arg4 * local64 - local60 * arg5 >> 15;
		arg6.method7711(local96 + arg1.anInt2399 / 2 + arg2 - arg6.EA() / 2, arg1.anInt2378 / 2 + (arg3 - (local107 + arg6.ma() / 2)), arg0, arg2, arg3);
	}
}

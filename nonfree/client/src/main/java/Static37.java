import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	public static int anInt894;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
	public static int anInt891 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIFZIII)[[I")
	public static int[][] method903(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(27) Class14_Sub3_Sub31 local27 = new Class14_Sub3_Sub31();
		local27.aBoolean346 = false;
		local27.anInt5161 = (int) (arg0 * 4096.0F);
		local27.anInt5153 = 8;
		local27.anInt5154 = 4;
		local27.anInt5148 = 3;
		local27.method5998();
		Static109.method2350(64, 256);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local27.method4608(local54, local9[local54]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	public static void method904() {
		@Pc(10) Class11 local10 = Static189.aClass11_134;
		synchronized (Static189.aClass11_134) {
			Static189.aClass11_134.method214();
		}
	}
}

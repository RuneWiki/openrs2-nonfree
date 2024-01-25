import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
	public static int anInt4308;

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString52 = null;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILclient!gf;I)V")
	public static void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1) {
		if (Static505.anInt8479 >= 50 || (arg1 == null || arg1.anIntArrayArray16 == null || arg1.anIntArrayArray16.length <= arg0 || arg1.anIntArrayArray16[arg0] == null)) {
			return;
		}
		@Pc(39) int local39 = arg1.anIntArrayArray16[arg0][0];
		@Pc(43) int local43 = local39 >> 8;
		@Pc(49) int local49 = local39 >> 5 & 0x7;
		@Pc(66) int local66;
		if (arg1.anIntArrayArray16[arg0].length > 1) {
			local66 = (int) (Math.random() * (double) arg1.anIntArrayArray16[arg0].length);
			if (local66 > 0) {
				local43 = arg1.anIntArrayArray16[arg0][local66];
			}
		}
		local66 = 256;
		if (arg1.anIntArray166 != null && arg1.anIntArray165 != null) {
			local66 = Static547.method7772(arg1.anIntArray166[arg0], arg1.anIntArray165[arg0]);
		}
		if (arg1.aBoolean186) {
			Static351.method5110(local49, 255, false, 0, local43, local66);
		} else {
			Static424.method6293(local43, local49, local66, 0, 255);
		}
	}
}

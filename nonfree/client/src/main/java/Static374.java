import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!ia;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
	public static int anInt6580 = 0;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_92 = new Class242("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIILclient!tq;IBI)V")
	public static void method5106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class233 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static425.anInt7124 >= 50 || (arg3 == null || arg3.anIntArrayArray61 == null || arg1 >= arg3.anIntArrayArray61.length || arg3.anIntArrayArray61[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg3.anIntArrayArray61[arg1][0];
		@Pc(46) int local46 = local34 >> 8;
		@Pc(52) int local52 = local34 >> 5 & 0x7;
		@Pc(56) int local56 = local34 & 0x1F;
		@Pc(73) int local73;
		if (arg3.anIntArrayArray61[arg1].length > 1) {
			local73 = (int) ((double) arg3.anIntArrayArray61[arg1].length * Math.random());
			if (local73 > 0) {
				local46 = arg3.anIntArrayArray61[arg1][local73];
			}
		}
		if (local56 == 0) {
			if (arg0) {
				Static350.method4918(local52, 255, 0, local46);
			}
		} else if (Static126.aClass67_Sub1_1.anInt5855 != 0) {
			local73 = arg4 - 64 >> 7;
			@Pc(118) int local118 = arg5 - 64 >> 7;
			Static246.aClass200Array1[Static425.anInt7124++] = new Class200((byte) 1, local46, local52, 0, 255, local56 + (local118 << 8) + (local73 << 16) + (arg2 << 24));
		}
	}
}

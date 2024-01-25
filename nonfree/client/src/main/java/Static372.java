import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
	public static int anInt6703;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mc;Lclient!mv;I)Lclient!ht;")
	public static Class154 method5588(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) Class238 arg1) {
		@Pc(13) Class154 local13 = new Class154(arg1);
		@Pc(17) int local17 = arg0.method7816();
		@Pc(25) boolean local25 = (local17 & 0x1) != 0;
		@Pc(36) boolean local36 = (local17 & 0x2) != 0;
		@Pc(44) boolean local44 = (local17 & 0x4) != 0;
		if (local25) {
			local13.anIntArray231[0] = arg0.method7860();
			local13.anIntArray234[0] = arg0.method7860();
			if (arg1.anInt6873 != -1 || arg1.anInt6859 != -1) {
				local13.anIntArray231[1] = arg0.method7860();
				local13.anIntArray234[1] = arg0.method7860();
			}
			if (arg1.anInt6860 != -1 || arg1.anInt6889 != -1) {
				local13.anIntArray231[2] = arg0.method7860();
				local13.anIntArray234[2] = arg0.method7860();
			}
		}
		@Pc(115) boolean local115 = (local17 & 0x8) != 0;
		if (local36) {
			local13.anIntArray232[0] = arg0.method7860();
			local13.anIntArray233[0] = arg0.method7860();
			if (arg1.anInt6830 != -1 || arg1.anInt6897 != -1) {
				local13.anIntArray232[1] = arg0.method7860();
				local13.anIntArray233[1] = arg0.method7860();
			}
		}
		@Pc(161) int local161;
		@Pc(164) int[] local164;
		@Pc(196) int local196;
		if (local44) {
			local161 = arg0.method7860();
			local164 = new int[] { local161 & 0xF, local161 >> 4 & 0xF, local161 >> 8 & 0xF, local161 >> 12 & 0xF };
			for (local196 = 0; local196 < 4; local196++) {
				if (local164[local196] != 15) {
					local13.aShortArray67[local164[local196]] = (short) arg0.method7860();
				}
			}
		}
		if (local115) {
			local161 = arg0.method7816();
			local164 = new int[] { local161 & 0xF, local161 >> 4 & 0xF };
			for (local196 = 0; local196 < 2; local196++) {
				if (local164[local196] != 15) {
					local13.aShortArray66[local164[local196]] = (short) arg0.method7860();
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIB)V")
	public static void method5589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(19) int local19 = arg1 << 3;
		if (Static660.anInt10605 == 2) {
			Static79.anInt1141 = local7;
			Static388.anInt6926 = 0;
			Static207.anInt3885 = local19;
		}
		Static157.aFloat83 = (float) local19;
		Static298.aFloat116 = (float) local7;
		Static167.method2915();
		Static260.aBoolean411 = true;
	}
}

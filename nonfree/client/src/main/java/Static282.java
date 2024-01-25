import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "Lclient!fi;")
	public static Class109 aClass109_2;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	public static int anInt4631 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[[I)V")
	public static void method4237(@OriginalArg(1) int[][] arg0) {
		Static267.anIntArrayArray20 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!aha;[[BZ)V")
	public static void method4238(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class5_Sub12 local30 = new Class5_Sub12(local23);
				local36 = Static594.anIntArray784[local17] >> 8;
				@Pc(42) int local42 = Static594.anIntArray784[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static113.anInt1785;
				@Pc(55) int local55 = local42 * 64 - Static622.anInt10087;
				Static439.method6528();
				arg0.method380(Static622.anInt10087, local49, Static113.anInt1785, local30, Static308.aClass182Array1, local55);
				arg0.method398(local49, local55, local30, local12, Static485.aClass126_17);
				if (!arg0.aBoolean31 && Static261.anInt4343 / 8 == local36 && Static237.anInt4007 / 8 == local42 && local12[0] != -1) {
					Static374.aClass218_1 = Static499.aClass121_1.method2668(local12[2], local12[0], local12[1], local12[3], Static629.aClass20_1);
					Static202.anInt3588 = local12[4];
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local15; local132++) {
			@Pc(150) int local150 = (Static594.anIntArray784[local132] >> 8) * 64 - Static113.anInt1785;
			local36 = (Static594.anIntArray784[local132] & 0xFF) * 64 - Static622.anInt10087;
			@Pc(165) byte[] local165 = arg1[local132];
			if (local165 == null && Static237.anInt4007 < 800) {
				Static439.method6528();
				arg0.method388(local36, local150);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method4240() {
		Static3.anInt29 = 2;
		Static166.aClass384_43 = null;
		Static617.aBoolean818 = false;
		Static198.anInt3546 = -1;
		Static583.aClass5_Sub16_Sub1_6 = null;
		Static474.anInt7949 = -1;
		Static210.anInt3640 = 0;
		Static571.anInt9391 = 1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ee;B)Ljava/lang/String;")
	public static String method4241(@OriginalArg(0) Class5_Sub12 arg0) {
		return Static32.method7382(arg0);
	}
}

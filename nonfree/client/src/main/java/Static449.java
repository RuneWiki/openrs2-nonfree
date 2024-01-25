import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt7502;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public static int anInt7506;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
	public static final int[] anIntArray503 = new int[3];

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Z")
	public static boolean aBoolean502 = false;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!gga;BLclient!vt;)V")
	public static void method6493(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1, @OriginalArg(3) Class380 arg2) {
		@Pc(9) Class6_Sub29 local9 = new Class6_Sub29();
		local9.anInt4677 = arg1.method8374();
		local9.anInt4675 = arg1.method8369();
		local9.anIntArray264 = new int[local9.anInt4677];
		local9.aClass103Array1 = new Class103[local9.anInt4677];
		local9.anIntArray265 = new int[local9.anInt4677];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt4677][][];
		local9.anIntArray263 = new int[local9.anInt4677];
		local9.aClass103Array2 = new Class103[local9.anInt4677];
		for (@Pc(53) int local53 = 0; local53 < local9.anInt4677; local53++) {
			try {
				@Pc(59) int local59 = arg1.method8374();
				@Pc(75) String local75;
				@Pc(79) String local79;
				@Pc(81) int local81;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local75 = arg1.method8354();
					local79 = arg1.method8354();
					local81 = 0;
					if (local59 == 1) {
						local81 = arg1.method8369();
					}
					local9.anIntArray263[local53] = local59;
					local9.anIntArray264[local53] = local81;
					local9.aClass103Array2[local53] = arg2.method8814(Static571.method7963(local75), local79);
				} else if (local59 == 3 || local59 == 4) {
					local75 = arg1.method8354();
					local79 = arg1.method8354();
					local81 = arg1.method8374();
					@Pc(138) String[] local138 = new String[local81];
					for (@Pc(140) int local140 = 0; local140 < local81; local140++) {
						local138[local140] = arg1.method8354();
					}
					@Pc(155) byte[][] local155 = new byte[local81][];
					@Pc(166) int local166;
					if (local59 == 3) {
						for (@Pc(160) int local160 = 0; local160 < local81; local160++) {
							local166 = arg1.method8369();
							local155[local160] = new byte[local166];
							arg1.method8375(local166, local155[local160], 0);
						}
					}
					local9.anIntArray263[local53] = local59;
					@Pc(191) Class[] local191 = new Class[local81];
					for (local166 = 0; local166 < local81; local166++) {
						local191[local166] = Static571.method7963(local138[local166]);
					}
					local9.aClass103Array1[local53] = arg2.method8825(local79, Static571.method7963(local75), local191);
					local9.aByteArrayArrayArray4[local53] = local155;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray265[local53] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray265[local53] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray265[local53] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray265[local53] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray265[local53] = -5;
			}
		}
		Static403.aClass362_34.method8536(local9);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public static void method6494() {
		if (Static456.aFileOutputStream1 != null) {
			try {
				Static456.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static456.aFileOutputStream1 = null;
	}
}

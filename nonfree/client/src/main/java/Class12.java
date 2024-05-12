import sign.signlink;

public class Class12 {

	public static Class12[] aClass12Array1;

	public int anInt411;

	public Class10 aClass10_1;

	public int anInt412;

	public int[] anIntArray130;

	public int[] anIntArray131;

	public int[] anIntArray132;

	public int[] anIntArray133;

	public static void method276(boolean arg0, Class39 arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else {
				Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg1.method536("frame_head.dat", (byte[]) null, (byte) 2));
				Class1_Sub3_Sub3 var3 = new Class1_Sub3_Sub3(363, arg1.method536("frame_tran1.dat", (byte[]) null, (byte) 2));
				Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg1.method536("frame_tran2.dat", (byte[]) null, (byte) 2));
				Class1_Sub3_Sub3 var5 = new Class1_Sub3_Sub3(363, arg1.method536("frame_del.dat", (byte[]) null, (byte) 2));
				int var6 = var2.method393();
				int var7 = var2.method393();
				aClass12Array1 = new Class12[var7 + 1];
				int[] var8 = new int[500];
				int[] var9 = new int[500];
				int[] var10 = new int[500];
				int[] var11 = new int[500];
				for (int var12 = 0; var12 < var6; ++var12) {
					int var13 = var2.method393();
					Class12 var14 = aClass12Array1[var13] = new Class12();
					var14.anInt411 = var5.method391();
					int var15 = var2.method393();
					Class10 var16 = Class10.aClass10Array1[var15];
					var14.aClass10_1 = var16;
					int var17 = var2.method391();
					int var18 = -1;
					int var19 = 0;
					int var21;
					for (int var20 = 0; var20 < var17; ++var20) {
						var21 = var3.method391();
						if (var21 > 0) {
							if (var16.anIntArray128[var20] != 0) {
								for (int var22 = var20 - 1; var22 > var18; --var22) {
									if (var16.anIntArray128[var22] == 0) {
										var8[var19] = var22;
										var9[var19] = 0;
										var10[var19] = 0;
										var11[var19] = 0;
										++var19;
										break;
									}
								}
							}
							var8[var19] = var20;
							short var24 = 0;
							if (var16.anIntArray128[var8[var19]] == 3) {
								var24 = 128;
							}
							if ((var21 & 1) != 0) {
								var9[var19] = var4.method404();
							} else {
								var9[var19] = var24;
							}
							if ((var21 & 2) != 0) {
								var10[var19] = var4.method404();
							} else {
								var10[var19] = var24;
							}
							if ((var21 & 4) != 0) {
								var11[var19] = var4.method404();
							} else {
								var11[var19] = var24;
							}
							var18 = var20;
							++var19;
						}
					}
					var14.anInt412 = var19;
					var14.anIntArray130 = new int[var19];
					var14.anIntArray131 = new int[var19];
					var14.anIntArray132 = new int[var19];
					var14.anIntArray133 = new int[var19];
					for (var21 = 0; var21 < var19; ++var21) {
						var14.anIntArray130[var21] = var8[var21];
						var14.anIntArray131[var21] = var9[var21];
						var14.anIntArray132[var21] = var10[var21];
						var14.anIntArray133[var21] = var11[var21];
					}
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("10576, " + arg0 + ", " + arg1 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}
}

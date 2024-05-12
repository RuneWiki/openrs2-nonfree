import sign.signlink;

public class Class10 {

	public static Class10[] aClass10Array1;

	public int anInt385;

	public int[] anIntArray128;

	public int[][] anIntArrayArray11;

	public static void method261(boolean arg0, Class39 arg1) {
		try {
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg1.method536("base_head.dat", (byte[]) null, (byte) 2));
			Class1_Sub3_Sub3 var3 = new Class1_Sub3_Sub3(363, arg1.method536("base_type.dat", (byte[]) null, (byte) 2));
			Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg1.method536("base_label.dat", (byte[]) null, (byte) 2));
			int var5 = var2.method393();
			int var6 = var2.method393();
			aClass10Array1 = new Class10[var6 + 1];
			if (arg0) {
				throw new NullPointerException();
			} else {
				for (int var7 = 0; var7 < var5; ++var7) {
					int var8 = var2.method393();
					int var9 = var2.method391();
					int[] var10 = new int[var9];
					int[][] var11 = new int[var9][];
					for (int var12 = 0; var12 < var9; ++var12) {
						var10[var12] = var3.method391();
						int var13 = var4.method391();
						var11[var12] = new int[var13];
						for (int var14 = 0; var14 < var13; ++var14) {
							var11[var12][var14] = var4.method391();
						}
					}
					aClass10Array1[var8] = new Class10();
					aClass10Array1[var8].anInt385 = var9;
					aClass10Array1[var8].anIntArray128 = var10;
					aClass10Array1[var8].anIntArrayArray11 = var11;
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("88924, " + arg0 + ", " + arg1 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}
}

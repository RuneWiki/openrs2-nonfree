import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!ln;")
	public static Class204 aClass204_4;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	public static int anInt6932 = -1;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString100 = "";

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!qh;Lclient!n;II)V")
	public static void method5935(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub8 local9 = new Class3_Sub8();
		local9.anInt691 = arg0.method3118();
		local9.anInt693 = arg0.method3116();
		local9.aByteArrayArrayArray1 = new byte[local9.anInt691][][];
		local9.anIntArray69 = new int[local9.anInt691];
		local9.anIntArray70 = new int[local9.anInt691];
		local9.aClass192Array2 = new Class192[local9.anInt691];
		local9.anIntArray71 = new int[local9.anInt691];
		local9.aClass192Array1 = new Class192[local9.anInt691];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt691; local51++) {
			try {
				@Pc(57) int local57 = arg0.method3118();
				@Pc(74) String local74;
				@Pc(78) String local78;
				@Pc(80) int local80;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local74 = arg0.method3133();
					local78 = arg0.method3133();
					local80 = 0;
					if (local57 == 1) {
						local80 = arg0.method3116();
					}
					local9.anIntArray70[local51] = local57;
					local9.anIntArray69[local51] = local80;
					local9.aClass192Array2[local51] = arg1.method5208(local78, Static236.method3973(local74));
				} else if (local57 == 3 || local57 == 4) {
					local74 = arg0.method3133();
					local78 = arg0.method3133();
					local80 = arg0.method3118();
					@Pc(133) String[] local133 = new String[local80];
					for (@Pc(135) int local135 = 0; local135 < local80; local135++) {
						local133[local135] = arg0.method3133();
					}
					@Pc(150) byte[][] local150 = new byte[local80][];
					@Pc(161) int local161;
					if (local57 == 3) {
						for (@Pc(155) int local155 = 0; local155 < local80; local155++) {
							local161 = arg0.method3116();
							local150[local155] = new byte[local161];
							arg0.method3090(local161, local150[local155]);
						}
					}
					local9.anIntArray70[local51] = local57;
					@Pc(186) Class[] local186 = new Class[local80];
					for (local161 = 0; local161 < local80; local161++) {
						local186[local161] = Static236.method3973(local133[local161]);
					}
					local9.aClass192Array1[local51] = arg1.method5202(local78, Static236.method3973(local74), local186);
					local9.aByteArrayArrayArray1[local51] = local150;
				}
			} catch (@Pc(225) ClassNotFoundException local225) {
				local9.anIntArray71[local51] = -1;
			} catch (@Pc(232) SecurityException local232) {
				local9.anIntArray71[local51] = -2;
			} catch (@Pc(239) NullPointerException local239) {
				local9.anIntArray71[local51] = -3;
			} catch (@Pc(246) Exception local246) {
				local9.anIntArray71[local51] = -4;
			} catch (@Pc(253) Throwable local253) {
				local9.anIntArray71[local51] = -5;
			}
		}
		Static511.aClass130_51.method3548(local9);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wca", name = "U", descriptor = "Z")
	public static boolean aBoolean695;

	@OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
	public static int anInt10037 = -2;

	@OriginalMember(owner = "client!wca", name = "T", descriptor = "Lclient!j;")
	public static final Class153 aClass153_145 = new Class153("WIP", 2);

	@OriginalMember(owner = "client!wca", name = "V", descriptor = "[I")
	public static final int[] anIntArray580 = new int[4096];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([BB)[B")
	public static byte[] method7894(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static604.method6225(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
	public static void method7896() {
		if (Static40.anInt1150 < 0) {
			return;
		}
		@Pc(11) long local11 = Static96.method2000();
		Static40.anInt1150 = (int) ((long) Static40.anInt1150 + Static383.aLong183 - local11);
		if (Static40.anInt1150 > 0) {
			@Pc(31) int local31 = (Static40.anInt1150 << 8) / Static375.anInt6514;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static121.anInt2823 = ((Static196.aClass263_1.anInt7478 & 0xFF00FF) * local36 + (Static389.anInt8541 & 0xFF00FF) * local31 & 0xFF00FF00) + (local36 * (Static196.aClass263_1.anInt7478 & 0xFF00) + local31 * (Static389.anInt8541 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(78) float local78 = 1.0F - local41;
			Static271.aFloat123 = (Static196.aClass263_1.aFloat164 - Static272.aFloat124) * local78 + Static272.aFloat124;
			Static570.aFloat226 = Static39.aFloat43 + (Static196.aClass263_1.aFloat163 - Static39.aFloat43) * local78;
			Static481.aFloat179 = (Static196.aClass263_1.aFloat159 - Static196.aFloat108) * local78 + Static196.aFloat108;
			Static471.aFloat174 = Static405.aFloat157 + (Static196.aClass263_1.aFloat161 - Static405.aFloat157) * local78;
			Static288.aFloat126 = (Static196.aClass263_1.aFloat162 - Static96.aFloat66) * local78 + Static96.aFloat66;
			Static79.anInt2119 = (local31 * (Static488.anInt8419 & 0xFF00) + (Static196.aClass263_1.anInt7484 & 0xFF00) * local36 & 0xFF0000) + (local36 * (Static196.aClass263_1.anInt7484 & 0xFF00FF) + local31 * (Static488.anInt8419 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static144.anInt3368 = local31 * Static57.anInt1530 + Static196.aClass263_1.anInt7477 * local36 >> 8;
			Static108.aFloat133 = local78 * (Static196.aClass263_1.aFloat160 - Static145.aFloat102) + Static145.aFloat102;
			if (Static478.aClass47_4 != Static196.aClass263_1.aClass47_3) {
				Static111.aClass47_1 = Static196.aClass31_8.method8093(Static478.aClass47_4, Static196.aClass263_1.aClass47_3, local78, Static111.aClass47_1);
			}
		} else {
			Static570.aFloat226 = Static196.aClass263_1.aFloat163;
			Static111.aClass47_1 = Static196.aClass263_1.aClass47_3;
			Static481.aFloat179 = Static196.aClass263_1.aFloat159;
			Static40.anInt1150 = -1;
			Static144.anInt3368 = Static196.aClass263_1.anInt7477;
			Static108.aFloat133 = Static196.aClass263_1.aFloat160;
			Static271.aFloat123 = Static196.aClass263_1.aFloat164;
			Static471.aFloat174 = Static196.aClass263_1.aFloat161;
			Static79.anInt2119 = Static196.aClass263_1.anInt7484;
			Static121.anInt2823 = Static196.aClass263_1.anInt7478;
			Static288.aFloat126 = Static196.aClass263_1.aFloat162;
		}
		Static383.aLong183 = local11;
	}
}

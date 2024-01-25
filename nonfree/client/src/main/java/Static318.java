import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "F")
	public static float aFloat81 = 0.0F;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
	public static final int[] anIntArray299 = new int[32];

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt5310 = -1;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public static void method4561() {
		Static267.aClass37_3.method1026();
		Static543.aClass59_3.method1324();
		Static538.aClass114_2.method2608();
		Static466.aClass340_6.method7669();
		Static267.aClass196_1.method4472();
		Static117.aClass197_2.method4520();
		Static13.aClass213_1.method5006();
		Static366.aClass182_2.method4106();
		Static400.aClass36_1.method1023();
		Static530.aClass237_1.method5371();
		Static286.aClass319_1.method6993();
		Static461.aClass223_42.method5174();
		Static61.aClass378_1.method8704();
		Static33.aClass208_11.method4944();
		Static389.aClass335_2.method7505();
		Static256.aClass303_1.method6667();
		Static73.aClass64_3.method1501();
		Static300.aClass332_1.method7481();
		Static148.aClass320_1.method7001();
		Static598.aClass175_2.method4023();
		Static88.aClass273_1.method6040();
		Static32.aClass65_1.method1505();
		Static255.method3842();
		Static329.method4686();
		Static63.method1145();
		Static99.method1636();
		Static419.method5764();
		Static319.aClass295_29.method6462(5);
		Static513.aClass295_52.method6462(5);
		Static359.aClass295_37.method6462(5);
		Static675.aClass295_73.method6462(5);
		Static250.aClass295_17.method6462(5);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([BZII)[B")
	public static byte[] method4562(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10;
		if (arg2 > 0) {
			local10 = new byte[arg1];
			for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
				local10[local12] = arg0[local12 + arg2];
			}
		} else {
			local10 = arg0;
		}
		@Pc(34) Class155 local34 = new Class155();
		local34.method3639();
		local34.method3640((long) (arg1 * 8), local10);
		@Pc(48) byte[] local48 = new byte[64];
		local34.method3641(local48);
		return local48;
	}
}

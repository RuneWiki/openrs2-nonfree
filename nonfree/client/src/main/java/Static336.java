import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!go;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public static final int anInt6150 = 1;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public static int anInt6157 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4727(@OriginalArg(1) String arg0) {
		if (Static38.aStringArray6 == null) {
			Static78.method1439();
		}
		@Pc(12) String[] local12 = Static117.method1928('\n', arg0);
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			for (@Pc(21) int local21 = Static453.anInt7924; local21 > 0; local21--) {
				Static38.aStringArray6[local21] = Static38.aStringArray6[local21 - 1];
			}
			Static38.aStringArray6[0] = local12[local18];
			if (Static453.anInt7924 < Static38.aStringArray6.length - 1) {
				Static453.anInt7924++;
				if (Static32.anInt888 > 0) {
					Static32.anInt888++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method4729(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static198.anInt7947 = 7;
		Static251.anInt4890 = 0x1 << Static198.anInt7947;
		Static333.anInt6111 = Static251.anInt4890 >> 1;
		Static460.anInt5780 = (int) Math.sqrt((double) (Static333.anInt6111 * Static333.anInt6111 + Static333.anInt6111 * Static333.anInt6111));
		Static45.anInt1145 = Static251.anInt4890 >> 2;
		Static367.anInt6709 = Static251.anInt4890;
		Static216.anInt4346 = arg0;
		Static198.anInt7949 = arg1;
		Static235.anInt4661 = arg2;
		Static409.aClass252ArrayArrayArray3 = new Class252[4][Static216.anInt4346][Static198.anInt7949];
		Static262.aClass96Array3 = new Class96[4];
		if (arg3) {
			Static360.anIntArrayArray52 = new int[Static216.anInt4346][Static198.anInt7949];
			Static383.aByteArrayArray22 = new byte[Static216.anInt4346][Static198.anInt7949];
			Static372.aShortArrayArray6 = new short[Static216.anInt4346][Static198.anInt7949];
			Static53.aClass252ArrayArrayArray1 = new Class252[1][Static216.anInt4346][Static198.anInt7949];
			Static221.aClass96Array4 = new Class96[1];
		} else {
			Static360.anIntArrayArray52 = null;
			Static383.aByteArrayArray22 = null;
			Static372.aShortArrayArray6 = null;
			Static53.aClass252ArrayArrayArray1 = null;
			Static221.aClass96Array4 = null;
		}
		if (arg4) {
			Static457.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static135.aClass75Array1 = new Class75[65535];
			Static278.aBooleanArray19 = new boolean[65535];
			Static315.anInt5904 = 0;
		} else {
			Static457.aLongArrayArrayArray1 = null;
			Static135.aClass75Array1 = null;
			Static278.aBooleanArray19 = null;
			Static315.anInt5904 = 0;
		}
		Static272.method4042(false);
		Static160.aClass230Array1 = new Class230[1000];
		Static156.anInt3364 = 0;
		Static316.aClass230Array2 = new Class230[1000];
		Static96.anInt2298 = 0;
		Static220.anIntArrayArrayArray13 = new int[4][Static216.anInt4346 + 1][Static198.anInt7949 + 1];
		Static268.aClass30_Sub1Array3 = new Class30_Sub1[5000];
		Static12.anInt184 = 0;
		Static335.aBooleanArrayArray4 = new boolean[Static235.anInt4661 + Static235.anInt4661 + 1][Static235.anInt4661 + Static235.anInt4661 + 1];
		Static166.aBooleanArrayArray2 = new boolean[Static235.anInt4661 + Static235.anInt4661 + 2][Static235.anInt4661 + Static235.anInt4661 + 2];
		Static47.aClass9_3 = null;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(ZI)V")
	public static void method4734(@OriginalArg(0) boolean arg0) {
		Static48.anInt1182 = 0;
		Static424.anInt7540 = 0;
		Static217.method3369();
		Static161.method2661(arg0);
		Static1.method35();
		@Pc(18) boolean local18 = false;
		@Pc(37) int local37;
		for (@Pc(20) int local20 = 0; local20 < Static48.anInt1182; local20++) {
			local37 = Static362.anIntArray614[local20];
			@Pc(44) Class1_Sub27 local44 = (Class1_Sub27) Static24.aClass38_3.method765((long) local37);
			@Pc(47) Class30_Sub1_Sub1_Sub1 local47 = local44.aClass30_Sub1_Sub1_Sub1_2;
			if (Static96.aBoolean151 && Static365.method5099(local37)) {
				Static340.method4795();
			}
			if (Static187.anInt3975 != local47.anInt1239) {
				if (local47.aClass11_1.method134()) {
					Static32.method668(local47);
				}
				local47.method666(null);
				local18 = true;
				local44.method6178();
			}
		}
		if (local18) {
			Static127.anInt2832 = Static24.aClass38_3.method770();
			Static24.aClass38_3.method772(Static324.aClass1_Sub27Array2);
		}
		if (Static350.anInt6510 != Static5.aClass1_Sub3_Sub1_1.anInt1710) {
			throw new RuntimeException("gnp1 pos:" + Static5.aClass1_Sub3_Sub1_1.anInt1710 + " psize:" + Static350.anInt6510);
		}
		for (local37 = 0; local37 < Static197.anInt4078; local37++) {
			if (Static24.aClass38_3.method765((long) Static415.anIntArray701[local37]) == null) {
				throw new RuntimeException("gnp2 pos:" + local37 + " size:" + Static197.anInt4078);
			}
		}
	}
}

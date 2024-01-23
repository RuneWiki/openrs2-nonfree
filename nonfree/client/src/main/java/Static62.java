import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	public static int anInt1330 = -1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "[Lclient!fa;")
	public static Class41_Sub1[] aClass41_Sub1Array1 = new Class41_Sub1[0];

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "[I")
	public static int[] anIntArray135 = new int[14];

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
	public static int[] anIntArray136 = new int[100];

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "[I")
	public static int[] anIntArray137 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method1120(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static160.aClass59_1 != null) {
			try {
				Static160.aClass59_1.method1757(0L);
				@Pc(17) int local17 = 0;
				Static160.aClass59_1.method1765(local8);
				while (local17 < 24 && local8[local17] == 0) {
					local17++;
				}
				if (local17 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (@Pc(48) int local48 = 0; local48 < 24; local48++) {
					local8[local48] = -1;
				}
			}
		}
		arg0.method2689(24, local8);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)V")
	public static void method1121(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static130.method2227(arg0, 7);
		local4.method3911();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!bo;)V")
	public static void method1122(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub2 arg1) {
		if (arg1.anInt4692 > Static237.anInt4710) {
			Static241.method3700(arg1);
		} else if (arg1.anInt4647 < Static237.anInt4710) {
			Static60.method1069(arg1);
		} else {
			Static247.method3825(arg1);
		}
		if (arg1.anInt4680 < 128 || arg1.anInt4630 < 128 || arg1.anInt4680 >= 13184 || arg1.anInt4630 >= 13184) {
			arg1.anInt4647 = 0;
			arg1.anInt4656 = -1;
			arg1.anInt4692 = 0;
			arg1.anInt4620 = -1;
			arg1.anInt4680 = arg1.anIntArray415[0] * 128 + arg1.method3656() * 64;
			arg1.anInt4630 = arg1.anIntArray418[0] * 128 + arg1.method3656() * 64;
			arg1.method3658();
		}
		if (Static197.aClass14_Sub2_Sub1_2 == arg1 && (arg1.anInt4680 < 1536 || arg1.anInt4630 < 1536 || arg1.anInt4680 >= 11776 || arg1.anInt4630 >= 11776)) {
			arg1.anInt4656 = -1;
			arg1.anInt4620 = -1;
			arg1.anInt4647 = 0;
			arg1.anInt4692 = 0;
			arg1.anInt4680 = arg1.anIntArray415[0] * 128 + arg1.method3656() * 64;
			arg1.anInt4630 = arg1.anIntArray418[0] * 128 + arg1.method3656() * 64;
			arg1.method3658();
		}
		Static131.method2230(arg1);
		Static267.method4058(arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BJ)V")
	public static void method1123(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static148.anInt3198; local17++) {
			if (arg0 == Static255.aLongArray8[local17]) {
				Static148.anInt3198--;
				for (@Pc(40) int local40 = local17; local40 < Static148.anInt3198; local40++) {
					Static255.aLongArray8[local40] = Static255.aLongArray8[local40 + 1];
					Static270.aStringArray55[local40] = Static270.aStringArray55[local40 + 1];
					Static273.aBooleanArray51[local40] = Static273.aBooleanArray51[local40 + 1];
				}
				Static67.anInt1414 = Static23.anInt471;
				Static283.aClass1_Sub11_Sub1_3.method2697(85);
				Static283.aClass1_Sub11_Sub1_3.method2673(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!km;)V")
	public static void method1124(@OriginalArg(1) Class91 arg0) {
		Static177.aClass91_143 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!in", name = "R", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BB)V")
	public static void method2061(@OriginalArg(0) byte arg0) {
		if (Static269.aByteArrayArrayArray51 == null) {
			Static269.aByteArrayArrayArray51 = new byte[4][104][104];
		}
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
					Static269.aByteArrayArrayArray51[local11][local18][local25] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(B)Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1 method2063() {
		@Pc(13) int local13 = Static166.anIntArray343[0] * Static81.anIntArray204[0];
		@Pc(17) byte[] local17 = Static200.aByteArrayArray83[0];
		@Pc(26) int[] local26 = new int[local13];
		for (@Pc(28) int local28 = 0; local28 < local13; local28++) {
			local26[local28] = Static167.anIntArray346[local17[local28] & 0xFF];
		}
		@Pc(63) Class1_Sub2_Sub14_Sub1 local63 = new Class1_Sub2_Sub14_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[0], anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], local26);
		Static265.method4490();
		return local63;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIJ)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) Class25 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class133 local8 = new Class133();
		local8.aLong160 = arg8;
		local8.anInt4873 = arg1 * 128 + 64;
		local8.anInt4882 = arg2 * 128 + 64;
		local8.anInt4877 = arg3;
		local8.aClass25_4 = arg4;
		local8.aClass25_5 = arg5;
		local8.anInt4872 = arg6;
		local8.anInt4874 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static132.aClass1_Sub14ArrayArrayArray2[local42][arg1][arg2] == null) {
				Static132.aClass1_Sub14ArrayArrayArray2[local42][arg1][arg2] = new Class1_Sub14(local42, arg1, arg2);
			}
		}
		Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass133_1 = local8;
	}
}

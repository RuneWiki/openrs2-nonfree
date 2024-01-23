import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt76;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Loaded title screen";

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Z")
	public static boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method79() {
		@Pc(4) Class142 local4 = Static88.aClass142_1;
		synchronized (Static88.aClass142_1) {
			Static12.anInt252 = Static144.anInt3138;
			Static108.anInt2490++;
			@Pc(31) int local31;
			if (Static92.anInt2206 >= 0) {
				while (Static155.anInt3464 != Static92.anInt2206) {
					local31 = Static251.anIntArray482[Static155.anInt3464];
					Static155.anInt3464 = Static155.anInt3464 + 1 & 0x7F;
					if (local31 < 0) {
						Static145.aBooleanArray13[~local31] = false;
					} else {
						Static145.aBooleanArray13[local31] = true;
					}
				}
			} else {
				for (local31 = 0; local31 < 112; local31++) {
					Static145.aBooleanArray13[local31] = false;
				}
				Static92.anInt2206 = Static155.anInt3464;
			}
			Static144.anInt3138 = Static6.anInt114;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIB)I")
	public static int method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static140.method2490(local7, local17);
		@Pc(35) int local35 = Static140.method2490(local7 + 1, local17);
		@Pc(42) int local42 = Static140.method2490(local7, local17 + 1);
		@Pc(59) int local59 = Static140.method2490(local7 + 1, local17 + 1);
		@Pc(66) int local66 = Static227.method3703(arg2, local23, local28, local35);
		@Pc(73) int local73 = Static227.method3703(arg2, local23, local42, local59);
		return Static227.method3703(arg2, local13, local66, local73);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIIIIIII)V")
	public static void method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (Static22.aClass15_Sub2_Sub2_1.method4286() == 2) {
			Static50.method940(arg2, arg1, arg6, arg3, arg0, arg7, arg4, arg8, arg5);
		} else if (Static22.aClass15_Sub2_Sub2_1.method4286() <= 2) {
			Static132.method2436(arg7, arg3, arg1, arg5, arg6, arg4, arg2, arg0, arg8);
		} else {
			Static191.method3297(arg4, arg6, arg7, arg8, arg0, arg1, arg3, arg2, arg5, Static22.aClass15_Sub2_Sub2_1.method4286());
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)[Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1[] method83() {
		@Pc(4) Class2_Sub8_Sub1_Sub1[] local4 = new Class2_Sub8_Sub1_Sub1[Static236.anInt4770];
		for (@Pc(10) int local10 = 0; local10 < Static236.anInt4770; local10++) {
			@Pc(21) int local21 = Static299.anIntArray561[local10] * Static187.anIntArray397[local10];
			@Pc(25) byte[] local25 = Static165.aByteArrayArray9[local10];
			@Pc(28) int[] local28 = new int[local21];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local28[local30] = Static199.anIntArray438[local25[local30] & 0xFF];
			}
			local4[local10] = new Class2_Sub8_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local10], Static275.anIntArray522[local10], Static299.anIntArray561[local10], Static187.anIntArray397[local10], local28);
		}
		Static293.method4502();
		return local4;
	}
}

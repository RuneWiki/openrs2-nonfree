import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt3427;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_10 = new Class21(4, -1);

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean288 = Boolean.FALSE;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB[BI)I")
	public static int method2846(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = Class152_Sub2.anIntArray505[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZLjava/lang/String;ZZIIJLjava/lang/String;I)V")
	public static void method2848(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class4_Sub12 local30 = new Class4_Sub12(128);
		local30.method2551(10);
		local30.method2524((arg3 ? 4 : 0) | (arg1 ? 2 : 0) | (arg4 ? 1 : 0));
		local30.method2504(arg7);
		local30.method2531(local8[0]);
		local30.method2518(arg2);
		local30.method2531(local8[1]);
		local30.method2524(Static168.anInt3259);
		local30.method2551(arg9);
		local30.method2551(arg0);
		local30.method2531(local8[2]);
		local30.method2524(arg5);
		local30.method2524(arg6);
		local30.method2531(local8[3]);
		local30.method2522(Static85.aBigInteger1, Static309.aBigInteger2);
		@Pc(120) Class4_Sub12 local120 = new Class4_Sub12(350);
		local120.method2518(arg8);
		@Pc(134) int local134 = 8 - Static269.method3856(arg8) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local120.method2551((int) (Math.random() * 255.0D));
		}
		local120.method2540(local8);
		Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
		Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_8.anInt1812);
		Static3.aClass4_Sub12_Sub1_5.method2524(local30.anInt2997 + local120.anInt2997 + 2);
		Static3.aClass4_Sub12_Sub1_5.method2524(592);
		Static3.aClass4_Sub12_Sub1_5.method2519(local30.aByteArray36, local30.anInt2997);
		Static3.aClass4_Sub12_Sub1_5.method2519(local120.aByteArray36, local120.anInt2997);
		Static348.anInt5976 = 0;
		Static354.anInt6183 = 1;
		Static119.anInt2524 = 0;
		Static249.anInt4623 = -3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method2849(@OriginalArg(0) Class16_Sub1_Sub5 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6023 == Static24.anInt5323 || arg0.anInt6021 == -1 || arg0.anInt6046 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class138 local26 = Static182.aClass55_1.method1397(arg0.anInt6021);
			if (local26.aBoolean405 || local26.anIntArray296[arg0.anInt6060] < arg0.anInt6073 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6023 - arg0.anInt6018;
			@Pc(60) int local60 = Static24.anInt5323 - arg0.anInt6018;
			@Pc(71) int local71 = arg0.anInt6043 * 128 + arg0.method4751() * 64;
			@Pc(83) int local83 = arg0.anInt6052 * 128 + arg0.method4751() * 64;
			@Pc(95) int local95 = arg0.anInt6044 * 128 + arg0.method4751() * 64;
			@Pc(107) int local107 = arg0.anInt6074 * 128 + arg0.method4751() * 64;
			arg0.anInt6893 = (local60 * local95 + (local54 - local60) * local71) / local54;
			arg0.anInt6892 = ((local54 - local60) * local83 + local107 * local60) / local54;
		}
		arg0.anInt6085 = 0;
		if (arg0.lb == 0) {
			arg0.method4745(8192);
		}
		if (arg0.lb == 1) {
			arg0.method4745(12288);
		}
		if (arg0.lb == 2) {
			arg0.method4745(0);
		}
		if (arg0.lb == 3) {
			arg0.method4745(4096);
		}
	}
}

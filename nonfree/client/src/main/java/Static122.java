import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!je", name = "P", descriptor = "[B")
	public static byte[] aByteArray17;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!dl;I)V")
	public static void method1968(@OriginalArg(0) Class8_Sub9 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt1243 == 0) {
			local5 = Static153.method2452(arg0.anInt1250, arg0.anInt1249, arg0.anInt1251);
		}
		if (arg0.anInt1243 == 1) {
			local5 = Static24.method424(arg0.anInt1250, arg0.anInt1249, arg0.anInt1251);
		}
		if (arg0.anInt1243 == 2) {
			local5 = Static136.method2197(arg0.anInt1250, arg0.anInt1249, arg0.anInt1251);
		}
		if (arg0.anInt1243 == 3) {
			local5 = Static210.method3402(arg0.anInt1250, arg0.anInt1249, arg0.anInt1251);
		}
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = 0;
		if (local5 != 0L) {
			local66 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local68 = (int) local5 >> 20 & 0x3;
			local64 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt1252 = local64;
		arg0.anInt1242 = local68;
		arg0.anInt1247 = local66;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method1969(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static45.method4130(arg0);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(BII)V")
	public static void method1971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class124 local11 = Static270.method4035(arg0);
		@Pc(14) int local14 = local11.anInt3754;
		@Pc(17) int local17 = local11.anInt3757;
		@Pc(20) int local20 = local11.anInt3756;
		@Pc(26) int local26 = Class8_Sub3_Sub9.anIntArray102[local20 - local17];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local17;
		Static297.method4294(local14, arg1 << local17 & local26 | ~local26 & Static255.anIntArray392[local14]);
	}
}

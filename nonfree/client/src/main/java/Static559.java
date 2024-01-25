import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "[Lclient!s;")
	public static Class51[] aClass51Array4;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_44 = new Class280(512);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!du;B[[B)V")
	public static void method8064(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg1.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg1[local22];
			if (local28 != null) {
				@Pc(35) Class3_Sub3 local35 = new Class3_Sub3(local28);
				local41 = Static351.anIntArray405[local22] >> 8;
				@Pc(47) int local47 = Static351.anIntArray405[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static299.anInt5307;
				@Pc(61) int local61 = local47 * 64 - Static171.anInt3340;
				Static1.method8294();
				arg0.method2276(Static171.anInt3340, local35, local61, Static299.anInt5307, local54, Static271.aClass105Array1);
				arg0.method2297(local17, local54, local61, Static323.aClass5_9, local35);
				if (!arg0.aBoolean164 && local41 == Static482.anInt8390 / 8 && local47 == Static133.anInt2704 / 8 && local17[0] != -1) {
					Static175.aClass327_1 = Static300.aClass186_1.method4651(local17[2], local17[3], local17[0], local17[1], Static229.aClass306_1);
					Static573.anInt9447 = local17[4];
				}
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local20; local137++) {
			@Pc(150) int local150 = (Static351.anIntArray405[local137] >> 8) * 64 - Static299.anInt5307;
			local41 = (Static351.anIntArray405[local137] & 0xFF) * 64 - Static171.anInt3340;
			@Pc(165) byte[] local165 = arg1[local137];
			if (local165 == null && Static133.anInt2704 < 800) {
				Static1.method8294();
				arg0.method2280(local150, local41);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!gt;)I")
	public static int method8065(@OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub1 arg0) {
		@Pc(13) Class109 local13 = arg0.aClass109_1;
		if (local13.anIntArray147 != null) {
			local13 = local13.method2813(Static373.aClass150_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt3068;
		@Pc(32) Class143 local32 = arg0.method5058();
		if (arg0.anInt5743 == -1 || arg0.aBoolean404) {
			local28 = local13.anInt3053;
		} else if (local32.anInt4187 == arg0.anInt5743 || arg0.anInt5743 == local32.anInt4194 || local32.anInt4186 == arg0.anInt5743 || arg0.anInt5743 == local32.anInt4182) {
			local28 = local13.anInt3069;
		} else if (local32.anInt4171 == arg0.anInt5743 || local32.anInt4170 == arg0.anInt5743 || local32.anInt4183 == arg0.anInt5743 || arg0.anInt5743 == local32.anInt4185) {
			local28 = local13.anInt3040;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!aj;)I")
	public static int method8066(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		@Pc(14) String local14 = Static36.method1271(arg0);
		return Static489.aClass282_12.method7138(Static167.aClass24Array8, local14);
	}
}

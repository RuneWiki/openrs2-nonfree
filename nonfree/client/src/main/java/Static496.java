import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_17 = new Class51();

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public static int anInt8607 = -1;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray41 = new byte[250][];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public static void method6695() {
		Static47.anInt1279 = 0;
		@Pc(11) int local11 = Static455.aClass3_Sub26_Sub1_2.method6819();
		@Pc(22) boolean local22 = Static455.aClass3_Sub26_Sub1_2.method6821() == 1;
		@Pc(26) int local26 = Static455.aClass3_Sub26_Sub1_2.method6812();
		@Pc(30) int local30 = Static455.aClass3_Sub26_Sub1_2.method6812();
		Static203.method3498();
		Static369.method5228(local11);
		@Pc(42) int local42 = (Static42.anInt1159 - Static455.aClass3_Sub26_Sub1_2.anInt8703) / 16;
		Static208.anIntArrayArray39 = new int[local42][4];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static208.anIntArrayArray39[local48][local52] = Static455.aClass3_Sub26_Sub1_2.method6816();
			}
		}
		Static4.aByteArrayArray1 = new byte[local42][];
		Static178.anIntArray159 = new int[local42];
		Static481.anIntArray497 = new int[local42];
		Static402.aByteArrayArray34 = null;
		Static403.aByteArrayArray35 = new byte[local42][];
		Static243.anIntArray529 = null;
		Static320.anIntArray288 = new int[local42];
		Static260.aByteArrayArray25 = new byte[local42][];
		Static562.anIntArray563 = new int[local42];
		Static566.aByteArrayArray50 = new byte[local42][];
		Static575.anIntArray575 = new int[local42];
		local42 = 0;
		for (local52 = (local30 - (Static345.anInt6228 >> 4)) / 8; local52 <= (local30 + (Static345.anInt6228 >> 4)) / 8; local52++) {
			for (@Pc(129) int local129 = (local26 - (Static535.anInt9341 >> 4)) / 8; local129 <= ((Static535.anInt9341 >> 4) + local26) / 8; local129++) {
				Static178.anIntArray159[local42] = (local52 << 8) + local129;
				Static320.anIntArray288[local42] = Static295.aClass284_92.method6333("m" + local52 + "_" + local129);
				Static481.anIntArray497[local42] = Static295.aClass284_92.method6333("l" + local52 + "_" + local129);
				Static562.anIntArray563[local42] = Static295.aClass284_92.method6333("um" + local52 + "_" + local129);
				Static575.anIntArray575[local42] = Static295.aClass284_92.method6333("ul" + local52 + "_" + local129);
				local42++;
			}
		}
		Static148.method2817(local22, local26, 11, local30);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIILclient!pba;)V")
	public static void method6696(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25_Sub2_Sub2_Sub5_Sub1 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray508 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray508.length; local12++) {
				if (arg2.anIntArray508[local12] != arg0[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt8545 != -1) {
				@Pc(49) Class270 local49 = Static245.aClass155_1.method3820(arg2.anInt8545);
				@Pc(52) int local52 = local49.anInt7686;
				if (local52 == 1) {
					arg2.anInt8539 = 0;
					arg2.anInt8521 = 0;
					arg2.anInt8492 = arg1;
					arg2.anInt8526 = 1;
					arg2.anInt8543 = 0;
					if (!arg2.aBoolean578) {
						Static217.method3600(arg2.anInt8539, arg2, local49);
					}
				}
				if (local52 == 2) {
					arg2.anInt8543 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray508 == null || arg2.anIntArray508[local12] == -1 || Static245.aClass155_1.method3820(arg0[local12]).anInt7694 >= Static245.aClass155_1.method3820(arg2.anIntArray508[local12]).anInt7694) {
				arg2.anInt8492 = arg1;
				arg2.anIntArray508 = arg0;
				break;
			}
		}
		if (local10) {
			arg2.anIntArray508 = arg0;
			arg2.anInt8492 = arg1;
		}
	}
}

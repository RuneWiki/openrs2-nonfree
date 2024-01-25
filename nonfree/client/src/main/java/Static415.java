import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
	public static int anInt6638;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_97 = new Class218(42, -1);

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
	public static int anInt6639 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILclient!cj;)Z")
	public static boolean method5918(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		Static568.aClass239_8.method9238(arg1.anIntArray122[arg0], arg1.anIntArray123[arg0], arg1.anIntArray121[arg0], Static78.anIntArray317);
		@Pc(30) int local30 = Static78.anIntArray317[2];
		if (local30 < 50) {
			return false;
		} else {
			arg1.aShortArray24[arg0] = (short) (Static636.anInt10127 * Static78.anIntArray317[0] / local30 + Static69.anInt1323);
			arg1.aShortArray26[arg0] = (short) (Static78.anIntArray317[1] * Static587.anInt9462 / local30 + Static215.anInt4112);
			arg1.aShortArray25[arg0] = (short) local30;
			return true;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IFFFFFIF)F")
	public static float method5919(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(15) float local15 = 0.0F;
		@Pc(20) float local20 = arg6 - arg4;
		@Pc(24) float local24 = arg0 - arg2;
		@Pc(28) float local28 = arg3 - arg1;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local15 < 1.1F) {
			@Pc(42) float local42 = arg4 + local20 * local15;
			@Pc(48) float local48 = local15 * local24 + arg2;
			@Pc(54) float local54 = arg1 + local28 * local15;
			@Pc(59) int local59 = (int) local42 >> 9;
			@Pc(64) int local64 = (int) local54 >> 9;
			if (local59 > 0 && local64 > 0 && local59 < Static158.anInt927 && Static515.anInt8292 > local64) {
				@Pc(88) int local88 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174;
				if (local88 < 3 && (Static90.aByteArrayArrayArray25[1][local59][local64] & 0x2) != 0) {
					local88++;
				}
				@Pc(112) int local112 = Static582.aClass21Array3[local88].method7980((int) local54, (int) local42);
				if ((float) local112 < local48) {
					if (arg5 < 2) {
						return local15;
					}
					return method5919(local48, local34, local32, local54, local30, arg5 - 1, local42) * 0.1F + local15 - 0.1F;
				}
			}
			local30 = local42;
			local15 += 0.1F;
			local32 = local48;
			local34 = local54;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZBLjava/lang/String;Ljava/lang/String;)V")
	public static void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class3_Sub34 local6 = Static202.method3100();
		local6.aClass3_Sub25_Sub1_2.method8614(Static515.aClass224_6.anInt6057);
		local6.aClass3_Sub25_Sub1_2.method8649(0);
		@Pc(21) int local21 = local6.aClass3_Sub25_Sub1_2.anInt9765;
		local6.aClass3_Sub25_Sub1_2.method8649(649);
		@Pc(38) int[] local38 = Static528.method7625(local6);
		@Pc(42) int local42 = local6.aClass3_Sub25_Sub1_2.anInt9765;
		local6.aClass3_Sub25_Sub1_2.method8583(arg3);
		local6.aClass3_Sub25_Sub1_2.method8649(Static362.anInt5843);
		local6.aClass3_Sub25_Sub1_2.method8583(arg2);
		local6.aClass3_Sub25_Sub1_2.method8603(Static306.aLong161);
		local6.aClass3_Sub25_Sub1_2.method8614(Static609.anInt9834);
		local6.aClass3_Sub25_Sub1_2.method8614(Static55.aClass118_2.anInt3893);
		Static674.method9361(local6.aClass3_Sub25_Sub1_2);
		@Pc(79) String local79 = Static455.aString82;
		local6.aClass3_Sub25_Sub1_2.method8614(local79 == null ? 0 : 1);
		if (local79 != null) {
			local6.aClass3_Sub25_Sub1_2.method8583(local79);
		}
		local6.aClass3_Sub25_Sub1_2.method8614(arg0);
		local6.aClass3_Sub25_Sub1_2.method8614(arg1 ? 1 : 0);
		local6.aClass3_Sub25_Sub1_2.anInt9765 += 7;
		local6.aClass3_Sub25_Sub1_2.method8587(local6.aClass3_Sub25_Sub1_2.anInt9765, local42, local38);
		local6.aClass3_Sub25_Sub1_2.method8629(local6.aClass3_Sub25_Sub1_2.anInt9765 - local21);
		Static441.method6275(local6);
		Static421.anInt6742 = -3;
		Static433.anInt8266 = 1;
		Static219.anInt4163 = 0;
		Static40.anInt933 = 0;
		if (arg0 < 13) {
			Static624.aBoolean697 = true;
			Static453.method6644();
		}
	}
}

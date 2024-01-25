import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
	public static int anInt1392;

	@OriginalMember(owner = "client!wba", name = "B", descriptor = "Lclient!gca;")
	public static Class3_Sub20 aClass3_Sub20_2;

	@OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
	public static int anInt1395;

	@OriginalMember(owner = "client!wba", name = "G", descriptor = "[I")
	public static int[] anIntArray58 = null;

	@OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
	public static final int anInt1400 = 1338;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ha;ILclient!gka;ILclient!bi;I)Z")
	public static boolean method1365(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class145 arg1, @OriginalArg(4) Class3_Sub8 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray249 != null) {
			local7 = (arg2.anInt1246 + arg1.anInt3599 - Static574.anInt8357) * (Static574.anInt8362 - Static574.anInt8356) / (Static574.anInt8363 - Static574.anInt8357) + Static574.anInt8356;
			local11 = Static574.anInt8365 - (Static574.anInt8365 - Static574.anInt8359) * (arg2.anInt1249 + arg1.anInt3629 + -Static574.anInt8367) / (Static574.anInt8358 - Static574.anInt8367);
			local13 = Static574.anInt8365 - (arg2.anInt1249 + arg1.anInt3627 - Static574.anInt8367) * (-Static574.anInt8359 + Static574.anInt8365) / (Static574.anInt8358 - Static574.anInt8367);
			local9 = Static574.anInt8356 + (arg1.anInt3637 + arg2.anInt1246 - Static574.anInt8357) * (Static574.anInt8362 - Static574.anInt8356) / (Static574.anInt8363 - Static574.anInt8357);
		}
		@Pc(100) Class102 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg1.anInt3606 != -1) {
			if (arg2.aBoolean108 && arg1.anInt3620 != -1) {
				local100 = arg1.method3160(arg0, true);
			} else {
				local100 = arg1.method3160(arg0, false);
			}
			if (local100 != null) {
				local102 = arg2.anInt1245 - (local100.method6951() + 1 >> 1);
				local104 = arg2.anInt1245 + (local100.method6951() + 1 >> 1);
				if (local7 > local102) {
					local7 = local102;
				}
				if (local104 > local9) {
					local9 = local104;
				}
				local106 = arg2.anInt1247 - (local100.method6958() + 1 >> 1);
				local108 = arg2.anInt1247 + (local100.method6958() + 1 >> 1);
				if (local106 < local11) {
					local11 = local106;
				}
				if (local108 > local13) {
					local13 = local108;
				}
			}
		}
		@Pc(209) Class281 local209 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(313) int local313;
		if (arg1.aString44 != null) {
			local209 = Static281.method4450(arg1.anInt3610);
			if (local209 != null) {
				local219 = Static621.aClass202_13.method4623(arg1.aString44, (int[]) null, (Class102[]) null, Static467.aStringArray55);
				local221 = arg2.anInt1245 + (Static574.anInt8362 - Static574.anInt8356) * arg1.anInt3597 / (Static574.anInt8363 - Static574.anInt8357);
				local223 = arg2.anInt1247 - arg1.anInt3608 * (Static574.anInt8365 - Static574.anInt8359) / (Static574.anInt8358 - Static574.anInt8367);
				if (local100 == null) {
					local223 -= local219 * local209.method6668() / 2;
				} else {
					local223 -= (local100.method6958() >> 1) + (local209.method6670() * local219);
				}
				for (local313 = 0; local313 < local219; local313++) {
					@Pc(319) String local319 = Static467.aStringArray55[local313];
					if (local313 < local219 - 1) {
						local319 = local319.substring(0, local319.length() - 4);
					}
					@Pc(340) int local340 = local209.method6672(local319);
					if (local340 > local225) {
						local225 = local340;
					}
				}
				local227 = local221 - local225 / 2;
				local229 = local221 + local225 / 2;
				if (local7 > local227) {
					local7 = local227;
				}
				if (local9 < local229) {
					local9 = local229;
				}
				local231 = local223;
				local233 = local219 * local209.method6670() + local223;
				if (local231 < local11) {
					local11 = local231;
				}
				if (local13 < local233) {
					local13 = local233;
				}
			}
		}
		if (local9 < Static574.anInt8356 || Static574.anInt8362 < local7 || local13 < Static574.anInt8359 || Static574.anInt8365 < local11) {
			return true;
		}
		Static574.method7085(arg0, arg2, arg1);
		if (local100 != null) {
			if (Static403.anInt6887 > 0 && (Static30.anInt914 != -1 && arg2.anInt1242 == Static30.anInt914 || Static476.anInt8110 != -1 && Static476.anInt8110 == arg1.anInt3628)) {
				if (Static666.anInt10253 > 50) {
					local313 = 200 - Static666.anInt10253 * 2;
				} else {
					local313 = Static666.anInt10253 * 2;
				}
				@Pc(480) int local480 = local313 << 24 | 0xFFFF00;
				arg0.method8150(local100.method6957() / 2 + 7, arg2.anInt1245, local480, arg2.anInt1247);
				arg0.method8150(local100.method6957() / 2 + 5, arg2.anInt1245, local480, arg2.anInt1247);
				arg0.method8150(local100.method6957() / 2 + 3, arg2.anInt1245, local480, arg2.anInt1247);
				arg0.method8150(local100.method6957() / 2 + 1, arg2.anInt1245, local480, arg2.anInt1247);
				arg0.method8150(local100.method6957() / 2, arg2.anInt1245, local480, arg2.anInt1247);
			}
			local100.method6961(arg2.anInt1245 - (local100.method6951() >> 1), arg2.anInt1247 - (local100.method6958() >> 1));
		}
		if (arg1.aString44 != null && local209 != null) {
			Static674.method8720(local221, local223, arg2, arg0, arg1, local225, local219, local209);
		}
		if (arg1.anInt3606 != -1 || arg1.aString44 != null) {
			@Pc(592) Class3_Sub45 local592 = new Class3_Sub45(arg2);
			local592.anInt8321 = local108;
			local592.anInt8327 = local231;
			local592.anInt8320 = local102;
			local592.anInt8325 = local106;
			local592.anInt8324 = local229;
			local592.anInt8323 = local227;
			local592.anInt8322 = local233;
			local592.anInt8326 = local104;
			Static553.aClass193_57.method4462(local592);
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "z", descriptor = "Lclient!oca;")
	public static Class235 aClass235_9;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_137 = new Class71(42, 4);

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_138 = new Class71(109, 0);

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	public static int anInt9809 = 0;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
	public static void method7912() {
		@Pc(12) Class379 local12 = null;
		try {
			@Pc(18) Class301 local18 = Static51.aClass118_1.method3396("");
			while (local18.anInt8915 == 0) {
				Static214.method4061(1L);
			}
			if (local18.anInt8915 == 1) {
				local12 = (Class379) local18.anObject18;
				@Pc(41) Class8_Sub8 local41 = Static155.aClass8_Sub25_6.method3476();
				local12.method8632(0, local41.anInt10588, local41.aByteArray107);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local12 != null) {
				local12.method8628();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method7918(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		@Pc(18) int local18 = arg0.length();
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) char local24 = 0;
		@Pc(26) char local26 = 0;
		while (local15 > local20 - local24 || local22 - local26 < local18) {
			if (local15 <= local20 - local24) {
				return -1;
			}
			if (local22 - local26 >= local18) {
				return 1;
			}
			@Pc(66) char local66;
			if (local24 == '\u0000') {
				local66 = arg2.charAt(local20++);
			} else {
				local66 = local24;
			}
			@Pc(79) char local79;
			if (local26 == '\u0000') {
				local79 = arg0.charAt(local22++);
			} else {
				local79 = local26;
			}
			local24 = Static102.method2346(local66);
			local26 = Static102.method2346(local79);
			local66 = Static49.method1396(local66, arg1);
			local79 = Static49.method1396(local79, arg1);
			if (local66 != local79 && Character.toUpperCase(local66) != Character.toUpperCase(local79)) {
				local66 = Character.toLowerCase(local66);
				local79 = Character.toLowerCase(local79);
				if (local66 != local79) {
					return Static433.method6716(local66, arg1) - Static433.method6716(local79, arg1);
				}
			}
		}
		@Pc(152) int local152 = Math.min(local15, local18);
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			if (arg1 == 2) {
				local22 = local18 - local154 - 1;
				local20 = local15 - local154 - 1;
			} else {
				local22 = local154;
				local20 = local154;
			}
			@Pc(185) char local185 = arg2.charAt(local20);
			@Pc(189) char local189 = arg0.charAt(local22);
			if (local185 != local189 && Character.toUpperCase(local185) != Character.toUpperCase(local189)) {
				local185 = Character.toLowerCase(local185);
				local189 = Character.toLowerCase(local189);
				if (local185 != local189) {
					return Static433.method6716(local185, arg1) - Static433.method6716(local189, arg1);
				}
			}
		}
		@Pc(241) int local241 = local15 - local18;
		if (local241 != 0) {
			return local241;
		}
		for (@Pc(250) int local250 = 0; local250 < local152; local250++) {
			@Pc(256) char local256 = arg2.charAt(local250);
			@Pc(260) char local260 = arg0.charAt(local250);
			if (local260 != local256) {
				return Static433.method6716(local256, arg1) - Static433.method6716(local260, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIFFIF)[F")
	public static float[] method7919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[8] = local17;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[2] = local25;
		local6[3] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg2 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(93) float local93 = 1.0F - local76;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg1 * arg1 + arg5 * arg5));
		if (local104 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg1 / local104;
				local78 = (float) arg5 / local104;
			}
			local69[8] = local93 * local78 * local78 + local76;
			local69[7] = -local71 * local88;
			local69[1] = local78 * local88;
			local69[6] = local93 * local78 * local71;
			local69[2] = local93 * local71 * local78;
			local69[3] = -local78 * local88;
			local69[4] = local76;
			local69[5] = local71 * local88;
			local69[0] = local76 + local93 * local71 * local71;
			local9[0] = local6[0] * local69[0] + local69[3] * local6[1] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local6[0] * local69[1] + local69[4] * local6[1];
			local9[2] = local6[0] * local69[2] + local6[1] * local69[5] + local69[8] * local6[2];
			local9[3] = local6[5] * local69[6] + local6[4] * local69[3] + local6[3] * local69[0];
			local9[4] = local69[4] * local6[4] + local69[1] * local6[3] + local6[5] * local69[7];
			local9[5] = local69[8] * local6[5] + local6[3] * local69[2] + local6[4] * local69[5];
			local9[6] = local6[7] * local69[3] + local69[0] * local6[6] + local69[6] * local6[8];
			local9[7] = local6[7] * local69[4] + local69[1] * local6[6] + local69[7] * local6[8];
			local9[8] = local6[8] * local69[8] + local6[7] * local69[5] + local69[2] * local6[6];
		}
		local9[5] *= arg3;
		local9[6] *= arg6;
		local9[2] *= arg4;
		local9[4] *= arg3;
		local9[0] *= arg4;
		local9[3] *= arg3;
		local9[7] *= arg6;
		local9[8] *= arg6;
		local9[1] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7923(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}
}

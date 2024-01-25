import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public static int anInt9813;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	public static int anInt9804 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)I")
	public static int method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return local31 + (((arg2 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg2 & 0xFF00) * local13 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!no;Lclient!no;I)V")
	public static void method8336(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_299 != null) {
			arg1.method8682();
		}
		arg1.aClass3_299 = arg0.aClass3_299;
		arg1.aClass3_300 = arg0;
		arg1.aClass3_299.aClass3_300 = arg1;
		arg1.aClass3_300.aClass3_299 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method8339(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		if (local13 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local13 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local13 <= local27 - 2 || Static616.method8416(arg0.charAt(local27 - 2)) == -1) {
			local33 -= 2;
		} else if (local13 <= local27 - 1 || Static616.method8416(arg0.charAt(local27 - 1)) == -1) {
			local33--;
		}
		@Pc(77) byte[] local77 = new byte[local33];
		Static74.method1261(local77, 0, arg0);
		return local77;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!sba;I)I")
	public static int method8344(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		@Pc(7) String local7 = Static354.method5709(arg0);
		@Pc(9) int[] local9 = null;
		if (Static368.method5890(arg0.anInt8564)) {
			local9 = Static298.aClass132_1.method3062((int) arg0.aLong229).anIntArray436;
		} else if (arg0.anInt8567 != -1) {
			local9 = Static298.aClass132_1.method3062(arg0.anInt8567).anIntArray436;
		} else if (Static580.method8102(arg0.anInt8564)) {
			@Pc(84) Class3_Sub43 local84 = (Class3_Sub43) Static545.aClass25_40.method426((long) (int) arg0.aLong229);
			if (local84 != null) {
				@Pc(89) Class9_Sub2_Sub1_Sub2_Sub2 local89 = local84.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				@Pc(92) Class309 local92 = local89.aClass309_1;
				if (local92.anIntArray553 != null) {
					local92 = local92.method7594(Static183.aClass285_1);
				}
				if (local92 != null) {
					local9 = local92.anIntArray554;
				}
			}
		} else if (Static110.method1823(arg0.anInt8564)) {
			@Pc(49) Class330 local49;
			if (arg0.anInt8564 == 1009) {
				local49 = Static370.aClass284_3.method6915((int) arg0.aLong229);
			} else {
				local49 = Static370.aClass284_3.method6915((int) (arg0.aLong229 >>> 32 & 0x7FFFFFFFL));
			}
			if (local49.anIntArray581 != null) {
				local49 = local49.method7892(Static183.aClass285_1);
			}
			if (local49 != null) {
				local9 = local49.anIntArray577;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static103.method1716(local9);
		}
		@Pc(141) int local141 = Static426.aClass93_11.method2319(Static307.aClass103Array12, local7);
		if (arg0.aBoolean626) {
			local141 += Static519.aClass103_44.method7445() + 4;
		}
		return local141;
	}
}

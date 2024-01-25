import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "Lclient!em;")
	public static final Class83 aClass83_37 = new Class83(19, 12);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[S)[S")
	public static short[] method974(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static598.method771(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!r;)V")
	public static void method975(@OriginalArg(1) Class78 arg0) {
		@Pc(7) int local7 = Static405.anInt7239;
		@Pc(9) int local9 = Static130.anInt2592;
		@Pc(11) int local11 = Static570.anInt9417;
		@Pc(13) int local13 = Static563.anInt9345;
		arg0.method6800(-10660793, local13, local7, local11, local9);
		arg0.method6800(-16777216, 16, local7 + 1, local11 + -2, local9 + 1);
		arg0.method6779(local9 + 18, -16777216, local7 + 1, local11 - 2, local13 + -19);
		Static62.aClass96_4.method7257(Static375.aClass253_28.method5453(Static161.anInt3095), local7 + 3, -10660793, local9 + 14, -1);
		@Pc(72) int local72 = Static216.aClass238_1.method5661();
		@Pc(76) int local76 = Static216.aClass238_1.method5653();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class1_Sub40 local83 = (Class1_Sub40) Static166.aClass111_49.method2547(); local83 != null; local83 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			@Pc(99) int local99 = local9 + (-local78 + Static22.anInt572 - 1) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local7 < local72 && local72 < local11 + local7 && local99 - 13 < local76 && local99 + 3 > local76 && local83.aBoolean590) {
				local101 = -256;
			}
			@Pc(126) int[] local126 = null;
			if (Static176.method2783(local83.anInt7819)) {
				local126 = Static230.aClass225_1.method4857((int) local83.aLong199).anIntArray352;
			} else if (local83.anInt7818 != -1) {
				local126 = Static230.aClass225_1.method4857(local83.anInt7818).anIntArray352;
			} else if (Static308.method4628(local83.anInt7819)) {
				@Pc(169) Class1_Sub33 local169 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local83.aLong199);
				if (local169 != null) {
					@Pc(174) Class11_Sub1_Sub1_Sub3_Sub2 local174 = local169.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					@Pc(177) Class354 local177 = local174.aClass354_1;
					if (local177.anIntArray597 != null) {
						local177 = local177.method7683(Static390.aClass353_29);
					}
					if (local177 != null) {
						local126 = local177.anIntArray595;
					}
				}
			} else if (Static13.method257(local83.anInt7819)) {
				@Pc(209) Class178 local209;
				if (local83.anInt7819 == 1010) {
					local209 = Static347.aClass122_4.method2770((int) local83.aLong199);
				} else {
					local209 = Static347.aClass122_4.method2770((int) (local83.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local209.anIntArray252 != null) {
					local209 = local209.method3713(Static390.aClass353_29);
				}
				if (local209 != null) {
					local126 = local209.anIntArray253;
				}
			}
			@Pc(240) String local240 = Static262.method3792(local83);
			if (local126 != null) {
				local240 = local240 + Static254.method2368(local126);
			}
			Static62.aClass96_4.method7248(Static230.anIntArray218, local99, local7 + 3, local101, Static519.aClass5Array19, local240);
			if (local83.aBoolean592) {
				Static76.aClass5_22.method7795(Static88.aClass352_7.method7572(local240) + local7 + 5, local99 + -12);
			}
			local78++;
		}
		Static524.method1208(Static570.anInt9417, Static563.anInt9345, Static130.anInt2592, Static405.anInt7239);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z")
	public static boolean method979(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub40 local15 = (Class1_Sub40) Static166.aClass111_49.method2547(); local15 != null; local15 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			if (Static308.method4628(local15.anInt7819) && (long) arg0 == local15.aLong199) {
				return true;
			}
		}
		return false;
	}
}

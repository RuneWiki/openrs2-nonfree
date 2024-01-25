import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
	public static int anInt6945;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method5685(@OriginalArg(0) Class162 arg0) {
		@Pc(7) int local7 = Static214.anInt3100;
		@Pc(9) int local9 = Static312.anInt5139;
		@Pc(11) int local11 = Static428.anInt6943;
		@Pc(13) int local13 = Static524.anInt8323;
		arg0.method6885(local9, -10660793, local11, local7, local13);
		arg0.method6885(local9 + 1, -16777216, -2 + local11, local7 + 1, 16);
		arg0.method6888(-16777216, local13 - 19, local11 - 2, local9 + 18, local7 - -1);
		Static81.aClass37_16.method7723(local7 + 3, Static229.aClass159_26.method2776(Static261.anInt4297), -10660793, local9 + 14, -1);
		@Pc(80) int local80 = Static205.aClass131_1.method6544();
		@Pc(84) int local84 = Static205.aClass131_1.method6542();
		@Pc(86) int local86 = 0;
		for (@Pc(91) Class2_Sub27 local91 = (Class2_Sub27) Static411.aClass70_43.method1264(); local91 != null; local91 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			@Pc(106) int local106 = (Static484.anInt7715 - local86 - 1) * 16 + local9 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local80 && local80 < local7 + local11 && local106 - 13 < local84 && local106 + 3 > local84 && local91.aBoolean322) {
				local108 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static427.method5678(local91.anInt4323)) {
				local138 = Static466.aClass130_2.method2311((int) local91.aLong113).anIntArray282;
			} else if (local91.anInt4325 != -1) {
				local138 = Static466.aClass130_2.method2311(local91.anInt4325).anIntArray282;
			} else if (Static577.method7485(local91.anInt4323)) {
				@Pc(208) Class2_Sub5 local208 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local91.aLong113);
				if (local208 != null) {
					@Pc(213) Class12_Sub2_Sub1_Sub4_Sub2 local213 = local208.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					@Pc(216) Class295 local216 = local213.aClass295_1;
					if (local216.anIntArray493 != null) {
						local216 = local216.method5942(Static426.aClass160_1);
					}
					if (local216 != null) {
						local138 = local216.anIntArray491;
					}
				}
			} else if (Static219.method2681(local91.anInt4323)) {
				@Pc(173) Class216 local173;
				if (local91.anInt4323 == 1007) {
					local173 = Static362.aClass290_2.method5799((int) local91.aLong113);
				} else {
					local173 = Static362.aClass290_2.method5799((int) (local91.aLong113 >>> 32 & 0x7FFFFFFFL));
				}
				if (local173.anIntArray362 != null) {
					local173 = local173.method4560(Static426.aClass160_1);
				}
				if (local173 != null) {
					local138 = local173.anIntArray364;
				}
			}
			@Pc(250) String local250 = Static491.method6283(local91);
			if (local138 != null) {
				local250 = local250 + Static88.method1301(local138);
			}
			Static81.aClass37_16.method7714(local7 + 3, local106, local108, Static309.anIntArray355, local250, Static389.aClass38Array21);
			if (local91.aBoolean321) {
				Static380.aClass38_40.method7463(local7 + Static537.aClass112_11.method2078(local250) + 5, local106 + -12);
			}
			local86++;
		}
		Static390.method5389(Static312.anInt5139, Static524.anInt8323, Static428.anInt6943, Static214.anInt3100);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B[I[I)V")
	public static void method5686(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static374.aByteArrayArrayArray14 = null;
			Class151_Sub2.lb = null;
			Static203.anIntArray245 = null;
			return;
		}
		Static203.anIntArray245 = arg0;
		Class151_Sub2.lb = new int[arg0.length];
		Static374.aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static203.anIntArray245.length; local28++) {
			Static374.aByteArrayArrayArray14[local28] = new byte[arg1[local28]][];
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
	public static int method5687() {
		return 16;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!he", name = "Ec", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!bd;")
	public static Class32 aClass32_31;

	@OriginalMember(owner = "client!he", name = "hc", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_32 = new Class317(32);

	@OriginalMember(owner = "client!he", name = "lg", descriptor = "I")
	public static int anInt6484 = 0;

	@OriginalMember(owner = "client!he", name = "hg", descriptor = "Lclient!gn;")
	public static final Class138 aClass138_5 = new Class138();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!eba;I)Lclient!eba;")
	public static Class14_Sub1_Sub3 method5671(@OriginalArg(0) Class14_Sub1_Sub3 arg0) {
		@Pc(15) Class14_Sub1_Sub3 local15 = arg0 == null ? new Class14_Sub1_Sub3() : new Class14_Sub1_Sub3(arg0);
		local15.method1917();
		return local15;
	}

	@OriginalMember(owner = "client!he", name = "M", descriptor = "(I)V")
	public static void method5677() {
		for (@Pc(15) Class14_Sub27 local15 = (Class14_Sub27) Static445.aClass125_30.method2633(); local15 != null; local15 = (Class14_Sub27) Static445.aClass125_30.method2627()) {
			if (local15.aBoolean478) {
				local15.aBoolean478 = false;
			} else {
				Static687.method9464(local15.anInt6684);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(IIIII)V")
	public static void method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static200.anIntArrayArray59 != null) {
			Static200.anIntArrayArray59[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static587.aShortArrayArray4 != null) {
			Static587.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (Static690.aByteArrayArray33 != null) {
			Static690.aByteArrayArray33[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rg;Lclient!rg;ILclient!rg;Lclient!rg;)V")
	public static void method5711(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(3) Class310 arg2, @OriginalArg(4) Class310 arg3) {
		Static132.aClass310_32 = arg3;
		Static381.aClass310_80 = arg1;
		Static6.aClass310_2 = arg0;
		Static339.aClass299ArrayArray1 = new Class299[Static132.aClass310_32.method7800()][];
		Static590.aBooleanArray24 = new boolean[Static132.aClass310_32.method7800()];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void method5719(@OriginalArg(0) Class4_Sub3_Sub3_Sub3 arg0) {
		if (arg0.anIntArray192 == null && arg0.anIntArray199 == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < arg0.anIntArray192.length; local27++) {
			@Pc(33) int local33 = -1;
			if (arg0.anIntArray192 != null) {
				local33 = arg0.anIntArray192[local27];
			}
			if (local33 != -1) {
				local25 = false;
				@Pc(88) int local88;
				@Pc(105) int local105;
				@Pc(72) int local72;
				if ((-1073741824 & local33) == -1073741824) {
					local72 = local33 & 0xFFFFFFF;
					@Pc(76) int local76 = local72 >> 14;
					local88 = arg0.anInt11184 - (local76 - Static36.anInt617) * 512 - 256;
					@Pc(92) int local92 = local72 & 0x3FFF;
					local105 = arg0.anInt11178 - (local92 - Static550.anInt9242) * 512 - 256;
				} else if ((local33 & 0x8000) == 0) {
					@Pc(120) Class14_Sub44 local120 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local33);
					if (local120 == null) {
						arg0.method2861(-1, local27);
						continue;
					}
					@Pc(137) Class4_Sub3_Sub3_Sub3_Sub1 local137 = local120.aClass4_Sub3_Sub3_Sub3_Sub1_2;
					local105 = arg0.anInt11178 - local137.anInt11178;
					local88 = arg0.anInt11184 - local137.anInt11184;
				} else {
					local72 = local33 & 0x7FFF;
					@Pc(160) Class4_Sub3_Sub3_Sub3_Sub2 local160 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local72];
					if (local160 == null) {
						arg0.method2861(-1, local27);
						continue;
					}
					local88 = arg0.anInt11184 - local160.anInt11184;
					local105 = arg0.anInt11178 - local160.anInt11178;
				}
				if (local88 != 0 || local105 != 0) {
					arg0.method2861((int) (Math.atan2((double) local88, (double) local105) * 2607.5945876176133D) & 0x3FFF, local27);
				}
			} else if (!arg0.method2861(-1, local27)) {
				local25 = false;
			}
		}
		if (local25) {
			arg0.anIntArray199 = null;
			arg0.anIntArray192 = null;
		}
	}
}

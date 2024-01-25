import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Lclient!oba;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
	public static int anInt7589;

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
	public static int anInt7590;

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "Lclient!qia;")
	public static final Class288 aClass288_2 = new Class288();

	@OriginalMember(owner = "client!qia", name = "f", descriptor = "Lclient!qia;")
	public static final Class288 aClass288_5 = new Class288();

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "Lclient!qia;")
	public static final Class288 aClass288_3 = new Class288();

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "Lclient!qia;")
	public static final Class288 aClass288_4 = new Class288();

	@OriginalMember(owner = "client!qia", name = "h", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_136 = new Class145(52, 4);

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!bp;")
	public static final Class43 aClass43_5 = new Class43();

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!ua;)V")
	public static void method6668(@OriginalArg(0) Class342 arg0) {
		if (Static4.anInt53 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub12 local6 = arg0.aClass2_Sub12_1;
		Static547.aClass342Array1[Static4.anInt53] = arg0;
		Static420.aBooleanArray20[Static4.anInt53] = false;
		Static4.anInt53++;
		@Pc(21) int local21 = arg0.anInt9281;
		if (arg0.aBoolean663) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9281;
		if (arg0.aBoolean664) {
			local29 = Static395.anInt6810 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7421() + Static620.anInt10145 - local6.method7418() >> Static326.anInt5713;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7421() + local6.method7418() - Static620.anInt10145 >> Static326.anInt5713;
			if (local73 >= Static389.anInt6693) {
				local73 = Static389.anInt6693 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray141[local41++];
				@Pc(105) int local105 = (local6.method7415() + Static620.anInt10145 - local6.method7418() >> Static326.anInt5713) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static595.anInt9881) {
					local113 = Static595.anInt9881 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static573.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static573.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static4.anInt53;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static573.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static4.anInt53 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static573.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static4.anInt53 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static573.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static4.anInt53 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLclient!vl;)V")
	public static void method6669(@OriginalArg(1) Class16_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
			@Pc(36) Class16_Sub1_Sub1_Sub3_Sub1 local36 = (Class16_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local36.aClass113_1 != null) {
				Static443.method6363(local36.aByte109 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, local36);
			}
		} else if (arg0 instanceof Class16_Sub1_Sub1_Sub3_Sub2) {
			@Pc(16) Class16_Sub1_Sub1_Sub3_Sub2 local16 = (Class16_Sub1_Sub1_Sub3_Sub2) arg0;
			Static196.method3385(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local16.aByte109, local16);
		}
	}
}

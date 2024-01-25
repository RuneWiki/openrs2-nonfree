import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "J")
	public static long aLong167;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!po;")
	public static final Class6_Sub39 aClass6_Sub39_3 = new Class6_Sub39(0, -1);

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public static int anInt6625 = 0;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_97 = new Class98(18, 3);

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!of;")
	public static final Class230 aClass230_42 = new Class230(0, 16);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!pu;)V")
	public static void method5358(@OriginalArg(0) Class255 arg0) {
		if (Static28.anInt487 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub25 local6 = arg0.aClass6_Sub25_3;
		Static111.aClass255Array1[Static28.anInt487] = arg0;
		Static170.aBooleanArray12[Static28.anInt487] = false;
		Static28.anInt487++;
		@Pc(21) int local21 = arg0.anInt7361;
		if (arg0.aBoolean499) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt7361;
		if (arg0.aBoolean500) {
			local29 = Static431.anInt7712 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6400() + Static259.anInt4703 - local6.method6398() >> Static23.anInt420;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6400() + local6.method6398() - Static259.anInt4703 >> Static23.anInt420;
			if (local73 >= Static20.anInt358) {
				local73 = Static20.anInt358 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray120[local41++];
				@Pc(105) int local105 = (local6.method6405() + Static259.anInt4703 - local6.method6398() >> Static23.anInt420) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static547.anInt9363) {
					local113 = Static547.anInt9363 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static511.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static511.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static28.anInt487;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static511.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static28.anInt487 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static511.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static28.anInt487 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static511.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static28.anInt487 << 48;
					}
				}
			}
		}
	}
}

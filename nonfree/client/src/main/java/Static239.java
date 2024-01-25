import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "Lclient!lp;")
	public static Class182 aClass182_6;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "Lclient!kda;")
	public static Class160 aClass160_52;

	@OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
	public static final int anInt4640 = Static124.method4359(1600);

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)Z")
	public static boolean method4057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static339.method5498(arg1, arg0) | (arg0 & 0x70000) != 0 || Static309.method5130(arg0, arg1);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!mw;)V")
	public static void method4058(@OriginalArg(0) Class201 arg0) {
		if (Static321.anInt6084 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub27 local6 = arg0.aClass1_Sub27_2;
		Static172.aClass201Array3[Static321.anInt6084] = arg0;
		Static78.aBooleanArray9[Static321.anInt6084] = false;
		Static321.anInt6084++;
		@Pc(21) int local21 = arg0.anInt5980;
		if (arg0.aBoolean409) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt5980;
		if (arg0.aBoolean410) {
			local29 = Static538.anInt9338 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5495() + Static444.anInt7507 - local6.method5496() >> Static246.anInt4759;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5495() + local6.method5496() - Static444.anInt7507 >> Static246.anInt4759;
			if (local73 >= Static60.anInt1677) {
				local73 = Static60.anInt1677 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray110[local41++];
				@Pc(105) int local105 = (local6.method5493() + Static444.anInt7507 - local6.method5496() >> Static246.anInt4759) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static488.anInt8353) {
					local113 = Static488.anInt8353 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static17.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static17.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static321.anInt6084;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static17.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static321.anInt6084 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static17.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static321.anInt6084 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static17.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static321.anInt6084 << 48;
					}
				}
			}
		}
	}
}

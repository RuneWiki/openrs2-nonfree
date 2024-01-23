import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Z")
	public static boolean aBoolean519 = true;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!ha;")
	public static Class1_Sub13_Sub1 aClass1_Sub13_Sub1_117 = new Class1_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!nm;Lclient!nm;ZB)V")
	public static void method4569(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1) {
		Static205.aClass119_72 = arg0;
		Static256.aBoolean457 = true;
		Static114.aClass119_43 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lclient!el;")
	public static Class45 method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2573; local13++) {
			@Pc(22) Class45 local22 = local7.aClass45Array2[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1360 == arg1 && local22.anInt1359 == arg2) {
				Static9.method164(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	public static void method4571(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static71.aBoolean165 && arg0) {
			local11 = 1;
			local13 = Static172.aByteArrayArray11;
		} else {
			local11 = 4;
			local13 = Static186.aByteArrayArray13;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static246.method3875();
			for (@Pc(32) int local32 = 0; local32 < 13; local32++) {
				for (@Pc(39) int local39 = 0; local39 < 13; local39++) {
					@Pc(52) int local52 = Static291.anIntArrayArrayArray14[local21][local32][local39];
					if (local52 != -1) {
						@Pc(62) int local62 = local52 >> 24 & 0x3;
						if (!arg0 || local62 == 0) {
							@Pc(75) int local75 = local52 >> 3 & 0x7FF;
							@Pc(81) int local81 = local52 >> 14 & 0x3FF;
							@Pc(91) int local91 = local75 / 8 + (local81 / 8 << 8);
							@Pc(97) int local97 = local52 >> 1 & 0x3;
							for (@Pc(99) int local99 = 0; local99 < Static135.anIntArray209.length; local99++) {
								if (local91 == Static135.anIntArray209[local99] && local13[local99] != null) {
									Static75.method1840(local97, local13[local99], local21, arg0, (local75 & 0x7) * 8, local62, Static122.aClass60Array1, (local81 & 0x7) * 8, local39 * 8, local32 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt2535;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static200.aByteArrayArrayArray8[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static200.aByteArrayArrayArray8[arg3][arg1][arg0] & 0x10) == 0) {
			return Static94.method2025(arg3, arg1, arg0) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!uo;)V")
	public static void method2324(@OriginalArg(0) Class32 arg0) {
		for (@Pc(1) int local1 = Static73.anInt1934; local1 < Static113.anInt2651; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static242.anInt6744; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static315.anInt6124; local7++) {
					@Pc(16) Class194 local16 = Static77.aClass194ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class17_Sub4 local21 = local16.aClass17_Sub4_1;
						@Pc(24) Class17_Sub4 local24 = local16.aClass17_Sub4_2;
						if (local21 != null && local21.method4778()) {
							Static298.method5001(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method4778()) {
								Static298.method5001(arg0, local24, local1, local4, local7, 1, 1);
								local24.method4786(arg0, 0, 0, 0, false, local21);
								local24.method4789();
							}
							local21.method4789();
						}
						for (@Pc(70) Class126 local70 = local16.aClass126_2; local70 != null; local70 = local70.aClass126_1) {
							@Pc(74) Class17_Sub1 local74 = local70.aClass17_Sub1_1;
							if (local74 != null && local74.method4778()) {
								Static298.method5001(arg0, local74, local1, local4, local7, local74.aShort74 + 1 - local74.aShort75, local74.aShort76 - local74.aShort77 + 1);
								local74.method4789();
							}
						}
						@Pc(111) Class17_Sub5 local111 = local16.aClass17_Sub5_1;
						if (local111 != null && local111.method4778()) {
							Static246.method4422(arg0, local111, local1, local4, local7);
							local111.method4789();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method2325() {
		@Pc(5) Class87 local5 = Static108.aClass87_21;
		synchronized (Static108.aClass87_21) {
			Static108.aClass87_21.method2473(5);
		}
		local5 = Static314.aClass87_55;
		synchronized (Static314.aClass87_55) {
			Static314.aClass87_55.method2473(5);
		}
		@Pc(37) Class18 local37 = Static357.aClass18_3;
		synchronized (Static357.aClass18_3) {
			Static357.aClass18_3.method567();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method2326() {
		if (Static276.anInt5645 <= 0) {
			Static243.aString52 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static263.aStringArray56.length; local11++) {
			if (Static263.aStringArray56[local11].startsWith("--> ")) {
				local9++;
				if (Static276.anInt5645 == local9) {
					Static243.aString52 = Static263.aStringArray56[local11].substring(4);
					break;
				}
			}
		}
	}
}

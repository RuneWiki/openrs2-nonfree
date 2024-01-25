import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_255 = new Class88("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt8697 = 0;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_134 = new Class45(113, 2);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)Z")
	public static boolean method7154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static352.method5522(arg0, arg1) || Static448.method6772(arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ge;I)I")
	public static int method7156(@OriginalArg(0) Class114 arg0) {
		if (Static155.aClass114_3 == arg0) {
			return 5120;
		} else if (arg0 == Static155.aClass114_4) {
			return 5122;
		} else if (Static155.aClass114_5 == arg0) {
			return 5124;
		} else if (Static155.aClass114_6 == arg0) {
			return 5121;
		} else if (arg0 == Static155.aClass114_7) {
			return 5123;
		} else if (Static155.aClass114_8 == arg0) {
			return 5125;
		} else if (Static155.aClass114_9 == arg0) {
			return 5131;
		} else if (arg0 == Static155.aClass114_10) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	public static int method7157() {
		if (Static191.aClass198_6 == null) {
			if (!Static389.aBoolean533 && Static8.anInt118 > 0) {
				if (Static435.aBoolean553 && Static23.aClass5_3.method211(81) && Static8.anInt118 > 2) {
					return ((Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284.aClass12_284).anInt4330;
				}
				return ((Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284).anInt4330;
			}
			@Pc(15) int local15 = Static527.aClass6_1.method3754();
			@Pc(19) int local19 = Static527.aClass6_1.method3757();
			@Pc(21) int local21 = Static301.anInt5821;
			@Pc(23) int local23 = Static105.anInt2405;
			@Pc(25) int local25 = Static253.anInt5213;
			if (local21 < local15 && local15 < local21 + local25) {
				@Pc(40) int local40 = -1;
				@Pc(59) int local59;
				for (@Pc(42) int local42 = 0; local42 < Static8.anInt118; local42++) {
					if (Static386.aBoolean562) {
						local59 = local23 + (Static8.anInt118 - local42 + -1) * 16 + 33;
						if (local19 > local59 - 13 && local59 + 3 >= local19) {
							local40 = local42;
						}
					} else {
						local59 = (Static8.anInt118 - local42 - 1) * 16 + local23 + 31;
						if (local59 - 13 < local19 && local59 + 3 >= local19) {
							local40 = local42;
						}
					}
				}
				if (local40 != -1) {
					local59 = 0;
					@Pc(124) Class162 local124 = new Class162(Static192.aClass73_33);
					for (@Pc(129) Class12_Sub20 local129 = (Class12_Sub20) local124.method4145(); local129 != null; local129 = (Class12_Sub20) local124.method4147()) {
						if (local40 == local59++) {
							return local129.anInt4330;
						}
					}
				}
			}
		}
		return -1;
	}
}

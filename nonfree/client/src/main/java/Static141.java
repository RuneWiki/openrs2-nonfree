import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public static int anInt2838;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_5 = new Class74(6, 0, 4, 2);

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString19 = "";

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "[I")
	public static final int[] anIntArray136 = new int[14];

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_6 = new Class74(0, 2, 2, 1);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
	public static int method2609() {
		if (Static608.aClass279_18 == null) {
			if (!Static447.aBoolean555 && Static203.aClass3_Sub4_Sub13_1 != null) {
				return Static203.aClass3_Sub4_Sub13_1.anInt4576;
			}
			@Pc(23) int local23 = Static483.aClass191_1.method6989();
			@Pc(27) int local27 = Static483.aClass191_1.method6982();
			@Pc(47) int local47;
			@Pc(49) int local49;
			@Pc(61) int local61;
			@Pc(248) Class3_Sub4_Sub13 local248;
			if (Static392.aBoolean518) {
				@Pc(118) Class94 local118;
				if (Static276.anInt4979 < local23 && local23 < Static452.anInt3209 + Static276.anInt4979) {
					local47 = -1;
					for (local49 = 0; local49 < Static157.anInt3113; local49++) {
						if (Static519.aBoolean557) {
							local61 = Static625.anInt10194 + local49 * 16 + 33;
							if (local61 - 13 < local27 && local27 <= local61 + 3) {
								local47 = local49;
							}
						} else {
							local61 = local49 * 16 + Static625.anInt10194 + 31;
							if (local27 > local61 - 13 && local61 + 3 >= local27) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local118 = new Class94(Static226.aClass15_3);
						for (@Pc(123) Class3_Sub4_Sub1 local123 = (Class3_Sub4_Sub1) local118.method2558(); local123 != null; local123 = (Class3_Sub4_Sub1) local118.method2557()) {
							if (local47 == local61++) {
								if (local123.anInt805 == 1) {
									return ((Class3_Sub4_Sub13) local123.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66).anInt4576;
								}
								return -1;
							}
						}
					}
				} else if (Static528.aClass3_Sub4_Sub1_1 != null && local23 > Static107.anInt2316 && local23 < Static416.anInt7575 + Static107.anInt2316) {
					local47 = -1;
					for (local49 = 0; local49 < Static528.aClass3_Sub4_Sub1_1.anInt805; local49++) {
						if (Static519.aBoolean557) {
							local61 = Static312.anInt5897 + local49 * 16 + 33;
							if (local61 - 13 < local27 && local61 + 3 >= local27) {
								local47 = local49;
							}
						} else {
							local61 = local49 * 16 + Static312.anInt5897 + 31;
							if (local61 - 13 < local27 && local61 + 3 >= local27) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local61 = 0;
						local118 = new Class94(Static528.aClass3_Sub4_Sub1_1.aClass15_1);
						for (local248 = (Class3_Sub4_Sub13) local118.method2558(); local248 != null; local248 = (Class3_Sub4_Sub13) local118.method2557()) {
							if (local61++ == local47) {
								return local248.anInt4576;
							}
						}
					}
				}
			} else if (local23 > Static276.anInt4979 && Static276.anInt4979 + Static452.anInt3209 > local23) {
				local47 = -1;
				for (local49 = 0; local49 < Static160.anInt3142; local49++) {
					if (Static519.aBoolean557) {
						local61 = (Static160.anInt3142 - local49 - 1) * 16 + Static625.anInt10194 + 33;
						if (local61 - 13 < local27 && local27 <= local61 + 3) {
							local47 = local49;
						}
					} else {
						local61 = (Static160.anInt3142 - local49 - 1) * 16 + Static625.anInt10194 + 31;
						if (local27 > local61 - 13 && local27 <= local61 + 3) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local61 = 0;
					@Pc(364) Class294 local364 = new Class294(Static464.aClass223_49);
					for (local248 = (Class3_Sub4_Sub13) local364.method7321(); local248 != null; local248 = (Class3_Sub4_Sub13) local364.method7319()) {
						if (local61++ == local47) {
							return local248.anInt4576;
						}
					}
				}
			}
		}
		return -1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!oa;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_108 = new Class119(11, -1);

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "J")
	public static long aLong151 = 0L;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	public static int method3880() {
		if (Static238.aClass156_9 == null) {
			if (!Static438.aBoolean636 && Static158.anInt3162 > 0) {
				if (Static348.aBoolean510 && Static263.aClass10_1.method301(81) && Static158.anInt3162 > 2) {
					return ((Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262.aClass3_262).anInt2185;
				}
				return ((Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262).anInt2185;
			}
			@Pc(48) int local48 = Static290.aClass100_1.method3218();
			@Pc(52) int local52 = Static290.aClass100_1.method3213();
			@Pc(54) int local54 = Static124.anInt7631;
			@Pc(56) int local56 = Static442.anInt7488;
			@Pc(58) int local58 = Static126.anInt2657;
			if (local48 > local54 && local54 + local58 > local48) {
				@Pc(68) int local68 = -1;
				@Pc(87) int local87;
				for (@Pc(70) int local70 = 0; local70 < Static158.anInt3162; local70++) {
					if (Static378.aBoolean550) {
						local87 = local56 + (-local70 + Static158.anInt3162 + -1) * 16 + 33;
						if (local52 > local87 - 13 && local87 + 3 >= local52) {
							local68 = local70;
						}
					} else {
						local87 = local56 + (-local70 + -1 + Static158.anInt3162) * 16 + 31;
						if (local87 - 13 < local52 && local87 + 3 >= local52) {
							local68 = local70;
						}
					}
				}
				if (local68 != -1) {
					local87 = 0;
					@Pc(149) Class40 local149 = new Class40(Static184.aClass243_21);
					for (@Pc(154) Class3_Sub14 local154 = (Class3_Sub14) local149.method1127(); local154 != null; local154 = (Class3_Sub14) local149.method1126()) {
						if (local87++ == local68) {
							return local154.anInt2185;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method3882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static14.method323(arg0, arg1) || Static120.method1956(arg1, arg0);
	}
}

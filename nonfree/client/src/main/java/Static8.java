import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!ic;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "Lclient!cs;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_9 = new Class18(43, 3);

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
	public static int anInt235 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIZ)I")
	public static int method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static258.aClass36Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(24) int local24 = arg2 >> 7;
		if (local11 < 0 || local24 < 0 || Static311.anInt5653 - 1 < local11 || Static189.anInt3820 - 1 < local24) {
			return 0;
		}
		@Pc(52) int local52 = arg0;
		if (arg0 < 3 && (Static264.aByteArrayArrayArray7[1][local11][local24] & 0x2) != 0) {
			local52 = arg0 + 1;
		}
		return Static258.aClass36Array2[local52].method4433(arg1, arg2);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
	public static int method289(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local26 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local49 >= '0' && local49 <= '9') {
				local78 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local78 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local78 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local78) {
				throw new NumberFormatException();
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(124) int local124 = local78 + local38 * arg1;
			if (local38 != local124 / arg1) {
				throw new NumberFormatException();
			}
			local36 = true;
			local38 = local124;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local38;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method291(@OriginalArg(1) String arg0) {
		if (Static365.aClass126Array1 != null) {
			Static280.method5009(Static50.aClass18_45);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0));
			Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method292() {
		Static29.aClass21_28.method857();
	}
}

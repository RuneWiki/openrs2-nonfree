import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!f;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!lm;")
	public static Class134 aClass134_128;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_10 = new Class88(64);

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt5687 = 0;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public static int anInt5688 = -1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
	public static int method4967(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(34) boolean local34 = false;
		@Pc(36) boolean local36 = false;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg1.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(49) char local49 = arg1.charAt(local43);
			if (local43 == 0) {
				if (local49 == '-') {
					local34 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local49 >= '0' && local49 <= '9') {
				local87 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local87 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local87 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local87) {
				throw new NumberFormatException();
			}
			if (local34) {
				local87 = -local87;
			}
			@Pc(123) int local123 = local38 * arg0 + local87;
			if (local123 / arg0 != local38) {
				throw new NumberFormatException();
			}
			local36 = true;
			local38 = local123;
		}
		if (!local36) {
			throw new NumberFormatException();
		}
		return local38;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Lclient!js;")
	public static Class10_Sub3 method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_Sub3_1 == null ? null : local7.aClass10_Sub3_1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4970(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static37.aClass134_18.anInt3576 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static157.anInt3294; local18++) {
			@Pc(24) Class102 local24 = Static348.method5333(local18);
			if ((!arg0 || local24.aBoolean195) && local24.anInt2395 == -1 && local24.anInt2432 == -1 && local24.anInt2424 == 0 && local24.aString95.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static210.anInt4430 = -1;
					Static273.aShortArray89 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static273.aShortArray89 = local14;
		Static138.anInt6325 = 0;
		Static210.anInt4430 = local16;
		@Pc(109) String[] local109 = new String[Static210.anInt4430];
		for (@Pc(116) int local116 = 0; local116 < Static210.anInt4430; local116++) {
			local109[local116] = Static348.method5333(local14[local116]).aString95;
		}
		Static288.method5031(local109, Static273.aShortArray89);
		Static37.aClass134_18.method3022();
		Static37.aClass134_18.anInt3576 = 2;
	}
}

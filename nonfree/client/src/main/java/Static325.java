import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
	public static int[] anIntArray638;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
	public static int[] anIntArray639;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_142 = new Class211(81, 8);

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	public static int anInt5480 = -50;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
	public static void method4730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) String local39 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local39);
		Static187.method2678(true, local39);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method4731(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(28) char local28 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local28) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local28 >= local11) {
				return 1;
			}
			@Pc(74) char local74;
			if (local17 == '\u0000') {
				local74 = arg0.charAt(local13++);
			} else {
				local74 = local17;
			}
			@Pc(93) char local93;
			if (local28 == '\u0000') {
				local93 = arg2.charAt(local15++);
			} else {
				local93 = local28;
			}
			local17 = Static294.method4445(local74);
			local28 = Static294.method4445(local93);
			local74 = Static22.method3210(arg1, local74);
			local93 = Static22.method3210(arg1, local93);
			if (local74 != local93 && Character.toUpperCase(local74) != Character.toUpperCase(local93)) {
				local74 = Character.toLowerCase(local74);
				local93 = Character.toLowerCase(local93);
				if (local74 != local93) {
					return Static46.method710(arg1, local74) - Static46.method710(arg1, local93);
				}
			}
		}
		@Pc(152) int local152 = Math.min(local8, local11);
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			if (arg1 == 2) {
				local13 = local8 - local154 - 1;
				local15 = local11 - local154 - 1;
			} else {
				local15 = local154;
				local13 = local154;
			}
			@Pc(183) char local183 = arg0.charAt(local13);
			@Pc(187) char local187 = arg2.charAt(local15);
			if (local187 != local183 && Character.toUpperCase(local183) != Character.toUpperCase(local187)) {
				local183 = Character.toLowerCase(local183);
				local187 = Character.toLowerCase(local187);
				if (local187 != local183) {
					return Static46.method710(arg1, local183) - Static46.method710(arg1, local187);
				}
			}
		}
		@Pc(227) int local227 = local8 - local11;
		if (local227 != 0) {
			return local227;
		}
		for (@Pc(233) int local233 = 0; local233 < local152; local233++) {
			@Pc(239) char local239 = arg0.charAt(local233);
			@Pc(243) char local243 = arg2.charAt(local233);
			if (local239 != local243) {
				return Static46.method710(arg1, local239) - Static46.method710(arg1, local243);
			}
		}
		return 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt6526;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString240 = "Loaded wordpack";

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString241 = "flash3:";

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
	public static final int[] anIntArray624 = new int[32];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
	public static int method5826(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg2.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(79) char local79;
			if (local19 == '\u0000') {
				local79 = arg1.charAt(local15++);
			} else {
				local79 = local19;
			}
			local17 = Static228.method4030(local60);
			local19 = Static228.method4030(local79);
			local60 = Static174.method3392(local60, arg0);
			local79 = Static174.method3392(local79, arg0);
			if (local60 != local79 && Character.toUpperCase(local60) != Character.toUpperCase(local79)) {
				local60 = Character.toLowerCase(local60);
				local79 = Character.toLowerCase(local79);
				if (local60 != local79) {
					return Static219.method3940(local60, arg0) - Static219.method3940(local79, arg0);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg0 == 2) {
				local13 = local8 - local140 - 1;
				local15 = local11 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(170) char local170 = arg2.charAt(local13);
			@Pc(174) char local174 = arg1.charAt(local15);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local174 != local170) {
					return Static219.method3940(local170, arg0) - Static219.method3940(local174, arg0);
				}
			}
		}
		@Pc(214) int local214 = local8 - local11;
		if (local214 != 0) {
			return local214;
		}
		for (@Pc(220) int local220 = 0; local220 < local138; local220++) {
			@Pc(231) char local231 = arg2.charAt(local220);
			@Pc(235) char local235 = arg1.charAt(local220);
			if (local235 != local231) {
				return Static219.method3940(local231, arg0) - Static219.method3940(local235, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method5827() {
		Static40.aClass14_Sub23_1 = new Class14_Sub23(Static304.aString218, "", Static288.anInt5579, 1002, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5829(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static217.anInt4354 >= 100) {
			Static276.method4684(Static30.aString27);
			return;
		}
		@Pc(19) String local19 = Static280.method5743(arg1);
		if (local19 == null) {
			return;
		}
		@Pc(61) String local61;
		for (@Pc(24) int local24 = 0; local24 < Static217.anInt4354; local24++) {
			@Pc(32) String local32 = Static280.method5743(Static38.aStringArray20[local24]);
			if (local32 != null && local32.equals(local19)) {
				Static276.method4684(arg1 + Static192.aString136);
				return;
			}
			if (Static143.aStringArray40[local24] != null) {
				local61 = Static280.method5743(Static143.aStringArray40[local24]);
				if (local61 != null && local61.equals(local19)) {
					Static276.method4684(arg1 + Static192.aString136);
					return;
				}
			}
		}
		for (@Pc(88) int local88 = 0; local88 < Static302.anInt5838; local88++) {
			local61 = Static280.method5743(Static120.aStringArray36[local88]);
			if (local61 != null && local61.equals(local19)) {
				Static276.method4684(Static286.aString205 + arg1 + Static47.aString50);
				return;
			}
			if (Static339.aStringArray34[local88] != null) {
				@Pc(127) String local127 = Static280.method5743(Static339.aStringArray34[local88]);
				if (local127 != null && local127.equals(local19)) {
					Static276.method4684(Static286.aString205 + arg1 + Static47.aString50);
					return;
				}
			}
		}
		if (Static280.method5743(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224).equals(local19)) {
			Static276.method4684(Static28.aString26);
		} else {
			Static164.aClass14_Sub4_Sub2_3.method2557(134);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg1) + 1);
			Static164.aClass14_Sub4_Sub2_3.method2527(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2538(arg0 ? 1 : 0);
		}
	}
}

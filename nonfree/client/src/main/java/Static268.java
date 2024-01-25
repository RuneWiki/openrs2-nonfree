import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	public static int anInt4864;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLjava/lang/String;Lclient!ae;)I")
	public static int method4087(@OriginalArg(1) String arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		@Pc(14) int local14 = arg1.anInt7898;
		@Pc(18) byte[] local18 = Static242.method3800(arg0);
		arg1.method6490(local18.length);
		arg1.anInt7898 += Static132.aClass147_1.method3282(0, local18.length, arg1.aByteArray96, local18, arg1.anInt7898);
		return arg1.anInt7898 - local14;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method4088(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(19) int local19 = arg1.length();
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) char local25 = 0;
		@Pc(27) char local27 = 0;
		while (local8 > local21 - local25 || local19 > local23 - local27) {
			if (local8 <= local21 - local25) {
				return -1;
			}
			if (local19 <= local23 - local27) {
				return 1;
			}
			@Pc(62) char local62;
			if (local25 == '\u0000') {
				local62 = arg0.charAt(local21++);
			} else {
				local62 = local25;
			}
			@Pc(81) char local81;
			if (local27 == '\u0000') {
				local81 = arg1.charAt(local23++);
			} else {
				local81 = local27;
			}
			local25 = Static184.method2974(local62);
			local27 = Static184.method2974(local81);
			local62 = Static286.method4293(arg2, local62);
			local81 = Static286.method4293(arg2, local81);
			if (local62 != local81 && Character.toUpperCase(local62) != Character.toUpperCase(local81)) {
				local62 = Character.toLowerCase(local62);
				local81 = Character.toLowerCase(local81);
				if (local62 != local81) {
					return Static373.method5585(arg2, local62) - Static373.method5585(arg2, local81);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local8, local19);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg2 == 2) {
				local21 = local8 - local139 - 1;
				local23 = local19 - local139 - 1;
			} else {
				local23 = local139;
				local21 = local139;
			}
			@Pc(167) char local167 = arg0.charAt(local21);
			@Pc(171) char local171 = arg1.charAt(local23);
			if (local171 != local167 && Character.toUpperCase(local167) != Character.toUpperCase(local171)) {
				local167 = Character.toLowerCase(local167);
				local171 = Character.toLowerCase(local171);
				if (local167 != local171) {
					return Static373.method5585(arg2, local167) - Static373.method5585(arg2, local171);
				}
			}
		}
		@Pc(212) int local212 = local8 - local19;
		if (local212 != 0) {
			return local212;
		}
		for (@Pc(221) int local221 = 0; local221 < local137; local221++) {
			@Pc(227) char local227 = arg0.charAt(local221);
			@Pc(231) char local231 = arg1.charAt(local221);
			if (local231 != local227) {
				return Static373.method5585(arg2, local227) - Static373.method5585(arg2, local231);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static void method4089(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 7);
		local8.method3084();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)[Lclient!si;")
	public static Class223[] method4091() {
		return new Class223[] { Static356.aClass223_1, Static356.aClass223_2, Static356.aClass223_3, Static356.aClass223_4, Static356.aClass223_5, Static356.aClass223_6, Static356.aClass223_7, Static356.aClass223_8, Static356.aClass223_9, Static356.aClass223_10 };
	}
}

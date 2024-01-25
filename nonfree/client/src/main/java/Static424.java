import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!za;")
	public static Class117 aClass117_11;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray137 = new byte[250][];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)[Lclient!ql;")
	public static Class210[] method5414() {
		return new Class210[] { Static67.aClass210_61, Static67.aClass210_62, Static67.aClass210_63, Static67.aClass210_64, Static67.aClass210_65, Static67.aClass210_66, Static67.aClass210_67, Static67.aClass210_68, Static67.aClass210_69, Static67.aClass210_70, Static67.aClass210_71, Static67.aClass210_72 };
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5415(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static148.anInt2307; local16++) {
			if (arg0.equalsIgnoreCase(Static108.aStringArray10[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method5416(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(34) boolean local34 = false;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local26 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(72) int local72;
			if (local47 >= '0' && local47 <= '9') {
				local72 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local72 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local72 = local47 - 'W';
			} else {
				return false;
			}
			if (local72 >= 10) {
				return false;
			}
			if (local26) {
				local72 = -local72;
			}
			@Pc(115) int local115 = local36 * 10 + local72;
			if (local36 != local115 / 10) {
				return false;
			}
			local36 = local115;
			local34 = true;
		}
		return local34;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method5417(@OriginalArg(1) int arg0) {
		Static128.anInt1970 = arg0;
		@Pc(7) Class77 local7 = Static185.aClass77_25;
		synchronized (Static185.aClass77_25) {
			Static185.aClass77_25.method1395();
		}
		local7 = Static309.aClass77_37;
		synchronized (Static309.aClass77_37) {
			Static309.aClass77_37.method1395();
		}
	}
}

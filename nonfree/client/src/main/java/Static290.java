import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static int anInt4840 = 0;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	public static int anInt4843 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[Lclient!l;)V")
	public static void method3849(@OriginalArg(1) Class11[] arg0) {
		Static212.anInt3800 = arg0.length;
		Static423.aClass11Array15 = new Class11[Static212.anInt3800 + 10];
		Static68.anIntArray99 = new int[Static212.anInt3800 + 10];
		Static464.method3637(arg0, 0, Static423.aClass11Array15, 0, Static212.anInt3800);
		for (@Pc(26) int local26 = 0; local26 < Static212.anInt3800; local26++) {
			Static68.anIntArray99[local26] = Static423.aClass11Array15[local26].T();
		}
		for (@Pc(41) int local41 = Static212.anInt3800; local41 < Static423.aClass11Array15.length; local41++) {
			Static68.anIntArray99[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)I")
	public static int method3850(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(58) char local58;
			if (local17 == '\u0000') {
				local58 = arg2.charAt(local13++);
			} else {
				local58 = local17;
			}
			@Pc(71) char local71;
			if (local19 == '\u0000') {
				local71 = arg0.charAt(local15++);
			} else {
				local71 = local19;
			}
			local17 = Static133.method2106(local58);
			local19 = Static133.method2106(local71);
			local58 = Static181.method2633(arg1, local58);
			local71 = Static181.method2633(arg1, local71);
			if (local58 != local71 && Character.toUpperCase(local58) != Character.toUpperCase(local71)) {
				local58 = Character.toLowerCase(local58);
				local71 = Character.toLowerCase(local71);
				if (local58 != local71) {
					return Static344.method4445(arg1, local58) - Static344.method4445(arg1, local71);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local8, local11);
		for (@Pc(141) int local141 = 0; local141 < local139; local141++) {
			if (arg1 == 2) {
				local15 = local11 - local141 - 1;
				local13 = local8 - local141 - 1;
			} else {
				local15 = local141;
				local13 = local141;
			}
			@Pc(172) char local172 = arg2.charAt(local13);
			@Pc(176) char local176 = arg0.charAt(local15);
			if (local172 != local176 && Character.toUpperCase(local172) != Character.toUpperCase(local176)) {
				local172 = Character.toLowerCase(local172);
				local176 = Character.toLowerCase(local176);
				if (local172 != local176) {
					return Static344.method4445(arg1, local172) - Static344.method4445(arg1, local176);
				}
			}
		}
		@Pc(225) int local225 = local8 - local11;
		if (local225 != 0) {
			return local225;
		}
		for (@Pc(231) int local231 = 0; local231 < local139; local231++) {
			@Pc(237) char local237 = arg2.charAt(local231);
			@Pc(241) char local241 = arg0.charAt(local231);
			if (local237 != local241) {
				return Static344.method4445(arg1, local237) - Static344.method4445(arg1, local241);
			}
		}
		return 0;
	}
}

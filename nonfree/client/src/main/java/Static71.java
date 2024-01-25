import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "Lclient!vi;")
	public static Class301 aClass301_4;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "I")
	public static int anInt4958 = 100;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "[Lclient!aea;")
	public static final Class10[] aClass10Array3 = new Class10[4];

	@OriginalMember(owner = "client!co", name = "p", descriptor = "(I)[Lclient!mh;")
	public static Class196[] method4213() {
		if (Static194.aClass196Array1 == null) {
			@Pc(7) Class196[] local7 = Static188.method3174(Static159.aClass9_10);
			@Pc(11) Class196[] local11 = new Class196[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(64) int local64;
			@Pc(70) Class196 local70;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class196 local21 = local7[local15];
				if ((local21.anInt6048 <= 0 || local21.anInt6048 >= 24) && local21.anInt6049 >= 800 && local21.anInt6050 >= 600 && (Static193.anInt3735 >= 96 || Static17.anInt459 != 0 || local21.anInt6049 <= 1024 && local21.anInt6050 <= 768)) {
					for (local64 = 0; local64 < local13; local64++) {
						local70 = local11[local64];
						if (local70.anInt6049 == local21.anInt6049 && local70.anInt6050 == local21.anInt6050) {
							if (local21.anInt6048 > local70.anInt6048) {
								local11[local64] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static194.aClass196Array1 = new Class196[local13];
			Static553.method2531(local11, 0, Static194.aClass196Array1, 0, local13);
			@Pc(126) int[] local126 = new int[Static194.aClass196Array1.length];
			for (local64 = 0; local64 < Static194.aClass196Array1.length; local64++) {
				local70 = Static194.aClass196Array1[local64];
				local126[local64] = local70.anInt6050 * local70.anInt6049;
			}
			Static103.method907(local126, Static194.aClass196Array1);
		}
		return Static194.aClass196Array1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method4225(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg2.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(72) char local72;
			if (local19 == '\u0000') {
				local72 = arg0.charAt(local15++);
			} else {
				local72 = local19;
			}
			local17 = Static47.method1043(local62);
			local19 = Static47.method1043(local72);
			local62 = Static433.method6185(arg1, local62);
			local72 = Static433.method6185(arg1, local72);
			if (local62 != local72 && Character.toUpperCase(local62) != Character.toUpperCase(local72)) {
				local62 = Character.toLowerCase(local62);
				local72 = Character.toLowerCase(local72);
				if (local72 != local62) {
					return Static442.method6259(arg1, local62) - Static442.method6259(arg1, local72);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local8, local11);
		for (@Pc(141) int local141 = 0; local141 < local139; local141++) {
			if (arg1 == 2) {
				local13 = local8 - local141 - 1;
				local15 = local11 - local141 - 1;
			} else {
				local15 = local141;
				local13 = local141;
			}
			@Pc(168) char local168 = arg2.charAt(local13);
			@Pc(172) char local172 = arg0.charAt(local15);
			if (local168 != local172 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static442.method6259(arg1, local168) - Static442.method6259(arg1, local172);
				}
			}
		}
		@Pc(217) int local217 = local8 - local11;
		if (local217 != 0) {
			return local217;
		}
		for (@Pc(226) int local226 = 0; local226 < local139; local226++) {
			@Pc(232) char local232 = arg2.charAt(local226);
			@Pc(236) char local236 = arg0.charAt(local226);
			if (local232 != local236) {
				return Static442.method6259(arg1, local232) - Static442.method6259(arg1, local236);
			}
		}
		return 0;
	}
}

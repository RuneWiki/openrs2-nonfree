import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_84 = new Class181(45, 3);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6254(@OriginalArg(1) String arg0) {
		if (!Static25.aBoolean80) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = Static81.anInt1953;
		@Pc(19) int[] local19 = Static227.anIntArray309;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(29) Class11_Sub1_Sub1_Sub2 local29 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local19[local21]];
			if (local29 != null && local29 != Static350.aClass11_Sub1_Sub1_Sub2_4 && local29.aString95 != null && local29.aString95.equalsIgnoreCase(arg0)) {
				Static298.method4854(Static356.aClass181_76);
				Static547.aClass6_Sub26_Sub2_2.method4971(0);
				Static547.aClass6_Sub26_Sub2_2.method4962(Static353.anInt6817);
				Static547.aClass6_Sub26_Sub2_2.method4991(Static150.anInt7378);
				Static547.aClass6_Sub26_Sub2_2.method4991(local19[local21]);
				Static547.aClass6_Sub26_Sub2_2.method4948(Static244.anInt4934);
				Static21.method864(local29.method6212(), local29.method6212(), local29.anIntArray526[0], 0, 0, -2, local29.anIntArray527[0], true);
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static99.method2135(Static222.aClass152_66.method4002(Static286.anInt5468) + arg0);
		}
		if (Static25.aBoolean80) {
			Static353.method5744();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method6255(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static267.aCharArray4[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
					local70 = ' ';
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}

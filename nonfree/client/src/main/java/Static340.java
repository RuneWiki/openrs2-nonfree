import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!pga;")
	public static Class32 aClass32_16;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public static int anInt6735 = 0;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!ada;")
	public static Class8 aClass8_37 = new Class8();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method5771() {
		if (Static71.aBoolean94 || Static482.aClass6_Sub2_Sub4_4 == null) {
			return "";
		} else if ((Static482.aClass6_Sub2_Sub4_4.aString20 == null || Static482.aClass6_Sub2_Sub4_4.aString20.length() == 0) && Static482.aClass6_Sub2_Sub4_4.aString18 != null && Static482.aClass6_Sub2_Sub4_4.aString18.length() > 0) {
			return Static482.aClass6_Sub2_Sub4_4.aString18;
		} else {
			return Static482.aClass6_Sub2_Sub4_4.aString20;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z")
	public static boolean method5774() {
		if (Static118.aBoolean172) {
			try {
				Static654.method5164(Static42.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public static void method5775() {
		@Pc(7) int local7 = 0;
		if (Static348.aClass6_Sub22_19 != null) {
			local7 = Static348.aClass6_Sub22_19.aClass15_Sub16_1.method5372();
		}
		@Pc(39) int local39;
		@Pc(53) int local53;
		if (local7 == 2) {
			local39 = Static26.anInt535 <= 800 ? Static26.anInt535 : 800;
			Static321.anInt6137 = local39;
			local53 = Static539.anInt9304 > 600 ? 600 : Static539.anInt9304;
			Static312.anInt5970 = (Static26.anInt535 - local39) / 2;
			Static356.anInt6630 = local53;
			Static44.anInt873 = 0;
		} else if (local7 == 1) {
			local39 = Static26.anInt535 > 1024 ? 1024 : Static26.anInt535;
			Static312.anInt5970 = (Static26.anInt535 - local39) / 2;
			local53 = Static539.anInt9304 > 768 ? 768 : Static539.anInt9304;
			Static321.anInt6137 = local39;
			Static356.anInt6630 = local53;
			Static44.anInt873 = 0;
		} else {
			Static356.anInt6630 = Static539.anInt9304;
			Static321.anInt6137 = Static26.anInt535;
			Static44.anInt873 = 0;
			Static312.anInt5970 = 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5776(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static612.aCharArray13[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hka", name = "f", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_5 = new Class387(14, 0, 4, 1);

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "[S")
	private static final short[] aShortArray45 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!hka", name = "k", descriptor = "[S")
	private static final short[] aShortArray47 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!hka", name = "j", descriptor = "[S")
	private static final short[] aShortArray46 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hka", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { aShortArray45, aShortArray47, aShortArray46 };

	@OriginalMember(owner = "client!hka", name = "i", descriptor = "I")
	public static int anInt2286 = 0;

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!ir;III)V")
	public static void method2112(@OriginalArg(0) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static44.aClass182ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V")
	public static void method2114() {
		if (Static280.anInt5243 <= 0) {
			Static337.aString75 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static475.aStringArray64.length; local18++) {
			if (Static475.aStringArray64[local18].indexOf("--> ") != -1) {
				@Pc(30) int local30 = ~Static280.anInt5243;
				local16++;
				if (local30 == ~local16) {
					Static337.aString75 = Static475.aStringArray64[local18].substring(Static475.aStringArray64[local18].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method2115(@OriginalArg(1) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static211.anInt9608;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class61 local30 = Static30.aClass267_1.method6384(arg0[local21]);
			if (local30.anInt1755 != -1) {
				@Pc(43) Class102 local43 = (Class102) Static305.aClass279_28.method6631((long) local30.anInt1755);
				if (local43 == null) {
					@Pc(51) Class150 local51 = Static683.method3275(Static235.aClass143_57, local30.anInt1755, 0);
					if (local51 != null) {
						local43 = Static582.aClass16_12.method8132(local51, true);
						Static305.aClass279_28.method6635(local43, (long) local30.anInt1755);
					}
				}
				if (local43 != null) {
					Static359.aClass102Array17[local19] = local43;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}
}

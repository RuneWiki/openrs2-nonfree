import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt5336;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!qj;")
	public static Class165 aClass165_81;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!di;")
	public static Class38 aClass38_8;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt5338;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V")
	public static void method4761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static180.aClass38_5.method1316(Static205.aString166);
		@Pc(25) int local25;
		for (@Pc(19) Class1_Sub41 local19 = (Class1_Sub41) Static175.aClass195_36.method5029(); local19 != null; local19 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
			local25 = Static141.method931(local19);
			if (local14 < local25) {
				local14 = local25;
			}
		}
		local14 += 8;
		local25 = Static277.anInt6207 * 16 + 21;
		@Pc(55) int local55 = arg1 - local14 / 2;
		if (local14 + local55 > Static11.anInt5389) {
			local55 = Static11.anInt5389 - local14;
		}
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(74) int local74 = arg0;
		if (Static320.anInt6140 < local25 + arg0) {
			local74 = Static320.anInt6140 - local25;
		}
		Static13.anInt269 = local55;
		if (local74 < 0) {
			local74 = 0;
		}
		Static179.aBoolean310 = true;
		Static115.anInt2299 = Static277.anInt6207 * 16 + (aBoolean458 ? 26 : 22);
		Static288.anInt6178 = local74;
		Static139.anInt2759 = local14;
	}
}

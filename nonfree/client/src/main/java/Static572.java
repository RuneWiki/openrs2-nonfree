import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "[[[Lclient!qs;")
	public static Class276[][][] aClass276ArrayArrayArray3;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "J")
	public static long aLong258;

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
	public static int anInt9366;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_168 = new Class73(110, 8);

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "Lclient!sv;")
	public static final Class311 aClass311_8 = new Class311();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7655(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static575.method7408(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static362.anInt6352; local30++) {
			@Pc(36) String local36 = Static488.aStringArray16[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static575.method7408(local36);
			if (local36 != null && local36.equals(local25)) {
				Static362.anInt6352--;
				for (@Pc(60) int local60 = local30; local60 < Static362.anInt6352; local60++) {
					Static488.aStringArray16[local60] = Static488.aStringArray16[local60 + 1];
					Static227.aStringArray11[local60] = Static227.aStringArray11[local60 + 1];
					Static378.aStringArray27[local60] = Static378.aStringArray27[local60 + 1];
					Static120.aStringArray6[local60] = Static120.aStringArray6[local60 + 1];
					Static82.aBooleanArray14[local60] = Static82.aBooleanArray14[local60 + 1];
				}
				Static449.anInt7763 = Static592.anInt9587;
				@Pc(117) Class6_Sub31 local117 = Static114.method2007(Static147.aClass47_144, Static337.aClass324_1);
				local117.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0));
				local117.aClass6_Sub21_Sub2_2.method6022(arg0);
				Static534.method7251(local117);
				return;
			}
		}
	}
}

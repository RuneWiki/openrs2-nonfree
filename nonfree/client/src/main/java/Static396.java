import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!vga;")
	public static Class359 aClass359_2;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
	public static boolean aBoolean569 = true;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6147(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static250.method3883(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static74.anInt1238; local30++) {
			@Pc(36) String local36 = Static182.aStringArray13[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static250.method3883(local36);
			if (local36 != null && local36.equals(local25)) {
				Static74.anInt1238--;
				for (@Pc(60) int local60 = local30; local60 < Static74.anInt1238; local60++) {
					Static182.aStringArray13[local60] = Static182.aStringArray13[local60 + 1];
					Static228.aStringArray17[local60] = Static228.aStringArray17[local60 + 1];
					Static484.anIntArray647[local60] = Static484.anIntArray647[local60 + 1];
					Static237.aStringArray18[local60] = Static237.aStringArray18[local60 + 1];
					Static42.anIntArray57[local60] = Static42.anIntArray57[local60 + 1];
					Static338.aBooleanArray36[local60] = Static338.aBooleanArray36[local60 + 1];
				}
				Static543.anInt10432 = Static278.anInt4551;
				@Pc(127) Class5_Sub40 local127 = Static25.method507(Static98.aClass208_2, Static186.aClass181_28);
				local127.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg0));
				local127.aClass5_Sub12_Sub2_2.method8619(arg0);
				Static612.method8496(local127);
				return;
			}
		}
	}
}

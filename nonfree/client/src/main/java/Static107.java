import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!ht;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_16 = new Class340();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public static void method2041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static673.anInt10331 == 1) {
			Static444.method6881(Static47.aClass6_Sub2_Sub11_1, arg0, arg1);
		} else if (Static673.anInt10331 == 2) {
			if (Static93.aBoolean113) {
				Static629.method8575(arg1 + Static24.method290(), arg0 - -Static488.method7227());
			} else {
				Static629.method8575(arg1, arg0);
			}
		}
		Static47.aClass6_Sub2_Sub11_1 = null;
		Static673.anInt10331 = 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([Ljava/lang/String;Z)V")
	public static void method2043(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static623.aString118 = Static623.aString118 + arg0[0];
			Static315.anInt5467 += arg0[0].length();
			return;
		}
		for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
			if (arg0[local40].startsWith("pause")) {
				@Pc(65) int local65 = 5;
				try {
					local65 = Integer.parseInt(arg0[local40].substring(6));
				} catch (@Pc(74) Exception local74) {
				}
				Static655.method8761("Pausing for " + local65 + " seconds...");
				Static337.aStringArray24 = arg0;
				Static5.anInt44 = local40 + 1;
				Static329.aLong191 = Static549.method7758() + (long) (local65 * 1000);
				return;
			}
			Static623.aString118 = arg0[local40];
			Static224.method4039(false);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z")
	public static boolean method2044() {
		return Static432.anInt7414 == 0 ? Static449.aClass6_Sub17_Sub4_3.method6077() : true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public static int anInt4127;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
	public static int anInt4138 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!jn;B)V")
	public static void method3669(@OriginalArg(0) Class176 arg0) {
		Static329.anInt6334 = arg0.method3998("p11_full");
		Static273.anInt7288 = arg0.method3998("p12_full");
		Static189.anInt3711 = arg0.method3998("b12_full");
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public static void method3672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = Static314.aClass114_11.method2950(Static590.aClass364_28.method8334(Static154.anInt3181));
		@Pc(28) int local28;
		for (@Pc(22) Class4_Sub39 local22 = (Class4_Sub39) Static40.aClass244_4.method5963(); local22 != null; local22 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			local28 = Static505.method7413(local22);
			if (local28 > local17) {
				local17 = local28;
			}
		}
		local17 += 8;
		local28 = Static339.anInt6583 * 16 + 21;
		@Pc(58) int local58 = arg1 - local17 / 2;
		if (local17 + local58 > Static554.anInt9828) {
			local58 = Static554.anInt9828 - local17;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(80) int local80 = arg0;
		if (Static375.anInt7256 < local28 + arg0) {
			local80 = Static375.anInt7256 - local28;
		}
		Static19.anInt285 = local58;
		if (local80 < 0) {
			local80 = 0;
		}
		Static543.anInt9642 = local80;
		Static17.anInt279 = (Static567.aBoolean701 ? 26 : 22) + Static339.anInt6583 * 16;
		Static49.aBoolean36 = true;
		Static179.anInt3618 = local17;
	}
}

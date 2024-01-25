import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
	public static int anInt1141 = 0;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	public static void method991() {
		if (Static398.anInt6539 < 0) {
			return;
		}
		@Pc(15) long local15 = Static567.method7863();
		Static398.anInt6539 = (int) ((long) Static398.anInt6539 + Static431.aLong215 - local15);
		if (Static398.anInt6539 > 0) {
			@Pc(35) int local35 = (Static398.anInt6539 << 8) / Static206.anInt3342;
			@Pc(40) int local40 = 255 - local35;
			@Pc(45) float local45 = (float) local35 / 255.0F;
			@Pc(49) float local49 = 1.0F - local45;
			Static266.anInt4126 = (local40 * (Static250.aClass264_1.anInt7054 & 0xFF00FF) + local35 * (Static627.anInt9594 & 0xFF00FF) & 0xFF00FF00) + ((Static627.anInt9594 & 0xFF00) * local35 + ((Static250.aClass264_1.anInt7054 & 0xFF00) * local40) & 0xFF0000) >>> 8;
			Static426.aFloat114 = Static233.aFloat47 + (Static250.aClass264_1.aFloat120 - Static233.aFloat47) * local49;
			Static366.anInt5876 = ((Static20.anInt270 & 0xFF00FF) * local35 + local40 * (Static250.aClass264_1.anInt7049 & 0xFF00FF) & 0xFF00FF00) + ((Static20.anInt270 & 0xFF00) * local35 + local40 * (Static250.aClass264_1.anInt7049 & 0xFF00) & 0xFF0000) >>> 8;
			Static558.aFloat145 = Static167.aFloat27 + local49 * (Static250.aClass264_1.aFloat117 - Static167.aFloat27);
			Static678.aFloat175 = local49 * (Static250.aClass264_1.aFloat119 - Static117.aFloat10) + Static117.aFloat10;
			Static439.aFloat123 = (Static250.aClass264_1.aFloat118 - Static611.aFloat151) * local49 + Static611.aFloat151;
			Static521.anInt8289 = local40 * Static250.aClass264_1.anInt7050 + local35 * Static255.anInt4025 >> 8;
			aFloat3 = Static138.aFloat24 + local49 * (Static250.aClass264_1.aFloat121 - Static138.aFloat24);
			Static434.aFloat122 = Static482.aFloat127 + (Static250.aClass264_1.aFloat116 - Static482.aFloat127) * local49;
			if (Static200.aClass74_2 != Static250.aClass264_1.aClass74_4) {
				Static11.aClass74_1 = Static587.aClass145_12.method9678(Static200.aClass74_2, Static250.aClass264_1.aClass74_4, local49, Static11.aClass74_1);
			}
			if (Static250.aClass264_1.aClass358_26 != Static206.aClass358_16) {
				if (Static206.aClass358_16 == null) {
					Static315.aClass358_20 = Static250.aClass264_1.aClass358_26;
					if (Static315.aClass358_20 != null) {
						Static315.aClass358_20.method8436(local40, 0);
					}
				} else {
					Static315.aClass358_20 = Static206.aClass358_16;
					if (Static315.aClass358_20 != null) {
						Static315.aClass358_20.method8436(local40, 255);
					}
				}
			}
		} else {
			Static11.aClass74_1 = Static250.aClass264_1.aClass74_4;
			Static366.anInt5876 = Static250.aClass264_1.anInt7049;
			Static558.aFloat145 = Static250.aClass264_1.aFloat117;
			Static439.aFloat123 = Static250.aClass264_1.aFloat118;
			Static426.aFloat114 = Static250.aClass264_1.aFloat120;
			Static266.anInt4126 = Static250.aClass264_1.anInt7054;
			Static434.aFloat122 = Static250.aClass264_1.aFloat116;
			Static521.anInt8289 = Static250.aClass264_1.anInt7050;
			aFloat3 = Static250.aClass264_1.aFloat121;
			Static678.aFloat175 = Static250.aClass264_1.aFloat119;
			if (Static315.aClass358_20 != null) {
				Static315.aClass358_20.method8431();
			}
			Static398.anInt6539 = -1;
			Static315.aClass358_20 = Static250.aClass264_1.aClass358_26;
		}
		Static431.aLong215 = local15;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Z")
	public static boolean method992() {
		return Static39.anInt535 != 0;
	}
}

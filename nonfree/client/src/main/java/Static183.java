import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)Z", line = 37)
	public static boolean method3311() {
		try {
			if (Class123.anInt3361 == 2) {
				if (Static146.aClass2_Sub34_1 == null) {
					Static146.aClass2_Sub34_1 = Static393.method5449(Static109.aClass197_26, Static98.anInt2180, Static318.anInt6364);
					if (Static146.aClass2_Sub34_1 == null) {
						return false;
					}
				}
				if (Static154.aClass24_1 == null) {
					Static154.aClass24_1 = new Class24(Static116.aClass197_30, Static165.aClass197_48);
				}
				if (Static85.aClass2_Sub12_Sub3_1.method4282(Static154.aClass24_1, Static146.aClass2_Sub34_1, Static104.aClass197_25)) {
					Static85.aClass2_Sub12_Sub3_1.method4272();
					Static85.aClass2_Sub12_Sub3_1.method4279(Static331.anInt6628);
					Static85.aClass2_Sub12_Sub3_1.method4274(Static146.aClass2_Sub34_1, Static358.aBoolean485);
					Static146.aClass2_Sub34_1 = null;
					Static109.aClass197_26 = null;
					Static154.aClass24_1 = null;
					Class123.anInt3361 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static85.aClass2_Sub12_Sub3_1.method4275();
			Class123.anInt3361 = 0;
			Static154.aClass24_1 = null;
			Static109.aClass197_26 = null;
			Static146.aClass2_Sub34_1 = null;
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	public static int anInt5951;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_322 = new Class159("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "[S")
	public static final short[] aShortArray92 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
	public static int anInt5956 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public static void method5039() {
		for (@Pc(16) Class4_Sub32 local16 = (Class4_Sub32) Static82.aClass116_11.method3270(); local16 != null; local16 = (Class4_Sub32) Static82.aClass116_11.method3272()) {
			if (local16.anInt4728 > 0) {
				local16.anInt4728--;
			}
			if (local16.anInt4728 != 0) {
				if (local16.anInt4727 > 0) {
					local16.anInt4727--;
				}
				if (local16.anInt4727 == 0 && local16.anInt4726 >= 1 && local16.anInt4722 >= 1 && Static350.anInt6637 - 2 >= local16.anInt4726 && Static105.anInt2647 - 2 >= local16.anInt4722 && (local16.anInt4732 < 0 || Static185.method3551(local16.anInt4723, local16.anInt4732))) {
					Static246.method4384(-1, local16.anInt4722, local16.anInt4723, local16.anInt4732, local16.anInt4726, local16.anInt4721, local16.anInt4729, local16.anInt4724);
					local16.anInt4727 = -1;
					if (local16.anInt4734 == local16.anInt4732 && local16.anInt4734 == -1) {
						local16.method5687();
					} else if (local16.anInt4734 == local16.anInt4732 && local16.anInt4729 == local16.anInt4730 && local16.anInt4725 == local16.anInt4723) {
						local16.method5687();
					}
				}
			} else if (local16.anInt4734 < 0 || Static185.method3551(local16.anInt4725, local16.anInt4734)) {
				Static246.method4384(-1, local16.anInt4722, local16.anInt4725, local16.anInt4734, local16.anInt4726, local16.anInt4721, local16.anInt4730, local16.anInt4724);
				local16.method5687();
			}
		}
	}
}

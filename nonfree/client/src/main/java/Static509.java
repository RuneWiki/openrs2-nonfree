import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public static int anInt8813;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public static int anInt8807 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt8808 = 0;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static final int[] anIntArray542 = new int[13];

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method7602() {
		Static508.aClass371Array1 = new Class371[50];
		Static393.anInt7276 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
	public static boolean method7603() {
		if (Static508.aClass3_Sub4_Sub13_3 == null) {
			return false;
		} else {
			if (Static508.aClass3_Sub4_Sub13_3.anInt4577 >= 2000) {
				Static508.aClass3_Sub4_Sub13_3.anInt4577 -= 2000;
			}
			return Static508.aClass3_Sub4_Sub13_3.anInt4577 == 1002;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Z")
	public static boolean method7604() {
		@Pc(10) Class3_Sub34 local10 = (Class3_Sub34) Static161.aClass223_16.method5874();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt5182; local16++) {
			if (local10.aClass304Array2[local16] != null && local10.aClass304Array2[local16].anInt8838 == 0) {
				return false;
			}
			if (local10.aClass304Array1[local16] != null && local10.aClass304Array1[local16].anInt8838 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
	public static void method7605() {
		if (Static365.anInt6941 < 0) {
			Static365.anInt6941 = 0;
			Static632.anInt10105 = -1;
			Static380.anInt7101 = -1;
		}
		if (Static110.anInt3019 < Static365.anInt6941) {
			Static380.anInt7101 = -1;
			Static632.anInt10105 = -1;
			Static365.anInt6941 = Static110.anInt3019;
		}
		if (Static561.anInt9391 < 0) {
			Static561.anInt9391 = 0;
			Static632.anInt10105 = -1;
			Static380.anInt7101 = -1;
		}
		if (Static110.anInt3020 < Static561.anInt9391) {
			Static561.anInt9391 = Static110.anInt3020;
			Static380.anInt7101 = -1;
			Static632.anInt10105 = -1;
		}
	}
}

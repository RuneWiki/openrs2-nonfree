import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array2;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_39 = new Class363(57, 8);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public static void method902() {
		if (!Static333.aBoolean489) {
			return;
		}
		while (true) {
			while (Static561.anInt9196 < Static225.aClass136_Sub1Array1.length) {
				@Pc(25) Class136_Sub1 local25 = Static225.aClass136_Sub1Array1[Static561.anInt9196];
				if (local25 != null && local25.anInt4387 == -1) {
					if (Static147.aClass2_Sub47_2 == null) {
						Static147.aClass2_Sub47_2 = Static12.aClass215_1.method4968(local25.aString33);
					}
					@Pc(48) int local48 = Static147.aClass2_Sub47_2.anInt9226;
					if (local48 == -1) {
						return;
					}
					Static147.aClass2_Sub47_2 = null;
					Static561.anInt9196++;
					local25.anInt4387 = local48;
				} else {
					Static561.anInt9196++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	public static void method904() {
		if (Static474.aBoolean641) {
			return;
		}
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean151) {
			Static412.aFloat13 = (int) Static412.aFloat13 - 17 & 0xFFFFFFF0;
		} else {
			Static402.aFloat205 += (-Static402.aFloat205 - 12.0F) / 2.0F;
		}
		Static474.aBoolean641 = true;
		Static341.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method905(@OriginalArg(2) String arg0) {
		Static375.method5567("", arg0, 4, "", 0, "");
	}
}

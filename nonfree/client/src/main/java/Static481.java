import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "Lclient!dc;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_93 = new Class230(31, 3);

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)V")
	public static void method7377() {
		if (Static39.anInt1074 == 1 || Static39.anInt1074 == 3 || Static39.anInt1074 != Static393.anInt7567 && (Static39.anInt1074 == 0 || Static393.anInt7567 == 0)) {
			Static17.anInt6046 = 0;
			Static268.anInt5680 = 0;
			Static331.aClass25_25.method948();
		}
		Static393.anInt7567 = Static39.anInt1074;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(ZI)V")
	public static void method7378(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static25.anInt779 != -1) {
				Static595.method8405(Static25.anInt779);
			}
			for (@Pc(17) Class3_Sub18 local17 = (Class3_Sub18) Static283.aClass25_23.method949(); local17 != null; local17 = (Class3_Sub18) Static283.aClass25_23.method947()) {
				if (!local17.method8414()) {
					local17 = (Class3_Sub18) Static283.aClass25_23.method949();
					if (local17 == null) {
						break;
					}
				}
				Static146.method8079(false, true, local17);
			}
			Static25.anInt779 = -1;
			Static283.aClass25_23 = new Class25(8);
			Static174.method3122();
			Static25.anInt779 = Static342.anInt6992;
			Static48.method1238(false);
			Static210.method3686();
			Static597.method8428(Static25.anInt779);
		}
		Static452.aBoolean253 = false;
		Static239.aString52 = "";
		Static492.aString107 = "";
		Static394.method6284();
		Static68.anInt1810 = -1;
		Static310.method5164(Static395.anInt4652);
		Static443.aClass2_Sub2_Sub1_Sub1_2 = new Class2_Sub2_Sub1_Sub1();
		Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] = Static460.anInt8640 / 2;
		Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 = Static460.anInt8640 * 512 / 2;
		Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 = Static292.anInt7682 * 512 / 2;
		Static496.anInt9269 = 0;
		Static594.anInt10391 = 0;
		Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0] = Static292.anInt7682 / 2;
		if (Static267.anInt5668 == 2) {
			Static496.anInt9269 = Static428.anInt8266 << 9;
			Static594.anInt10391 = Static29.anInt855 << 9;
		} else {
			Static286.method8370();
		}
		Static423.method6761();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(IBI)I")
	public static int method7379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static590.anIntArray674[arg1 & 0x3] : Static72.anIntArray498[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
	public static void method7380() {
		Static322.aClass15_10.ha(((float) Static455.aClass3_Sub27_Sub1_1.anInt4805 * 0.1F + 0.7F) * Static424.aFloat173);
		Static322.aClass15_10.YA(Static446.anInt8504, Static288.aFloat118, Static191.aFloat55, (float) (Static569.anInt10062 << 2), (float) (Static23.anInt8708 << 2), (float) (Static174.anInt3558 << 2));
		Static322.aClass15_10.method5344(Static300.aClass108_6);
	}
}

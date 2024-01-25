import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public static int anInt4884 = -1;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	public static int anInt4889 = 0;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Lclient!r;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public static void method3930(@OriginalArg(1) int arg0) {
		if (arg0 == Static435.anInt7180) {
			return;
		}
		Static229.anInt4427 = Static379.anInt6422 = Static42.anIntArray368[arg0];
		Static70.method1328();
		Static393.anIntArrayArrayArray13 = new int[4][Static229.anInt4427 >> 3][Static379.anInt6422 >> 3];
		Static250.anIntArrayArray47 = new int[Static229.anInt4427][Static379.anInt6422];
		Static5.anIntArrayArray1 = new int[Static229.anInt4427][Static379.anInt6422];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static194.aClass70Array1[local36] = Static192.method3010(Static229.anInt4427, Static379.anInt6422);
		}
		Static231.aByteArrayArrayArray9 = new byte[4][Static229.anInt4427][Static379.anInt6422];
		Static255.method3871(Static229.anInt4427, Static379.anInt6422);
		Static280.method4100(Static229.anInt4427 >> 3, Static33.aClass49_1, Static379.anInt6422 >> 3);
		Static435.anInt7180 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!mf;B)V")
	public static void method3938(@OriginalArg(0) Class8_Sub5 arg0) {
		arg0.aClass3_1 = null;
		@Pc(12) int local12 = arg0.aClass8_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass8_Sub4Array1[local14].aBoolean251 = false;
		}
		@Pc(36) Class112[] local36 = Class267.aClass112Array1;
		synchronized (Class267.aClass112Array1) {
			if (local12 < Class267.aClass112Array1.length && Static98.anIntArray184[local12] < 200) {
				Class267.aClass112Array1[local12].method2546(arg0);
				@Pc(59) int local59 = Static98.anIntArray184[local12]++;
			}
		}
	}
}

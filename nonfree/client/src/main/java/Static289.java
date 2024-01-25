import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	public static int anInt5853;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_138 = new Class150(4, 6);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
	public static void method4849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 14);
		local8.method1327();
		local8.anInt1437 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
	public static void method4853(@OriginalArg(1) int arg0) {
		if (Static383.anInt6996 == arg0) {
			return;
		}
		Static460.anInt7894 = Static235.anInt4493 = Static386.anIntArray255[arg0];
		Static304.method4997();
		Static357.anIntArrayArray53 = new int[Static460.anInt7894][Static235.anInt4493];
		Static157.anIntArrayArrayArray1 = new int[4][Static460.anInt7894 >> 3][Static235.anInt4493 >> 3];
		Static448.anIntArrayArray65 = new int[Static460.anInt7894][Static235.anInt4493];
		for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
			Static71.aClass10Array3[local41] = Static121.method2296(Static460.anInt7894, Static235.anInt4493);
		}
		Static203.aByteArrayArrayArray7 = new byte[4][Static460.anInt7894][Static235.anInt4493];
		Static255.method4329(Static460.anInt7894, Static235.anInt4493);
		Static54.method1118(Static460.anInt7894 >> 3, Static235.anInt4493 >> 3, Static110.aClass62_15);
		Static383.anInt6996 = arg0;
	}
}

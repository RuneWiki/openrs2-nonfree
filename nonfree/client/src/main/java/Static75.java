import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1503 = 0;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[S")
	public static final short[] aShortArray28 = new short[] { 58, 25, 16, 6, 8, 21, 47, 59 };

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static int anInt1505 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)[Lclient!wa;")
	public static Class257[] method1409() {
		return new Class257[] { Static381.aClass257_4, Static134.aClass257_2, Static186.aClass257_3 };
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)V")
	public static void method1411(@OriginalArg(0) byte arg0) {
		if (Static193.aByteArrayArrayArray4 == null) {
			Static193.aByteArrayArrayArray4 = new byte[4][Static84.anInt1632][Static261.anInt4480];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static84.anInt1632; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static261.anInt4480; local22++) {
					Static193.aByteArrayArrayArray4[local14][local18][local22] = arg0;
				}
			}
		}
	}
}

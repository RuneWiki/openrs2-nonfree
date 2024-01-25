import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "Ib", descriptor = "Ljava/lang/String;")
	public static String aString44 = "K";

	@OriginalMember(owner = "client!ea", name = "Tb", descriptor = "Ljava/lang/String;")
	public static String aString45 = "rating: ";

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIZI)V")
	public static void method1240(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static197.method3566(arg3, arg0, Static305.aClass83_Sub1Array1.length - 1, 0, arg2, arg1);
		Static63.aClass4_Sub29_1 = null;
		Static245.anInt5133 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "(I)V")
	public static void method1242() {
		Static158.aClass92_6.method4536(((float) Static293.anInt5927 * 0.1F + 0.7F) * 1.1523438F);
		Static158.aClass92_6.method4457(Static59.anInt1272, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static158.aClass92_6.method4488(Static325.anInt6400, -1);
		Static158.aClass92_6.method4517(Static204.aClass49_4);
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(IB)Lclient!fd;")
	public static Class72 method1243(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static158.aClass72ArrayArray1[local7] == null || Static158.aClass72ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static266.method4641(local7);
			if (!local25) {
				return null;
			}
		}
		return Static158.aClass72ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(B)V")
	public static void method1245() {
		Static257.method4399();
		Static174.aClass49_3 = null;
		Static197.aClass100ArrayArray1 = null;
		Static158.aClass92_6 = null;
		Static112.aClass49_1 = null;
		Static204.aClass49_4 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 aClass1_Sub1_Sub12_Sub4_4;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_546 = Static169.method2903("<img=0>");

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public static int anInt1547 = -2;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!ed;")
	private static Class23 aClass23_550 = Static169.method2903("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_547 = aClass23_550;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ed;")
	private static Class23 aClass23_549 = Static169.method2903("Too many connections from your address)3");

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_548 = aClass23_549;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)V")
	public static void method994(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static37.anInt996; local19++) {
			if (arg0 == Static106.aLongArray5[local19]) {
				Static37.anInt996--;
				for (@Pc(41) int local41 = local19; local41 < Static37.anInt996; local41++) {
					Static133.aClass23Array19[local41] = Static133.aClass23Array19[local41 + 1];
					Static72.anIntArray264[local41] = Static72.anIntArray264[local41 + 1];
					Static106.aLongArray5[local41] = Static106.aLongArray5[local41 + 1];
					Static70.anIntArray255[local41] = Static70.anIntArray255[local41 + 1];
				}
				Static23.anInt698 = Static176.anInt4191;
				Static25.aClass1_Sub8_Sub1_1.method919(99);
				Static25.aClass1_Sub8_Sub1_1.method873(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method996() {
		Static14.anIntArray63 = null;
		Static59.anIntArray226 = null;
		Static47.anIntArray152 = null;
		Static1.aByteArrayArray1 = null;
		Static27.anIntArray109 = null;
		Static103.anIntArray346 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method998() {
		aClass23_546 = null;
		aClass23_550 = null;
		aClass23_549 = null;
		aClass1_Sub1_Sub12_Sub4_4 = null;
		aClass23_547 = null;
		aClass23_548 = null;
	}
}

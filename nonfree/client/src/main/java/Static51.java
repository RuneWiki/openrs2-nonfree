import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!va;")
	public static Class10_Sub1[] aClass10_Sub1Array1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!ql;")
	public static final Class169 aClass169_2 = new Class169();

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	public static final int[] anIntArray78 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44 = "green:";

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public static int anInt1260 = 0;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt1261 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)B")
	public static byte method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) boolean local12 = false;
		for (@Pc(14) int local14 = 0; local14 < Static167.anInt3454; local14++) {
			@Pc(22) Class10_Sub1_Sub2_Sub2 local22 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local14]];
			if (local22 != null && local22.aString152 != null && local22.aString152.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static305.aClass1_Sub21_Sub2_3.method5757(27);
					Static305.aClass1_Sub21_Sub2_3.method5718(0);
					Static305.aClass1_Sub21_Sub2_3.method5696(Static212.anIntArray415[local14]);
				} else if (arg0 == 4) {
					Static305.aClass1_Sub21_Sub2_3.method5757(53);
					Static305.aClass1_Sub21_Sub2_3.method5696(Static212.anIntArray415[local14]);
					Static305.aClass1_Sub21_Sub2_3.method5718(0);
				} else if (arg0 == 5) {
					Static305.aClass1_Sub21_Sub2_3.method5757(61);
					Static305.aClass1_Sub21_Sub2_3.method5698(Static212.anIntArray415[local14]);
					Static305.aClass1_Sub21_Sub2_3.method5749(0);
				} else if (arg0 == 6) {
					Static305.aClass1_Sub21_Sub2_3.method5757(196);
					Static305.aClass1_Sub21_Sub2_3.method5698(Static212.anIntArray415[local14]);
					Static305.aClass1_Sub21_Sub2_3.method5718(0);
				} else if (arg0 == 7) {
					Static305.aClass1_Sub21_Sub2_3.method5757(172);
					Static305.aClass1_Sub21_Sub2_3.method5749(0);
					Static305.aClass1_Sub21_Sub2_3.method5711(Static212.anIntArray415[local14]);
				}
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static335.method5587(Static111.aString84 + arg1);
		}
	}
}

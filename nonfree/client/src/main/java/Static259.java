import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	public static boolean aBoolean361 = true;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_60 = new Class208(56, 8);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!go;")
	public static final Class121 aClass121_7 = new Class121(1, 2, 2, 0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static int anInt4739 = 1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
	public static boolean method3767() {
		try {
			return Static185.method3003();
		} catch (@Pc(14) IOException local14) {
			Static335.method4988();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static284.aClass83_193 == null ? -1 : Static284.aClass83_193.method2190()) + "," + (Static169.aClass83_74 == null ? -1 : Static169.aClass83_74.method2190()) + "," + (Static365.aClass83_141 == null ? -1 : Static365.aClass83_141.method2190()) + " - " + Static464.anInt8696 + "," + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] + Static539.anInt9045) + "," + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] + Static311.anInt5708) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static464.anInt8696 && local79 < 50; local79++) {
				local77 = local77 + Static158.aClass1_Sub3_Sub1_2.aByteArray104[local79] + ",";
			}
			Static419.method5957(local77, local19);
			Static136.method2372(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	public static void method3769() {
		if (Static55.anInt1068 == 9) {
			Static318.method4726(5);
		} else if (Static55.anInt1068 == 5 || Static55.anInt1068 == 6) {
			Static318.method4726(3);
		} else if (Static55.anInt1068 == 12) {
			Static318.method4726(3);
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)I")
	public static int method3770(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[Lclient!dh;")
	public static Class33[] aClass33Array2;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_7 = new Class210();

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!pf;")
	public static final Class2_Sub13_Sub2 aClass2_Sub13_Sub2_4 = new Class2_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)I")
	public static int method835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	public static void method837(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class22_Sub5 local6 = (Class22_Sub5) Static55.aClass56_2.method1259(); local6 != null; local6 = (Class22_Sub5) Static55.aClass56_2.method1254()) {
			if (local6.anInt2242 <= Static295.anInt5281) {
				local6.method5237();
			} else {
				Static307.method4778((local6.anInt2243 << 7) + 64, (local6.anInt2239 << 7) + 64, local6.anInt2246, local6.anInt2245 * 2, arg3 >> 1, arg2 >> 1);
				Static34.aClass13_1.method5617(Static136.anIntArray287[0] + arg0, local6.anInt2241 | 0xFF000000, 0, local6.aString25, Static136.anIntArray287[1] + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(DB)V")
	public static void method838(@OriginalArg(0) double arg0) {
		if (Static68.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static201.anIntArray595[local15] = local27 <= 255 ? local27 : 255;
		}
		Static68.aDouble9 = arg0;
	}
}

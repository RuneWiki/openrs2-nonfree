import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array14;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI[IJ)Ljava/lang/String;")
	public static String method5533(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static61.anInterface7_1 != null) {
			@Pc(12) String local12 = Static61.anInterface7_1.method1185(arg1, arg2, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBIII)V")
	public static void method5534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static268.anInt4728 = arg0;
		Static76.anInt1619 = arg1;
		Static4.anInt109 = arg2;
		Static108.anInt2137 = arg3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public static void method5535() {
		if (Static316.anInt5438 <= 0) {
			Static204.aString52 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static361.aStringArray42.length; local10++) {
			if (Static361.aStringArray42[local10].startsWith("--> ")) {
				local8++;
				if (local8 == Static316.anInt5438) {
					Static204.aString52 = Static361.aStringArray42[local10].substring(4);
					break;
				}
			}
		}
	}
}

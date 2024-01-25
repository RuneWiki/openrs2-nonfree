import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Lclient!fo;")
	public static Class82 aClass82_36;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_20 = new Class227();

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public static int anInt2420 = -1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([[[Lclient!no;Z)V")
	public static void method2073(@OriginalArg(0) Class169[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class169[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class169 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass25_Sub2_2 instanceof Interface8) {
							((Interface8) local27.aClass25_Sub2_2).method4616();
						}
						if (local27.aClass25_Sub1_2 instanceof Interface8) {
							((Interface8) local27.aClass25_Sub1_2).method4616();
						}
						if (local27.aClass25_Sub1_3 instanceof Interface8) {
							((Interface8) local27.aClass25_Sub1_3).method4616();
						}
						if (local27.aClass25_Sub4_2 instanceof Interface8) {
							((Interface8) local27.aClass25_Sub4_2).method4616();
						}
						if (local27.aClass25_Sub4_1 instanceof Interface8) {
							((Interface8) local27.aClass25_Sub4_1).method4616();
						}
						for (@Pc(77) Class27 local77 = local27.aClass27_3; local77 != null; local77 = local77.aClass27_1) {
							@Pc(82) Class25_Sub5 local82 = local77.aClass25_Sub5_1;
							if (local82 instanceof Interface8) {
								((Interface8) local82).method4616();
							}
						}
					}
				}
			}
		}
	}
}

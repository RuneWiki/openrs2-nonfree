import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
	public static int anInt5849 = 0;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_152 = new Class381(16, 8);

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_112 = new Class156(35, 6);

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
	public static int anInt5858 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BII)Z")
	public static boolean method5224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)V")
	public static void method5226() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static271.anInt4910; local16++) {
			for (@Pc(20) int local20 = 0; local20 < Static613.anInt9909; local20++) {
				if (Static154.method2821(Static283.aClass128ArrayArrayArray1, local16, local14, local20, true)) {
					local14++;
				}
				if (local14 >= 512) {
					return;
				}
			}
		}
	}
}

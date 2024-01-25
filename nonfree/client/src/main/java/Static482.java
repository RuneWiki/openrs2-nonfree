import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_92 = new Class94(24, 7);

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_198 = new Class215(12, 0);

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt8988 = 0;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_51 = new Class169(10);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method7519() {
		Static605.anInt10972 = 0;
		Static90.anInt2649 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static548.anInt9814; local19++) {
			@Pc(25) int local25 = Static228.anInt5033 * local19;
			for (@Pc(27) int local27 = 0; local27 < Static228.anInt5033; local27++) {
				@Pc(34) int local34 = local25 + local27;
				Static326.anInterface14Array1[local34].method8987(local27 * Static267.anInt5684, local19 * Static11.anInt6559, Static267.anInt5684, Static11.anInt6559, true);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)Z")
	public static boolean method7525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static632.method9169(arg1, arg0) & Static385.method6307(arg0, arg1);
	}
}

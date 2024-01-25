import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
	public static int anInt7647;

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
	public static int anInt7654;

	@OriginalMember(owner = "client!tn", name = "P", descriptor = "Lclient!up;")
	public static final Class250 aClass250_23 = new Class250(13, 5);

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "F")
	public static float aFloat102 = 0.0F;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_136 = new Class15("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!fh;Ljava/lang/String;B)I")
	public static int method6052(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt6207;
		@Pc(10) byte[] local10 = Static123.method1734(arg1);
		arg0.method5010(local10.length);
		arg0.anInt6207 += Static439.aClass236_1.method5081(arg0.aByteArray81, local10.length, 0, local10, arg0.anInt6207);
		return arg0.anInt6207 - local6;
	}
}

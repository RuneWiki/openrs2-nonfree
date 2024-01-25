import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_46 = new Class268(63, 6);

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "F")
	public static float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I")
	public static int method2044() {
		return Static328.anInt6240++;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2045(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(3, arg1);
		local8.method3723();
		local8.aString49 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!pd;I)I")
	public static int method2047(@OriginalArg(0) Class250 arg0) {
		if (Static600.aClass250_16 == arg0) {
			return 6407;
		} else if (arg0 == Static203.aClass250_7) {
			return 6408;
		} else if (arg0 == Static598.aClass250_15) {
			return 6406;
		} else if (Static23.aClass250_8 == arg0) {
			return 6409;
		} else if (arg0 == Static458.aClass250_12) {
			return 6410;
		} else if (Static360.aClass250_11 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}

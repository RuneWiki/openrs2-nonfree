import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "Lclient!vd;")
	public static Class353 aClass353_129;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_64 = new Class8();

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_65 = new Class8();

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_178 = new Class268(109, -1);

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "[I")
	public static final int[] anIntArray609 = new int[4];

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "Lclient!re;")
	public static final Class286 aClass286_12 = new Class286();

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "J")
	public static long aLong264 = -1L;

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
	public static int anInt10033 = -1;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!sca;B)V")
	public static void method8464(@OriginalArg(0) Class302 arg0) {
		if (arg0.anInt8811 == Static498.anInt8628) {
			Static501.aBooleanArray46[arg0.anInt8810] = true;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V")
	public static void method8465(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(6, arg0);
		local13.method3722();
	}
}

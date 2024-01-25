import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_19 = new Class305(83, 8);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public static int anInt2256 = -1;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public static int anInt2258 = 0;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public static int anInt2259 = -1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public static int method2031(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	public static void method2033(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(17, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method2035() {
		@Pc(8) Class5_Sub3_Sub17 local8 = Static358.method5408(15, 0L);
		local8.method7288();
	}
}

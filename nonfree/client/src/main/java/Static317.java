import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_182 = new Class194(87, 1);

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_183 = new Class194(81, 0);

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;Z)Lclient!ha;")
	public static Class82 method5281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface5 arg3) {
		return new Class82_Sub2(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)J")
	public static long method5283(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static116.aCalendar2.clear();
		Static116.aCalendar2.set(arg2, arg0, arg1, 12, 0, 0);
		return Static116.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)Lclient!aea;")
	public static Class3_Sub3_Sub1 method5284() {
		return Static466.aClass3_Sub3_Sub1_3;
	}
}

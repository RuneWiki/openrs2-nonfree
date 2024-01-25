import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wda", name = "ld", descriptor = "[Lclient!cn;")
	public static Class23_Sub2[] aClass23_Sub2Array5;

	@OriginalMember(owner = "client!wda", name = "od", descriptor = "I")
	public static int anInt10217;

	@OriginalMember(owner = "client!wda", name = "Uc", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_206 = new Class126(49, 3);

	@OriginalMember(owner = "client!wda", name = "cd", descriptor = "Lclient!wm;")
	public static final Class393 aClass393_7 = new Class393();

	@OriginalMember(owner = "client!wda", name = "md", descriptor = "I")
	public static int anInt10216 = -1;

	@OriginalMember(owner = "client!wda", name = "nd", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_148 = new Class376(11, 2);

	@OriginalMember(owner = "client!wda", name = "pd", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_13 = new Class239("", 17);

	@OriginalMember(owner = "client!wda", name = "qd", descriptor = "[F")
	public static final float[] aFloatArray83 = new float[4];

	@OriginalMember(owner = "client!wda", name = "rd", descriptor = "[I")
	public static final int[] anIntArray661 = new int[14];

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class16 method8637(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		return new Class16_Sub2(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(III)V")
	public static void method8640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub6_Sub7 local8 = Static198.method3146(0L, 15);
		local8.method1712();
		local8.anInt1782 = arg0;
		local8.anInt1790 = arg1;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!q", name = "C", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!si;")
	public static final Class338 aClass338_42 = new Class338(4);

	@OriginalMember(owner = "client!q", name = "H", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_1 = new Class309(14, 0);

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_2 = new Class309(15, 4);

	@OriginalMember(owner = "client!q", name = "P", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_3 = new Class309(16, -2);

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_4 = new Class309(17, 0);

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_5 = new Class309(19, -2);

	@OriginalMember(owner = "client!q", name = "S", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_6 = new Class309(22, -2);

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_7 = new Class309(23, 4);

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_8 = new Class309(24, -1);

	@OriginalMember(owner = "client!q", name = "D", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_9 = new Class309(26, 0);

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!qq;")
	public static Class309 aClass309_10 = new Class309(27, 0);

	@OriginalMember(owner = "client!q", name = "K", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_11 = new Class309(28, -2);

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_12 = new Class309(29, -2);

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Lclient!qq;")
	public static final Class309 aClass309_13 = new Class309(30, -2);

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
	public static void method7226() {
		Static316.anIntArrayArray36 = null;
		Static247.aClass3_Sub28_8 = null;
		Static334.anInt5845 = 4;
		Static484.aBoolean631 = false;
		Static723.method9428();
		Static532.aClass400_3.method9223(Static89.method1200(Static548.aClass286_96, Static532.aClass400_3.aClass399_2));
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	public static void method7229(@OriginalArg(0) int arg0) {
		if (!Static255.method3996(arg0)) {
			return;
		}
		@Pc(22) Class20[] local22 = Static403.aClass20ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class20 local30 = local22[local24];
			if (local30 != null && local30.aClass100_1 != null) {
				local30.aClass100_1.method8958();
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class67 method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Interface2 arg3) {
		return new oa(arg2, arg3, arg0, arg1);
	}
}

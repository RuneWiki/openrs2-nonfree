import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!oo;")
	public static Class247 aClass247_13;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!oi;")
	public static Class3_Sub40 aClass3_Sub40_11;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Lclient!xa;")
	public static Class37 aClass37_45;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "[[[Lclient!gn;")
	public static Class125[][][] aClass125ArrayArrayArray3;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	public static int anInt10228;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	public static int anInt10229;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_152 = new Class276(60, 10);

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public static int anInt10224 = 0;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
	public static final int[] anIntArray664 = new int[3];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public static void method8284() {
		if (Static54.aBoolean104) {
			return;
		}
		Static450.method7029(Static422.aClass125ArrayArrayArray2);
		if (Static191.aClass125ArrayArrayArray1 != null) {
			Static450.method7029(Static191.aClass125ArrayArrayArray1);
		}
		Static54.aBoolean104 = true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V")
	public static void method8285(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static377.anInt7322 = 3;
		Static400.anInt7816 = arg0;
		Static175.method3125(Static460.aClass329_5.aString124, Static460.aClass329_5.anInt9698);
		if (arg1) {
			Static573.method8191(false, "", "");
		} else {
			Static69.method1734();
			Static573.method8191(false, Static551.aString128, Static361.aString81);
		}
	}
}

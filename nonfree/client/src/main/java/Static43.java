import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt1036;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_520 = Static32.method683("Ausw-=hlen");

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt1034 = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!tf;")
	public static Class81 aClass81_3 = new Class81();

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_521 = Static32.method683(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!bg;II)[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] method820(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static179.method2970(arg0, arg2, arg1) ? Static53.method930() : null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method821() {
		aClass81_3 = null;
		aClass49_521 = null;
		anIntArray102 = null;
		aClass49_520 = null;
		aClass2_Sub2_Sub2_Sub2Array4 = null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method822() {
		Static131.aClass74_92.method2347();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method823() {
		if (Static79.aClass67_41 != null) {
			@Pc(3) Class67 local3 = Static79.aClass67_41;
			synchronized (Static79.aClass67_41) {
				Static79.aClass67_41 = null;
			}
		}
	}
}

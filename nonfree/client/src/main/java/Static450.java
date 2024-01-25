import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
	public static int anInt7234;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_214 = new Class107(45, 3);

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
	public static void method5912() {
		Static166.aClass96_19.method2338();
		Static177.aClass227_2.method5111();
		Static397.aClass227_10.method5111();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILclient!ul;IIZ)V")
	public static void method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class246 arg2, @OriginalArg(4) int arg3) {
		Static286.anInt5015 = 0;
		Static390.anInt6278 = 1;
		Static53.anInt991 = arg3;
		Static152.anInt2905 = arg1;
		Static59.aBoolean86 = false;
		Static157.aClass246_114 = arg2;
		Static23.anInt5191 = Static244.aClass1_Sub19_Sub4_2.method3671() / arg0;
		if (Static23.anInt5191 < 1) {
			Static23.anInt5191 = 1;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZIII)I")
	public static int method5914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg2;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}
}

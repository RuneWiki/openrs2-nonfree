import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_66 = new Class12(57, 6);

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_98 = new Class103(9, -1);

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_72 = new Class119("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_67 = new Class12(42, 4);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	public static void method2031() {
		Static286.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBI)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg2 >= Static427.anInt7214 && arg2 + arg1 <= Static434.anInt7302 && arg3 - arg2 >= Static289.anInt5053 && arg2 + arg3 <= Static93.anInt1676) {
			Static186.method2671(arg3, arg1, arg2, arg0);
		} else {
			Static31.method400(arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZI)I")
	public static int method2034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static232.anIntArray273[arg1 & 0x3] : 256;
	}
}

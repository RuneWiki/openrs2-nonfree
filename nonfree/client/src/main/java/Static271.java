import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static271 {

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!vl;")
	public static final Class185 aClass185_1 = Static215.method3731();

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString204 = "Loading wordpack - ";

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public static int anInt5573 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method4735(@OriginalArg(0) Class11 arg0) {
		Static225.aClass11_90 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBII)I")
	public static int method4736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static348.aByteArrayArrayArray11[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static348.aByteArrayArrayArray11[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method4738(@OriginalArg(0) int arg0) {
		Static312.anInt2706 = 1000 / arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public static int anInt3087;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	public static int anInt3088;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	public static int anInt3089;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_80 = new Class239(95, 8);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
	public static boolean method2839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static267.aByteArrayArrayArray19[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!maa;)Z")
	public static boolean method2844(@OriginalArg(1) Class182 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean399) {
			return false;
		} else if (!arg0.method4598(Static201.anInterface2_2)) {
			return false;
		} else if (Static348.aClass127_35.method3205((long) arg0.anInt5349) == null) {
			return Static391.aClass127_38.method3205((long) arg0.anInt5322) == null;
		} else {
			return false;
		}
	}
}

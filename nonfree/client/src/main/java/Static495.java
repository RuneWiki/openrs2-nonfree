import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static495 {

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_13 = new Class181(10, 5);

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "S")
	public static short aShort96 = 1;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BII)Z")
	public static boolean method6912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)V")
	public static void method6916(@OriginalArg(1) int arg0) {
		Static519.anInt8575 = -1;
		Static538.anInt8880 = 3;
		Static44.anInt1118 = 100;
		Static297.anInt8265 = arg0;
	}
}

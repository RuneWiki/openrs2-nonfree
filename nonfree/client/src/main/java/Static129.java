import java.awt.datatransfer.Clipboard;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "Lclient!kr;")
	public static Class171 aClass171_46;

	@OriginalMember(owner = "client!fca", name = "D", descriptor = "I")
	public static int anInt2570;

	@OriginalMember(owner = "client!fca", name = "E", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIBI)V")
	public static void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0 * Static544.aClass1_Sub22_Sub1_1.anInt5439 >> 8;
		if (arg2 == -1 && !Static316.aBoolean424) {
			Static458.method6479();
		} else if (arg2 != -1 && (Static507.anInt8581 != arg2 || !Static220.method3804()) && local14 != 0 && !Static316.aBoolean424) {
			Static143.method2311(arg1, arg2, local14, Static235.aClass171_78);
		}
		Static507.anInt8581 = arg2;
	}
}

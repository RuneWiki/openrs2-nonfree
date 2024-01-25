import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_11;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_44 = new Class179(68, 6);

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_1 = new Class45(2);

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2573(@OriginalArg(0) String arg0) {
		Static443.method6042("", 0, "", arg0, "", 0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBZ)V")
	public static void method2575(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static514.anInt8569++;
			Static365.method4952();
		}
		if (arg1) {
			Static301.anInt4923++;
			Static165.method5089();
		}
	}
}

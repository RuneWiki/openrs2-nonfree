import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_1 = new Class262(0, 3, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_2 = new Class262(1, 3, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_3 = new Class262(2, 4, Static155.aClass114_6);

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_4 = new Class262(3, 1, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_5 = new Class262(4, 2, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!ri;")
	public static final Class262 aClass262_6 = new Class262(5, 3, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!ri;")
	private static final Class262 aClass262_7 = new Class262(6, 4, Static155.aClass114_10);

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	public static final int anInt7898 = Static483.method7240(16);

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public static int anInt7899 = 0;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "[B")
	public static final byte[] aByteArray98 = new byte[520];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)[Lclient!ri;")
	public static Class262[] method6550() {
		return new Class262[] { aClass262_1, aClass262_2, aClass262_3, aClass262_4, aClass262_5, aClass262_6, aClass262_7 };
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZII)V")
	public static void method6552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static251.anInt5168 && arg0 <= Static341.anInt6481) {
			@Pc(15) int local15 = Static108.method2267(arg2, Static507.anInt9124, Static234.anInt4897);
			@Pc(21) int local21 = Static108.method2267(arg1, Static507.anInt9124, Static234.anInt4897);
			Static162.method3309(arg3, local15, local21, arg0);
		}
	}
}

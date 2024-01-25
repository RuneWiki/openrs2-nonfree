import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Lclient!it;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Lclient!wa;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "Lclient!lf;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_9 = new Class186(18, 5);

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "Z")
	public static final boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "Lclient!kb;")
	public static Class135 aClass135_1 = new Class135(8);

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_10 = new Class186(26, 2);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static70.method1382(arg1, arg0) | Static92.method1588(arg1, arg0)) & Static54.method1013(arg1, arg0);
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_664 = Static193.method3027("Too many connections from your address)3");

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "Lclient!oc;")
	public static Class70 aClass70_662 = aClass70_664;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_666 = Static193.method3027("Loading textures )2 ");

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!oc;")
	public static Class70 aClass70_663 = aClass70_666;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "[J")
	public static final long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_665 = Static193.method3027("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_667 = Static193.method3027("document)3cookie=(R");

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_669 = Static193.method3027("Unexpected server response)3");

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "Lclient!oc;")
	public static Class70 aClass70_668 = aClass70_669;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I")
	public static int method1022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(11) int local11 = arg0 / arg2;
		@Pc(17) int local17 = arg1 & arg2 - 1;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static187.method2949(local11, local7);
		@Pc(35) int local35 = Static187.method2949(local11, local7 + 1);
		@Pc(42) int local42 = Static187.method2949(local11 + 1, local7);
		@Pc(51) int local51 = Static187.method2949(local11 + 1, local7 - -1);
		@Pc(58) int local58 = Static11.method253(local28, local17, local35, arg2);
		@Pc(65) int local65 = Static11.method253(local42, local17, local51, arg2);
		return Static11.method253(local58, local23, local65, arg2);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)V")
	public static void method1023(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}

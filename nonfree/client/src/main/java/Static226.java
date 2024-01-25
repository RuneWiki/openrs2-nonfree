import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt4449;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!ij;")
	public static Class93 aClass93_85;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt4453 = 127;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
	public static void method4085(@OriginalArg(1) int arg0) {
		if (Static349.anIntArray633 == null || Static349.anIntArray633.length < arg0) {
			Static349.anIntArray633 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ij;BLclient!ij;)V")
	public static void method4086(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Class93 arg1) {
		Static254.aClass93_99 = arg0;
		Static335.aClass93_123 = arg1;
		Static348.anInt6697 = Static254.aClass93_99.method2418(3);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZ)V")
	public static void method4087(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static8.aByteArrayArrayArray3 = new byte[arg0][Static22.anInt481 + 1][Static269.anInt5281 + 1];
		Static217.anIntArrayArrayArray8 = new int[arg0][Static22.anInt481 + 1][Static269.anInt5281 + 1];
		if (!arg1) {
			Static332.aByteArrayArrayArray16 = null;
		}
		Static19.aByteArrayArrayArray4 = new byte[arg0][Static22.anInt481][Static269.anInt5281];
		Static193.aByteArrayArrayArray10 = new byte[arg0][Static22.anInt481][Static269.anInt5281];
		Static183.anIntArray364 = new int[Static269.anInt5281];
		Static339.anInt6583 = 99;
		Static255.anIntArray491 = new int[Static269.anInt5281];
		Static162.anIntArray333 = new int[Static269.anInt5281];
		Static207.aByteArrayArrayArray11 = new byte[arg0][Static22.anInt481][Static269.anInt5281];
		Static213.anIntArray394 = new int[Static269.anInt5281];
		Static163.anIntArray334 = new int[5];
		Static162.aByteArrayArrayArray7 = new byte[arg0][Static22.anInt481][Static269.anInt5281];
		Static307.anIntArray587 = new int[Static269.anInt5281];
	}
}

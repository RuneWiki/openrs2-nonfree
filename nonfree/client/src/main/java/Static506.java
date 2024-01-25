import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Z")
	public static boolean aBoolean624;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt8447;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
	public static int[] anIntArray581 = new int[2];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method7003(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static308.method4741(-1, arg0, arg1, -1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;ZLclient!io;)I")
	public static int method7004(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		@Pc(6) int local6 = arg1.anInt5238;
		@Pc(10) byte[] local10 = Static146.method2367(arg0);
		arg1.method4386(local10.length);
		arg1.anInt5238 += Static254.aClass67_1.method1751(0, arg1.aByteArray52, arg1.anInt5238, local10, local10.length);
		return arg1.anInt5238 - local6;
	}
}

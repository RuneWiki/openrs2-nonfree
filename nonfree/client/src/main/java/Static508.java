import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ud", name = "Nc", descriptor = "I")
	public static int anInt8600;

	@OriginalMember(owner = "client!ud", name = "Gc", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[4];

	@OriginalMember(owner = "client!ud", name = "hd", descriptor = "[I")
	public static final int[] anIntArray662 = new int[32];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!fca;II)V")
	public static void method7012(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static249.anInt4106 = arg1;
		Static31.anInt552 = arg2;
		Static126.aClass97_3 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wi;I)V")
	public static void method7014(@OriginalArg(0) Class6_Sub19 arg0) {
		if (arg0.aClass6_Sub12_5 != null) {
			arg0.aClass6_Sub12_5.anInt5509 = 0;
		}
		arg0.aBoolean660 = false;
		for (@Pc(23) Class6_Sub19 local23 = arg0.method7700(); local23 != null; local23 = arg0.method7694()) {
			method7014(local23);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method7019(@OriginalArg(1) File arg0) {
		return Static2.method54(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "(I)V")
	public static void method7021() {
		@Pc(24) byte[] local24;
		if (Static78.anObject8 == null) {
			@Pc(17) Class11_Sub2_Sub2 local17 = new Class11_Sub2_Sub2();
			local24 = local17.method7816();
			Static78.anObject8 = Static78.method1178(local24);
		}
		if (Static361.anObject21 == null) {
			@Pc(35) Class11_Sub1_Sub2 local35 = new Class11_Sub1_Sub2();
			local24 = local35.method271();
			Static361.anObject21 = Static78.method1178(local24);
		}
	}
}

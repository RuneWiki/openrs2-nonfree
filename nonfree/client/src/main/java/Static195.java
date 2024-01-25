import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public static int anInt4016;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
	public static int method3427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg0;
		@Pc(28) int local28 = Static130.method2226(local17, local7);
		@Pc(35) int local35 = Static130.method2226(local17, local7 + 1);
		@Pc(42) int local42 = Static130.method2226(local17 + 1, local7);
		@Pc(51) int local51 = Static130.method2226(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static306.method5154(local35, local13, local28, arg2);
		@Pc(65) int local65 = Static306.method5154(local51, local13, local42, arg2);
		return Static306.method5154(local65, local23, local58, arg2);
	}
}

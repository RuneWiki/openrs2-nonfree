import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
	public static int anInt2643;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt2638 = 0;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
	public static final int[] anIntArray162 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!gfa;")
	public static final Class117 aClass117_2 = new Class117();

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public static int anInt2642 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method2236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg4[local31] += arg6[arg2++];
				@Pc(43) int local43 = arg5++;
				arg4[local43] += arg6[arg2++];
				@Pc(55) int local55 = arg5++;
				arg4[local55] += arg6[arg2++];
				@Pc(67) int local67 = arg5++;
				arg4[local67] += arg6[arg2++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg5++;
				arg4[local31] += arg6[arg2++];
			}
			arg5 += arg3;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lclient!fea;")
	public static Class92 method2238() {
		try {
			return new Class92_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class92) Class.forName("Class92_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class92_Sub3();
			}
		}
	}
}

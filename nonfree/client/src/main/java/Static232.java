import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_157 = new Class18(2, 6);

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_125 = new Class21(64);

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_153 = new Class217(97, 6);

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_154 = new Class217(11, -2);

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_158 = new Class18(6, 4);

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIB)I")
	public static int method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static312.anIntArray464[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
	public static void method4302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class54 local9 = Static247.aClass54ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static346.anInt6545 = local9.anInt1873;
			Static87.anInt1926 = local9.anInt1880;
			Static31.anInt782 = local9.anInt1881;
		}
		Static78.method1684();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!co;")
	public static RuntimeException_Sub1 method4303(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString6 = local9.aString6 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}

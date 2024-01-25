import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jca", name = "Jb", descriptor = "I")
	public static int anInt4307 = 0;

	@OriginalMember(owner = "client!jca", name = "Kb", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!jca", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray296 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBI)I")
	public static int method3766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static243.anIntArray311[arg0 & 0x3] : Static78.anIntArray171[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3767(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 2);
		local12.method1327();
		local12.aString28 = arg1;
	}
}

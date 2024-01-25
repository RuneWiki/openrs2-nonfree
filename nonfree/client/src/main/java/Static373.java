import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	public static int anInt6285;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Lclient!mk;")
	public static Class5_Sub1_Sub13 aClass5_Sub1_Sub13_1;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!at;")
	public static final Class20 aClass20_30 = new Class20();

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_121 = new Class156(3, 0);

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_122 = new Class156(27, -2);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)I")
	public static int method5553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public static void method5557(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 8);
		local9.method7444();
	}
}

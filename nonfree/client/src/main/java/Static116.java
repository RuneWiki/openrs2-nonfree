import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "Lclient!fq;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "[Lclient!bi;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
	public static int anInt2579 = -1;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)I")
	public static int method2336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!d;)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		Static47.aClass62Array1[arg0] = arg1;
	}
}

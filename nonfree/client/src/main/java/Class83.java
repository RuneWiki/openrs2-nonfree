import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class83 implements Interface9 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public static int anInt2343 = -60;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
	public static final int[] anIntArray148 = new int[200];

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "[Lclient!nb;")
	public static final Class157[] aClass157Array14 = new Class157[14];

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 6)
	@Override
	public String method2362(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(23) Class52 local23 = Static131.aClass109_1.method2781(arg1[0]);
			return local23.method1777((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(45) Class188 local45 = Static290.aClass107_2.method2761((int) arg0);
			return local45.aString55;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static131.aClass109_1.method2781(arg1[0]).method1777((int) arg0);
		} else {
			return null;
		}
	}
}

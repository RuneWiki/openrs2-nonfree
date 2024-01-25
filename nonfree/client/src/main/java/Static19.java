import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "uc", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!at", name = "wc", descriptor = "Lclient!kg;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!at", name = "Z", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_1 = new Class220(6, 0, 4, 2);

	@OriginalMember(owner = "client!at", name = "Mb", descriptor = "[Lclient!ir;")
	public static final Class120[] aClass120Array1 = new Class120[4];

	@OriginalMember(owner = "client!at", name = "rc", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_14 = new Class263(1, -1);

	@OriginalMember(owner = "client!at", name = "tc", descriptor = "[I")
	public static final int[] anIntArray32 = new int[2];

	@OriginalMember(owner = "client!at", name = "vc", descriptor = "I")
	public static int anInt523 = -1;

	@OriginalMember(owner = "client!at", name = "xc", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method415(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1 local8 = Static227.aClass38_19.method767(); local8 != null; local8 = Static227.aClass38_19.method773()) {
			if ((local8.aLong228 >> 48 & 0xFFFFL) == (long) arg0) {
				local8.method6178();
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "Lclient!ae;")
	public static Class8 aClass8_89;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "Lclient!si;")
	public static final Class322 aClass322_5 = new Class322();

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_211 = new Class179(121, -1);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)V")
	public static void method4599(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static27.anInt7651 = arg0;
		Static591.aClass2_Sub8Array1 = new Class2_Sub8[Static376.anIntArray372[Static27.anInt7651] + 1];
		Static136.anInt2379 = 0;
		Static597.anInt9777 = 0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(JJ)J")
	public static long method4600(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "[I")
	public static int[] anIntArray588;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public static int anInt10166;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public static final int[] anIntArray587 = new int[200];

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_325 = new Class196(18, -2);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Lclient!cm;")
	public static Class41_Sub2 method8470() {
		@Pc(8) Class41_Sub2 local8 = (Class41_Sub2) Static381.aClass102_3.method2058();
		if (local8 == null) {
			return new Class41_Sub2();
		} else {
			Static135.anInt2262--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIILclient!ha;II)V")
	public static void method8475(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class143 arg3, @OriginalArg(6) int arg4) {
		Static371.aClass143_7 = arg3;
		Static448.aClass56_10 = Static371.aClass143_7.method6232();
		Static162.aClass56_11 = Static371.aClass143_7.method6232();
		Static563.aClass56_13 = Static371.aClass143_7.method6232();
		Static634.anInt10113 = 1;
		Static458.anInt7968 = 2;
		Static606.anInt9804 = 0;
		Static150.anInterface2_1 = null;
		Static77.anInt1204 = arg2;
		Static675.anInt10637 = 0;
		Static10.anInt178 = 2;
		Static586.anInt9622 = arg1;
		Static290.method8315(arg4, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!om;")
	public static Class1_Sub16_Sub3 aClass1_Sub16_Sub3_3;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public static int anInt9145;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_135 = new Class306("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
	public static final int[] anIntArray841 = new int[5];

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
	public static final int[] anIntArray843 = new int[1];

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "Z")
	public static boolean aBoolean640 = false;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Lclient!nd;")
	public static Class1_Sub1_Sub11 method7520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub11 local15 = (Class1_Sub1_Sub11) Static166.aClass17_13.method738((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class1_Sub1_Sub11(arg0, arg1);
			Static166.aClass17_13.method737(local15, local15.aLong392);
		}
		return local15;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method7521(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static132.method2208(Static259.method4365(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}

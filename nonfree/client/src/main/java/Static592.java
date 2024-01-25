import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!bn;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
	public static final int anInt9783 = -1;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	public static final int anInt9787 = 4;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!jc;I)Lclient!tka;")
	public static Class132_Sub3 method8407(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(7) Class132 local7 = Static689.method9504(arg0);
		@Pc(11) int local11 = arg0.method7748();
		@Pc(15) int local15 = arg0.method7748();
		@Pc(26) int local26 = arg0.method7717(-1978450544);
		return new Class132_Sub3(local7.aClass258_12, local7.aClass205_16, local7.anInt9744, local7.anInt9746, local7.anInt9737, local7.anInt9742, local7.anInt9740, local7.anInt9739, local7.anInt9747, local11, local15, local26);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)I")
	public static int method8408(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}

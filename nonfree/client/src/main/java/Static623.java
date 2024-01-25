import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!um", name = "S", descriptor = "I")
	public static int anInt10496 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!jc;)Lclient!lq;")
	public static Class132_Sub1_Sub1 method8971(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(13) Class132_Sub1 local13 = Static576.method8248(arg0);
		@Pc(17) int local17 = arg0.method7752();
		return new Class132_Sub1_Sub1(local13.aClass258_12, local13.aClass205_16, local13.anInt9744, local13.anInt9746, local13.anInt9737, local13.anInt9742, local13.anInt9740, local13.anInt9739, local13.anInt9747, local13.anInt6140, local13.anInt6131, local13.anInt6139, local13.anInt6138, local13.anInt6136, local13.anInt6133, local17);
	}
}

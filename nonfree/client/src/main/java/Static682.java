import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static682 {

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "J")
	public static long aLong344;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public static int anInt10442;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
	public static final boolean aBoolean770 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!vk;BLclient!vk;)V")
	public static void method8966(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		if (arg1.aClass60_68 != null) {
			arg1.method8914();
		}
		arg1.aClass60_67 = arg0;
		arg1.aClass60_68 = arg0.aClass60_68;
		arg1.aClass60_68.aClass60_67 = arg1;
		arg1.aClass60_67.aClass60_68 = arg1;
	}
}

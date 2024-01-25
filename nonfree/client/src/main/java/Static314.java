import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt5740 = -1;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
	public static boolean aBoolean421 = true;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_34 = new Class238();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZII)V")
	public static void method5081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static345.aLong187 = 0L;
		@Pc(8) int local8 = Static195.method3553();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static383.aClass48_9.method2481()) {
			arg2 = true;
		}
		Static162.method2880(local8, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method5082(@OriginalArg(0) int arg0) {
		if (!Static300.method4909(arg0)) {
			return;
		}
		@Pc(19) Class3[] local19 = Static272.aClass3ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class3 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt112 = 0;
				local27.anInt82 = 0;
				local27.anInt80 = 1;
			}
		}
	}
}

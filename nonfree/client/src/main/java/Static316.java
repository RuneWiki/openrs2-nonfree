import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!lu", name = "eb", descriptor = "Lclient!f;")
	public static Class38 aClass38_27;

	@OriginalMember(owner = "client!lu", name = "hb", descriptor = "[Lclient!kv;")
	public static Class12_Sub4[] aClass12_Sub4Array1;

	@OriginalMember(owner = "client!lu", name = "kb", descriptor = "I")
	public static int anInt5329;

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_10 = new Class222("", 13);

	@OriginalMember(owner = "client!lu", name = "ib", descriptor = "[Lclient!gk;")
	public static final Class2_Sub7[] aClass2_Sub7Array1 = new Class2_Sub7[2048];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(DB)V")
	public static void method4593(@OriginalArg(0) double arg0) {
		if (Static60.aDouble9 == arg0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static403.anIntArray607[local19] = local31 > 255 ? 255 : local31;
		}
		Static60.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method4596(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static570.method7435(arg4, arg5, arg0, -1, arg1, arg2, null, arg3);
	}
}

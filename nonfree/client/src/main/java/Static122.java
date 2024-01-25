import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Lclient!tf;")
	public static Class322 aClass322_46;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt2800;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
	public static int anInt2802;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_9 = new Class358(15, 0, 1, 0);

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!nj;B)V")
	public static void method2503(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.aBoolean621 = false;
		if (arg0.aClass3_Sub48_5 != null) {
			arg0.aClass3_Sub48_5.anInt8528 = 0;
		}
		for (@Pc(18) Class3_Sub4 local18 = arg0.method6656(); local18 != null; local18 = arg0.method6660()) {
			method2503(local18);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)V")
	public static void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(88) Class299 local88 = Static309.aClass299ArrayArrayArray3[arg2][arg1][arg0];
		if (local88 != null) {
			if (arg3 == 1) {
				local88.aShort127 = 0;
			} else if (arg3 == 2) {
				local88.aShort125 = 0;
			}
		}
		Static457.method6409();
	}
}

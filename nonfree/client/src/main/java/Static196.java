import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "Lclient!ai;")
	public static Class7 aClass7_36;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1420 = Static200.method3116("No reply from loginserver)3");

	@OriginalMember(owner = "client!u", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1421 = Static200.method3116("0(U");

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1422 = aClass60_1420;

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1423 = Static200.method3116("Hidden)2use");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZII)V")
	public static void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static214.anInt4572 && Static130.anInt2847 >= arg1) {
			@Pc(24) int local24 = Static107.method1863(Static141.anInt3163, arg2, Static200.anInt4273);
			@Pc(30) int local30 = Static107.method1863(Static141.anInt3163, arg3, Static200.anInt4273);
			Static199.method3111(local24, arg0, arg1, local30);
		}
	}
}

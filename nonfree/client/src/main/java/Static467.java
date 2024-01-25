import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt8607;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!pr;")
	public static Class254 aClass254_148;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Lclient!ta;")
	public static Class73 aClass73_3;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public static int anInt8612;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString104 = null;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_12 = new Class112(14, 0, 4, 1);

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public static int anInt8609 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIIII)V")
	public static void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(13) int local13 = arg5 - arg2;
		for (@Pc(15) int local15 = arg4; local15 < local9; local15++) {
			Static115.method2332(arg3, arg0, arg1, Static183.anIntArrayArray26[local15]);
		}
		@Pc(35) int local35 = arg0 - arg2;
		for (@Pc(41) int local41 = arg5; local41 > local13; local41--) {
			Static115.method2332(arg3, arg0, arg1, Static183.anIntArrayArray26[local41]);
		}
		@Pc(64) int local64 = arg3 + arg2;
		for (@Pc(66) int local66 = local9; local66 <= local13; local66++) {
			@Pc(72) int[] local72 = Static183.anIntArrayArray26[local66];
			Static115.method2332(arg3, local64, arg1, local72);
			Static115.method2332(local35, arg0, arg1, local72);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
	public static int method7194(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "Lclient!fc;")
	public static final Class2_Sub19 aClass2_Sub19_1 = new Class2_Sub19(0, -1);

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
	public static int anInt661 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V")
	public static void method733(@OriginalArg(0) int arg0) {
		if (Static523.anInt8452 == arg0) {
			return;
		}
		Static456.anInt7428 = Static5.anInt112 = Static71.anIntArray143[arg0];
		Static550.method7586();
		Static584.anIntArrayArrayArray18 = new int[4][Static456.anInt7428 >> 3][Static5.anInt112 >> 3];
		Static133.anIntArrayArray27 = new int[Static456.anInt7428][Static5.anInt112];
		Static219.anIntArrayArray43 = new int[Static456.anInt7428][Static5.anInt112];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static520.aClass175Array1[local40] = Static460.method6506(Static5.anInt112, Static456.anInt7428);
		}
		Static582.aByteArrayArrayArray17 = new byte[4][Static456.anInt7428][Static5.anInt112];
		Static224.method3610(Static5.anInt112, Static456.anInt7428);
		Static360.method5383(Static141.aClass13_27, Static5.anInt112 >> 3, Static456.anInt7428 >> 3);
		Static523.anInt8452 = arg0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public static boolean method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static27.method629(arg7, arg8, arg3)) {
			return false;
		}
		@Pc(15) int local15 = Static209.anIntArray263[0];
		@Pc(19) int local19 = Static209.anIntArray263[2];
		@Pc(23) int local23 = Static209.anIntArray263[1];
		if (!Static27.method629(arg5, arg2, arg0)) {
			return false;
		}
		@Pc(35) int local35 = Static209.anIntArray263[0];
		@Pc(39) int local39 = Static209.anIntArray263[1];
		@Pc(43) int local43 = Static209.anIntArray263[2];
		if (Static27.method629(arg1, arg6, arg4)) {
			@Pc(55) int local55 = Static209.anIntArray263[0];
			@Pc(59) int local59 = Static209.anIntArray263[2];
			@Pc(68) int local68 = Static209.anIntArray263[1];
			return Static92.method1887(local23, local59, local35, local39, local43, local68, local19, local55, local15);
		} else {
			return false;
		}
	}
}

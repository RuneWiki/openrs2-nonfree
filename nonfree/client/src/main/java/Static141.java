import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!od", name = "r", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public static int anInt1520 = 0;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_527 = Static151.method2243("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_528 = Static151.method2243("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
	public static void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub18 local28 = Static92.aClass2_Sub18ArrayArrayArray1[local9][arg0][arg1] = Static92.aClass2_Sub18ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt3299--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt3292; local38++) {
					@Pc(44) Class39 local44 = local28.aClass39Array2[local38];
					if ((local44.aLong54 >> 29 & 0x3L) == 2L && local44.anInt1480 == arg0 && local44.anInt1484 == arg1) {
						local44.anInt1483--;
					}
				}
			}
		}
		if (Static92.aClass2_Sub18ArrayArrayArray1[0][arg0][arg1] == null) {
			Static92.aClass2_Sub18ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub18(0, arg0, arg1);
		}
		Static92.aClass2_Sub18ArrayArrayArray1[0][arg0][arg1].aClass2_Sub18_1 = local7;
		Static92.aClass2_Sub18ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
	public static int method1037(@OriginalArg(0) int arg0) {
		if (Static134.anInt2873 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}

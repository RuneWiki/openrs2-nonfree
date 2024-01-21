import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!ii;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!ji;")
	public static Class2_Sub1_Sub12 aClass2_Sub1_Sub12_2;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!pb;")
	public static Class71 aClass71_2;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt329 = 0;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_95 = Static151.method2243("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[Lclient!bg;")
	public static final Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!ii;")
	public static Class47 aClass47_2 = null;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_96 = Static151.method2243("Hier wechseln");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_98 = Static151.method2243("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!mb;")
	public static Class62 aClass62_97 = aClass62_98;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ga;ZI)V")
	public static void method231(@OriginalArg(0) Class36 arg0, @OriginalArg(1) boolean arg1) {
		if (Static117.aClass36_2 != null) {
			try {
				Static117.aClass36_2.method862();
			} catch (@Pc(20) Exception local20) {
			}
			Static117.aClass36_2 = null;
		}
		Static117.aClass36_2 = arg0;
		Static149.method2221(arg1);
		Static174.anInt3690 = 0;
		Static147.aClass2_Sub11_2.anInt2235 = 0;
		Static203.aClass2_Sub11_5 = null;
		Static33.aClass2_Sub1_Sub21_1 = null;
		while (true) {
			@Pc(41) Class2_Sub1_Sub21 local41 = (Class2_Sub1_Sub21) Static137.aClass58_13.method1709();
			if (local41 == null) {
				while (true) {
					local41 = (Class2_Sub1_Sub21) Static92.aClass58_10.method1709();
					if (local41 == null) {
						if (Static83.aByte2 != 0) {
							try {
								@Pc(96) Class2_Sub11 local96 = new Class2_Sub11(4);
								local96.method1565(4);
								local96.method1565(Static83.aByte2);
								local96.method1533(0);
								Static117.aClass36_2.method858(local96.aByteArray26, 4);
							} catch (@Pc(117) IOException local117) {
								try {
									Static117.aClass36_2.method862();
								} catch (@Pc(122) Exception local122) {
								}
								Static117.aClass36_2 = null;
								Static69.anInt1430++;
							}
						}
						Static199.anInt4167 = 0;
						Static31.aLong37 = Static104.method1634();
						return;
					}
					Static95.aClass61_1.method1785(local41);
					Static21.aClass58_4.method1708(local41, local41.aLong148);
					Static30.anInt735++;
					Static49.anInt1065--;
				}
			}
			Static87.aClass58_9.method1708(local41, local41.aLong148);
			Static96.anInt2150++;
			Static179.anInt3757--;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(14) int local14 = arg5 + arg3;
		@Pc(19) int local19 = arg2 + arg3;
		for (@Pc(21) int local21 = arg5; local21 < local14; local21++) {
			Static19.method345(arg1, Static55.anIntArrayArray8[local21], arg2, arg0);
		}
		@Pc(52) int local52 = arg0 - arg3;
		for (@Pc(54) int local54 = arg4; local54 > local9; local54--) {
			Static19.method345(arg1, Static55.anIntArrayArray8[local54], arg2, arg0);
		}
		for (@Pc(74) int local74 = local14; local74 <= local9; local74++) {
			@Pc(80) int[] local80 = Static55.anIntArrayArray8[local74];
			Static19.method345(arg1, local80, arg2, local19);
			Static19.method345(arg6, local80, local19, local52);
			Static19.method345(arg1, local80, local52, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method234(@OriginalArg(0) int arg0) {
		Static23.anInt558 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static198.anInt4147; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static12.anInt319; local6++) {
				if (Static92.aClass2_Sub18ArrayArrayArray1[arg0][local3][local6] == null) {
					Static92.aClass2_Sub18ArrayArrayArray1[arg0][local3][local6] = new Class2_Sub18(arg0, local3, local6);
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lclient!vf;")
	public static Class2_Sub23[] aClass2_Sub23Array1;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1106 = Static158.method3034("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
	public static final int[] anIntArray447 = new int[2000];

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1107 = Static158.method3034("mapflag");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	public static final int[] anIntArray448 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1108 = aClass60_1106;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1109 = Static158.method3034("Lade Texturen )2 ");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBII[I)V")
	public static void method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1--;
		@Pc(8) int local8 = arg0 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg1) {
			@Pc(15) int local15 = arg1 + 1;
			arg3[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			arg1 = local45 + 1;
			arg3[arg1] = arg2;
		}
		while (arg1 < local8) {
			arg1++;
			arg3[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3072() {
		for (@Pc(14) Class2_Sub6 local14 = (Class2_Sub6) Static190.aClass67_14.method2848(); local14 != null; local14 = (Class2_Sub6) Static190.aClass67_14.method2851()) {
			if (local14.anInt1927 > 0) {
				local14.anInt1927--;
			}
			if (local14.anInt1927 != 0) {
				if (local14.anInt1912 > 0) {
					local14.anInt1912--;
				}
				if (local14.anInt1912 == 0 && local14.anInt1921 >= 1 && local14.anInt1926 >= 1 && local14.anInt1921 <= 102 && local14.anInt1926 <= 102 && (local14.anInt1916 < 0 || Static78.method1881(local14.anInt1913, local14.anInt1916))) {
					Static128.method2703(local14.anInt1913, local14.anInt1928, local14.anInt1929, local14.anInt1921, local14.anInt1915, local14.anInt1916, local14.anInt1926);
					local14.anInt1912 = -1;
					if (local14.anInt1916 == local14.anInt1911 && local14.anInt1911 == -1) {
						local14.method3556();
					} else if (local14.anInt1916 == local14.anInt1911 && local14.anInt1929 == local14.anInt1920 && local14.anInt1924 == local14.anInt1913) {
						local14.method3556();
					}
				}
			} else if (local14.anInt1911 < 0 || Static78.method1881(local14.anInt1924, local14.anInt1911)) {
				Static128.method2703(local14.anInt1924, local14.anInt1928, local14.anInt1920, local14.anInt1921, local14.anInt1915, local14.anInt1911, local14.anInt1926);
				local14.method3556();
			}
		}
	}
}

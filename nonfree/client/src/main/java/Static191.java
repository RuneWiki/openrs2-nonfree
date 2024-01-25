import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!gl;")
	public static Class2 aClass2_16;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!ol;")
	public static Class159 aClass159_4;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Z")
	public static boolean aBoolean245;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!al;")
	public static final Class11 aClass11_86 = new Class11(100);

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt3905 = 0;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt3907 = 0;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt3908 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method3631() {
		Static143.aClass14_Sub19_Sub4_2.method5545();
		Static106.anInt2365 = 1;
		Static285.aClass143_100 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ne;Z)V")
	public static void method3632(@OriginalArg(1) Class146 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt4183 == 0 ? arg0.anInt4133 : arg0.anInt4183;
		@Pc(25) int local25 = arg0.anInt4197 == 0 ? arg0.anInt4199 : arg0.anInt4197;
		Static64.method1506(Static182.aClass146ArrayArray1[arg0.anInt4214 >> 16], local25, arg0.anInt4214, arg1, local16);
		if (arg0.aClass146Array2 != null) {
			Static64.method1506(arg0.aClass146Array2, local25, arg0.anInt4214, arg1, local16);
		}
		@Pc(60) Class14_Sub27 local60 = (Class14_Sub27) Static198.aClass25_20.method691((long) arg0.anInt4214);
		if (local60 != null) {
			Static1.method5709(local16, local60.anInt5186, arg1, local25);
		}
	}
}

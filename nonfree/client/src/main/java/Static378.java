import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray155;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Lclient!tk;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
	public static void method4843(@OriginalArg(0) int arg0) {
		Static323.anInt5318 = -1;
		Static257.anInt6932 = arg0;
		Static113.anInt2002 = -1;
		Static144.method1907();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BII)V")
	public static void method4844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class257 local10 = new Class257(16);
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) Static194.aClass257_13.method5506(); local15 != null; local15 = (Class1_Sub19) Static194.aClass257_13.method5501()) {
			local15.method5617();
			@Pc(26) int local26 = (int) (local15.aLong226 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong226 >> 14 & 0x3FFFL) - arg1;
			@Pc(46) int local46 = (int) (local15.aLong226 & 0x3FFFL) - arg0;
			if (local46 >= 0 && local37 >= 0 && Static425.anInt6922 > local46 && Static251.anInt4072 > local37) {
				local10.method5504(local15, (long) (local26 << 28 | local37 << 14 | local46));
			}
		}
		Static194.aClass257_13 = local10;
	}
}

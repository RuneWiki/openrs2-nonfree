import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!jc;")
	public static Class40 aClass40_13;

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
	public static int anInt1123;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_713 = Static107.method1838("white:");

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "Lclient!gg;")
	public static Class28 aClass28_709 = aClass28_713;

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lclient!gg;")
	private static Class28 aClass28_711 = Static107.method1838("Invalid username or password)3");

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Lclient!gg;")
	public static Class28 aClass28_710 = aClass28_711;

	@OriginalMember(owner = "client!ec", name = "ob", descriptor = "Lclient!gg;")
	public static Class28 aClass28_712 = aClass28_713;

	@OriginalMember(owner = "client!ec", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_714 = Static107.method1838("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!kh;)V")
	public static void method773(@OriginalArg(0) Class43 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2326; local2 <= arg0.anInt2321; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2322; local6 <= arg0.anInt2319; local6++) {
				@Pc(16) Class2_Sub14 local16 = Static133.aClass2_Sub14ArrayArrayArray1[arg0.anInt2316][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt2269; local20++) {
						if (local16.aClass43Array56[local20] == arg0) {
							local16.anInt2269--;
							for (local35 = local20; local35 < local16.anInt2269; local35++) {
								local16.aClass43Array56[local35] = local16.aClass43Array56[local35 + 1];
								local16.anIntArray220[local35] = local16.anIntArray220[local35 + 1];
							}
							local16.aClass43Array56[local16.anInt2269] = null;
							break;
						}
					}
					local16.anInt2277 = 0;
					for (local35 = 0; local35 < local16.anInt2269; local35++) {
						local16.anInt2277 |= local16.anIntArray220[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Lclient!vg;")
	public static Class2_Sub4_Sub18 method774(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub18 local10 = (Class2_Sub4_Sub18) Static95.aClass14_122.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static9.aClass40_5.method1771(1, arg0);
		local10 = new Class2_Sub4_Sub18();
		if (local20 != null) {
			local10.method2743(new Class2_Sub2(local20), arg0);
		}
		Static95.aClass14_122.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(Z)V")
	public static void method787() {
		aClass28_710 = null;
		aClass28_711 = null;
		aClass28_709 = null;
		aClass28_712 = null;
		aClass40_13 = null;
		aClass28_714 = null;
		aClass28_713 = null;
	}
}

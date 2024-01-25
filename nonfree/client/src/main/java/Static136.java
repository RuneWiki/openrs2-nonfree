import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!im", name = "V", descriptor = "I")
	public static int anInt3193;

	@OriginalMember(owner = "client!im", name = "R", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_27 = new Class116();

	@OriginalMember(owner = "client!im", name = "U", descriptor = "[I")
	public static final int[] anIntArray272 = new int[500];

	@OriginalMember(owner = "client!im", name = "X", descriptor = "[Lclient!qf;")
	public static final Class165[] aClass165Array1 = new Class165[4];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lclient!jg;")
	public static Class4_Sub4_Sub7 method2904(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub4_Sub7 local15 = (Class4_Sub4_Sub7) Static74.aClass124_1.method3525((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static155.aClass193_57.method5047(0, arg0 & 0x7FFF);
		} else {
			local30 = Static282.aClass193_82.method5047(0, arg0);
		}
		local15 = new Class4_Sub4_Sub7();
		if (local30 != null) {
			local15.method2990(new Class4_Sub11(local30));
		}
		if (arg0 >= 32768) {
			local15.method2995();
		}
		Static74.aClass124_1.method3528(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V")
	public static void method2905() {
		for (@Pc(3) int local3 = 0; local3 < Static162.aClass50ArrayArray1.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static162.aClass50ArrayArray1[local3].length; local12++) {
				Static162.aClass50ArrayArray1[local3][local12] = Static65.aClass50_1;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "H", descriptor = "Lclient!cm;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_11 = new Class103(42, -1);

	@OriginalMember(owner = "client!as", name = "z", descriptor = "Lclient!kh;")
	public static final Class1_Sub28_Sub1 aClass1_Sub28_Sub1_1 = new Class1_Sub28_Sub1(5000);

	@OriginalMember(owner = "client!as", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_7 = new Class119("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!as", name = "E", descriptor = "I")
	public static int anInt378 = 0;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	public static int anInt379 = 1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	public static boolean method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIB)V")
	public static void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg2);
		@Pc(17) int local17 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg1);
		@Pc(23) int local23 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg4);
		@Pc(37) int local37 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg0);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static2.method38(local37, arg3, Static67.anIntArrayArray13[local39], local23);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)Z")
	public static boolean method276(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static185.aClass34_7.method5734();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static185.aClass34_7.method5764();
		} else if (!Static185.aClass34_7.method5775()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static453.aClass136_Sub1_1.aBoolean511 = arg0;
			Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)Lclient!sd;")
	public static Class220 method279(@OriginalArg(0) int arg0) {
		@Pc(13) Class220[] local13 = Static79.method1295();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt6171) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIILclient!ur;I)Lclient!al;")
	public static Class10_Sub1_Sub1 method285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34_Sub2 arg4) {
		if (arg4.aBoolean768 || Static90.method1429(arg0) && Static90.method1429(arg1)) {
			return new Class10_Sub1_Sub1(arg4, 3553, arg3, arg2, arg0, arg1, true);
		} else if (arg4.aBoolean759) {
			return new Class10_Sub1_Sub1(arg4, 34037, arg3, arg2, arg0, arg1, true);
		} else {
			return new Class10_Sub1_Sub1(arg4, arg3, arg2, arg0, arg1, Static191.method2740(arg0), Static191.method2740(arg1), true);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!nl;")
	public static Class171 aClass171_6;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt440;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_5 = new Class11(76, 0);

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!gj;")
	public static final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)Z")
	public static boolean method351(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static131.method2584(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static276.aCharArray4;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static213.aCharArray2;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (arg0 == local55) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public static int method352(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static171.method3061(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public static void method353() {
		@Pc(1) Class160 local1 = Static208.aClass160_33;
		synchronized (Static208.aClass160_33) {
			Static208.aClass160_33.method3606(5);
		}
		local1 = Static238.aClass160_36;
		synchronized (Static238.aClass160_36) {
			Static238.aClass160_36.method3606(5);
		}
	}
}

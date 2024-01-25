import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Lclient!cr;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
	public static int anInt2703;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "Lclient!ll;")
	public static final Class186 aClass186_1 = new Class186();

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)Z")
	public static boolean method2237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(BLjava/lang/String;)V")
	public static void method2238(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static502.method6919(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static383.anInt6691; local33++) {
			@Pc(39) String local39 = Static353.aStringArray23[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static502.method6919(local39);
			if (local39 != null && local39.equals(local20)) {
				Static383.anInt6691--;
				for (@Pc(65) int local65 = local33; local65 < Static383.anInt6691; local65++) {
					Static353.aStringArray23[local65] = Static353.aStringArray23[local65 + 1];
					Static521.aStringArray32[local65] = Static521.aStringArray32[local65 + 1];
					Static129.aStringArray10[local65] = Static129.aStringArray10[local65 + 1];
					Static195.aStringArray14[local65] = Static195.aStringArray14[local65 + 1];
					Static354.aBooleanArray34[local65] = Static354.aBooleanArray34[local65 + 1];
				}
				Static350.anInt6167 = Static48.anInt821;
				Static136.method2051(Static370.aClass160_86);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0));
				Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IC)Z")
	public static boolean method2241(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static83.method1316(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static30.aCharArray6;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static332.aCharArray8;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (arg0 == local54) {
					return true;
				}
			}
			return false;
		}
	}
}

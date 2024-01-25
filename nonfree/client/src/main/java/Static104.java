import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_37 = new Class73(86, 0);

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString16 = null;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
	public static int anInt1999 = 0;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!pp;[III)V")
	public static void method1870(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray519 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray519.length; local8++) {
				if (arg0.anIntArray519[local8] != arg1[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt7085 != -1) {
				@Pc(40) Class57 local40 = Static78.aClass298_2.method6521(arg0.anInt7085);
				@Pc(43) int local43 = local40.anInt1547;
				if (local43 == 1) {
					arg0.anInt7054 = 0;
					arg0.anInt7121 = 0;
					arg0.anInt7101 = 1;
					arg0.anInt7112 = 0;
					arg0.anInt7107 = arg2;
					Static520.method6532(arg0.aByte108, local40, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7112, arg0.anInt9540);
				}
				if (local43 == 2) {
					arg0.anInt7121 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray519 == null || arg0.anIntArray519[local8] == -1 || Static78.aClass298_2.method6521(arg1[local8]).anInt1532 >= Static78.aClass298_2.method6521(arg0.anIntArray519[local8]).anInt1532) {
				arg0.anIntArray519 = arg1;
				arg0.anInt7107 = arg2;
				break;
			}
		}
		if (local6) {
			arg0.anInt7107 = arg2;
			arg0.anIntArray519 = arg1;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)I")
	public static int method1871(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZII)V")
	public static void method1872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class6_Sub2_Sub7 local19 = Static401.method5861(arg1, 12);
		local19.method2582();
		local19.anInt2944 = arg0;
	}
}

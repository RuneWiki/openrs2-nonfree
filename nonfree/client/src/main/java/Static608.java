import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_36 = new Class269(36, 4);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZ)V")
	public static void method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class121 local13 = Static600.aClass121ArrayArray1[arg1][arg0];
		if (local13 != null) {
			Static4.anInt48 = local13.anInt3715;
			Static386.anInt6960 = local13.anInt3719;
			Static151.anInt3492 = local13.anInt3712;
		}
		Static478.method6849();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public static void method2877() {
		if (Static50.anInt1090 <= 0) {
			Static216.aString49 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static177.aStringArray9.length; local15++) {
			if (Static177.aStringArray9[local15].indexOf("--> ") != -1) {
				local13++;
				if (local13 == Static50.anInt1090) {
					Static216.aString49 = Static177.aStringArray9[local15].substring(Static177.aStringArray9[local15].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II[BIILclient!oea;ZI)Lclient!m;")
	public static Class88_Sub2_Sub1 method2888(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class87_Sub2 arg3) {
		if (arg3.aBoolean550 || Static504.method7825(arg1) && Static504.method7825(arg2)) {
			return new Class88_Sub2_Sub1(arg3, 3553, 6406, arg1, arg2, false, arg0, 6406);
		} else if (arg3.aBoolean538) {
			return new Class88_Sub2_Sub1(arg3, 34037, 6406, arg1, arg2, false, arg0, 6406);
		} else {
			return new Class88_Sub2_Sub1(arg3, 6406, arg1, arg2, Static347.method5404(arg1), Static347.method5404(arg2), arg0, 6406);
		}
	}
}

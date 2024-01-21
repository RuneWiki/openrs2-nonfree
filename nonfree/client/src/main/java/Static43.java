import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "[Lclient!cd;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_310 = Static158.method3034("Cancel");

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Lclient!ob;")
	public static Class60 aClass60_311 = aClass60_310;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method942(@OriginalArg(0) Class13 arg0) {
		Static32.aClass13_7 = arg0;
		Static32.aClass13_7.method513(4);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method943(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static134.aClass82_1);
		arg0.removeFocusListener(Static134.aClass82_1);
		Static148.anInt3847 = -1;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)Lclient!ge;")
	public static Class2_Sub1_Sub11 method944(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) Static128.aClass89_49.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static50.aClass13_9.method521(arg0, 3);
		local10 = new Class2_Sub1_Sub11();
		if (local20 != null) {
			local10.method1431(new Class2_Sub3(local20));
		}
		Static128.aClass89_49.method3432(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!og;I)Lclient!ji;")
	public static Class4_Sub3 method945(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class4_Sub3(arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method239(), arg0.method218());
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static64.anInt1962 <= arg0 - arg3 && arg0 + arg3 <= Static123.anInt3379 && Static36.anInt1076 <= arg2 - arg3 && arg2 + arg3 <= Static117.anInt951) {
			Static1.method7(arg0, arg1, arg2, arg3);
		} else {
			Static159.method3418(arg1, arg0, arg2, arg3);
		}
	}
}

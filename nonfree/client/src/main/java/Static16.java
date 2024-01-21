import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
	public static int anInt510 = 0;

	@OriginalMember(owner = "client!bf", name = "xb", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bf", name = "Gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_247 = Static146.method2172("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bf", name = "Xb", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lclient!kf;")
	public static Class2_Sub2_Sub14 method343(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub14 local18 = (Class2_Sub2_Sub14) Static111.aClass82_43.method2699((long) arg0);
		if (local18 != null) {
			return local18;
		}
		local18 = Static170.method2834(Static111.aClass43_27, Static150.aClass43_34, arg0);
		if (local18 != null) {
			Static111.aClass82_43.method2701((long) arg0, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	public static void method346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static119.anInt2968 == 2) {
			Static48.method919((Static152.anInt3739 - Static168.anInt4143 << 7) + Static134.anInt3285, Static134.anInt3284 * 2, Static60.anInt1617 + (Static101.anInt2501 - Static157.anInt3889 << 7));
			if (Static159.anInt3921 > -1 && Static143.anInt3513 % 20 < 10) {
				Static167.aClass2_Sub2_Sub3_Sub2Array12[0].method401(arg1 + Static159.anInt3921 - 12, Static57.anInt4543 + -28 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method350() {
		anIntArray72 = null;
		aClass77_247 = null;
	}
}

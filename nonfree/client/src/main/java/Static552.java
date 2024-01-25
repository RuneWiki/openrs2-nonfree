import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static552 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt9015;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!wm;")
	public static Class390 aClass390_108;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public static int anInt9017 = -1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIILclient!wm;Z)V")
	public static void method7656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class390 arg3) {
		if (arg1 <= 0) {
			Static127.method2322(arg3, arg2, arg0);
			return;
		}
		Static67.anInt1002 = 0;
		Static439.aClass5_Sub17_Sub1_3 = null;
		Static26.anInt352 = 1;
		Static577.anInt9443 = arg2;
		Static128.aBoolean231 = false;
		Static234.aClass390_55 = arg3;
		Static561.anInt9131 = arg0;
		Static171.anInt3389 = Static386.aClass5_Sub17_Sub1_2.method2562() / arg1;
		if (Static171.anInt3389 < 1) {
			Static171.anInt3389 = 1;
		}
	}
}

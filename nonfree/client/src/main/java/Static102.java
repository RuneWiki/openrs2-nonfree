import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
	public static int anInt1785;

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "Lclient!nca;")
	public static Class254 aClass254_44;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!io;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
	public static int anInt1792;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!et;)Lclient!oca;")
	public static Class33_Sub2_Sub1 method1542(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(7) Class33_Sub2 local7 = Static603.method8250(arg0);
		@Pc(20) int local20 = arg0.method8598();
		return new Class33_Sub2_Sub1(local7.aClass18_12, local7.aClass239_13, local7.anInt7247, local7.anInt7249, local7.anInt7246, local7.anInt7251, local7.anInt7252, local7.anInt7250, local7.anInt7245, local7.anInt7257, local7.anInt7262, local7.anInt7260, local7.anInt7255, local7.anInt7258, local7.anInt7256, local20);
	}
}

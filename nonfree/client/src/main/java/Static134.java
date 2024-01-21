import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!ai;")
	private static Class6 aClass6_903 = Static38.method685(" from your friend list first)3");

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_901 = aClass6_903;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_902 = Static38.method685("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "Lclient!ai;")
	private static Class6 aClass6_908 = Static38.method685("Your profile will be transferred in:");

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_904 = aClass6_908;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_905 = Static38.method685("(U4");

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_906 = Static38.method685("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array17 = new Class6[500];

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[I")
	public static int[] anIntArray283 = new int[500];

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Lclient!ai;")
	public static Class6 aClass6_907 = Static38.method685("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method2094() {
		aClass6Array17 = null;
		aClass6_901 = null;
		aClass6_905 = null;
		aClass6_904 = null;
		aClass6_908 = null;
		aClass6_906 = null;
		anIntArray283 = null;
		aClass6_903 = null;
		aClass6_907 = null;
		aClass6_902 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lclient!af;")
	public static Class2_Sub3_Sub1 method2095(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub1 local6 = (Class2_Sub3_Sub1) Static133.aClass17_20.method505((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static160.aClass10_25.method1605(arg0, 1);
		local6 = new Class2_Sub3_Sub1();
		if (local25 != null) {
			local6.method84(new Class2_Sub13(local25), arg0);
		}
		Static133.aClass17_20.method508((long) arg0, local6);
		return local6;
	}
}

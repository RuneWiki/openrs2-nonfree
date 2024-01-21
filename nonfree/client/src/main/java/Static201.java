import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_26;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
	public static int anInt3995;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!eh;")
	public static Class28 aClass28_190;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1148 = Static181.method2795("Discard");

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1146 = aClass83_1148;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "[I")
	public static final int[] anIntArray392 = new int[50];

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1147 = Static181.method2795("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
	public static int[] anIntArray394 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
	public static int anInt4000 = -1;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public static int anInt4001 = -1;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1149 = Static181.method2795("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1150 = Static181.method2795("(U4");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIB)Lclient!ae;")
	public static Class5 method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5 local12 = Static74.method1401(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass5Array1 == null || arg0 >= local12.aClass5Array1.length) {
			return null;
		} else {
			return local12.aClass5Array1[arg0];
		}
	}
}

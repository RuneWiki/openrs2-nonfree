import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static int anInt480;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!sd;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
	public static int[] anIntArray57 = new int[500];

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt479 = 0;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_182 = Static56.method972("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!bd;")
	public static Class9 aClass9_7 = new Class9(64);

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_183 = Static56.method972("::noclip");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_184 = Static56.method972("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_185 = Static56.method972("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_186 = aClass5_185;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!bf;Lclient!bf;IZ)Lclient!od;")
	public static Class3_Sub1_Sub12 method321(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		@Pc(18) int[] local18 = arg1.method1863(arg0);
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < local18.length; local22++) {
			@Pc(32) byte[] local32 = arg1.method1871(arg0, local18[local22]);
			if (local32 == null) {
				local20 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(68) byte[] local68 = arg2.method1871(local52, 0);
				if (local68 == null) {
					local20 = false;
				}
			}
		}
		if (!local20) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub12(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method322() {
		anIntArray57 = null;
		anIntArray58 = null;
		aClass5_184 = null;
		aClass9_7 = null;
		aClass5_183 = null;
		aClass5_182 = null;
		aClass5_186 = null;
		anIntArrayArray3 = null;
		aClass2_1 = null;
		aClass5_185 = null;
		anIntArray60 = null;
	}
}

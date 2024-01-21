import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt3117;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!ag;")
	public static Class4 aClass4_75;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int anInt3125;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1042 = Static161.method2971("(Udns");

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1047 = Static161.method2971("Prepared visibility map");

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1043 = aClass13_1047;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1044 = Static161.method2971("mod_icons");

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1045 = Static161.method2971("Enter your username (V password)3");

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1046 = Static161.method2971("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
	public static int[] anIntArray301 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1048 = aClass13_1045;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1049 = Static161.method2971("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	public static int anInt3129 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!ag;I)Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 method2227(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		return Static15.method624(arg0, arg1, arg2) ? Static169.method2886() : null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ag;ILclient!ag;ZB)Lclient!f;")
	public static Class1_Sub2_Sub7 method2228(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2) {
		@Pc(10) int[] local10 = arg0.method2265(arg1);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method2261(arg1, local10[local14]);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg2.method2261(local44, 0);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub7(arg0, arg2, arg1, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method2229() {
		aClass4_75 = null;
		aClass13_1046 = null;
		anIntArray301 = null;
		aClass13_1042 = null;
		aClass13_1043 = null;
		aClass13_1045 = null;
		anIntArray300 = null;
		aClass13_1049 = null;
		aClass13_1044 = null;
		aClass13_1048 = null;
		aClass13_1047 = null;
	}
}

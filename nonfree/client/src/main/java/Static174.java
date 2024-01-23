import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lclient!rg;")
	public static Class1_Sub2_Sub16_Sub2 aClass1_Sub2_Sub16_Sub2_1;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	public static int anInt3964 = 0;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "[Lclient!le;")
	public static Class25_Sub3[] aClass25_Sub3Array1 = new Class25_Sub3[4];

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "[J")
	public static long[] aLongArray9 = new long[1000];

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
	public static int anInt3970 = -2;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!bk;")
	public static Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
	public static int[] anIntArray358 = new int[14];

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "S")
	public static short aShort22 = 205;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString114 = "Please remove ";

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ICB)I")
	public static int method3212(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(3) int local3 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local3 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local3 = 1762;
		}
		return local3;
	}
}

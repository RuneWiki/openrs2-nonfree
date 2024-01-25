import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static307 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public static int anInt4841;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!kea;")
	public static Class161 aClass161_51;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_70 = new Class67("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	public static int anInt4847 = 0;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
	public static final int[] anIntArray435 = new int[14];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Z")
	public static boolean method4066(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!oa;Z)V")
	public static void method4067(@OriginalArg(0) Class5 arg0) {
		if (Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != Static228.anInt4893 && (Static279.aClass290ArrayArrayArray7 != null && Static290.method4907(arg0, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100))) {
			Static228.anInt4893 = Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static232.aByteArrayArrayArray18[1][arg0][arg1] & 0x2) != 0;
	}
}

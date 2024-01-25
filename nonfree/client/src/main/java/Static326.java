import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ku", name = "M", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
	public static int anInt6096 = 0;

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ku", name = "L", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_94 = new Class394("", 17);

	@OriginalMember(owner = "client!ku", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[200];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!eka;B)Lclient!eka;")
	public static Class5_Sub17_Sub1 method5068(@OriginalArg(0) Class5_Sub17_Sub1 arg0) {
		@Pc(19) Class5_Sub17_Sub1 local19 = arg0 == null ? new Class5_Sub17_Sub1() : new Class5_Sub17_Sub1(arg0);
		local19.method2547();
		return local19;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)Z")
	public static boolean method5069(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
	public static void method5071() {
		Static530.anInt8752 = 0;
		Static281.anInt5401 = Static671.anInt10769;
		Static402.aClass38Array3 = new Class38[2000];
		Static276.anIntArrayArrayArray49 = new int[Static219.anInt4088][Static216.anInt4042 + 1][Static233.anInt4238 + 1];
		Static522.aClass38Array4 = new Class38[500];
		Static563.aBoolean781 = false;
		Static479.anInt8053 = 0;
		Static108.aClass38Array1 = new Class38[1000];
		Static272.anInt5008 = 0;
		Static390.aClass38Array2 = new Class38[500];
		Static518.anInt8630 = Static671.anInt10769;
		Static364.anInt6622 = 0;
		if (Static10.aClass65_1 instanceof oa) {
			Static37.aBoolean43 = false;
		} else {
			Static37.aBoolean43 = true;
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(II)Z")
	public static boolean method5072(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
	public static int anInt477;

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bg", name = "Z", descriptor = "Lclient!cg;")
	public static Class22 aClass22_11;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
	public static int anInt474 = 50;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
	public static int[] anIntArray58 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
	public static int anInt478 = 0;

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "[I")
	public static int[] anIntArray59 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "[I")
	public static int[] anIntArray60 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "[I")
	public static int[] anIntArray61 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
	public static int[] anIntArray62 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[anInt474];

	@OriginalMember(owner = "client!bg", name = "db", descriptor = "[I")
	public static int[] anIntArray63 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "fb", descriptor = "[I")
	public static int[] anIntArray64 = new int[anInt474];

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	public static void method454() {
		Static15.aClass172_4.method4350();
		Static80.aClass172_13.method4350();
		Static92.aClass172_16.method4350();
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)I")
	public static int method455(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method456(@OriginalArg(0) String arg0) {
		if (Static209.aClass100_3 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(23) int local23 = 0; local23 < Static209.aClass100_3.anInt3236; local23++) {
			if (Static171.method2716(Static64.method1170(" ", Static209.aClass100_3.aStringArray22[local23], "<br>"), arg0)) {
				return local23;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)Lclient!wh;")
	public static Class185 method458(@OriginalArg(0) int arg0) {
		@Pc(10) Class185 local10 = (Class185) Static136.aClass172_23.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static236.aClass22_79.method665(Static298.method4224(arg0), Static189.method4543(arg0));
		local10 = new Class185();
		local10.anInt5770 = arg0;
		if (local26 != null) {
			local10.method4652(new Class4_Sub24(local26));
		}
		local10.method4660();
		Static136.aClass172_23.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(Z)V")
	public static void method459() {
		Static94.aClass172_17.method4350();
		Static70.aClass172_12.method4350();
	}
}

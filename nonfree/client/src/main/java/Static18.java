import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!va;")
	private static Class61 aClass61_198 = Static88.method1421(" million");

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!qa;")
	public static Class50 aClass50_2 = new Class50(4096);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!va;")
	private static Class61 aClass61_199 = Static88.method1421("Cancel");

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_200 = Static88.method1421("Create a free account");

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_201 = aClass61_198;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_202 = Static88.method1421("backtop1");

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!va;")
	public static Class61 aClass61_203 = aClass61_199;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!va;")
	public static Class61 aClass61_204 = aClass61_200;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt611 = 0;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_205 = Static88.method1421("Chat panel redrawn");

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!va;")
	public static Class61 aClass61_206 = Static88.method1421(" )2> @lre@");

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static int[] anIntArray70 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!da", name = "v", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public static int anInt614 = 1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method403() {
		Static107.aClass29_66.method646();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method404() {
		aClass61_198 = null;
		aClass61_201 = null;
		aClass61_202 = null;
		aClass61_204 = null;
		aClass50_2 = null;
		aByteArrayArray6 = null;
		aClass61_200 = null;
		aClass61_205 = null;
		aClass61_206 = null;
		aByteArrayArrayArray3 = null;
		anIntArray70 = null;
		aClass61_203 = null;
		aClass61_199 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!je;")
	public static Class10_Sub1_Sub10 method405(@OriginalArg(1) int arg0) {
		@Pc(13) Class10_Sub1_Sub10 local13 = (Class10_Sub1_Sub10) Static101.aClass29_71.method644((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27 = Static107.aClass11_59.method203(6, arg0);
		local13 = new Class10_Sub1_Sub10();
		local13.anInt1368 = arg0;
		if (local27 != null) {
			local13.method767(new Class10_Sub10(local27));
		}
		local13.method772();
		if (local13.aBoolean62) {
			local13.aBoolean56 = false;
			local13.aBoolean57 = false;
		}
		Static101.aClass29_71.method649(local13, (long) arg0);
		return local13;
	}
}

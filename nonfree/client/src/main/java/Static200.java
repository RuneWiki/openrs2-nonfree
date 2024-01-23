import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Lclient!lc;")
	public static Class98 aClass98_119;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	public static int anInt3912;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "Lclient!lc;")
	public static Class98 aClass98_120;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!ii;")
	public static Class69 aClass69_8 = new Class69(16);

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "[S")
	public static short[] aShortArray50 = new short[256];

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "[I")
	public static int[] anIntArray336 = new int[50];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
	public static void method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 6);
		local16.method4360();
		local16.anInt5492 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	public static void method3111() {
		Static231.aClass33_34.method839();
		Static250.aClass33_36.method839();
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	public static void method3112() {
		aClass98_120 = null;
		anIntArray336 = null;
		aByteArrayArrayArray12 = null;
		aClass98_119 = null;
		aShortArray50 = null;
		aClass69_8 = null;
	}
}

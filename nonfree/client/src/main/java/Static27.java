import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt827;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!sg;")
	private static Class77 aClass77_339 = Static146.method2172("Loading textures )2 ");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lclient!vb;")
	public static Class86[] aClass86Array1 = new Class86[4];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt815 = 1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt816 = 0;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_340 = aClass77_339;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	public static int method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 * (4096 - arg2) + arg1 * arg2 >> 12;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	public static void method563() {
		aClass77_339 = null;
		anIntArray104 = null;
		aClass86Array1 = null;
		aClass2_Sub2_Sub3_Sub3Array4 = null;
		aByteArrayArrayArray2 = null;
		aClass77_340 = null;
		aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	public static void method564(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static41.method809(arg0 - 1L);
			Static41.method809(1L);
		} else {
			Static41.method809(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!sg;)Z")
	public static boolean method565(@OriginalArg(1) Class77 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static51.anInt1395; local14++) {
			if (arg0.method2508(Static120.aClass77Array7[local14])) {
				return true;
			}
		}
		return arg0.method2508(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482);
	}
}

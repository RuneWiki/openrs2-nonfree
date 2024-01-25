import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "x", descriptor = "I")
	public static int anInt3796;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "I")
	public static int anInt3797;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Lclient!sm;")
	public static final Class5_Sub12_Sub2 aClass5_Sub12_Sub2_5 = new Class5_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!al", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray68 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
	public static final int[] anIntArray381 = new int[25];

	@OriginalMember(owner = "client!al", name = "B", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_90 = new Class85("purple:", "", "", "");

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void method3423() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static349.aBooleanArray26[local5] = false;
		}
		Static350.anInt6717 = 0;
		Static316.anInt4878 = Static42.anInt731;
		Static78.anInt1476 = -1;
		Static53.anInt992 = 5;
		Static252.anInt5004 = Static258.anInt5088;
		Static276.anInt5738 = Static21.anInt466;
		Static275.anInt5459 = Static102.anInt1934;
		Static19.anInt385 = Static271.anInt5301;
		Static288.anInt5652 = -1;
		Static88.anInt1648 = Static283.anInt5563;
		Static30.anInt601 = 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	public static void method3425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub1_Sub2 local13 = Static166.method3027(arg0, 14);
		local13.method850();
		local13.anInt996 = arg1;
	}
}

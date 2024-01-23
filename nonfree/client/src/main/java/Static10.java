import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
	public static int[] anIntArray24 = new int[50];

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt204 = -1;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Lclient!oj;")
	public static Class84 aClass84_9 = new Class84(64);

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)I")
	public static int method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static152.aClass1_Sub1_Sub14_1 != null && local11 == Static152.aClass1_Sub1_Sub14_1.aLong173 ? Static139.aClass1_Sub17_3.anInt2656 * 99 / (Static139.aClass1_Sub17_3.aByteArray40.length - Static152.aClass1_Sub1_Sub14_1.aByte7) + 1 : 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	public static int anInt1261 = 0;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "[I")
	public static final int[] anIntArray267 = new int[50];

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_31 = new Class205(35, -2);

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
	public static final int[] anIntArray268 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	public static int anInt1263 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)I")
	public static int method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public static void method1040() {
		Static140.aClass63_4.method1984(Static131.anInt2691, Static58.aBoolean89 ? Static266.anInt4632 + 256 : -1);
	}
}

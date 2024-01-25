import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "Lclient!kr;")
	public static Class171 aClass171_124;

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
	public static int anInt7222;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Lclient!kr;")
	public static Class171 aClass171_125;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
	public static int anInt7223;

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	public static int anInt7224;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame8;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray95;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!ei;")
	public static final Class79 aClass79_11 = new Class79();

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_79 = new Class37();

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
	public static int anInt7225 = -1;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Lclient!im;")
	public static Class140 aClass140_112 = null;

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
	public static int anInt7226 = 0;

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "[I")
	public static final int[] anIntArray695 = new int[256];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!jq;Z)V")
	public static void method6045(@OriginalArg(1) Class156 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt4712 == 0 ? arg0.anInt4732 : arg0.anInt4712;
		@Pc(25) int local25 = arg0.anInt4719 == 0 ? arg0.anInt4673 : arg0.anInt4719;
		Static265.method4403(arg0.anInt4677, arg1, local12, Static396.aClass156ArrayArray1[arg0.anInt4677 >> 16], local25);
		if (arg0.aClass156Array1 != null) {
			Static265.method4403(arg0.anInt4677, arg1, local12, arg0.aClass156Array1, local25);
		}
		@Pc(58) Class1_Sub35 local58 = (Class1_Sub35) Static468.aClass17_36.method738((long) arg0.anInt4677);
		if (local58 != null) {
			Static152.method2408(local25, arg1, local58.anInt6103, local12);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6050(@OriginalArg(0) String arg0) {
		return Static281.method4560(dba.class, arg0);
	}
}

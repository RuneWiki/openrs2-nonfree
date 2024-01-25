import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public static int anInt10061;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public static int anInt10065;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_100 = new Class187(57, 7);

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)I")
	public static int method8378(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIBI)V")
	public static void method8380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static117.anInt2046 = arg0;
		Static303.anInt4682 = arg1;
		Static371.anInt6494 = arg2;
		Static85.anInt1444 = arg3;
	}
}

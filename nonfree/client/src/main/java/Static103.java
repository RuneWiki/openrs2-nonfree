import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString139 = "glow1:";

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Choose Option";

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
	public static final int[] anIntArray133 = new int[14];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!nj;Z)V")
	public static void method2059(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(16) Class5_Sub27 local16 = (Class5_Sub27) Static331.aClass42_55.method1052((long) arg0.anInt5287);
		if (local16 == null) {
			Static129.method2471(arg0.anIntArray402[0], arg0.anIntArray401[0], arg0, null, 0, Static156.anInt3123, null);
		} else {
			local16.method3460();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIII)V")
	public static void method2060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 < arg2) {
			Static247.method3552(arg1, arg3, Static332.anIntArrayArray56[arg0], arg2);
		} else {
			Static247.method3552(arg1, arg2, Static332.anIntArrayArray56[arg0], arg3);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
	public static void method2061(@OriginalArg(0) int arg0) {
		if (!Static183.aBoolean261) {
			arg0 = -1;
		}
		if (Static95.anInt6300 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class58 local23 = Static315.method5370(arg0);
			@Pc(27) Class37 local27 = local23.method1604();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static202.aClass10_3.method324(local27.method916(), Static243.aCanvas3, new Point(local23.anInt1819, local23.anInt1820), local27.method906(), local27.method914());
				Static95.anInt6300 = arg0;
			}
		}
		if (arg0 == -1 && Static95.anInt6300 != -1) {
			Static202.aClass10_3.method324(-1, Static243.aCanvas3, new Point(), -1, null);
			Static95.anInt6300 = -1;
		}
	}
}

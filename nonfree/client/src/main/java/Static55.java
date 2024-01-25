import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "Lclient!mv;")
	public static Class229 aClass229_14;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Lclient!kk;")
	public static final Class195 aClass195_1 = new Class195();

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "[Lclient!tj;")
	public static final Class102_Sub1[] aClass102_Sub1Array1 = new Class102_Sub1[35];

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "[I")
	public static final int[] anIntArray104 = new int[8];

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "[Lclient!kq;")
	public static final Class198[] aClass198Array1 = new Class198[16];

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BI)V")
	public static void method947(@OriginalArg(0) byte arg0) {
		if (Class2_Sub35_Sub1.lb == null) {
			Class2_Sub35_Sub1.lb = new byte[4][Static281.anInt4822][Static29.anInt491];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static281.anInt4822; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static29.anInt491; local30++) {
					Class2_Sub35_Sub1.lb[local22][local26][local30] = arg0;
				}
			}
		}
	}
}

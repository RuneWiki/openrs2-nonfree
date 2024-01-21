import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!la", name = "rb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!la", name = "ob", descriptor = "[Lclient!pb;")
	public static Class49[] aClass49Array1 = new Class49[4];

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "[I")
	public static int[] anIntArray245 = new int[50];

	@OriginalMember(owner = "client!la", name = "tb", descriptor = "I")
	public static int anInt1497 = 0;

	@OriginalMember(owner = "client!la", name = "wb", descriptor = "Lclient!wd;")
	public static Class3_Sub11 aClass3_Sub11_4 = new Class3_Sub11(8);

	@OriginalMember(owner = "client!la", name = "xb", descriptor = "I")
	public static int anInt1500 = 0;

	@OriginalMember(owner = "client!la", name = "Cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_738 = Static87.method1648("Sprites geladen)3");

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_739 = Static87.method1648("sch-Utteln:");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!td;B)[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		return Static64.method1189(arg1, arg2, arg0) ? Static18.method322() : null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg1;
			arg1 = arg5;
			arg5 = local10;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local18 == 2) {
			return 7 + 1 - arg4 - arg5;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(I)V")
	public static void method1102() {
		aClass3_Sub11_4 = null;
		aClass27_738 = null;
		aByteArrayArrayArray4 = null;
		aClass27_739 = null;
		anIntArray245 = null;
		aClass49Array1 = null;
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(I)V")
	public static void method1103() {
		Static94.method1754(false, 0, null);
	}
}

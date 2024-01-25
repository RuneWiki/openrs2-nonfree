import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "[Lclient!ek;")
	public static final Class61[] aClass61Array2 = new Class61[4];

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_89 = new Class157(53, 6);

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[128][128];

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "J")
	public static long aLong90 = 0L;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(6, arg1);
		local8.method1801();
		local8.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method2436() {
		@Pc(5) Class107 local5 = Static98.aClass107_11;
		synchronized (Static98.aClass107_11) {
			Static98.aClass107_11.method3015();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method2437(@OriginalArg(0) String arg0) {
		return Static209.method5769(arg0, 16);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	public static void method2438() {
		Static53.aClass107_6.method3015();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBIII)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(8, arg3);
		local16.method1801();
		local16.anInt1719 = arg1;
		local16.anInt1723 = arg2;
		local16.anInt1729 = arg0;
	}
}

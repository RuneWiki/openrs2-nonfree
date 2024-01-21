import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1315 = Static32.method683("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1316 = Static32.method683("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1318 = Static32.method683("Loaded sprites");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1317 = aClass49_1318;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method2263() {
		aClass2_Sub2_Sub2_Sub3Array9 = null;
		aClass49_1317 = null;
		aClass49_1318 = null;
		aClass49_1315 = null;
		aClass49_1316 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILclient!i;II)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class2_Sub16 local12 = new Class2_Sub16();
		local12.anInt1776 = arg1 * 128;
		local12.anInt1784 = arg2.anInt1493;
		local12.anInt1786 = arg2.anInt1514 * 128;
		local12.anIntArray186 = arg2.anIntArray178;
		@Pc(34) int local34 = arg2.anInt1480;
		local12.anInt1777 = arg2.anInt1519;
		local12.anInt1781 = arg4 * 128;
		local12.anInt1788 = arg3;
		@Pc(49) int local49 = arg2.anInt1482;
		local12.anInt1787 = arg2.anInt1507;
		if (arg0 == 1 || arg0 == 3) {
			local49 = arg2.anInt1480;
			local34 = arg2.anInt1482;
		}
		local12.anInt1785 = (local34 + arg1) * 128;
		local12.anInt1783 = (arg4 + local49) * 128;
		if (arg2.anIntArray177 != null) {
			local12.aClass2_Sub2_Sub9_1 = arg2;
			local12.method1425();
		}
		Static132.aClass81_10.method2683(local12);
		if (local12.anIntArray186 != null) {
			local12.anInt1780 = local12.anInt1784 + (int) ((double) (local12.anInt1787 - local12.anInt1784) * Math.random());
		}
	}
}

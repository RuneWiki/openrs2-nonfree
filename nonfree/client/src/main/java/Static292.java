import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_37 = new Class83(8);

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Z")
	public static boolean aBoolean386 = true;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_71 = new Class212(8, -1);

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	public static int anInt5387 = 0;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public static int anInt5388 = 1;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!nj;)V")
	public static void method4484(@OriginalArg(1) Class71_Sub3 arg0) {
		arg0.aClass11_1 = null;
		@Pc(12) int local12 = arg0.aClass71_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass71_Sub7Array1[local14].aBoolean566 = false;
		}
		@Pc(37) Class273[] local37 = Applet_Sub1.aClass273Array2;
		synchronized (Applet_Sub1.aClass273Array2) {
			if (local12 < Applet_Sub1.aClass273Array2.length && Static86.anIntArray171[local12] < 200) {
				Applet_Sub1.aClass273Array2[local12].method6247(arg0);
				@Pc(64) int local64 = Static86.anIntArray171[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([BI)[B")
	public static byte[] method4485(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static474.method3327(arg0, 0, local14, 0, local11);
		return local14;
	}
}

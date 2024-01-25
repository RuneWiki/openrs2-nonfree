import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_141 = new Class156(105, -1);

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
	public static final int anInt7342 = Static281.method4513(1600);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)V")
	public static void method6387(@OriginalArg(1) int arg0) {
		Static545.anInt8676 = arg0;
		@Pc(7) Class168 local7 = Static101.aClass168_18;
		synchronized (Static101.aClass168_18) {
			Static101.aClass168_18.method3862();
		}
		local7 = Static62.aClass168_11;
		synchronized (Static62.aClass168_11) {
			Static62.aClass168_11.method3862();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([BB)[B")
	public static byte[] method6388(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static693.method8320(arg0, 0, local9, 0, local6);
		return local9;
	}
}

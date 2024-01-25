import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pf", name = "Fd", descriptor = "I")
	public static int anInt5016;

	@OriginalMember(owner = "client!pf", name = "Kd", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!pf", name = "Ld", descriptor = "Lclient!o;")
	public static Class13 aClass13_20;

	@OriginalMember(owner = "client!pf", name = "Md", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array17;

	@OriginalMember(owner = "client!pf", name = "Bd", descriptor = "Lclient!de;")
	public static final Class50 aClass50_22 = new Class50(0, 2, 2, 1);

	@OriginalMember(owner = "client!pf", name = "Ed", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_150 = new Class102(73, -1);

	@OriginalMember(owner = "client!pf", name = "Hd", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_113 = new Class211(66, 8);

	@OriginalMember(owner = "client!pf", name = "Id", descriptor = "J")
	public static long aLong166 = 0L;

	@OriginalMember(owner = "client!pf", name = "Jd", descriptor = "Lclient!ea;")
	public static final Class60 aClass60_3 = new Class60("RC", 1);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!dk;I)Lclient!hm;")
	public static Class2_Sub23 method4018(@OriginalArg(1) Class54 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method1110(arg1);
		return local18 == null ? null : new Class2_Sub23(local18);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	public static void method4019() {
		@Pc(1) Class132 local1 = Static459.aClass132_35;
		synchronized (Static459.aClass132_35) {
			Static459.aClass132_35.method2713(5);
		}
	}
}

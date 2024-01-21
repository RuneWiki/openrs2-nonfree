import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_313 = Static81.method1507(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_314 = Static81.method1507("; Max)2Age=");

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	public static int anInt1253 = 0;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt1254 = 0;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt1256 = 10;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!ah;")
	public static Class1_Sub2_Sub2 method908(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub2 local6 = (Class1_Sub2_Sub2) Static162.aClass86_52.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static110.aClass69_25.method2208(16, arg0);
		local6 = new Class1_Sub2_Sub2();
		if (local20 != null) {
			local6.method233(new Class1_Sub7(local20));
		}
		Static162.aClass86_52.method2821(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method909() {
		@Pc(1) Class73 local1 = Static107.aClass73_1;
		synchronized (Static107.aClass73_1) {
			Static27.anInt724++;
			Static188.anInt4176 = Static42.anInt1102;
			Static24.anInt661 = Static202.anInt4521;
			Static7.anInt174 = Static36.anInt956;
			Static170.anInt3792 = Static56.anInt1411;
			Static157.anInt3462 = Static109.anInt2507;
			Static92.anInt2141 = Static172.anInt3844;
			Static2.aLong6 = Static41.aLong41;
			Static56.anInt1411 = 0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZII)I")
	public static int method910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 256 - arg0;
		return ((arg2 & 0xFF00) * arg0 + local12 * (arg1 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * local12 + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)Z")
	public static boolean method912(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}

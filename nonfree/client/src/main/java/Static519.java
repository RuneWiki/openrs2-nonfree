import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public static int anInt9182;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "Lclient!kka;")
	public static final Class2_Sub38 aClass2_Sub38_1 = new Class2_Sub38(0, 0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
	public static void method8036() {
		@Pc(1) Class22 local1 = Static68.aClass22_7;
		synchronized (Static68.aClass22_7) {
			Static68.aClass22_7.method468(5);
		}
		local1 = Static522.aClass22_48;
		synchronized (Static522.aClass22_48) {
			Static522.aClass22_48.method468(5);
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
	public static void method8037(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(6, (long) arg0);
		local9.method2489();
	}
}

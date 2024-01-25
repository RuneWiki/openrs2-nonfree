import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!kf;")
	public static final Class194 aClass194_1 = new Class194();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public static void method1369() {
		if (Static580.aBoolean214) {
			return;
		}
		Static580.aBoolean214 = true;
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static330.aFloat102 = (int) Static330.aFloat102 - 17 & 0xFFFFFFF0;
		} else {
			Static189.aFloat90 += (-12.0F - Static189.aFloat90) / 2.0F;
		}
		Static279.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!eh;I)Lclient!oq;")
	public static Class256 method1371(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(7) String local7 = arg0.method6010();
		@Pc(14) Class297 local14 = Static192.method3526()[arg0.method6015()];
		@Pc(21) Class58 local21 = Static458.method6443()[arg0.method6015()];
		@Pc(27) int local27 = arg0.method6003();
		@Pc(33) int local33 = arg0.method6003();
		@Pc(44) int local44 = arg0.method6015();
		@Pc(48) int local48 = arg0.method6015();
		@Pc(52) int local52 = arg0.method6015();
		@Pc(56) int local56 = arg0.method5982();
		@Pc(60) int local60 = arg0.method5982();
		@Pc(64) int local64 = arg0.method6026();
		@Pc(68) int local68 = arg0.method6026();
		@Pc(74) int local74 = arg0.method6026();
		return new Class256(local7, local14, local21, local27, local33, local44, local48, local52, local56, local60, local64, local68, local74);
	}
}

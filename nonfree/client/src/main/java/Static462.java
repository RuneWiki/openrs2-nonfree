import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_84 = new Class344(7, 6);

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_12 = new Class184(0, 1);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBI)V")
	public static void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static455.aClass4_Sub35_Sub1_1.anInt9926 >> 8;
		if (local6 == 0 || arg0 == -1) {
			return;
		}
		if (!Static421.aBoolean581 && Static269.anInt5657 != -1 && Static578.method8124()) {
			Static565.aClass4_Sub21_Sub4_5 = Static224.method3626();
			@Pc(35) Class4_Sub21_Sub4 local35 = Static38.method1064(Static565.aClass4_Sub21_Sub4_5);
			Static325.method5023(local35);
		}
		Static586.method8188(arg0, Static84.aClass348_28, local6);
		Static328.method5066(255, -1);
		Static421.aBoolean581 = true;
	}
}

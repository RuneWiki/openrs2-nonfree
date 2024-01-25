import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_20 = new Class70(20, 8);

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Lclient!gm;")
	public static final Class125 aClass125_5 = new Class125();

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Lclient!lt;")
	public static Class1_Sub32 method1740() {
		if (Static226.aClass353_46 == null || Static119.aClass220_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub32 local16 = (Class1_Sub32) Static119.aClass220_1.method4410(); local16 != null; local16 = (Class1_Sub32) Static119.aClass220_1.method4410()) {
			@Pc(24) Class310 local24 = Static226.aClass273_2.method5840(local16.anInt5300);
			if (local24 != null && local24.aBoolean620 && local24.method6534(Static226.anInterface16_2)) {
				return local16;
			}
		}
		return null;
	}
}

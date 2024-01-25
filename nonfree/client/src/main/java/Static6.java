import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	public static int anInt215;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!di;")
	public static final Class54 aClass54_6 = new Class54(14, 6);

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)Lclient!hq;")
	public static Class2_Sub18 method193() {
		if (Static88.aClass14_34 == null || Static93.aClass249_1 == null) {
			return null;
		}
		for (@Pc(24) Class2_Sub18 local24 = (Class2_Sub18) Static93.aClass249_1.method5444(); local24 != null; local24 = (Class2_Sub18) Static93.aClass249_1.method5444()) {
			@Pc(32) Class48 local32 = Static88.aClass215_3.method4741(local24.anInt3142);
			if (local32 != null && local32.aBoolean68 && local32.method932(Static88.anInterface12_2)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)I")
	public static int method194() {
		return 16;
	}
}

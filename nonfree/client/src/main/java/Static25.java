import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt589 = 0;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public static final int anInt591 = 2;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "F")
	public static float aFloat12 = 0.25F;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method500() {
		Static66.anInt134 = -1;
		Static220.anInt4265 = -1;
		Static393.anInt6568 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lclient!hq;")
	public static Class2_Sub18 method503() {
		if (Static88.aClass14_34 == null || Static93.aClass249_1 == null) {
			return null;
		}
		Static93.aClass249_1.method5440(Static88.aClass14_34);
		@Pc(23) Class2_Sub18 local23 = (Class2_Sub18) Static93.aClass249_1.method5441();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class48 local33 = Static88.aClass215_3.method4741(local23.anInt3142);
			return local33 != null && local33.aBoolean68 && local33.method932(Static88.anInterface12_2) ? local23 : Static6.method193();
		}
	}
}

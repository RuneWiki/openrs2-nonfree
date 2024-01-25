import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!bq;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Lclient!vv;")
	public static final Class376 aClass376_9 = new Class376();

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_117 = new Class100(4, 5);

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public static int anInt9334 = -1;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public static int anInt9335 = -1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	public static void method7713() {
		Static494.anInt8821 = 1;
		Static652.anInt10896 = -1;
		@Pc(9) String local9 = null;
		if (Static436.aByteArray90 != null) {
			@Pc(16) Class14_Sub29 local16 = new Class14_Sub29(Static436.aByteArray90);
			local9 = Static627.method8803(local16.method5907());
			Static133.aLong67 = local16.method5907();
		}
		if (local9 == null) {
			Static5.method6556(35);
		} else {
			Static2.method22(false, true, "", local9);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	public static int anInt8633;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_17 = new Class219(2, 4, 4, 0);

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "J")
	public static long aLong213 = -1L;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!tea;")
	public static final Class308 aClass308_6 = new Class308(128);

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!ffa;")
	public static final Class100 aClass100_10 = new Class100();

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLclient!tca;)V")
	public static void method7067(@OriginalArg(1) Class3_Sub45 arg0) {
		if (Static580.aClass125ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface22 local8 = null;
		if (arg0.anInt9268 == 0) {
			local8 = (Interface22) Static496.method7511(arg0.anInt9265, arg0.anInt9258, arg0.anInt9267);
		}
		if (arg0.anInt9268 == 1) {
			local8 = (Interface22) Static563.method8123(arg0.anInt9265, arg0.anInt9258, arg0.anInt9267);
		}
		if (arg0.anInt9268 == 2) {
			local8 = (Interface22) Static200.method3364(arg0.anInt9265, arg0.anInt9258, arg0.anInt9267, ut.class);
		}
		if (arg0.anInt9268 == 3) {
			local8 = (Interface22) Static86.method1922(arg0.anInt9265, arg0.anInt9258, arg0.anInt9267);
		}
		if (local8 == null) {
			arg0.anInt9261 = 0;
			arg0.anInt9264 = 0;
			arg0.anInt9257 = -1;
		} else {
			arg0.anInt9257 = local8.method8398();
			arg0.anInt9264 = local8.method8399();
			arg0.anInt9261 = local8.method8402();
		}
	}
}

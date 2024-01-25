import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
	public static int anInt5011;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_88 = new Class15("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public static int anInt5006 = 0;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	public static int anInt5008 = 0;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "S")
	public static short aShort70 = 1;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_191 = new Class56(30, 18);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Lclient!dt;")
	public static Class4_Sub12 method4001() {
		if (Static292.aClass244_35 == null || Static103.aClass208_1 == null) {
			return null;
		}
		Static103.aClass208_1.method4286(Static292.aClass244_35);
		@Pc(23) Class4_Sub12 local23 = (Class4_Sub12) Static103.aClass208_1.method4290();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class100 local33 = Static292.aClass235_4.method4957(local23.anInt1566);
			return local33 != null && local33.aBoolean162 && local33.method1962(Static292.anInterface12_2) ? local23 : Static181.method2528();
		}
	}
}

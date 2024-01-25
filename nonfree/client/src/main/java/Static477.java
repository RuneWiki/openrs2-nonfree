import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public static int anInt8703 = -1;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_256 = new Class88("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public static int anInt8709 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Lclient!ui;")
	public static Class89 method7162() {
		try {
			return new Class89_Sub3();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class89_Sub2();
			}
		}
	}
}

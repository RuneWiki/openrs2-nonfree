import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_405 = Static13.method257(" million @whi@(X");

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_406 = Static13.method257("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lclient!o;")
	public static Class40 aClass40_407 = Static13.method257("@gr1@");

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
	public static int anInt1430 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "Lclient!o;")
	public static Class40 aClass40_408 = Static13.method257("To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W");

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_409 = Static13.method257(")2");

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!qc;")
	public static Class47 aClass47_13 = new Class47(64);

	@OriginalMember(owner = "client!kd", name = "Qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_410 = Static13.method257("Unable to connect)3");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method940() {
		aClass47_13 = null;
		aClass40_407 = null;
		aClass40_408 = null;
		anIntArray298 = null;
		anIntArray299 = null;
		aClass40_410 = null;
		aClass40_409 = null;
		aClass40_405 = null;
		aClass40_406 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ud;Lclient!o;Lclient!o;Z)Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 method941(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(13) int local13 = arg0.method80(arg2);
		@Pc(19) int local19 = arg0.method72(arg1, local13);
		return Static13.method260(local13, arg0, local19);
	}
}

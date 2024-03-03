import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class22 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public static int anInt643 = -1;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[S")
	public static final short[] aShortArray4 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	public static final int[] anIntArray33 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9 = "";

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!bi;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!hb;")
	public Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 4)
	public void method857() {
		if (Class155_Sub1.anInt3939 >= 500) {
			return;
		}
		this.anInt645 = 0;
		this.aClass22_1 = Static267.aClass22_3;
		this.aClass11_Sub5_1 = null;
		Static267.aClass22_3 = this;
		Class155_Sub1.anInt3939++;
	}
}

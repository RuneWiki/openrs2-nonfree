import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_43 = Static12.method257("@red@Offline");

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "J")
	public static long aLong12 = 0L;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!od;")
	public static Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_44 = Static12.method257("Mem:");

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	public static int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_45 = Static12.method257("@whi@ )4 ");

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_46 = Static12.method257("Hide");

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_47 = Static12.method257("Loading fonts )2 ");

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lclient!qc;")
	public static Class47 aClass47_3 = new Class47(64);

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	public static int[] anIntArray37 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!eb;I)V", line = 121)
	private void method119(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt174 = arg0.method1704();
			this.anInt171 = arg0.method1708();
			this.anInt170 = arg0.method1708();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!eb;B)V", line = 159)
	public void method121(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1708();
			if (local9 == 0) {
				return;
			}
			this.method119(arg0, local9);
		}
	}
}

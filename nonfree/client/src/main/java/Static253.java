import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!gj;")
	public static Class31 aClass31_141;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public static int anInt6903;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!tq;")
	public static Class191 aClass191_222;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public static int anInt6899 = 0;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_210 = new Class119(64);

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray190 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method5944() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static200.aBooleanArray29[local12] = true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!dg;I)Lclient!md;")
	public static Class79_Sub2 method5946(@OriginalArg(0) Class2_Sub10 arg0) {
		return new Class79_Sub2(arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4463(), arg0.method4463(), arg0.method4421());
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!j;B)V")
	public static void method5947(@OriginalArg(0) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub12_5 != null) {
			arg0.aClass2_Sub12_5.anInt6728 = 0;
		}
		arg0.aBoolean442 = false;
		for (@Pc(22) Class2_Sub3 local22 = arg0.method4475(); local22 != null; local22 = arg0.method4476()) {
			method5947(local22);
		}
	}
}

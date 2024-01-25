import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
	public static int anInt4087;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public static int anInt4069 = 0;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public static int anInt4070 = -1;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!hd;")
	public static Class110 aClass110_11 = null;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[Lclient!db;")
	public static Class46[] aClass46Array1 = new Class46[50];

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_67 = new Class15("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
	public static int anInt4084 = 1;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZB)V")
	public static void method3241(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static52.anInt826--;
			if (Static52.anInt826 == 0) {
				Static365.anIntArray475 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static206.anInt4095--;
		if (Static206.anInt4095 == 0) {
			Static212.anIntArray274 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public static void method3244() {
		for (@Pc(15) Class4_Sub2_Sub9 local15 = (Class4_Sub2_Sub9) Static295.aClass244_25.method5263(); local15 != null; local15 = (Class4_Sub2_Sub9) Static295.aClass244_25.method5271()) {
			@Pc(20) Class8_Sub3_Sub4 local20 = local15.aClass8_Sub3_Sub4_1;
			if (local20.aBoolean381) {
				local15.method6059();
				local20.method4346();
			} else if (local20.anInt5348 <= Static265.anInt4371) {
				local20.method4347(Static298.anInt4895);
				if (local20.aBoolean381) {
					local15.method6059();
				} else {
					Static160.method3989(local20, true);
				}
			}
		}
	}
}

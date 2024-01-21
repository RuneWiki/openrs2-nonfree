import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "Lclient!u;")
	public static Class76 aClass76_133;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_28 = new Class25(50);

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1539 = Static49.method1293("Passwort: ");

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1540 = Static49.method1293("Sprites geladen)3");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array23 = new Class70[500];

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
	public static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt4470 = 127;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
	public static int method3424(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg0 >> 2 << 10);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lclient!rf;Z)[Lclient!rf;")
	public static Class70[] method3425(@OriginalArg(0) Class70[] arg0) {
		@Pc(4) Class70[] local4 = new Class70[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static160.method3210(new Class70[] { Static34.method873(local6), Static156.aClass70_1381 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static160.method3210(new Class70[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method3427() {
		aClass70_1539 = null;
		aClass70_1540 = null;
		aClass76_133 = null;
		aClass25_28 = null;
		aClass70Array23 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
	public static boolean method3429() {
		return Static160.anInt4192 == 0 ? Static45.aClass1_Sub8_Sub2_1.method2140() : true;
	}
}

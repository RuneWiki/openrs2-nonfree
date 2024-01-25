import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_122 = new Class254(30, -1);

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
	public static void method5693() {
		Static360.aClass78_1.method6582();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static179.aLongArray4[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static111.aLongArray1[local27] = 0L;
		}
		Static194.anInt4228 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	public static void method5695(@OriginalArg(0) int arg0) {
		Static427.anInt9633 = -1;
		if (arg0 == 37) {
			Static461.aFloat4 = 3.0F;
		} else if (arg0 == 50) {
			Static461.aFloat4 = 4.0F;
		} else if (arg0 == 75) {
			Static461.aFloat4 = 6.0F;
		} else if (arg0 == 100) {
			Static461.aFloat4 = 8.0F;
		} else if (arg0 == 200) {
			Static461.aFloat4 = 16.0F;
		}
		Static427.anInt9633 = -1;
	}
}

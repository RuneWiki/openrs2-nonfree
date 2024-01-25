import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public static int anInt3663 = 0;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt3664 = -1;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public static int anInt3665 = -1;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "[I")
	public static final int[] anIntArray316 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!r;BLclient!vg;)V")
	public static void method2982(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class341 arg1) {
		@Pc(37) boolean local37 = Static175.aClass114_4.method2216(arg1.anInt9318 | 0xFF000000, arg1.anInt9277, arg1.anInt9324, arg1.anInt9260, arg1.anInt9328, arg0, arg1.aBoolean715 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null) == null;
		if (local37) {
			Static86.aClass353_10.method7679(new Class1_Sub4(arg1.anInt9328, arg1.anInt9324, arg1.anInt9260, arg1.anInt9318 | 0xFF000000, arg1.anInt9277, arg1.aBoolean715));
			Static442.method6111(arg1);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
	public static void method2987(@OriginalArg(0) int arg0) {
		Static134.anInt2584 = -1;
		if (arg0 == 37) {
			Static226.aFloat136 = 3.0F;
		} else if (arg0 == 50) {
			Static226.aFloat136 = 4.0F;
		} else if (arg0 == 75) {
			Static226.aFloat136 = 6.0F;
		} else if (arg0 == 100) {
			Static226.aFloat136 = 8.0F;
		} else if (arg0 == 200) {
			Static226.aFloat136 = 16.0F;
		}
		Static134.anInt2584 = -1;
	}
}

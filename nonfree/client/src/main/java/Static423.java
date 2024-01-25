import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array15;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_151 = new Class253(45, -1);

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_47 = new Class85();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method5440() {
		Static390.anIntArray620 = null;
		Static69.anIntArray101 = null;
		Static294.anIntArray435 = null;
		Static360.anIntArray530 = null;
		Static77.aBoolean90 = false;
		Static7.anIntArray4 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method5442() {
		@Pc(7) int local7 = Static36.anInt647;
		@Pc(9) int[] local9 = Static362.anIntArray533;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class26_Sub2_Sub4_Sub2 local23 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9[local15]];
			if (local23 != null) {
				Static292.method3870(local23, local23.method5512());
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "S")
	public static short aShort57;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!nca;")
	public static Class254 aClass254_87;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILclient!oh;I)V")
	public static void method3713(@OriginalArg(1) int arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class114 local8 = arg1.method6608(Static396.aClass145_6);
		if (local8 == null) {
			return;
		}
		Static396.aClass145_6.KA(arg2, arg0, arg2 + arg1.anInt7402, arg1.anInt7385 + arg0);
		if (Static238.anInt3745 < 3) {
			Static712.aClass43_33.method9596((float) arg2 + (float) arg1.anInt7402 / 2.0F, (float) arg1.anInt7385 / 2.0F + (float) arg0, ((int) -Static213.aFloat46 & 0x3FFF) << 2, local8.aClass1_1, arg2, arg0);
		} else {
			Static396.aClass145_6.A(-16777216, local8.aClass1_1, arg2, arg0);
		}
	}
}

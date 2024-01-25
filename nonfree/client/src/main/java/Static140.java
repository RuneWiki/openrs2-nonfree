import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Lclient!oh;")
	public static Class237 aClass237_41;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_23 = new Class43();

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
	public static int anInt3588 = -1;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZII)I")
	public static int method2958(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub18 local16 = Static211.method4038(false, arg0);
		if (local16 == null) {
			return Static446.aClass92_3.method2947(arg0).anInt8340;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local16.anIntArray153.length; local28++) {
			if (local16.anIntArray153[local28] == -1) {
				local26++;
			}
		}
		return local26 + Static446.aClass92_3.method2947(arg0).anInt8340 - local16.anIntArray153.length;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	public static void method2960() {
		@Pc(10) int local10 = Static155.aClass8_Sub25_6.aClass36_Sub3_2.method2233();
		if (local10 == 0) {
			Static28.aByteArrayArrayArray7 = null;
			Static626.method8436(0);
		} else if (local10 == 1) {
			Static408.method6464((byte) 0);
			Static626.method8436(512);
			if (Static118.aByteArrayArrayArray20 != null) {
				Static589.method8152();
			}
		} else {
			Static408.method6464((byte) (Static609.anInt9845 - 4 & 0xFF));
			Static626.method8436(2);
		}
		Static268.anInt5697 = Static128.anInt3428;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIII)V")
	public static void method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static251.anInt9634 && arg4 <= Static366.anInt6946 && Static444.anInt8258 <= arg3 && Static188.anInt4410 >= arg0) {
			Static85.method6995(arg1, arg3, arg2, arg0, arg4);
		} else {
			Static435.method6731(arg4, arg0, arg2, arg3, arg1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
	public static final int anInt731 = 1400;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "(II)V")
	public static void method753(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub25 local10 = (Class5_Sub25) Static587.aClass81_67.method1599((long) arg0);
		if (local10 != null) {
			local10.aClass103_Sub1_1.method6158();
			Static106.method1544(local10.anInt4568, local10.aBoolean371);
			local10.method8911();
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method754(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static134.method1999(local18, arg1);
		} else if (arg0 instanceof Class225) {
			@Pc(30) Class225 local30 = (Class225) arg0;
			return local30.method8139(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)V")
	public static void method757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static27.anInt517 = arg1;
		Static554.anInt9157 = arg0;
		if (Static453.anInt7627 == 0) {
			Static444.anInt7482 = Static262.anInt4378 * 2 + Static554.anInt9157;
			Static134.anInt2214 = Static27.anInt517 + Static503.anInt3942 * 2;
		} else if (Static453.anInt7627 == 1) {
			Static180.anInt3253 = Static27.anInt531 + Static554.anInt9157 / Static549.anInt9105 + 2;
			Static116.anInt1804 = Static27.anInt517 / Static133.anInt3875 + Static145.anInt6903 + 2;
			Static134.anInt2214 = Static116.anInt1804 * Static133.anInt3875;
			Static444.anInt7482 = Static549.anInt9105 * Static180.anInt3253;
			Static503.anInt3942 = Static134.anInt2214 - Static27.anInt517 >> 1;
			Static262.anInt4378 = Static444.anInt7482 - Static554.anInt9157 >> 1;
		} else if (Static453.anInt7627 == 2) {
			Static134.anInt2214 = Static27.anInt517;
			Static444.anInt7482 = Static554.anInt9157;
		}
	}
}

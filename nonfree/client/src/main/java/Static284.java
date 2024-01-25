import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
	public static int anInt4912;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt4919;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	public static int anInt4923;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public static int anInt4920 = -1;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "[I")
	public static final int[] anIntArray971 = new int[50];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!vc;J)V")
	public static void method4322(@OriginalArg(1) Class63 arg0, @OriginalArg(2) long arg1) {
		Static113.anInt2419 = Static92.anInt1738;
		Static47.anInt960 = 0;
		Static92.anInt1738 = 0;
		@Pc(14) long local14 = Static39.method699();
		for (@Pc(24) Class10_Sub1 local24 = (Class10_Sub1) Static71.aClass154_2.method3479(); local24 != null; local24 = (Class10_Sub1) Static71.aClass154_2.method3483()) {
			if (local24.method231(arg0, arg1)) {
				Static47.anInt960++;
			}
		}
		if (Static222.aBoolean300 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static71.aClass154_2.method3487() + ", running: " + Static47.anInt960 + ". Particles: " + Static92.anInt1738 + ". Time taken: " + (Static39.method699() - local14) + "ms");
		}
	}
}

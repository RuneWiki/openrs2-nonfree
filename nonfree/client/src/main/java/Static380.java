import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sn", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_102 = new Class242(13, 5);

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "S")
	public static short aShort93 = 32767;

	@OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
	public static final int anInt6112 = 1400;

	@OriginalMember(owner = "client!sn", name = "R", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)V")
	public static void method4903() {
		Static424.aClass117_11.JA(Static428.aFloat84 * ((float) Static126.aClass19_Sub1_1.anInt4238 * 0.1F + 0.7F));
		Static424.aClass117_11.B(Static65.anInt1010, Static293.aFloat69, Static165.aFloat29, (float) (Static205.anInt3788 << 0), (float) (Static128.anInt1965 << 0), (float) (Static217.anInt1119 << 0));
		Static424.aClass117_11.method5661(Static43.aClass59_49);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V")
	public static void method4904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static241.method3467(arg2, Static142.anInt2163, Static182.anInt3402);
		@Pc(21) int local21 = Static241.method3467(arg4, Static142.anInt2163, Static182.anInt3402);
		@Pc(27) int local27 = Static241.method3467(arg0, Static281.anInt4757, Static457.anInt7264);
		@Pc(33) int local33 = Static241.method3467(arg1, Static281.anInt4757, Static457.anInt7264);
		for (@Pc(35) int local35 = local15; local35 <= local21; local35++) {
			Static298.method3977(local27, arg3, local33, Static194.anIntArrayArray28[local35]);
		}
	}
}

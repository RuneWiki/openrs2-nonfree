import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "[Lclient!mg;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
	public static int anInt123 = -1;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "Lclient!mi;")
	public static final Class1_Sub29 aClass1_Sub29_1 = new Class1_Sub29(0, 0);

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
	public static int anInt125 = -2;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "[I")
	public static final int[] anIntArray6 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	public static int anInt126 = 0;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_2 = new Class217(76, 10);

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "[Lclient!jg;")
	public static final Class102[] aClass102Array1 = new Class102[16];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)V")
	public static void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class32_Sub1 local15 = (Class32_Sub1) Static299.aClass195_8.method5302(); local15 != null; local15 = (Class32_Sub1) Static299.aClass195_8.method5298()) {
			if (Static51.anInt1301 >= local15.anInt1264) {
				local15.method5725();
			} else {
				Static42.method981((local15.anInt1272 << 7) + 64, (local15.anInt1269 << 7) - -64, local15.anInt1267 * 2, local15.anInt1274, arg2 >> 1, arg3 >> 1);
				Static340.aClass33_3.method6036(local15.anInt1266 | 0xFF000000, Static168.anIntArray261[1] + arg1, local15.aString7, 0, Static168.anIntArray261[0] + arg0);
			}
		}
	}
}

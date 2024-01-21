import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "[Lclient!hh;")
	public static Class42[] aClass42Array3;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_6;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_454 = Static151.method2243("mapdots");

	@OriginalMember(owner = "client!ge", name = "X", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_457 = Static151.method2243("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!mb;")
	public static Class62 aClass62_455 = aClass62_457;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
	public static final int[] anIntArray108 = new int[128];

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_456 = Static151.method2243("::gc");

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
	public static int anInt1369 = 0;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)I")
	public static int method899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)[Lclient!hh;")
	public static Class42[] method900() {
		@Pc(13) Class42[] local13 = new Class42[Static208.anInt4345];
		for (@Pc(15) int local15 = 0; local15 < Static208.anInt4345; local15++) {
			local13[local15] = new Class42_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[local15], Static25.anIntArray57[local15], Static86.anIntArray298[local15], Static138.anIntArray256[local15], Static8.aByteArrayArray1[local15], Static108.anIntArray222);
		}
		Static169.method2456();
		return local13;
	}
}

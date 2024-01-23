import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public static int anInt1591;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!vb;")
	public static Class120 aClass120_8 = new Class120();

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!sc;")
	private static Class107 aClass107_456 = Static231.method3737("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!sc;")
	public static Class107 aClass107_453 = aClass107_456;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!sc;")
	private static Class107 aClass107_458 = Static231.method3737("yellow:");

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_454 = aClass107_458;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_455 = Static231.method3737("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	public static int anInt1592 = 10;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!sc;")
	public static Class107 aClass107_457 = aClass107_458;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!sc;")
	public static Class107 aClass107_459 = Static231.method3737("underlay");

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "Lclient!sc;")
	public static Class107 aClass107_460 = Static231.method3737(")2");

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "[I")
	public static int[] anIntArray149 = new int[32];

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method1250() {
		if (Static88.anInt1924 < 128) {
			Static88.anInt1924 = 128;
		}
		if (Static88.anInt1924 > 383) {
			Static88.anInt1924 = 383;
		}
		Static79.anInt1741 &= 0x7FF;
		@Pc(23) int local23 = Static21.anInt411 >> 7;
		@Pc(27) int local27 = Static77.anInt1730 >> 7;
		@Pc(29) int local29 = 0;
		@Pc(35) int local35 = Static130.method2174(Static191.anInt4237, Static77.anInt1730, Static21.anInt411);
		@Pc(53) int local53;
		if (local23 > 3 && local27 > 3 && local23 < 100 && local27 < 100) {
			for (local53 = local23 - 4; local53 <= local23 + 4; local53++) {
				for (@Pc(59) int local59 = local27 - 4; local59 <= local27 + 4; local59++) {
					@Pc(63) int local63 = Static191.anInt4237;
					if (local63 < 3 && (Static221.aByteArrayArrayArray14[1][local53][local59] & 0x2) == 2) {
						local63++;
					}
					@Pc(93) int local93 = local35 - Static166.anIntArrayArrayArray11[local63][local53][local59];
					if (local29 < local93) {
						local29 = local93;
					}
				}
			}
		}
		local53 = local29 * 192;
		if (local53 > 98048) {
			local53 = 98048;
		}
		if (local53 < 32768) {
			local53 = 32768;
		}
		if (Static42.anInt940 < local53) {
			Static42.anInt940 += (local53 - Static42.anInt940) / 24;
		} else if (Static42.anInt940 > local53) {
			Static42.anInt940 += (local53 - Static42.anInt940) / 80;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public static void method1251() {
		for (@Pc(3) int local3 = 0; local3 < Static189.anInt4167; local3++) {
			@Pc(9) int local9 = Static12.anIntArray35[local3];
			@Pc(13) Class5_Sub5_Sub1 local13 = Static198.aClass5_Sub5_Sub1Array1[local9];
			@Pc(17) int local17 = Static194.aClass1_Sub26_Sub1_3.method2945();
			if ((local17 & 0x80) != 0) {
				local17 += Static194.aClass1_Sub26_Sub1_3.method2945() << 8;
			}
			Static177.method2802(local17, local13, local9);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[I)[I")
	public static int[] method1252(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static236.method299(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}

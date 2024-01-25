import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "[Lclient!cp;")
	public static Class48_Sub1[] aClass48_Sub1Array3;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	public static int anInt868;

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
	public static int anInt883;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
	private static int anInt887;

	@OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
	private static int anInt888;

	@OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public static final int anInt850 = 52;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
	public static int anInt866 = -1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method721(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 11);
		local8.method28();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method723(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + Static359.method5126(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
	public static void method727() {
		Static353.aClass51_25.method921();
		Static22.aClass51_2.method921();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BII)V")
	public static void method733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub1 local15 = Static190.method3007(arg1, 6);
		local15.method32();
		local15.anInt35 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "providesignlink", descriptor = "(Lclient!ci;)V")
	private static void method737(@OriginalArg(0) Class42 arg0) {
		Static403.aClass42_6 = arg0;
		Static171.aClass42_4 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "Lclient!lc;")
	public static Class40 aClass40_52;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "Z")
	public static boolean aBoolean68;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
	public static int anInt1809;

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
	public static int anInt1810;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_643 = Static121.method2047("gr-Un:");

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_652 = Static121.method2047("Unable to connect)3");

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "Lclient!qc;")
	public static Class60 aClass60_644 = aClass60_652;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "Lclient!qc;")
	private static Class60 aClass60_645 = Static121.method2047("yellow:");

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_651 = Static121.method2047("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Lclient!qc;")
	public static Class60 aClass60_646 = aClass60_651;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_647 = aClass60_652;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "Lclient!qc;")
	public static Class60 aClass60_648 = aClass60_645;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "Lclient!qc;")
	public static Class60 aClass60_649 = aClass60_645;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_650 = Static121.method2047("<)4col>");

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "Lclient!mf;")
	public static Class48 aClass48_41 = new Class48(64);

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "[I")
	public static int[] anIntArray184 = new int[5];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	public static int method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			arg0--;
			local15 = local15 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method1357() {
		aClass4_Sub4_Sub3_Sub2Array5 = null;
		aClass60_648 = null;
		aClass60_649 = null;
		aClass48_41 = null;
		aClass60_650 = null;
		aClass60_643 = null;
		aClass40_52 = null;
		aClass60_652 = null;
		aClass60_645 = null;
		aClass60_647 = null;
		aClass60_646 = null;
		aClass60_644 = null;
		anIntArray184 = null;
		aClass60_651 = null;
	}
}

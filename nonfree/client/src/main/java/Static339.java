import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static339 {

	@OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
	public static int anInt6337;

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
	public static int anInt6343;

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_92 = new Class186(79, -1);

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "[I")
	public static final int[] anIntArray471 = new int[4096];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)Z")
	public static boolean method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI)I")
	public static int method5499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static528.anIntArray772[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public static void method5500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static444.method6416(Static323.aClass186_90);
		Static192.aClass1_Sub13_Sub2_1.method3064(arg1);
		Static192.aClass1_Sub13_Sub2_1.method3028(arg0);
	}
}

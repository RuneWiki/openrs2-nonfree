import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
	public static int anInt7642;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
	public static int anInt7637 = 104;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIB)Z")
	public static boolean method6753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z[S)[S")
	public static short[] method6754(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static652.method4547(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(II)V")
	public static void method6756(@OriginalArg(0) int arg0) {
		Static181.anInt3236 = -1;
		Static235.anInt4321 = arg0;
		Static181.anInt3236 = -1;
		Static494.method7232();
	}
}

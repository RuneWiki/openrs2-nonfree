import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class64 {

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
	public static int[] anIntArray340 = new int[32];

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public int anInt2628;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt2636;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public int anInt2642;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	public int anInt2648;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
	public int anInt2650;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[B")
	public final byte[] aByteArray19 = new byte[18002];

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public int anInt2629 = 0;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[Z")
	public final boolean[] aBooleanArray12 = new boolean[256];

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[B")
	public final byte[] aByteArray24 = new byte[256];

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "[B")
	public final byte[] aByteArray22 = new byte[4096];

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "[B")
	public final byte[] aByteArray20 = new byte[18002];

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt2637 = 0;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "[I")
	public final int[] anIntArray336 = new int[256];

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "[I")
	public final int[] anIntArray337 = new int[16];

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "[[I")
	public final int[][] anIntArrayArray24 = new int[6][258];

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "[[B")
	public final byte[][] aByteArrayArray11 = new byte[6][258];

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "[I")
	public final int[] anIntArray338 = new int[6];

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "[[I")
	public final int[][] anIntArrayArray26 = new int[6][258];

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "[Z")
	public final boolean[] aBooleanArray13 = new boolean[16];

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "[I")
	public final int[] anIntArray339 = new int[257];

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "[[I")
	public final int[][] anIntArrayArray25 = new int[6][258];

	static {
		@Pc(36) int local36 = 2;
		for (@Pc(38) int local38 = 0; local38 < 32; local38++) {
			anIntArray340[local38] = local36 - 1;
			local36 += local36;
		}
	}
}

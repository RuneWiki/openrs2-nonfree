import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class61 {

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	public static int[] anIntArray518 = new int[32];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public int anInt2402;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public int anInt2405;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public int anInt2407;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt2421;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[Z")
	public final boolean[] aBooleanArray38 = new boolean[16];

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
	public final int[] anIntArray520 = new int[6];

	@OriginalMember(owner = "client!va", name = "B", descriptor = "[Z")
	public final boolean[] aBooleanArray39 = new boolean[256];

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[B")
	public final byte[] aByteArray20 = new byte[18002];

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[B")
	public final byte[] aByteArray18 = new byte[18002];

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public int anInt2408 = 0;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "[I")
	public final int[] anIntArray521 = new int[16];

	@OriginalMember(owner = "client!va", name = "n", descriptor = "[B")
	public final byte[] aByteArray19 = new byte[256];

	@OriginalMember(owner = "client!va", name = "D", descriptor = "[[B")
	public final byte[][] aByteArrayArray11 = new byte[6][258];

	@OriginalMember(owner = "client!va", name = "O", descriptor = "[[I")
	public final int[][] anIntArrayArray25 = new int[6][258];

	@OriginalMember(owner = "client!va", name = "I", descriptor = "[B")
	public final byte[] aByteArray22 = new byte[4096];

	@OriginalMember(owner = "client!va", name = "R", descriptor = "[[I")
	public final int[][] anIntArrayArray26 = new int[6][258];

	@OriginalMember(owner = "client!va", name = "T", descriptor = "I")
	public int anInt2420 = 0;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "[I")
	public final int[] anIntArray522 = new int[256];

	@OriginalMember(owner = "client!va", name = "N", descriptor = "[[I")
	public final int[][] anIntArrayArray24 = new int[6][258];

	@OriginalMember(owner = "client!va", name = "U", descriptor = "[I")
	public final int[] anIntArray523 = new int[257];

	static {
		@Pc(47) int local47 = 2;
		for (@Pc(49) int local49 = 0; local49 < 32; local49++) {
			anIntArray518[local49] = local47 - 1;
			local47 += local47;
		}
	}
}

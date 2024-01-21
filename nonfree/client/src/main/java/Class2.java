import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "[I")
	public static int[] anIntArray7 = new int[32];

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public int anInt17;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public int anInt20;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[[I")
	public final int[][] anIntArrayArray1 = new int[6][258];

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	public int anInt28 = 0;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[B")
	public final byte[] aByteArray1 = new byte[256];

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "[I")
	public final int[] anIntArray4 = new int[256];

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
	public final byte[] aByteArray5 = new byte[4096];

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "[I")
	public final int[] anIntArray5 = new int[16];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[B")
	public final byte[] aByteArray2 = new byte[18002];

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray2 = new int[6][258];

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[Z")
	public final boolean[] aBooleanArray1 = new boolean[16];

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "[I")
	public final int[] anIntArray3 = new int[6];

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "[[B")
	public final byte[][] aByteArrayArray1 = new byte[6][258];

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "[B")
	public final byte[] aByteArray6 = new byte[18002];

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "[[I")
	public final int[][] anIntArrayArray3 = new int[6][258];

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	public int anInt32 = 0;

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "[I")
	public final int[] anIntArray6 = new int[257];

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "[Z")
	public final boolean[] aBooleanArray2 = new boolean[256];

	static {
		@Pc(38) int local38 = 2;
		for (@Pc(40) int local40 = 0; local40 < 32; local40++) {
			anIntArray7[local40] = local38 - 1;
			local38 += local38;
		}
	}
}

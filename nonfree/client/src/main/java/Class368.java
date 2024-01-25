import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class368 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[C")
	private static final char[] aCharArray15 = new char[64];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public int anInt10239;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public int anInt10240;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public int anInt10242;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public int anInt10243;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public int anInt10244;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public int anInt10245;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public int anInt10246;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public int anInt10247;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public int anInt10248;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[B")
	public byte[] aByteArray115;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public int anInt10249;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public int anInt10250;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt10253;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public int anInt10254;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "[B")
	public byte[] aByteArray118;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	public final int[] anIntArray618 = new int[6];

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[[B")
	public final byte[][] aByteArrayArray170 = new byte[6][258];

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[B")
	public final byte[] aByteArray114 = new byte[256];

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt10251 = 0;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray58 = new int[6][258];

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "[I")
	public final int[] anIntArray620 = new int[16];

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[[I")
	public final int[][] anIntArrayArray57 = new int[6][258];

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "[B")
	public final byte[] aByteArray116 = new byte[18002];

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[I")
	public final int[] anIntArray621 = new int[256];

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray55 = new boolean[256];

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "[B")
	public final byte[] aByteArray117 = new byte[4096];

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
	public final int[] anIntArray619 = new int[257];

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[Z")
	public final boolean[] aBooleanArray56 = new boolean[16];

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "[[I")
	public final int[][] anIntArrayArray59 = new int[6][258];

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt10252 = 0;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[B")
	public final byte[] aByteArray119 = new byte[18002];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray15[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray15[local20] = (char) (local20 + 71);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray15[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray15[62] = '+';
		aCharArray15[63] = '/';
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class56 {

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[I")
	public static int[] anIntArray119 = new int[4096];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public int anInt1450;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	public int anInt1453;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	public int anInt1457;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public int anInt1458;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
	public int anInt1461;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[B")
	public byte[] aByteArray12 = new byte[256];

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public int anInt1454 = 0;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "[B")
	public byte[] aByteArray11 = new byte[4096];

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray13 = new boolean[16];

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[I")
	public int[] anIntArray118 = new int[6];

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray4 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray5 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt1448 = 0;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[B")
	public byte[] aByteArray13 = new byte[18002];

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray6 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "[[B")
	public byte[][] aByteArrayArray5 = new byte[6][258];

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[Z")
	public boolean[] aBooleanArray14 = new boolean[256];

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "[B")
	public byte[] aByteArray15 = new byte[18002];

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "[I")
	public int[] anIntArray120 = new int[257];

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
	public int[] anIntArray117 = new int[256];

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "[I")
	public int[] anIntArray121 = new int[16];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray119[local8] = Static61.method1027(local8);
		}
	}
}

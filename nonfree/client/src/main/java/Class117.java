import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class117 {

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[16384];

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[16384];

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public int anInt3190;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public int anInt3191;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public int anInt3192;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	public int anInt3195;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public int anInt3197;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	public int anInt3198;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
	public int anInt3199;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	public int anInt3202;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	public int anInt3203;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	public int anInt3204;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[Z")
	public final boolean[] aBooleanArray11 = new boolean[256];

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[I")
	public final int[] anIntArray160 = new int[6];

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[Z")
	public final boolean[] aBooleanArray12 = new boolean[16];

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public int anInt3200 = 0;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[I")
	public final int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[[I")
	public final int[][] anIntArrayArray20 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public int anInt3193 = 0;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
	public final byte[] aByteArray19 = new byte[18002];

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray19 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "[B")
	public final byte[] aByteArray18 = new byte[256];

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "[[I")
	public final int[][] anIntArrayArray18 = new int[6][258];

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "[I")
	public final int[] anIntArray163 = new int[257];

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "[B")
	public final byte[] aByteArray23 = new byte[4096];

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "[[B")
	public final byte[][] aByteArrayArray10 = new byte[6][258];

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "[B")
	public final byte[] aByteArray22 = new byte[18002];

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[I")
	public final int[] anIntArray164 = new int[256];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray22[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray21[local9] = (float) Math.cos((double) local9 * local7);
		}
	}
}

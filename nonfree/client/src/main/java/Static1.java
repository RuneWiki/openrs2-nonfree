import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
	private static final int[] anIntArray1 = new int[Math.max(Math.max(80, 20), 24573)];

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public static final int[] anIntArray2 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[S")
	public static final short[] aShortArray1 = new short[8191];

	@OriginalMember(owner = "client!a", name = "u", descriptor = "[F")
	private static final float[] aFloatArray1 = new float[20];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
	public static final int[] anIntArray3 = new int[8191];

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
	public static final int[] anIntArray4 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
	public static final int[] anIntArray5 = new int[6];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[8191];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
	public static final int[] anIntArray6 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[F")
	public static final float[] aFloatArray2 = aFloatArray1;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
	public static final int[] anIntArray7 = new int[8191];
}

import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
	private static final int[] anIntArray1 = new int[Math.max(Math.max(80, 20), 24573)];

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public static final int[] anIntArray2 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
	public static final int[] anIntArray3 = new int[8191];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[F")
	private static final float[] aFloatArray2 = new float[20];

	@OriginalMember(owner = "client!a", name = "u", descriptor = "[F")
	public static final float[] aFloatArray1 = aFloatArray2;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
	public static final int[] anIntArray4 = new int[8191];

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[S")
	public static final short[] aShortArray1 = new short[8191];

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[8191];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	public static final int[] anIntArray5 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
	public static final int[] anIntArray6 = anIntArray1;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	public static final int[] anIntArray7 = new int[6];
}

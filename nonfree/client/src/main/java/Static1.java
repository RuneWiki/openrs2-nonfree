import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	private static final int[] anIntArray3 = new int[Math.max(Math.max(104, 20), 24573)];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
	public static final int[] anIntArray4 = anIntArray3;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
	public static final int[] anIntArray5 = anIntArray3;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
	public static final int[] anIntArray6 = new int[6];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
	public static final int[] anIntArray7 = new int[8191];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
	public static final int[] anIntArray8 = anIntArray3;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[B")
	public static final byte[] aByteArray3 = new byte[8191];

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[F")
	private static final float[] aFloatArray2 = new float[20];

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[F")
	public static final float[] aFloatArray1 = aFloatArray2;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "[S")
	public static final short[] aShortArray1 = new short[8191];

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
	public static final int[] anIntArray9 = new int[8191];
}

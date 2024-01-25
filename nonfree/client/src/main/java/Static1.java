import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	private static final int[] anIntArray3 = new int[Math.max(Math.max(80, 20), 24573)];

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[F")
	private static final float[] aFloatArray2 = new float[20];

	@OriginalMember(owner = "client!a", name = "v", descriptor = "[F")
	public static final float[] aFloatArray1 = aFloatArray2;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
	public static final int[] anIntArray4 = new int[6];

	@OriginalMember(owner = "client!a", name = "y", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[8191];

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	public static final int[] anIntArray5 = anIntArray3;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
	public static final int[] anIntArray6 = new int[8191];

	@OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
	public static final int[] anIntArray7 = new int[8191];

	@OriginalMember(owner = "client!a", name = "G", descriptor = "[S")
	public static final short[] aShortArray1 = new short[8191];

	@OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
	public static final int[] anIntArray8 = anIntArray3;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "[I")
	public static final int[] anIntArray9 = anIntArray3;
}

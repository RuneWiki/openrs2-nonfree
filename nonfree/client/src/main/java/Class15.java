import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class15 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
	public static final int[] anIntArray101 = new int[14];

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[F")
	protected final float[] aFloatArray11 = new float[5000];

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "[B")
	protected final byte[] aByteArray16 = new byte[5000];

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	protected int anInt1408 = 0;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	protected int anInt1409 = 0;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
	protected volatile int anInt1411 = 0;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	protected volatile int anInt1412 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!tf;ZFII)V")
	public abstract void method1579(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	public abstract void method1580(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!f;B)V")
	public abstract void method1581(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V")
	public abstract void method1584(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!f;I)V")
	public abstract void method1585(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!f;)V")
	public abstract void method1586(@OriginalArg(1) Class67 arg0);

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public abstract void method1587();

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
	public abstract void method1588();
}

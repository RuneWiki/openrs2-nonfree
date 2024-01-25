import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class Class92 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	protected int anInt4042 = 0;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	protected volatile int anInt4046 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	protected volatile int anInt4044 = 0;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	protected int anInt4048 = 0;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[B")
	protected final byte[] aByteArray55 = new byte[5000];

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[F")
	protected final float[] aFloatArray8 = new float[5000];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZFLclient!ta;II)V")
	public abstract void method3213(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!rr;I)V")
	public abstract void method3214(@OriginalArg(0) Class223 arg0);

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public abstract void method3216();

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public abstract void method3218();

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Lclient!rr;I)V")
	public abstract void method3220(@OriginalArg(0) Class223 arg0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!rr;)V")
	public abstract void method3221(@OriginalArg(1) Class223 arg0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public abstract void method3222(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	public abstract void method3223(@OriginalArg(0) int arg0);
}

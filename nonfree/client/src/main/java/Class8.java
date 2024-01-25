import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class8 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "I")
	protected volatile int anInt4630 = 0;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	protected int anInt4631 = 0;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
	protected final float[] aFloatArray27 = new float[5000];

	@OriginalMember(owner = "client!or", name = "i", descriptor = "[B")
	protected final byte[] aByteArray53 = new byte[5000];

	@OriginalMember(owner = "client!or", name = "g", descriptor = "I")
	protected int anInt4634 = 0;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	protected volatile int anInt4633 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!ak;)V")
	public abstract void method3746(@OriginalArg(1) Class11 arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(FIZLclient!ya;I)V")
	public abstract void method3749(@OriginalArg(0) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public abstract void method3750();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ak;)V")
	public abstract void method3751(@OriginalArg(1) Class11 arg0);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
	public abstract void method3752(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
	public abstract void method3754(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public abstract void method3755();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ak;I)V")
	public abstract void method3757(@OriginalArg(0) Class11 arg0);
}

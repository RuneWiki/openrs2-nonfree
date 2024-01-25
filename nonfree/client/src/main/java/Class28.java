import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class28 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	protected volatile int anInt3658 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	protected volatile int anInt3659 = 0;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	protected int anInt3657 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[B")
	protected final byte[] aByteArray60 = new byte[5000];

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[F")
	protected final float[] aFloatArray25 = new float[5000];

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	protected int anInt3663 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public abstract void method3464();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public abstract void method3465();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!uk;)V")
	public abstract void method3467(@OriginalArg(1) Class204 arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sm;ZBIF)V")
	public abstract void method3468(@OriginalArg(0) Class41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V")
	public abstract void method3469(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!uk;I)V")
	public abstract void method3471(@OriginalArg(0) Class204 arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public abstract void method3473(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!uk;)V")
	public abstract void method3474(@OriginalArg(1) Class204 arg0);
}

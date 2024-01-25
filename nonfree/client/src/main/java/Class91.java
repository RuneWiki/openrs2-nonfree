import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class91 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	protected int anInt4213 = 0;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "I")
	protected volatile int anInt4215 = 0;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	protected volatile int anInt4212 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "[B")
	protected final byte[] aByteArray58 = new byte[5000];

	@OriginalMember(owner = "client!op", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray5 = new Object[5000];

	@OriginalMember(owner = "client!op", name = "g", descriptor = "I")
	protected int anInt4216 = 0;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "[F")
	protected final float[] aFloatArray17 = new float[5000];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!r;B)V")
	public abstract void method3911(@OriginalArg(0) Class174 arg0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public abstract void method3912();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
	public abstract void method3913(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!r;)V")
	public abstract void method3915(@OriginalArg(1) Class174 arg0);

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public abstract void method3916();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(FLclient!dn;ZII)V")
	public abstract void method3918(@OriginalArg(0) float arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
	public abstract void method3919(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Lclient!r;B)V")
	public abstract void method3920(@OriginalArg(0) Class174 arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class Class2 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	protected volatile int anInt3446 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	protected int anInt3445 = 0;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray5 = new Object[5000];

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[F")
	protected final float[] aFloatArray26 = new float[5000];

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[B")
	protected final byte[] aByteArray48 = new byte[5000];

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	protected volatile int anInt3447 = 0;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	protected int anInt3449 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public abstract void method3037();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public abstract void method3039();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!br;B)V")
	public abstract void method3040(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!sa;FII)V")
	public abstract void method3042(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
	public abstract void method3043(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
	public abstract void method3044(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!br;)V")
	public abstract void method3046(@OriginalArg(1) Class37 arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!br;)V")
	public abstract void method3047(@OriginalArg(1) Class37 arg0);
}

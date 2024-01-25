import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	protected volatile int anInt3077 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	protected int anInt3080 = 0;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	protected volatile int anInt3081 = 0;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[B")
	protected final byte[] aByteArray34 = new byte[5000];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	protected int anInt3078 = 0;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "[F")
	protected final float[] aFloatArray18 = new float[5000];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
	public abstract void method2551(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BFLclient!na;IZ)V")
	public abstract void method2554(@OriginalArg(1) float arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLclient!fl;)V")
	public abstract void method2555(@OriginalArg(1) Class82 arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public abstract void method2556(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fl;B)V")
	public abstract void method2557(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public abstract void method2558();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!fl;)V")
	public abstract void method2560(@OriginalArg(1) Class82 arg0);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public abstract void method2561();
}

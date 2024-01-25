import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class125 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	protected volatile int anInt3685 = 0;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	protected int anInt3687 = 0;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	protected volatile int anInt3688 = 0;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "[B")
	protected final byte[] aByteArray112 = new byte[5000];

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "[F")
	protected final float[] aFloatArray22 = new float[5000];

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	protected int anInt3691 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public abstract void method2947();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	public abstract void method2948(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ht;)V")
	public abstract void method2949(@OriginalArg(1) Class113 arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IFZLclient!na;I)V")
	public abstract void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class106 arg3);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public abstract void method2951(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ILclient!ht;)V")
	public abstract void method2952(@OriginalArg(1) Class113 arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ht;I)V")
	public abstract void method2953(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public abstract void method2955();
}

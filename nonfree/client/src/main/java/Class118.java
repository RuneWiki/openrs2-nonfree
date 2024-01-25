import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class118 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[F")
	protected final float[] aFloatArray29 = new float[5000];

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	protected int anInt6395 = 0;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	protected volatile int anInt6397 = 0;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[B")
	protected final byte[] aByteArray93 = new byte[5000];

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	protected volatile int anInt6393 = 0;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	protected int anInt6398 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!og;I)V")
	public abstract void method5660(@OriginalArg(0) Class155 arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!og;B)V")
	public abstract void method5662(@OriginalArg(0) Class155 arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public abstract void method5664(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public abstract void method5665();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!og;)V")
	public abstract void method5666(@OriginalArg(1) Class155 arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IFZILclient!ui;)V")
	public abstract void method5667(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public abstract void method5668(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public abstract void method5669();
}

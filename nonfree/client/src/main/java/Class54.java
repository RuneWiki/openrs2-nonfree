import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class54 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	protected int anInt5391 = 0;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[B")
	protected final byte[] aByteArray71 = new byte[5000];

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	protected int anInt5394 = 0;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[F")
	protected final float[] aFloatArray31 = new float[5000];

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	protected volatile int anInt5395 = 0;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	protected volatile int anInt5388 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public abstract void method4337();

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public abstract void method4339(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public abstract void method4340();

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public abstract void method4343(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!sd;)V")
	public abstract void method4344(@OriginalArg(1) Class211 arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!sd;B)V")
	public abstract void method4347(@OriginalArg(0) Class211 arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!sd;)V")
	public abstract void method4348(@OriginalArg(1) Class211 arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!na;FII)V")
	public abstract void method4351(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3);
}

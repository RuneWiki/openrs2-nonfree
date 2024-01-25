import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class Class28 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	protected volatile int anInt5530 = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	protected int anInt5529 = 0;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "[B")
	protected final byte[] aByteArray71 = new byte[5000];

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	protected int anInt5532 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	protected volatile int anInt5527 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "[F")
	protected final float[] aFloatArray26 = new float[5000];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public abstract void method4499(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ev;)V")
	public abstract void method4501(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ev;I)V")
	public abstract void method4502(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public abstract void method4503();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
	public abstract void method4504(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ta;IIFZ)V")
	public abstract void method4505(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public abstract void method4506();

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(ILclient!ev;)V")
	public abstract void method4507(@OriginalArg(1) Class75 arg0);
}

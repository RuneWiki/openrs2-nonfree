import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class Class57 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	protected volatile int anInt2496 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	protected volatile int anInt2491 = 0;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	protected int anInt2495 = 0;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "[F")
	protected final float[] aFloatArray8 = new float[5000];

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	protected int anInt2497 = 0;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "[B")
	protected final byte[] aByteArray67 = new byte[5000];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	public abstract void method2403(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public abstract void method2404();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!we;I)V")
	public abstract void method2405(@OriginalArg(0) Class213 arg0);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)V")
	public abstract void method2406(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public abstract void method2407();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!lf;ZFIZ)V")
	public abstract void method2408(@OriginalArg(0) Class114 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLclient!we;)V")
	public abstract void method2409(@OriginalArg(1) Class213 arg0);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lclient!we;I)V")
	public abstract void method2411(@OriginalArg(0) Class213 arg0);
}

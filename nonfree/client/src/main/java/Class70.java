import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class Class70 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[B")
	protected final byte[] aByteArray91 = new byte[5000];

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray5 = new Object[5000];

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	protected int anInt6472 = 0;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	protected volatile int anInt6474 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	protected int anInt6471 = 0;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	protected volatile int anInt6473 = 0;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[F")
	protected final float[] aFloatArray29 = new float[5000];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public abstract void method5073();

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public abstract void method5074();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public abstract void method5075(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!nt;B)V")
	public abstract void method5076(@OriginalArg(0) Class164 arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	public abstract void method5077(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!nt;)V")
	public abstract void method5078(@OriginalArg(1) Class164 arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZLclient!ta;FB)V")
	public abstract void method5079(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!nt;I)V")
	public abstract void method5080(@OriginalArg(0) Class164 arg0);
}

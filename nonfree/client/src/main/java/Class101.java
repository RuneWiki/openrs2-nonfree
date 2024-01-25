import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class101 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[B")
	protected final byte[] aByteArray51 = new byte[5000];

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	protected int anInt3535 = 0;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	protected int anInt3542 = 0;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	protected volatile int anInt3534 = 0;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[F")
	protected final float[] aFloatArray16 = new float[5000];

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	protected volatile int anInt3539 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ak;)V")
	public abstract void method3247(@OriginalArg(1) Class8 arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public abstract void method3248();

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ak;Z)V")
	public abstract void method3250(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZFBLclient!gh;)V")
	public abstract void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) Class73 arg3);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILclient!ak;)V")
	public abstract void method3252(@OriginalArg(1) Class8 arg0);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
	public abstract void method3253(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public abstract void method3254();

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)V")
	public abstract void method3255(@OriginalArg(0) int arg0);
}

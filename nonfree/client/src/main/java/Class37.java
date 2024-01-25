import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class37 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[B")
	protected final byte[] aByteArray124 = new byte[5000];

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	protected volatile int anInt6674 = 0;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
	protected int anInt6677 = 0;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "[F")
	protected final float[] aFloatArray49 = new float[5000];

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	protected int anInt6678 = 0;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	protected volatile int anInt6675 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!hg;I)V")
	public abstract void method5281(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public abstract void method5282(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V")
	public abstract void method5283(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!hg;Z)V")
	public abstract void method5284(@OriginalArg(0) Class106 arg0);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BFILclient!ta;Z)V")
	public abstract void method5285(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public abstract void method5286();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!hg;)V")
	public abstract void method5287(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public abstract void method5288();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class Class10 {

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	protected int anInt6505 = 0;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "[F")
	protected final float[] aFloatArray30 = new float[5000];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	protected int anInt6500 = 0;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[B")
	protected final byte[] aByteArray83 = new byte[5000];

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	protected volatile int anInt6504 = 0;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	protected volatile int anInt6503 = 0;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public abstract void method5374(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public abstract void method5375();

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public abstract void method5379(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!oh;I)V")
	public abstract void method5380(@OriginalArg(0) Class189 arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public abstract void method5381();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!oh;)V")
	public abstract void method5382(@OriginalArg(1) Class189 arg0);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lclient!oh;I)V")
	public abstract void method5383(@OriginalArg(0) Class189 arg0);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIFLclient!fo;Z)V")
	public abstract void method5384(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) boolean arg3);
}

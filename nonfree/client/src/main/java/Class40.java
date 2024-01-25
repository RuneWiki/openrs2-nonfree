import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class Class40 {

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	protected volatile int anInt9537 = 0;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	protected int anInt9534 = 0;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[F")
	protected final float[] aFloatArray79 = new float[5000];

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	protected int anInt9535 = 0;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	protected volatile int anInt9531 = 0;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "[B")
	protected final byte[] aByteArray118 = new byte[5000];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public abstract void method8209();

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	public abstract void method8210(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!dg;)V")
	public abstract void method8212(@OriginalArg(1) Class64 arg0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!dg;Z)V")
	public abstract void method8213(@OriginalArg(0) Class64 arg0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public abstract void method8215();

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sa;IIZF)V")
	public abstract void method8216(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!dg;B)V")
	public abstract void method8217(@OriginalArg(0) Class64 arg0);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public abstract void method8219(@OriginalArg(1) int arg0);
}

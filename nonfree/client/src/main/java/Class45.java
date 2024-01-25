import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public abstract class Class45 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "[B")
	protected final byte[] aByteArray80 = new byte[5000];

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	protected int anInt6512 = 0;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "[F")
	protected final float[] aFloatArray31 = new float[5000];

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	protected volatile int anInt6509 = 0;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	protected volatile int anInt6515 = 0;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	protected int anInt6514 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!wr;I)V")
	public abstract void method5051(@OriginalArg(0) Class270 arg0);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ya;IZZF)V")
	public abstract void method5052(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!wr;)V")
	public abstract void method5053(@OriginalArg(1) Class270 arg0);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)V")
	public abstract void method5054(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
	public abstract void method5056(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public abstract void method5057();

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLclient!wr;)V")
	public abstract void method5058(@OriginalArg(1) Class270 arg0);

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public abstract void method5059();
}

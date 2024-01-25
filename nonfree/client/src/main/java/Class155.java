import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class155 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	protected int anInt6147 = 0;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[F")
	protected final float[] aFloatArray29 = new float[5000];

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "[B")
	protected final byte[] aByteArray95 = new byte[5000];

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	protected int anInt6146 = 0;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	protected volatile int anInt6139 = 0;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	protected volatile int anInt6143 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!sk;I)V")
	public abstract void method5563(@OriginalArg(0) Class187 arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!sk;B)V")
	public abstract void method5565(@OriginalArg(0) Class187 arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(FBIZLclient!nc;)V")
	public abstract void method5566(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class106 arg3);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!sk;)V")
	public abstract void method5567(@OriginalArg(1) Class187 arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public abstract void method5569();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public abstract void method5570(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public abstract void method5571(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public abstract void method5572();
}

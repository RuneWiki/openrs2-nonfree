import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class Class6 {

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "[B")
	protected final byte[] aByteArray67 = new byte[5000];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	protected int anInt5928 = 0;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	protected volatile int anInt5929 = 0;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	protected volatile int anInt5930 = 0;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "[F")
	protected final float[] aFloatArray33 = new float[5000];

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	protected int anInt5932 = 0;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!tg;B)V")
	public abstract void method4728(@OriginalArg(0) Class217 arg0);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public abstract void method4729();

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!tg;I)V")
	public abstract void method4730(@OriginalArg(0) Class217 arg0);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	public abstract void method4733(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public abstract void method4735();

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V")
	public abstract void method4736(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLclient!tg;)V")
	public abstract void method4737(@OriginalArg(1) Class217 arg0);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!na;IBFZ)V")
	public abstract void method4738(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3);
}

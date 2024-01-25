import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class77 {

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "[B")
	protected final byte[] aByteArray51 = new byte[5000];

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	protected volatile int anInt3602 = 0;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	protected int anInt3606 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	protected volatile int anInt3596 = 0;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[F")
	protected final float[] aFloatArray6 = new float[5000];

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	protected int anInt3600 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!vt;)V")
	public abstract void method2848(@OriginalArg(1) Class258 arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public abstract void method2849();

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!vt;I)V")
	public abstract void method2850(@OriginalArg(0) Class258 arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ya;IIZF)V")
	public abstract void method2853(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILclient!vt;)V")
	public abstract void method2858(@OriginalArg(1) Class258 arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
	public abstract void method2859(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public abstract void method2860(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public abstract void method2861();
}

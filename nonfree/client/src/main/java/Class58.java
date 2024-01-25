import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class58 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	protected volatile int anInt4407 = 0;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[B")
	protected final byte[] aByteArray53 = new byte[5000];

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[F")
	protected final float[] aFloatArray19 = new float[5000];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	protected int anInt4409 = 0;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	protected volatile int anInt4408 = 0;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	protected int anInt4410 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!no;B)V")
	public abstract void method3489(@OriginalArg(0) Class169 arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public abstract void method3491();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!no;)V")
	public abstract void method3492(@OriginalArg(1) Class169 arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public abstract void method3493(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BLclient!no;)V")
	public abstract void method3494(@OriginalArg(1) Class169 arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ya;FZII)V")
	public abstract void method3495(@OriginalArg(0) Class157 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public abstract void method3496();

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	public abstract void method3497(@OriginalArg(1) int arg0);
}

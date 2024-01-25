import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class Class9 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[F")
	protected final float[] aFloatArray33 = new float[5000];

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	protected int anInt7827 = 0;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[B")
	protected final byte[] aByteArray96 = new byte[5000];

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	protected int anInt7829 = 0;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	protected volatile int anInt7830 = 0;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	protected volatile int anInt7828 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public abstract void method6061();

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public abstract void method6063();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ut;)V")
	public abstract void method6064(@OriginalArg(1) Class252 arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ya;IZFI)V")
	public abstract void method6065(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ut;I)V")
	public abstract void method6066(@OriginalArg(0) Class252 arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)V")
	public abstract void method6067(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(ILclient!ut;)V")
	public abstract void method6068(@OriginalArg(1) Class252 arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public abstract void method6069(@OriginalArg(1) int arg0);
}

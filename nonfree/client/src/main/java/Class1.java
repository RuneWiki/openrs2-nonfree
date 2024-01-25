import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class Class1 {

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	protected int anInt9399 = 0;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "[B")
	protected final byte[] aByteArray118 = new byte[5000];

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
	protected volatile int anInt9402 = 0;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	protected volatile int anInt9400 = 0;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	protected int anInt9401 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZILclient!d;)V")
	public abstract void method7671(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59 arg2);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
	public abstract void method7672(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public abstract void method7673();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!qs;I)V")
	public abstract void method7674(@OriginalArg(0) Class276 arg0);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!qs;)V")
	public abstract void method7676(@OriginalArg(1) Class276 arg0);

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
	public abstract void method7677();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ)V")
	public abstract void method7678(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!qs;B)V")
	public abstract void method7680(@OriginalArg(0) Class276 arg0);
}

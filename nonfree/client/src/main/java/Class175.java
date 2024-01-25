import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class175 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[B")
	protected final byte[] aByteArray68 = new byte[5000];

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	protected volatile int anInt4892 = 0;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	protected int anInt4891 = 0;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	protected volatile int anInt4890 = 0;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
	protected int anInt4896 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!hl;B)V")
	public abstract void method4153(@OriginalArg(0) Class133 arg0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public abstract void method4154();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZLclient!d;)V")
	public abstract void method4155(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class46 arg2);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!hl;)V")
	public abstract void method4157(@OriginalArg(1) Class133 arg0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public abstract void method4159(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public abstract void method4160();

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZLclient!hl;)V")
	public abstract void method4162(@OriginalArg(1) Class133 arg0);

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	public abstract void method4163(@OriginalArg(1) int arg0);
}

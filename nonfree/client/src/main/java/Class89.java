import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class89 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	protected int anInt4579 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "[B")
	protected final byte[] aByteArray57 = new byte[5000];

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	protected volatile int anInt4581 = 0;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	protected int anInt4580 = 0;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	protected volatile int anInt4578 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public abstract void method3862(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V")
	public abstract void method3863(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public abstract void method3864();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!gn;)V")
	public abstract void method3865(@OriginalArg(1) Class125 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZBLclient!d;I)V")
	public abstract void method3866(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public abstract void method3867();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!gn;I)V")
	public abstract void method3868(@OriginalArg(0) Class125 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!gn;Z)V")
	public abstract void method3870(@OriginalArg(0) Class125 arg0);
}

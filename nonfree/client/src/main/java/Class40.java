import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class Class40 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
	protected int anInt9379 = 0;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "[B")
	protected final byte[] aByteArray116 = new byte[5000];

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
	protected int anInt9384 = 0;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	protected volatile int anInt9385 = 0;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	protected volatile int anInt9383 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!fba;)V")
	public abstract void method7707(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)V")
	public abstract void method7708(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!d;IZ)V")
	public abstract void method7709(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!fba;B)V")
	public abstract void method7711(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	public abstract void method7712();

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
	public abstract void method7713();

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)V")
	public abstract void method7714(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!fba;I)V")
	public abstract void method7716(@OriginalArg(0) Class100 arg0);
}

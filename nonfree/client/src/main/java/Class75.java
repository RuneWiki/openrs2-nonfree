import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class Class75 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
	protected int anInt4392 = 0;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	protected volatile int anInt4393 = 0;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "[B")
	protected final byte[] aByteArray65 = new byte[5000];

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	protected volatile int anInt4398 = 0;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
	protected int anInt4400 = 0;

	static {
		new Class306("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIILclient!sa;)V")
	public abstract void method3831(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class205 arg2);

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
	public abstract void method3834(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!rg;B)V")
	public abstract void method3835(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public abstract void method3836();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLclient!rg;)V")
	public abstract void method3837(@OriginalArg(1) Class255 arg0);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V")
	public abstract void method3839(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public abstract void method3840();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!rg;)V")
	public abstract void method3842(@OriginalArg(1) Class255 arg0);
}

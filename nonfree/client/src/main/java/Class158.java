import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public abstract class Class158 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray35 = new Object[5000];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "[B")
	protected final byte[] aByteArray79 = new byte[5000];

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
	protected int anInt6301 = 0;

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
	protected int anInt6302 = 0;

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
	protected volatile int anInt6300 = 0;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
	protected volatile int anInt6298 = 0;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)V")
	public abstract void method5351(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
	public abstract void method5352();

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!af;)V")
	public abstract void method5353(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!af;I)V")
	public abstract void method5354(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Lclient!af;I)V")
	public abstract void method5355(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	public abstract void method5357();

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!d;IZI)V")
	public abstract void method5358(@OriginalArg(0) Class60 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(ZI)V")
	public abstract void method5359(@OriginalArg(1) int arg0);
}

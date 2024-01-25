import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class118 {

	static {
		new Class57("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public abstract void method2656(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!os;)V")
	public abstract void method2657(@OriginalArg(0) Class118 arg0);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	public abstract void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
	public abstract void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public abstract void method2660(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
	public abstract void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III[I)V")
	public abstract void method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
	public abstract void method2665();

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
	public abstract void method2666(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([I)V")
	public abstract void method2667(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
	public abstract void method2669(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	public abstract void method2670(@OriginalArg(0) int arg0);
}

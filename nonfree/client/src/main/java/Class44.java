import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class44 {

	static {
		new Class32("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public abstract void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
	public abstract void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!de;)V")
	public abstract void method3530(@OriginalArg(0) Class44 arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public abstract void method3531(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public abstract void method3533(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[I)V")
	public abstract void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public abstract void method3536(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public abstract void method3537(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public abstract void method3538();

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	public abstract void method3539(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
	public abstract void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([I)V")
	public abstract void method3542(@OriginalArg(0) int[] arg0);
}

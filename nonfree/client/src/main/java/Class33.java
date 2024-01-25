import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class33 {

	static {
		new Class7("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!c", name = "za", descriptor = "(Lclient!c;)V")
	public abstract void za(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Lclient!c;")
	public abstract Class33 method4612();

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
	public abstract void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
	public abstract void m(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
	public abstract void O(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
	public abstract void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
	public abstract void ka(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
	public abstract void N(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
	public abstract void ra(@OriginalArg(0) int arg0);
}

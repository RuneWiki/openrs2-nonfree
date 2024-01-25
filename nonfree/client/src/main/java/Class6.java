import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class6 {

	static {
		new Class231("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Lclient!c;")
	public abstract Class6 method4655();

	@OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
	public abstract void wa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
	public abstract void ea(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lclient!c;)V")
	public abstract void ha(@OriginalArg(0) Class6 arg0);

	@OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
	public abstract void ca(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
	public abstract void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
	public abstract void EA(@OriginalArg(0) int arg0);
}

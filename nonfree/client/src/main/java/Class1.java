import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class1 {

	static {
		new Class202("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7671();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	public abstract void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;IB)Z")
	public abstract boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public abstract void method7675();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	public abstract Class68 method7676(@OriginalArg(1) Class39 arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qa;Z)V")
	public abstract void method7677(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	public abstract Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0);
}

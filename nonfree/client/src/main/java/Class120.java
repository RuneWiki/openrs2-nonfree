import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class Class120 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!tu;")
	protected final Class5_Sub3 aClass5_Sub3_20;

	static {
		new Class67("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class120(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aClass5_Sub3_20 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method7319() {
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public void method7321() {
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Z")
	public abstract boolean method7322();

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public void method7323() {
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	public abstract void method7324();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public void method7325() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V")
	public abstract void method7326(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public void method7327() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLclient!iu;)V")
	public abstract void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public abstract void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	public void method7330() {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	public abstract void method7331(@OriginalArg(1) boolean arg0);
}

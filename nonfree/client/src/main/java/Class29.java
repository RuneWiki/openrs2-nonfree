import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public abstract class Class29 {

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "Lclient!ch;")
	protected final Class5_Sub1 aClass5_Sub1_22;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class29(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZZ)V")
	public abstract void method8067(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	public abstract void method8071();

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IILclient!ec;)V")
	public abstract void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1);

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)Z")
	public abstract boolean method8073();

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "(I)V")
	public void method8076() {
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(I)V")
	public void method8077() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V")
	public void method8078() {
	}

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "(I)V")
	public void method8079() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BZ)V")
	public abstract void method8080(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "(I)V")
	public void method8082() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
	public abstract void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sha", name = "h", descriptor = "(I)V")
	public void method8084() {
	}
}

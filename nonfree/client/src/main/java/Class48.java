import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public abstract class Class48 {

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!gca;")
	protected final Class100_Sub1 aClass100_Sub1_23;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class48(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
	public void method8931() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!ln;BI)V")
	public abstract void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
	public abstract void method8934();

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	public abstract void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	public void method8936() {
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	public void method8937() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
	public abstract void method8938(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
	public void method8939() {
	}

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "(I)Z")
	public abstract boolean method8940();

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZ)V")
	public abstract void method8941(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
	public void method8943() {
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(I)V")
	public void method8944() {
	}
}

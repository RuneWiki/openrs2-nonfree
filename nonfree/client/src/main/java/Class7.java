import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public abstract class Class7 {

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "Lclient!wu;")
	protected final Class100_Sub1 aClass100_Sub1_22;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class7(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V")
	public void method7182() {
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)V")
	public void method7184() {
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)V")
	public void method7185() {
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!bca;II)V")
	public abstract void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZI)V")
	public abstract void method7187(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(Z)V")
	public void method7188() {
	}

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "(Z)V")
	public void method7190() {
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BII)V")
	public abstract void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Z")
	public abstract boolean method7194();

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ZZ)V")
	public abstract void method7195(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "(Z)V")
	public void method7196() {
	}

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "(I)V")
	public abstract void method7197();
}

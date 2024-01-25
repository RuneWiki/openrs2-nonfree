import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class Class22 {

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!kea;")
	protected final Class14_Sub2 aClass14_Sub2_20;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class22(@OriginalArg(0) Class14_Sub2 arg0) {
		this.aClass14_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	public abstract void method7642(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public abstract void method7643();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public void method7644() {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BILclient!gl;)V")
	public abstract void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
	public abstract void method7646(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z")
	public abstract boolean method7647();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
	public void method7649() {
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	public void method7650() {
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	public void method7651() {
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public void method7652() {
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	public void method7653() {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public abstract void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}

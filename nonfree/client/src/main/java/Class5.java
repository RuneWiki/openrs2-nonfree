import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public abstract class Class5 {

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "Lclient!kw;")
	protected final Class39_Sub2 aClass39_Sub2_20;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class5(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V")
	public abstract void method7081(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	public void method7082() {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZILclient!mn;)V")
	public abstract void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1);

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)Z")
	public abstract boolean method7085();

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public void method7086() {
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
	public abstract void method7087();

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)V")
	public void method7088() {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
	public void method7089() {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBI)V")
	public abstract void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
	public abstract void method7092(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
	public void method7095() {
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
	public void method7097() {
	}
}

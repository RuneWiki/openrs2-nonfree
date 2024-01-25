import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class37 {

	@OriginalMember(owner = "client!or", name = "k", descriptor = "Lclient!fo;")
	protected final Class9_Sub3 aClass9_Sub3_19;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class37(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_19 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ld;B)V")
	public abstract void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public void method7553() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public void method7554() {
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
	public void method7555() {
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public void method7556() {
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public void method7557() {
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	public void method7558() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V")
	public abstract void method7559(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
	public abstract void method7561();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	public abstract void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)Z")
	public abstract boolean method7564();

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(ZI)V")
	public abstract void method7565(@OriginalArg(0) boolean arg0);
}

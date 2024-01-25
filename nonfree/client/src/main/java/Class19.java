import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class Class19 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!fc;")
	protected final Class15_Sub2 aClass15_Sub2_18;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class19(@OriginalArg(0) Class15_Sub2 arg0) {
		this.aClass15_Sub2_18 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public void method7882() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7883();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method7884() {
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public void method7885() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!nm;ZI)V")
	public abstract void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public void method7887() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public abstract void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public abstract void method7890();

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public void method7891() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
	public abstract void method7892(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public void method7893() {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
	public abstract void method7894(@OriginalArg(1) boolean arg0);
}

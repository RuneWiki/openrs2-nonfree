import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class Class121 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!nb;")
	protected final Class67_Sub1 aClass67_Sub1_23;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class121(@OriginalArg(0) Class67_Sub1 arg0) {
		this.aClass67_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IZ)V")
	public abstract void method9231(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public abstract void method9232();

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public void method9233() {
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	public void method9235() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public abstract void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public void method9237() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)V")
	public abstract void method9239(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method9240() {
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)Z")
	public abstract boolean method9241();

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
	public void method9242() {
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)V")
	public void method9243() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ip;II)V")
	public abstract void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class Class34 {

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "Lclient!hea;")
	protected final Class134_Sub1 aClass134_Sub1_21;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class34(@OriginalArg(0) Class134_Sub1 arg0) {
		this.aClass134_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
	public void method7004() {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
	public abstract void method7006();

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(B)V")
	public void method7008() {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	public abstract void method7009(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public void method7010() {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!bb;II)V")
	public abstract void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)V")
	public void method7015() {
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(ZI)V")
	public abstract void method7016(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "(I)Z")
	public abstract boolean method7017();

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
	public void method7018() {
	}

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "(I)V")
	public void method7019() {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
	public abstract void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

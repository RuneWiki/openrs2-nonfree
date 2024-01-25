import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class Class14 {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "Lclient!wk;")
	protected final Class143_Sub1 aClass143_Sub1_22;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class14(@OriginalArg(0) Class143_Sub1 arg0) {
		this.aClass143_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public void method8614() {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
	public abstract void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
	public void method8616() {
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZI)V")
	public abstract void method8617(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	public void method8618() {
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
	public abstract void method8619();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!dr;I)V")
	public abstract void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(B)V")
	public void method8621() {
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	public void method8622() {
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V")
	public void method8623() {
	}

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(I)Z")
	public abstract boolean method8624();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZB)V")
	public abstract void method8625(@OriginalArg(0) boolean arg0);
}

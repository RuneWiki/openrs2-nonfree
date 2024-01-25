import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public abstract class Class13 {

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "Lclient!mj;")
	protected final Class101_Sub1 aClass101_Sub1_22;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class13(@OriginalArg(0) Class101_Sub1 arg0) {
		this.aClass101_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	public void method8487() {
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
	public abstract void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Z")
	public abstract boolean method8489();

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZZ)V")
	public abstract void method8490(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	public void method8492() {
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V")
	public void method8493() {
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!en;ZI)V")
	public abstract void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V")
	public abstract void method8495(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)V")
	public void method8496() {
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)V")
	public void method8497() {
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)V")
	public abstract void method8498();

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)V")
	public void method8499() {
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class18 {

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "Lclient!gd;")
	protected final Class65_Sub2 aClass65_Sub2_23;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class18(@OriginalArg(0) Class65_Sub2 arg0) {
		this.aClass65_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public void method8997() {
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public void method8998() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public void method8999() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
	public abstract boolean method9000();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
	public void method9001() {
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
	public void method9002() {
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public abstract void method9003();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!sfa;I)V")
	public abstract void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
	public abstract void method9009(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
	public void method9010() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
	public abstract void method9011(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V")
	public abstract void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}

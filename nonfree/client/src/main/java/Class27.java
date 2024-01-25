import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public abstract class Class27 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "Lclient!pj;")
	protected final Class133_Sub1 aClass133_Sub1_23;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class27(@OriginalArg(0) Class133_Sub1 arg0) {
		this.aClass133_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public abstract void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Z")
	public abstract boolean method8891();

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
	public void method8892() {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public void method8893() {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZI)V")
	public abstract void method8894(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
	public abstract void method8895();

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BZ)V")
	public abstract void method8898(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
	public void method8899() {
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V")
	public void method8900() {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZLclient!iu;)V")
	public abstract void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1);

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
	public void method8902() {
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)V")
	public void method8903() {
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class27_Sub3 extends Class27 {

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class27_Sub3(@OriginalArg(0) Class133_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		super.aClass133_Sub1_23.method6153(arg1);
		super.aClass133_Sub1_23.method6268(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
	}
}

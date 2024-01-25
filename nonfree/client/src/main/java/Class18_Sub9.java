import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class18_Sub9 extends Class18 {

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class18_Sub9(@OriginalArg(0) Class65_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		super.aClass65_Sub2_23.method4426(arg1);
		super.aClass65_Sub2_23.method4405(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class85_Sub5 extends Class85 {

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class85_Sub5(@OriginalArg(0) Class78_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		super.aClass78_Sub3_37.method4535(arg1);
		super.aClass78_Sub3_37.method4534(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		super.aClass78_Sub3_37.method4531(false);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		super.aClass78_Sub3_37.method4531(true);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}
}

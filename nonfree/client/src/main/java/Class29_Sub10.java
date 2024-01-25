import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class29_Sub10 extends Class29 {

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class29_Sub10(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass5_Sub1_22.method5609(arg1);
		super.aClass5_Sub1_22.method5697(arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_22.method5568(true);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return true;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		super.aClass5_Sub1_22.method5568(false);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
	}
}

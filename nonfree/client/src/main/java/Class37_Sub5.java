import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class37_Sub5 extends Class37 {

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class37_Sub5(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5489(true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
		super.aClass9_Sub3_19.method5545(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		super.aClass9_Sub3_19.method5489(false);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

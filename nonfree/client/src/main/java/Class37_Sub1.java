import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class37_Sub1(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
		super.aClass9_Sub3_19.method5545(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
	}
}

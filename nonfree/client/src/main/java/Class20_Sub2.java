import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class20_Sub2(@OriginalArg(0) Class105_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	@Override
	public void method5681(@OriginalArg(0) boolean arg0) {
		this.aClass105_Sub1_42.method3602(true);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "()V")
	@Override
	public void method5684() {
		this.aClass105_Sub1_42.method3602(false);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	@Override
	public void method5685(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "()Z")
	@Override
	public boolean method5683() {
		return true;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
	@Override
	public void method5682(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!me;)V")
	@Override
	public void method5680(@OriginalArg(0) Class44 arg0) {
		this.aClass105_Sub1_42.method3591(arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class14_Sub11_Sub6 extends Class14_Sub11 {

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.aString7 = this.aString88;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.aString88 = arg0.method7703(0);
		arg0.method7748();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class5_Sub15_Sub12 extends Class5_Sub15 {

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/lang/String;")
	private String aString122;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.aString122 = arg0.method7281();
		arg0.method7268();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.aString97 = this.aString122;
	}
}

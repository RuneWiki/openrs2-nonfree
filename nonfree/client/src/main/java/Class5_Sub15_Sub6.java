import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class5_Sub15_Sub6 extends Class5_Sub15 {

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "Ljava/lang/String;")
	private String aString90;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
	private int anInt7460;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!sca;I)V")
	@Override
	public void method9164(@OriginalArg(0) Class325 arg0) {
		arg0.method7406(this.anInt7460, this.aString90);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!wq;)V")
	@Override
	public void method9163(@OriginalArg(1) Class5_Sub36 arg0) {
		this.anInt7460 = arg0.method7268();
		this.aString90 = arg0.method7281();
	}
}

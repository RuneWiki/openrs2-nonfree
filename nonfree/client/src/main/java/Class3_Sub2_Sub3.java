import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.aString107 = this.aString17;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aString17 = arg0.method7922();
	}
}

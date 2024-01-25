import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.aString58 = arg0.method8497();
		arg0.method8527();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.aString73 = this.aString58;
	}
}

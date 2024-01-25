import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public final class Class14_Sub2_Sub4 extends Class14_Sub2 {

	@OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
	private int anInt3541 = -1;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5430(this.anInt3541);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt3541 = arg0.method5900();
	}
}

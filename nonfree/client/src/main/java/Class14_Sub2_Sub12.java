import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class14_Sub2_Sub12 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
	private int anInt11209 = -1;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt11209 = arg0.method5900();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5423(this.anInt11209);
	}
}

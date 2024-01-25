import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class14_Sub2_Sub11 extends Class14_Sub2 {

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "B")
	private byte aByte140;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	private int anInt10700 = -1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5421(this.anInt10700, this.aByte140);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt10700 = arg0.method5900();
		this.aByte140 = arg0.method5845();
	}
}

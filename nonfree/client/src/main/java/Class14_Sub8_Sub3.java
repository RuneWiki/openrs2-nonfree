import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class14_Sub8_Sub3 extends Class14_Sub8 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "I")
	private int anInt10089 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method8405(@OriginalArg(0) Class14_Sub29 arg0) {
		this.anInt10089 = arg0.method5900();
		arg0.method5866();
		if (arg0.method5866() != 255) {
			arg0.anInt7264--;
			arg0.method5907();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!hs;Z)V")
	@Override
	public void method8406(@OriginalArg(0) Class14_Sub25 arg0) {
		arg0.method3486(this.anInt10089);
	}
}

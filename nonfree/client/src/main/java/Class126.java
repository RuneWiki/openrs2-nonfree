import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class126 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public int anInt3464;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public int anInt3469;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public int anInt3470;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!si;BI)V")
	private void method2842(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3464 = arg0.method5500();
			this.anInt3470 = arg0.method5495();
			this.anInt3469 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!si;I)V")
	public void method2844(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5495();
			if (local11 == 0) {
				return;
			}
			this.method2842(arg0, local11);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class151 {

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	public int anInt3822;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
	public int anInt3824;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method3203(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method3204(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IILclient!vj;)V")
	private void method3204(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt3822 = arg1.method8546();
			this.anInt3818 = arg1.method8547();
			this.anInt3824 = arg1.method8547();
		}
	}
}

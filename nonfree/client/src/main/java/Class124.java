import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class124 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public int anInt3754;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public int anInt3756;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public int anInt3757;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!aj;B)V")
	public void method2931(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2334();
			if (local15 == 0) {
				return;
			}
			this.method2932(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!aj;)V")
	private void method2932(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt3754 = arg1.method2375();
			this.anInt3757 = arg1.method2334();
			this.anInt3756 = arg1.method2334();
		}
	}
}

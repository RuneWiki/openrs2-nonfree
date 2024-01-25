import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class111 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public int anInt3605 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ol;Z)V")
	public void method3356(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5203();
			if (local5 == 0) {
				return;
			}
			this.method3358(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILclient!ol;)V")
	private void method3358(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt3605 = arg1.method5211();
		}
	}
}

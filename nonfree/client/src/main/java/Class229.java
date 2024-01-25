import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class229 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
	public int anInt6240 = 0;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method5243(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3642();
			if (local7 == 0) {
				return;
			}
			this.method5244(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBLclient!rv;)V")
	private void method5244(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 5) {
			this.anInt6240 = arg1.method3698();
		}
	}
}

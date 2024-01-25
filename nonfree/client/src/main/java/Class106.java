import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class106 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public int anInt3671 = 1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static111.method2501(arg1.method8208());
		} else if (arg0 == 2) {
			this.anInt3671 = 0;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method3153(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8246();
			if (local13 == 0) {
				return;
			}
			this.method3152(local13, arg0);
		}
	}
}

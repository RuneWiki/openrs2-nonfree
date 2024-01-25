import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class195 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public int anInt5231 = 1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!so;I)V")
	private void method4369(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static462.method6790(arg1.method5845());
		} else if (arg0 == 2) {
			this.anInt5231 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!so;I)V")
	public void method4370(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method4369(local9, arg0);
		}
	}
}

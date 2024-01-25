import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class224 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public int anInt5606 = 1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ofa;Z)V")
	public void method4981(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5966();
			if (local9 == 0) {
				return;
			}
			this.method4983(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLclient!ofa;)V")
	private void method4983(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static644.method9020(arg1.method5963());
		} else if (arg0 == 2) {
			this.anInt5606 = 0;
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public int anInt140 = 1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!co;ZI)V")
	private void method267(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static260.method6803(arg0.method4196());
		} else if (arg1 == 2) {
			this.anInt140 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!co;B)V")
	public void method269(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method267(arg0, local5);
		}
	}
}

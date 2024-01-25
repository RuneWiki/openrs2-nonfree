import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class245 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	public int anInt7296;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public int anInt7299;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public int anInt7300;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILclient!so;)V")
	private void method5935(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static462.method6790(arg1.method5845());
		} else if (arg0 == 2) {
			this.anInt7299 = arg1.method5900();
			this.anInt7296 = arg1.method5866();
			this.anInt7300 = arg1.method5866();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!so;I)V")
	public void method5936(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method5935(local9, arg0);
		}
	}
}

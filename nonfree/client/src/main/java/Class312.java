import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class312 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	public int anInt9505 = 1;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method7865(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method7869(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!daa;II)V")
	private void method7869(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static485.method7249(arg0.method5173());
		} else if (arg1 == 2) {
			this.anInt9505 = 0;
			return;
		}
	}
}

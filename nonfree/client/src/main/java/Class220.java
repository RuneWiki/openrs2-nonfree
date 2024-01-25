import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class220 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public int anInt6316 = 1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ae;II)V")
	private void method5250(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static199.method3102(arg0.method6438());
		} else if (arg1 == 2) {
			this.anInt6316 = 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!ae;)V")
	public void method5251(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6433();
			if (local9 == 0) {
				return;
			}
			this.method5250(arg0, local9);
		}
	}
}

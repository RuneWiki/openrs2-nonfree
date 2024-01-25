import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class2_Sub9_Sub20 extends Class2_Sub9 {

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
	public int anInt6192 = 1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!ef;)V")
	public void method5211(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method5213(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!ef;)V")
	private void method5213(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static294.method4922(arg1.method3122());
		} else if (arg0 == 2) {
			this.anInt6192 = 0;
		}
	}
}

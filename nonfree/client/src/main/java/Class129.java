import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class129 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public int anInt3858 = 1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!nn;)V")
	private void method3060(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static276.method2522(arg1.method2460());
		} else if (arg0 == 2) {
			this.anInt3858 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!nn;)V")
	public void method3062(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2502();
			if (local9 == 0) {
				return;
			}
			this.method3060(local9, arg0);
		}
	}
}

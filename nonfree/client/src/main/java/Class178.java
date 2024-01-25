import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class178 {

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public int anInt5015 = 2048;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	public int anInt5018 = 2048;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	public int anInt5020 = 0;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public int anInt5016 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!jc;)V")
	public void method4532(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method4534(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!jc;)V")
	private void method4534(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt5020 = arg1.method3030();
		} else if (arg0 == 2) {
			this.anInt5015 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt5018 = arg1.method3018();
		} else if (arg0 == 4) {
			this.anInt5016 = arg1.method2989();
		}
	}
}

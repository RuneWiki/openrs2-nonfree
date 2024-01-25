import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class205 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
	public int anInt5675 = 1;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!vt;)V")
	private void method5034(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static168.method2964(arg1.method5759());
		} else if (arg0 == 2) {
			this.anInt5675 = 0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!vt;I)V")
	public void method5035(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method5034(local5, arg0);
		}
	}
}

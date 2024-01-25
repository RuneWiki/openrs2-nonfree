import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class84 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public int anInt2117 = 1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method1684(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method1685(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method1685(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static57.method814(arg1.method5063());
		} else if (arg0 == 2) {
			this.anInt2117 = 0;
		}
	}
}

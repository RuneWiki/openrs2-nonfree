import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class89 {

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method2197(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static383.method5912(arg0.method3027());
		} else if (arg1 == 3) {
			this.anInt2300 = arg0.method3018();
			this.anInt2299 = arg0.method3030();
			this.anInt2303 = arg0.method3030();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!jc;)V")
	public void method2198(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3030();
			if (local11 == 0) {
				return;
			}
			this.method2197(arg0, local11);
		}
	}
}

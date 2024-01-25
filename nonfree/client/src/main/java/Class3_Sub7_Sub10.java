import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class3_Sub7_Sub10 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
	public int anInt2992 = 1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!fb;Z)V")
	public void method2463(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3643();
			if (local5 == 0) {
				return;
			}
			this.method2464(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!fb;IB)V")
	private void method2464(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static178.method2913(arg0.method3621());
		} else if (arg1 == 2) {
			this.anInt2992 = 0;
			return;
		}
	}
}

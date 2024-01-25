import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class14_Sub2_Sub6 extends Class14_Sub2 {

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	public int anInt2022;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method2031(@OriginalArg(0) Class14_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2548();
			if (local13 == 0) {
				return;
			}
			this.method2036(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
	public boolean method2035() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jg;IZ)V")
	private void method2036(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static85.method2093(arg0.method2553());
		} else if (arg1 == 2) {
			this.anInt2022 = arg0.method2510();
		} else if (arg1 == 5) {
			this.aString77 = arg0.method2496();
		}
	}
}

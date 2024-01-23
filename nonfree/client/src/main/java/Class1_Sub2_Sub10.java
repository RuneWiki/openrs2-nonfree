import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	public int anInt3511;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Ljava/lang/String;")
	public String aString227;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)Z")
	public boolean method2633() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ql;II)V")
	private void method2634(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static139.method4196(arg0.method1756());
		} else if (arg1 == 2) {
			this.anInt3511 = arg0.method1802();
		} else if (arg1 == 5) {
			this.aString227 = arg0.method1774();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ql;I)V")
	public void method2636(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1772();
			if (local9 == 0) {
				return;
			}
			this.method2634(arg0, local9);
		}
	}
}

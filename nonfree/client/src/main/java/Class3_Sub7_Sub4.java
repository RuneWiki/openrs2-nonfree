import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!fb;B)V")
	public void method665(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3643();
			if (local9 == 0) {
				return;
			}
			this.method669(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Z")
	public boolean method667() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!fb;I)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static178.method2913(arg1.method3621());
		} else if (arg0 == 2) {
			this.anInt808 = arg1.method3642();
		} else if (arg0 == 5) {
			this.aString20 = arg1.method3671();
			return;
		}
	}
}

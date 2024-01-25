import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class79 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt2016;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Z")
	public boolean aBoolean180 = true;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
	public boolean method1707() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!ud;)V")
	public void method1708(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6904();
			if (local7 == 0) {
				return;
			}
			this.method1710(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ud;II)V")
	private void method1710(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static448.method6635(arg0.method6908());
		} else if (arg1 == 2) {
			this.anInt2016 = arg0.method6865();
		} else if (arg1 == 4) {
			this.aBoolean180 = false;
		} else if (arg1 == 5) {
			this.aString26 = arg0.method6903();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class53 {

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public int anInt1685;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
	public boolean method1652() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!os;)V")
	public void method1655(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4487();
			if (local11 == 0) {
				return;
			}
			this.method1656(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!os;I)V")
	private void method1656(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static253.method4580(arg0.method4482());
		} else if (arg1 == 2) {
			this.anInt1685 = arg0.method4481();
		} else if (arg1 == 4) {
			this.aBoolean143 = false;
		} else if (arg1 == 5) {
			this.aString31 = arg0.method4491();
		}
	}
}

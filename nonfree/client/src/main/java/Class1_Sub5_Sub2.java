import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Z")
	public boolean method461() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!fh;Z)V")
	public void method468(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1853();
			if (local17 == 0) {
				return;
			}
			this.method471(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method471(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static142.method2500(arg0.method1829());
		} else if (arg1 == 2) {
			this.anInt484 = arg0.method1860();
		} else if (arg1 == 5) {
			this.aString15 = arg0.method1827();
		}
	}
}

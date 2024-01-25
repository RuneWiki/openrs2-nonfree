import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class57 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method1105(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static581.method7528(arg0.method4477());
		} else if (arg1 == 2) {
			this.anInt1160 = arg0.method4509();
		} else if (arg1 == 4) {
			this.aBoolean64 = false;
		} else if (arg1 == 5) {
			this.aString16 = arg0.method4494();
			return;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method1106(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method1105(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Z")
	public boolean method1108() {
		return this.aChar1 == 's';
	}
}

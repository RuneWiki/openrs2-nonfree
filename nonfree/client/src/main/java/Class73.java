import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class73 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "Z")
	public boolean aBoolean158 = true;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ps;II)V")
	private void method2114(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static431.method6618(arg0.method5179());
		} else if (arg1 == 2) {
			this.anInt2133 = arg0.method5198();
		} else if (arg1 == 4) {
			this.aBoolean158 = false;
		} else if (arg1 == 5) {
			this.aString53 = arg0.method5194();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
	public boolean method2116() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ps;)V")
	public void method2117(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5170();
			if (local17 == 0) {
				return;
			}
			this.method2114(arg0, local17);
		}
	}
}

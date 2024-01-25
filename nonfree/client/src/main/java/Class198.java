import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class198 {

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public int anInt5653;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
	public boolean method4491() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BILclient!hw;)V")
	private void method4493(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static408.method1357(arg1.method6120());
		} else if (arg0 == 2) {
			this.anInt5653 = arg1.method6129();
		} else if (arg0 == 4) {
			this.aBoolean399 = false;
		} else if (arg0 == 5) {
			this.aString55 = arg1.method6141();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!hw;B)V")
	public void method4494(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method6138();
			if (local8 == 0) {
				return;
			}
			this.method4493(local8, arg0);
		}
	}
}

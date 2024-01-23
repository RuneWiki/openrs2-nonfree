import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!va", name = "I", descriptor = "I")
	public int anInt5559;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Ljava/lang/String;")
	public String aString184;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!jj;I)V")
	private void method4263(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static217.method3483(arg0.method3082());
		} else if (arg1 == 2) {
			this.anInt5559 = arg0.method3074();
		} else if (arg1 == 5) {
			this.aString184 = arg0.method3101();
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)Z")
	public boolean method4264() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!jj;)V")
	public void method4265(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3122();
			if (local15 == 0) {
				return;
			}
			this.method4263(arg0, local15);
		}
	}
}

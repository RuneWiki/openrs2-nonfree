import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub11_Sub21 extends Class2_Sub11 {

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public int anInt6866;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Z")
	public boolean aBoolean603 = true;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Z")
	public boolean method5923() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!dg;Z)V")
	private void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static194.method3503(arg1.method4436());
		} else if (arg0 == 2) {
			this.anInt6866 = arg1.method4444();
		} else if (arg0 == 4) {
			this.aBoolean603 = false;
		} else if (arg0 == 5) {
			this.aString65 = arg1.method4409();
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5925(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method5924(local5, arg0);
		}
	}
}

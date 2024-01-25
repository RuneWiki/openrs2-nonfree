import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class135 {

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public int anInt3793;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Z")
	public boolean aBoolean226 = true;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!co;I)V")
	private void method3274(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static260.method6803(arg0.method4196());
		} else if (arg1 == 2) {
			this.anInt3793 = arg0.method4230();
		} else if (arg1 == 4) {
			this.aBoolean226 = false;
		} else if (arg1 == 5) {
			this.aString38 = arg0.method4234();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z")
	public boolean method3275() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!co;)V")
	public void method3276(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4220();
			if (local9 == 0) {
				return;
			}
			this.method3274(arg0, local9);
		}
	}
}

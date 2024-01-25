import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class343 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Ljava/lang/String;")
	public String aString118;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public int anInt9461;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
	public boolean aBoolean663 = true;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!dga;)V")
	private void method7740(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static276.method3963(arg1.method6034());
		} else if (arg0 == 2) {
			this.anInt9461 = arg1.method6027();
		} else if (arg0 == 4) {
			this.aBoolean663 = false;
		} else if (arg0 == 5) {
			this.aString118 = arg1.method5991();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!dga;)V")
	public void method7743(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method7740(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	public boolean method7744() {
		return this.aChar5 == 's';
	}
}

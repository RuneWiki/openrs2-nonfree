import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class120 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public int anInt3368;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public int anInt3369;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public int anInt3372;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method2868(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7954();
			if (local9 == 0) {
				return;
			}
			this.method2870(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZILclient!dt;)V")
	private void method2870(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static363.method8911(arg1.method7960());
		} else if (arg0 == 2) {
			this.anInt3372 = arg1.method7951();
			this.anInt3368 = arg1.method7954();
			this.anInt3369 = arg1.method7954();
		}
	}
}

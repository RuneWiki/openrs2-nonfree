import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class359 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public int anInt9849 = 1;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!sl;ZI)V")
	private void method8440(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static242.method3969(arg0.method4254());
		} else if (arg1 == 2) {
			this.anInt9849 = 0;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!sl;Z)V")
	public void method8443(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4225();
			if (local11 == 0) {
				return;
			}
			this.method8440(arg0, local11);
		}
	}
}

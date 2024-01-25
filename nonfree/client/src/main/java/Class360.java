import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tla")
public final class Class360 {

	@OriginalMember(owner = "client!tla", name = "e", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!tla", name = "b", descriptor = "I")
	public int anInt9702 = 1;

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(ILclient!ika;Z)V")
	private void method8265(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar7 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 2) {
			this.anInt9702 = 0;
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method8267(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2048(255);
			if (local9 == 0) {
				return;
			}
			this.method8265(local9, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class282 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public int anInt7377 = 1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method6187(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7954();
			if (local12 == 0) {
				return;
			}
			this.method6188(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!dt;)V")
	private void method6188(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static363.method8911(arg1.method7960());
		} else if (arg0 == 2) {
			this.anInt7377 = 0;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class367 {

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	public int anInt9662 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!mo;I)V")
	private void method7874(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (arg0 == 5) {
			this.anInt9662 = arg1.method5771();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!mo;)V")
	public void method7876(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method7874(local5, arg0);
		}
	}
}

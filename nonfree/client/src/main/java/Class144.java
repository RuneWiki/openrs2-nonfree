import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class144 {

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	public int anInt4348 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!dg;)V")
	private void method3970(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 5) {
			this.anInt4348 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!dg;B)V")
	public void method3976(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4421();
			if (local17 == 0) {
				return;
			}
			this.method3970(local17, arg0);
		}
	}
}
